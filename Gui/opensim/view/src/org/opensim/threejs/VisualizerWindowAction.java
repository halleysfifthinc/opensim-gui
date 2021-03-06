/* -------------------------------------------------------------------------- *
 * OpenSim: VisualizerWindowAction.java                                       *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.threejs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.eclipse.jetty.JettyMain;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.opensim.swingui.SwingWorker;
import org.opensim.utils.BrowserLauncher;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;

@ActionID(
        category = "Edit",
        id = "org.opensim.threejs.VisualizerWindow"
)
@ActionRegistration(
        displayName = "#CTL_VisualizerWindow"
)
@ActionReference(path = "Menu/Window", position = 10000)
@Messages("CTL_VisualizerWindow=View in Browser")
public final class VisualizerWindowAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // launch server and open page in fixed location to be used as a view
        openVisualizerWindow();
    }

    public static void openVisualizerWindow() {
        ViewDB.getInstance().startVisualizationServer();
        BrowserLauncher.openURL("http://localhost:"+JettyMain.getSERVER_PORT()+JettyMain.getPathToStartPage()+"index.html");
    }

}
