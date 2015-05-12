/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapCylinder extends WrapObject {
  private long swigCPtr;

  public WrapCylinder(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.WrapCylinder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapCylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_WrapCylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapCylinder safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.WrapCylinder_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapCylinder(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.WrapCylinder_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.WrapCylinder_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.WrapCylinder_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapCylinder(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.WrapCylinder_getConcreteClassName(swigCPtr, this);
  }

  public WrapCylinder() {
    this(opensimModelJNI.new_WrapCylinder__SWIG_0(), true);
  }

  public WrapCylinder(WrapCylinder aWrapCylinder) {
    this(opensimModelJNI.new_WrapCylinder__SWIG_1(WrapCylinder.getCPtr(aWrapCylinder), aWrapCylinder), true);
  }

  public void copyData(WrapCylinder aWrapCylinder) {
    opensimModelJNI.WrapCylinder_copyData(swigCPtr, this, WrapCylinder.getCPtr(aWrapCylinder), aWrapCylinder);
  }

  public double getRadius() {
    return opensimModelJNI.WrapCylinder_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimModelJNI.WrapCylinder_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimModelJNI.WrapCylinder_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimModelJNI.WrapCylinder_setLength(swigCPtr, this, aLength);
  }

  public String getWrapTypeName() {
    return opensimModelJNI.WrapCylinder_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelJNI.WrapCylinder_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelJNI.WrapCylinder_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelJNI.WrapCylinder_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

}
