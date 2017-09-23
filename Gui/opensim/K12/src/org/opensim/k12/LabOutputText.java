/* -------------------------------------------------------------------------- *
 * OpenSim: LabOutputText.java                                                *
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
 * LabTextOutputToPanel.java
 *
 * Created on August 19, 2010, 6:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.opensim.k12;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author ayman
 */
public class LabOutputText extends LabOutput {
    private String quantitySpecfication;
    private String textTemplate;
    /**
     * Creates a new instance of LabTextOutputToPanel
     */
    public LabOutputText() {
    }

    public String getQuantitySpecfication() {
        return quantitySpecfication;
    }

    public void setQuantitySpecfication(String quantityDescriptor) {
        this.quantitySpecfication = quantityDescriptor;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    }

    public String getTextTemplate() {
        return textTemplate;
    }

    public void setTextTemplate(String textTemplate) {
        this.textTemplate = textTemplate;
    }
    public String toString() {
        String retValue;
        
        retValue = "Output: Panel. Quantity:"+quantitySpecfication;
        return retValue;
    }
    
}
