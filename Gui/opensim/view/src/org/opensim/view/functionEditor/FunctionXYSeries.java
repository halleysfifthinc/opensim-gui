/* -------------------------------------------------------------------------- *
 * OpenSim: FunctionXYSeries.java                                             *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib, Peter Loan                                         *
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
 * FunctionXYSeries.java
 *
 * Created on October 31, 2007, 4:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.opensim.view.functionEditor;

import java.io.Serializable;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author Peter Loan
 */
public class FunctionXYSeries extends XYSeries implements Cloneable, Serializable {
   
   /** Creates a new instance of FunctionXYSeries */
   public FunctionXYSeries(Comparable key) {
      super(key, true, true);
   }
   
   public void updateByIndex(int index, Number x, Number y) {
      XYDataItem newNode = new XYDataItem(x, y);
      data.remove(index);
      data.add(index, newNode);
      fireSeriesChanged();
   }
}
