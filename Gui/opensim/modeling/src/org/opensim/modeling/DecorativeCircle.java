/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeCircle extends DecorativeGeometry {
  private transient long swigCPtr;

  public DecorativeCircle(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.DecorativeCircle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeCircle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_DecorativeCircle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeCircle(double radius) {
    this(opensimSimbodyJNI.new_DecorativeCircle__SWIG_0(radius), true);
  }

  public DecorativeCircle() {
    this(opensimSimbodyJNI.new_DecorativeCircle__SWIG_1(), true);
  }

  public DecorativeCircle setRadius(double arg0) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setRadius(swigCPtr, this, arg0), false);
  }

  public double getRadius() {
    return opensimSimbodyJNI.DecorativeCircle_getRadius(swigCPtr, this);
  }

  public DecorativeCircle setBodyId(int b) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeCircle setIndexOnBody(int x) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeCircle setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeCircle setTransform(Transform X_BD) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeCircle setResolution(double r) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeCircle setScaleFactors(Vec3 s) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeCircle setColor(Vec3 rgb) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeCircle setOpacity(double o) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeCircle setLineThickness(double t) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeCircle setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeCircle(opensimSimbodyJNI.DecorativeCircle_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

}
