/*
 * Copyright (c)  2005-2008, Stanford University
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed 
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer. 
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.opensim.view.markerEditor;

import java.io.IOException;
import java.util.Vector;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.opensim.modeling.Component;
import org.opensim.modeling.Marker;
import org.opensim.modeling.MarkerSet;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimContext;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PhysicalFrame;
import org.opensim.modeling.Vec3;
import org.opensim.view.ExplorerTopComponent;
import org.opensim.view.ObjectsDeletedEvent;
import org.opensim.view.nodes.OneMarkerNode;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;

public final class OneMarkerDeleteAction extends CallableSystemAction {

   public String getName() {
      return NbBundle.getMessage(OneMarkerDeleteAction.class, "CTL_MarkerDeleteAction");
   }
   
   protected void initialize() {
      super.initialize();
      // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
      putValue("noIconInMenu", Boolean.TRUE);
   }
   
   public HelpCtx getHelpCtx() {
      return HelpCtx.DEFAULT_HELP;
   }
   
   protected boolean asynchronous() {
      return false;
   }
   
   public boolean isEnabled() {
       return OpenSimDB.getInstance().getCurrentModel()!=null;
   }

    public void performAction() {
        Node[] selected = ExplorerTopComponent.findInstance().getExplorerManager().getSelectedNodes();
        // If any selected object is hidden (or any selected group is mixed), return false.
        Vector<OpenSimObject> markers = new Vector<OpenSimObject>();
        for (int i = 0; i < selected.length; i++) {
            OneMarkerNode objectNode = (OneMarkerNode) selected[i];
            Marker marker = Marker.safeDownCast(objectNode.getOpenSimObject());
            markers.add(marker);
        }
        deleteMarkers(markers, markers.size()==1);

    }
    static public void deleteMarkers(final Vector<OpenSimObject> markers, boolean supportUndo) {
        // This block of code should stay in sync with 
        // TestEditMarkers.java in opensim-core
        // Remove the marker from the model's marker set.
        Marker marker = Marker.safeDownCast(markers.get(0));
        final Model model = marker.getModel();
        MarkerSet markerset = model.getMarkerSet();
        final String saveMarkerName = marker.getName();
        final PhysicalFrame saveBody = marker.getParentFrame();
        final Vec3 saveMarkerOffset = new Vec3(marker.get_location());

        ObjectsDeletedEvent evnt = new ObjectsDeletedEvent(model, model, markers);
        OpenSimDB.getInstance().setChanged();
        OpenSimDB.getInstance().notifyObservers(evnt);
        if (supportUndo) {
            //System.out.println("name, body, offset="+saveMarkerName+" "+saveBodyName+" "+saveMarkerOffset);
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit() {

                public void undo() throws CannotUndoException {
                    super.undo();
                    Marker newMarker = new Marker();
                    newMarker.setName(saveMarkerName);
                    newMarker.set_location(saveMarkerOffset);
                    newMarker.setParentFrame(saveBody);
                    OpenSimContext context = OpenSimDB.getInstance().getContext(model);
                    context.cacheModelAndState();
                    model.getMarkerSet().adoptAndAppend(newMarker);
                    try {
                        context.restoreStateFromCachedModel();
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    Vector<OpenSimObject> markers = new  Vector<OpenSimObject>();
                    markers.add(newMarker);
                    new NewMarkerAction().addMarkers(markers, false);
                }

                public void redo() throws CannotRedoException {
                    super.redo();
                    Marker toDelete = model.getMarkerSet().get(saveMarkerName);
                    Vector<OpenSimObject> markers = new Vector<OpenSimObject>();
                    markers.add(toDelete);
                    deleteMarkers(markers, true);
                }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
        // Use Editing call sequence since removing a marker requires 
        // recreation of tree traversal/initialization
        OpenSimContext context = OpenSimDB.getInstance().getContext(model);
        context.cacheModelAndState();
        for (int i=0; i<markers.size(); i++)
            markerset.remove(Marker.safeDownCast(markers.get(i)));
        try {
            context.restoreStateFromCachedModel();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        // Update the marker name list in the ViewDB.
        OpenSimDB.getInstance().getModelGuiElements(model).updateMarkerNames();
    }
  
}
