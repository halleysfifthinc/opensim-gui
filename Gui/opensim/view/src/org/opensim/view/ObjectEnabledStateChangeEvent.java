/* -------------------------------------------------------------------------- *
 * OpenSim: ObjectEnabledStateChangeEvent.java                                *
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
 * ObjectEnabledStateChangeEvent.java
 *
 * Created on July 30, 2007, 3:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.opensim.view;

import java.util.Vector;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimObject;

/**
 *
 * @author Peter
 */
public class ObjectEnabledStateChangeEvent extends OpenSimEvent {
   
   /** Creates a new instance of ObjectSetCurrentEvent */
   public ObjectEnabledStateChangeEvent(Object source, Model theModel, Vector<OpenSimObject> theObjects) {
        super(source, theModel, theObjects);
   }
   
}
