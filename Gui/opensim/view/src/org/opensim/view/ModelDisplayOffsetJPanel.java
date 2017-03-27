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
/*
 * ModelDisplayOffsetJPanel.java
 *
 * Created on May 8, 2007, 4:04 PM
 */

package org.opensim.view;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.opensim.modeling.Model;
import org.opensim.modeling.Vec3;
import org.opensim.threejs.ModelVisualizationJson;
import org.opensim.view.pub.ViewDB;
import vtk.vtkMatrix4x4;

/**
 *
 * @author  Ayman, A class that backs the model/display-edit functionality where
 * users can change display properties of a model and change its offset.
 */
public class ModelDisplayOffsetJPanel extends javax.swing.JPanel 
                                      implements ChangeListener{
    
    private SingleModelVisuals rep;
    private ModelVisualizationJson modelJson;
    
    private Model dModel;
    private String modelName;
    private vtkMatrix4x4 offset;
    private vtkMatrix4x4 saveOffset;
    private double saveOpacity;
    private Vec3 initialOffset = new Vec3(0.);
    /** Creates new form ModelDisplayOffsetJPanel */
    public ModelDisplayOffsetJPanel(Model abstractModel) {
        rep = ViewDB.getInstance().getModelVisuals(abstractModel);
        modelJson = ViewDB.getInstance().getModelVisualizationJson(abstractModel);
        if (ViewDB.isVtkGraphicsAvailable()){
            offset= ViewDB.getInstance().getModelVisualsTransform(rep);
            // Save offsets and opacity incase we need to restore them
            saveOffset=new vtkMatrix4x4();
            saveOffset.DeepCopy(offset);
            saveOpacity = ViewDB.getInstance().getNominalModelOpacity(abstractModel);
        }
        this.dModel = abstractModel;
        modelName = abstractModel.getName();

        initComponents();
        
        // Compute bounds and initialize text fields for offsets
        computeDisplacementBounds();
        
        textSliderJPanel1.addChangeListener(this);
        textSliderJPanel2.addChangeListener(this);
        textSliderJPanel3.addChangeListener(this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      jPanel1 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      textSliderJPanel1 = new org.opensim.view.TextSliderJPanel();
      jLabel4 = new javax.swing.JLabel();
      textSliderJPanel2 = new org.opensim.view.TextSliderJPanel();
      textSliderJPanel3 = new org.opensim.view.TextSliderJPanel();
      jLabel5 = new javax.swing.JLabel();

      jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      jLabel3.setText("Offset X");

      jLabel4.setText("Offset Y");

      jLabel5.setText("Offset Z");

      org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jPanel1Layout.createSequentialGroup()
                  .add(jLabel4)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(textSliderJPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
               .add(jPanel1Layout.createSequentialGroup()
                  .add(jLabel3)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(textSliderJPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
               .add(jPanel1Layout.createSequentialGroup()
                  .add(jLabel5)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(textSliderJPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jLabel3)
               .add(textSliderJPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(14, 14, 14)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(textSliderJPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
               .add(jLabel4))
            .add(14, 14, 14)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(textSliderJPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
               .add(jLabel5))
            .add(23, 23, 23))
      );

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
      );
   }// </editor-fold>//GEN-END:initComponents
    
    
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private org.opensim.view.TextSliderJPanel textSliderJPanel1;
   private org.opensim.view.TextSliderJPanel textSliderJPanel2;
   private org.opensim.view.TextSliderJPanel textSliderJPanel3;
   // End of variables declaration//GEN-END:variables
    /**
     * Callback when slide is moved 
     **/
    public void stateChanged(ChangeEvent e) {
        Vec3 offsetVec3 = new Vec3(0.);
        if (e.getSource().equals(textSliderJPanel1.getJXSlider())){
            //offset.SetElement(0, 3, textSliderJPanel1.getTheValue());
            offsetVec3.set(0, textSliderJPanel1.getTheValue()*ModelVisualizationJson.getVisScaleFactor());
        } else if (e.getSource().equals(textSliderJPanel2.getJXSlider())){
            //offset.SetElement(1, 3, textSliderJPanel2.getTheValue());
            offsetVec3.set(1, textSliderJPanel2.getTheValue()*ModelVisualizationJson.getVisScaleFactor());
        } else if (e.getSource().equals(textSliderJPanel3.getJXSlider())){
            //offset.SetElement(2, 3, textSliderJPanel3.getTheValue());
             offsetVec3.set(2, textSliderJPanel3.getTheValue()*ModelVisualizationJson.getVisScaleFactor());
       }
        // Apply transform on screen
        // pass offsetVec3 to ViewDB to apply it
        //ViewDB.getInstance().setModelVisualsTransform(rep, offset);
        ViewDB.getInstance().setModelOffset(modelJson, offsetVec3);
        ViewDB.getInstance().repaintAll();
    }
    /** Make up bounds for displacement. Initially it's 3 times the size of the bounding 
     * box of the scene so that the user can move everything out of intersection.
     * This may need to be tuned. When a motion is going to be applied, the user needs
     * to keep this in mind */
    private void computeDisplacementBounds() {
          double[] bounds = ViewDB.getInstance().getSceneBounds();
          
          if (ViewDB.isVtkGraphicsAvailable()){
              for (int i=0; i<3; i++)
                  initialOffset.set(i, offset.GetElement(i, 3));
          };
          // Modify bounds to make the sliders ceneter around 0
          for(int i=0; i<3; i++){
              double max=Math.max(Math.abs(bounds[2*i]), Math.abs(bounds[2*i+1]));
              bounds[2*i] = -max;
              bounds[2*i+1] =max;
          }
          
          // map bounds to range 0-100 for Slider
            double range = bounds[1] - bounds[0];
            textSliderJPanel1.setRange(bounds[0], bounds[1]);
            textSliderJPanel1.setInitialValue(initialOffset.get(0));
            range = bounds[3] - bounds[2];
            textSliderJPanel2.setRange(bounds[2], bounds[3]);
            textSliderJPanel2.setInitialValue(initialOffset.get(1));
            range = bounds[5] - bounds[4];
            textSliderJPanel3.setRange(bounds[4], bounds[5]);
            textSliderJPanel3.setInitialValue(initialOffset.get(2));
     }

    public void restore() {
        ViewDB.getInstance().setNominalModelOpacity(dModel, saveOpacity);
        if (ViewDB.isVtkGraphicsAvailable()){
            ViewDB.getInstance().setModelVisualsTransform(rep, saveOffset);
        }
        ViewDB.getInstance().repaintAll();
    }
    
}
