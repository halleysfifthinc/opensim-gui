/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SurfaceProperties extends OpenSimObject {
  private transient long swigCPtr;

  public SurfaceProperties(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SurfaceProperties_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SurfaceProperties obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SurfaceProperties(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SurfaceProperties safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SurfaceProperties_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SurfaceProperties(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SurfaceProperties_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SurfaceProperties_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SurfaceProperties_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SurfaceProperties(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SurfaceProperties_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_representation(SurfaceProperties source) {
    opensimSimulationJNI.SurfaceProperties_copyProperty_representation(swigCPtr, this, SurfaceProperties.getCPtr(source), source);
  }

  public int get_representation(int i) {
    return opensimSimulationJNI.SurfaceProperties_get_representation__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_representation(int i) {
    return new SWIGTYPE_p_int(opensimSimulationJNI.SurfaceProperties_upd_representation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_representation(int i, int value) {
    opensimSimulationJNI.SurfaceProperties_set_representation__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_representation(int value) {
    return opensimSimulationJNI.SurfaceProperties_append_representation(swigCPtr, this, value);
  }

  public void constructProperty_representation(int initValue) {
    opensimSimulationJNI.SurfaceProperties_constructProperty_representation(swigCPtr, this, initValue);
  }

  public int get_representation() {
    return opensimSimulationJNI.SurfaceProperties_get_representation__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_representation() {
    return new SWIGTYPE_p_int(opensimSimulationJNI.SurfaceProperties_upd_representation__SWIG_1(swigCPtr, this), false);
  }

  public void set_representation(int value) {
    opensimSimulationJNI.SurfaceProperties_set_representation__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_texture(SurfaceProperties source) {
    opensimSimulationJNI.SurfaceProperties_copyProperty_texture(swigCPtr, this, SurfaceProperties.getCPtr(source), source);
  }

  public String get_texture(int i) {
    return opensimSimulationJNI.SurfaceProperties_get_texture__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_texture(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.SurfaceProperties_upd_texture__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_texture(int i, String value) {
    opensimSimulationJNI.SurfaceProperties_set_texture__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_texture(String value) {
    return opensimSimulationJNI.SurfaceProperties_append_texture(swigCPtr, this, value);
  }

  public void constructProperty_texture() {
    opensimSimulationJNI.SurfaceProperties_constructProperty_texture__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_texture(String initValue) {
    opensimSimulationJNI.SurfaceProperties_constructProperty_texture__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_texture() {
    return opensimSimulationJNI.SurfaceProperties_get_texture__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_texture() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.SurfaceProperties_upd_texture__SWIG_1(swigCPtr, this), false);
  }

  public void set_texture(String value) {
    opensimSimulationJNI.SurfaceProperties_set_texture__SWIG_1(swigCPtr, this, value);
  }

  public SurfaceProperties() {
    this(opensimSimulationJNI.new_SurfaceProperties(), true);
  }

  public boolean hasTexture() {
    return opensimSimulationJNI.SurfaceProperties_hasTexture(swigCPtr, this);
  }

}
