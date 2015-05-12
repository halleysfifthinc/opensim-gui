/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeGeometry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public DecorativeGeometry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_DecorativeGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DecorativeGeometry() {
    this(opensimModelJNI.new_DecorativeGeometry__SWIG_0(), true);
  }

  public DecorativeGeometry(DecorativeGeometry source) {
    this(opensimModelJNI.new_DecorativeGeometry__SWIG_1(DecorativeGeometry.getCPtr(source), source), true);
  }

  public DecorativeGeometry setBodyId(int bodyId) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setBodyId(swigCPtr, this, bodyId), false);
  }

  public DecorativeGeometry setIndexOnBody(int index) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setIndexOnBody(swigCPtr, this, index), false);
  }

  public DecorativeGeometry setUserRef(SWIGTYPE_p_void userRef) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(userRef)), false);
  }

  public DecorativeGeometry setTransform(Transform X_BG) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setTransform(swigCPtr, this, Transform.getCPtr(X_BG), X_BG), false);
  }

  public DecorativeGeometry setResolution(double arg0) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setResolution(swigCPtr, this, arg0), false);
  }

  public DecorativeGeometry setScaleFactors(Vec3 scale) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setScaleFactors(swigCPtr, this, Vec3.getCPtr(scale), scale), false);
  }

  public DecorativeGeometry setScale(double scale) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setScale(swigCPtr, this, scale), false);
  }

  public int getBodyId() {
    return opensimModelJNI.DecorativeGeometry_getBodyId(swigCPtr, this);
  }

  public int getIndexOnBody() {
    return opensimModelJNI.DecorativeGeometry_getIndexOnBody(swigCPtr, this);
  }

  public SWIGTYPE_p_void getUserRef() {
    long cPtr = opensimModelJNI.DecorativeGeometry_getUserRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public double getResolution() {
    return opensimModelJNI.DecorativeGeometry_getResolution(swigCPtr, this);
  }

  public Transform getTransform() {
    return new Transform(opensimModelJNI.DecorativeGeometry_getTransform(swigCPtr, this), false);
  }

  public Vec3 getScaleFactors() {
    return new Vec3(opensimModelJNI.DecorativeGeometry_getScaleFactors(swigCPtr, this), false);
  }

  public DecorativeGeometry setColor(Vec3 rgb) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeGeometry setOpacity(double arg0) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setOpacity(swigCPtr, this, arg0), false);
  }

  public DecorativeGeometry setLineThickness(double arg0) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setLineThickness(swigCPtr, this, arg0), false);
  }

  public Vec3 getColor() {
    return new Vec3(opensimModelJNI.DecorativeGeometry_getColor(swigCPtr, this), false);
  }

  public double getOpacity() {
    return opensimModelJNI.DecorativeGeometry_getOpacity(swigCPtr, this);
  }

  public double getLineThickness() {
    return opensimModelJNI.DecorativeGeometry_getLineThickness(swigCPtr, this);
  }

  public DecorativeGeometry setFaceCamera(int shouldFace) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setFaceCamera(swigCPtr, this, shouldFace), false);
  }

  public int getFaceCamera() {
    return opensimModelJNI.DecorativeGeometry_getFaceCamera(swigCPtr, this);
  }

  public DecorativeGeometry setRepresentation(DecorativeGeometry.Representation arg0) {
    return new DecorativeGeometry(opensimModelJNI.DecorativeGeometry_setRepresentation(swigCPtr, this, arg0.swigValue()), false);
  }

  public DecorativeGeometry.Representation getRepresentation() {
    return DecorativeGeometry.Representation.swigToEnum(opensimModelJNI.DecorativeGeometry_getRepresentation(swigCPtr, this));
  }

  public void implementGeometry(DecorativeGeometryImplementation arg0) {
    opensimModelJNI.DecorativeGeometry_implementGeometry(swigCPtr, this, DecorativeGeometryImplementation.getCPtr(arg0), arg0);
  }

  public boolean isOwnerHandle() {
    return opensimModelJNI.DecorativeGeometry_isOwnerHandle(swigCPtr, this);
  }

  public boolean isEmptyHandle() {
    return opensimModelJNI.DecorativeGeometry_isEmptyHandle(swigCPtr, this);
  }

  public DecorativeGeometry(SWIGTYPE_p_DecorativeGeometryRep r) {
    this(opensimModelJNI.new_DecorativeGeometry__SWIG_2(SWIGTYPE_p_DecorativeGeometryRep.getCPtr(r)), true);
  }

  public boolean hasRep() {
    return opensimModelJNI.DecorativeGeometry_hasRep(swigCPtr, this);
  }

  public SWIGTYPE_p_DecorativeGeometryRep getRep() {
    return new SWIGTYPE_p_DecorativeGeometryRep(opensimModelJNI.DecorativeGeometry_getRep(swigCPtr, this), false);
  }

  public SWIGTYPE_p_DecorativeGeometryRep updRep() {
    return new SWIGTYPE_p_DecorativeGeometryRep(opensimModelJNI.DecorativeGeometry_updRep(swigCPtr, this), false);
  }

  public boolean hasUserRef() {
    return opensimModelJNI.DecorativeGeometry_hasUserRef(swigCPtr, this);
  }

  public OpenSimObject getUserRefAsObject() {
    return new OpenSimObject(opensimModelJNI.DecorativeGeometry_getUserRefAsObject(swigCPtr, this), false);
  }

  public final static class Representation {
    public final static DecorativeGeometry.Representation Hide = new DecorativeGeometry.Representation("Hide", opensimModelJNI.DecorativeGeometry_Hide_get());
    public final static DecorativeGeometry.Representation DrawPoints = new DecorativeGeometry.Representation("DrawPoints", opensimModelJNI.DecorativeGeometry_DrawPoints_get());
    public final static DecorativeGeometry.Representation DrawWireframe = new DecorativeGeometry.Representation("DrawWireframe", opensimModelJNI.DecorativeGeometry_DrawWireframe_get());
    public final static DecorativeGeometry.Representation DrawSurface = new DecorativeGeometry.Representation("DrawSurface", opensimModelJNI.DecorativeGeometry_DrawSurface_get());
    public final static DecorativeGeometry.Representation DrawDefault = new DecorativeGeometry.Representation("DrawDefault", opensimModelJNI.DecorativeGeometry_DrawDefault_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Representation swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Representation.class + " with value " + swigValue);
    }

    private Representation(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Representation(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Representation(String swigName, Representation swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Representation[] swigValues = { Hide, DrawPoints, DrawWireframe, DrawSurface, DrawDefault };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
