/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleFirstOrderActivationDynamicModel extends ModelComponent {
  private long swigCPtr;

  public MuscleFirstOrderActivationDynamicModel(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleFirstOrderActivationDynamicModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MuscleFirstOrderActivationDynamicModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleFirstOrderActivationDynamicModel safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MuscleFirstOrderActivationDynamicModel_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleFirstOrderActivationDynamicModel(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MuscleFirstOrderActivationDynamicModel_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleFirstOrderActivationDynamicModel(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_activation_time_constant(MuscleFirstOrderActivationDynamicModel source) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_copyProperty_activation_time_constant(swigCPtr, this, MuscleFirstOrderActivationDynamicModel.getCPtr(source), source);
  }

  public double get_activation_time_constant(int i) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_get_activation_time_constant__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_activation_time_constant(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_upd_activation_time_constant__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_time_constant(int i, double value) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_set_activation_time_constant__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_time_constant(double value) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_append_activation_time_constant(swigCPtr, this, value);
  }

  public void constructProperty_activation_time_constant(double initValue) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_constructProperty_activation_time_constant(swigCPtr, this, initValue);
  }

  public double get_activation_time_constant() {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_get_activation_time_constant__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_activation_time_constant() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_upd_activation_time_constant__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_time_constant(double value) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_set_activation_time_constant__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_deactivation_time_constant(MuscleFirstOrderActivationDynamicModel source) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_copyProperty_deactivation_time_constant(swigCPtr, this, MuscleFirstOrderActivationDynamicModel.getCPtr(source), source);
  }

  public double get_deactivation_time_constant(int i) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_get_deactivation_time_constant__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_deactivation_time_constant(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_upd_deactivation_time_constant__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_deactivation_time_constant(int i, double value) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_set_deactivation_time_constant__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_deactivation_time_constant(double value) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_append_deactivation_time_constant(swigCPtr, this, value);
  }

  public void constructProperty_deactivation_time_constant(double initValue) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_constructProperty_deactivation_time_constant(swigCPtr, this, initValue);
  }

  public double get_deactivation_time_constant() {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_get_deactivation_time_constant__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_deactivation_time_constant() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_upd_deactivation_time_constant__SWIG_1(swigCPtr, this), false);
  }

  public void set_deactivation_time_constant(double value) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_set_deactivation_time_constant__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_minimum_activation(MuscleFirstOrderActivationDynamicModel source) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_copyProperty_minimum_activation(swigCPtr, this, MuscleFirstOrderActivationDynamicModel.getCPtr(source), source);
  }

  public double get_minimum_activation(int i) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_get_minimum_activation__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_minimum_activation(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_upd_minimum_activation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_minimum_activation(int i, double value) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_set_minimum_activation__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_minimum_activation(double value) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_append_minimum_activation(swigCPtr, this, value);
  }

  public void constructProperty_minimum_activation(double initValue) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_constructProperty_minimum_activation(swigCPtr, this, initValue);
  }

  public double get_minimum_activation() {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_get_minimum_activation__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_minimum_activation() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFirstOrderActivationDynamicModel_upd_minimum_activation__SWIG_1(swigCPtr, this), false);
  }

  public void set_minimum_activation(double value) {
    opensimModelJNI.MuscleFirstOrderActivationDynamicModel_set_minimum_activation__SWIG_1(swigCPtr, this, value);
  }

  public MuscleFirstOrderActivationDynamicModel() {
    this(opensimModelJNI.new_MuscleFirstOrderActivationDynamicModel__SWIG_0(), true);
  }

  public MuscleFirstOrderActivationDynamicModel(double tauActivation, double tauDeactivation, double minActivation, String muscleName) {
    this(opensimModelJNI.new_MuscleFirstOrderActivationDynamicModel__SWIG_1(tauActivation, tauDeactivation, minActivation, muscleName), true);
  }

  public double clampActivation(double activation) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_clampActivation(swigCPtr, this, activation);
  }

  public double calcDerivative(double activation, double excitation) {
    return opensimModelJNI.MuscleFirstOrderActivationDynamicModel_calcDerivative(swigCPtr, this, activation, excitation);
  }

}
