/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This defines a text label with its base at the origin. The default <br>
 * constructor creates a blank label. *
 */
public class DecorativeText extends DecorativeGeometry {
  private transient long swigCPtr;

  public DecorativeText(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.DecorativeText_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeText obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_DecorativeText(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeText(String label) {
    this(opensimSimbodyJNI.new_DecorativeText__SWIG_0(label), true);
  }

  public DecorativeText() {
    this(opensimSimbodyJNI.new_DecorativeText__SWIG_1(), true);
  }

  public DecorativeText setText(String label) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setText(swigCPtr, this, label), false);
  }

  public String getText() {
    return opensimSimbodyJNI.DecorativeText_getText(swigCPtr, this);
  }

  /**
   *  By default the text is part of the scene; set this flag if you want<br>
   *     it to just show up in a fixed spot on the screen instead. *
   */
  public DecorativeText setIsScreenText(boolean isScreen) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setIsScreenText(swigCPtr, this, isScreen), false);
  }

  public boolean getIsScreenText() {
    return opensimSimbodyJNI.DecorativeText_getIsScreenText(swigCPtr, this);
  }

  public DecorativeText setBodyId(int b) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeText setIndexOnBody(int x) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeText setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeText setTransform(Transform X_BD) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeText setResolution(double r) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeText setScaleFactors(Vec3 s) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeText setColor(Vec3 rgb) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeText setOpacity(double o) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeText setLineThickness(double t) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeText setFaceCamera(int yn) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setFaceCamera(swigCPtr, this, yn), false);
  }

  public DecorativeText setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeText(opensimSimbodyJNI.DecorativeText_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

}
