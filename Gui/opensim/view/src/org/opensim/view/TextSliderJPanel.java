/* -------------------------------------------------------------------------- *
 * OpenSim: TextSliderJPanel.java                                             *
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
 * TextSliderJPanel.java
 *
 * Created on November 28, 2006, 1:34 PM
 */

package org.opensim.view;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author  Ayman
 *
 * A slider with a model and a text field that supports:
 * 1. Regular slider use that updates the text field with the value.
 * 2. Setting the value directly from the text field (potential problem is if users type in
 *      an out of range value but this can be handled with a dialog). Default behavior is 
 *      to have slider stuck on one end without error indication but we should change that if needed.
 */
public class TextSliderJPanel extends javax.swing.JPanel implements ChangeListener {
    
    private DoubleRangeModel sliderModel;
    private double accurateValue;   // Value set by user directly
    private int textMaxLength=5;
    // A flag indicating if the value is really from Slider
    // if true then sliderModel.getValue() -> transform should be used
    // otherwise accurateValue should be used.
    private boolean fromSlider=false;
    private NumberFormat numFormat = NumberFormat.getInstance();
    
    /** Creates new form TextSliderJPanel */
    public TextSliderJPanel() {
       if (numFormat instanceof DecimalFormat) {
         ((DecimalFormat) numFormat).applyPattern("#,##0.#########");
       }

       initComponents();
       getJXSlider().addChangeListener(this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      jXTextField = new javax.swing.JTextField();
      jXSlider = new javax.swing.JSlider();

      jXTextField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jXTextFieldActionPerformed(evt);
         }
      });
      jXTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusLost(java.awt.event.FocusEvent evt) {
            jXTextFieldFocusLost(evt);
         }
      });

      jXSlider.setMajorTickSpacing(20);
      jXSlider.setMinorTickSpacing(10);
      jXSlider.setPaintTicks(true);

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .add(jXTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jXSlider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jXSlider, 0, 0, Short.MAX_VALUE)
         .add(jXTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
      );
   }// </editor-fold>//GEN-END:initComponents

    private void jXTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jXTextFieldFocusLost
        JTextField src = (JTextField) evt.getSource();
        updateValueFromTextField(src);
    }//GEN-LAST:event_jXTextFieldFocusLost
    /**
     * Common place to update the actual value maintained by the Slider and its Model when 
     * Editing of the text field is finished.
     */
    private void updateValueFromTextField(final JTextField src) {
        setFromSlider(false);
        try {
           accurateValue = numFormat.parse(src.getText()).doubleValue();
        } catch (ParseException ex) {
           Toolkit.getDefaultToolkit().beep();
           accurateValue = sliderModel.getDValue();
        }
        getJXSlider().removeChangeListener(this);
        sliderModel.setDValue(accurateValue);
        getJXSlider().addChangeListener(this);
    }

    private void jXTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextFieldActionPerformed
        JTextField src = (JTextField) evt.getSource();
        updateValueFromTextField(src);
        
    }//GEN-LAST:event_jXTextFieldActionPerformed

    public boolean isFromSlider() {
        return fromSlider;
    }

    public void setFromSlider(boolean fromSlider) {
        this.fromSlider = fromSlider;
    }
    
    public void setRange(double d, double d0) {
        sliderModel = new DoubleRangeModel(d, d0);
        getJXSlider().setModel(sliderModel);        
    }
    /**
     * Set current value from text field. May not correspond to a tickmark.
     */
    void setInitialValue(double d)
    {
        // Make the slider match d
        // Remove the listener first so that the text is not updated incorrectly
        getJXSlider().removeChangeListener(this);
        sliderModel.setDValue(d);
        setFormattedText(d);
        accurateValue = d;
        getJXSlider().addChangeListener(this);
    }

     public double getTheValue()
    {
        // Make the slider match d
         if (isFromSlider())
             return ((DoubleRangeModel)getJXSlider().getModel()).getDValue();
         else
             return accurateValue;
    }

     public void stateChanged(ChangeEvent e) {
        if (this.getJXSlider() != e.getSource())
            return;
        setFormattedText(sliderModel.getDValue());
        setFromSlider(true);
    }
    /**
     * A change listener for the panel. This listens to changes in slider only.
     * Changes in text field should cause changes in slider and so should be 
     * caught too?
     */
    public void addChangeListener(ChangeListener l) {
        this.getJXSlider().addChangeListener(l);
    }
    
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JSlider jXSlider;
   private javax.swing.JTextField jXTextField;
   // End of variables declaration//GEN-END:variables
   /**
     * A class representing the model for a Slider that ranges over double 
     * values rather than integers 
     */
    class DoubleRangeModel extends DefaultBoundedRangeModel
    {
        private double dMin, dMax;    
        
        public DoubleRangeModel(double d, double d0) {
           dMin =((double)((int)(d*10000)))/10000;    
           dMax= ((double)((int)(d0*10000)))/10000;
        }
        
        public void setDValue(double n) {
            
            super.setValue((int)((n-dMin)/(dMax-dMin)*100));
        }

        public boolean getValueIsAdjusting() {
            boolean retValue;
            retValue = super.getValueIsAdjusting();
            setFromSlider(true);
            return retValue;
        }

        public double getDValue() {
            int retValue;
            
            retValue = super.getValue();
            double dValue = ((double)retValue)/100.0*(dMax-dMin)+dMin;
            // Truncate to 2 significant digits, though should be a better way
            //return ((int)(dValue*100.))/100.0;
            return dValue;
        }
     }

    public javax.swing.JSlider getJXSlider() {
        return jXSlider;
    }

    private void setFormattedText(double d) {
        String dString=numFormat.format(d);
        if (dString.length()>textMaxLength)
            jXTextField.setText(dString.substring(0,textMaxLength));
        else
            jXTextField.setText(dString);
    }

    public void setTextMaxLength(int textMaxLength) {
        this.textMaxLength = textMaxLength;
    }
}

