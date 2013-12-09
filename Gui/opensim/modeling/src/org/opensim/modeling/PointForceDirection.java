/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointForceDirection {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public PointForceDirection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointForceDirection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PointForceDirection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PointForceDirection(Vec3 point, Body body, Vec3 direction, double scale) {
    this(opensimModelJNI.new_PointForceDirection__SWIG_0(Vec3.getCPtr(point), point, Body.getCPtr(body), body, Vec3.getCPtr(direction), direction, scale), true);
  }

  public PointForceDirection(Vec3 point, Body body, Vec3 direction) {
    this(opensimModelJNI.new_PointForceDirection__SWIG_1(Vec3.getCPtr(point), point, Body.getCPtr(body), body, Vec3.getCPtr(direction), direction), true);
  }

  public Vec3 point() {
    return new Vec3(opensimModelJNI.PointForceDirection_point(swigCPtr, this), true);
  }

  public Body body() {
    return new Body(opensimModelJNI.PointForceDirection_body(swigCPtr, this), false);
  }

  public Vec3 direction() {
    return new Vec3(opensimModelJNI.PointForceDirection_direction(swigCPtr, this), true);
  }

  public double scale() {
    return opensimModelJNI.PointForceDirection_scale(swigCPtr, this);
  }

  public void addToDirection(Vec3 newDirection) {
    opensimModelJNI.PointForceDirection_addToDirection(swigCPtr, this, Vec3.getCPtr(newDirection), newDirection);
  }

}