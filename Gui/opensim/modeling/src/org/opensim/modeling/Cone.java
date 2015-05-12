/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Cone extends AnalyticGeometry {
  private long swigCPtr;

  public Cone(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Cone_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Cone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Cone(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Cone safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Cone_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Cone(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Cone_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Cone_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Cone_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Cone(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Cone_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_origin(Cone source) {
    opensimModelJNI.Cone_copyProperty_origin(swigCPtr, this, Cone.getCPtr(source), source);
  }

  public Vec3 get_origin(int i) {
    return new Vec3(opensimModelJNI.Cone_get_origin__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_origin(int i) {
    return new Vec3(opensimModelJNI.Cone_upd_origin__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_origin(int i, Vec3 value) {
    opensimModelJNI.Cone_set_origin__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_origin(Vec3 value) {
    return opensimModelJNI.Cone_append_origin(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_origin(Vec3 initValue) {
    opensimModelJNI.Cone_constructProperty_origin(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_origin() {
    return new Vec3(opensimModelJNI.Cone_get_origin__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_origin() {
    return new Vec3(opensimModelJNI.Cone_upd_origin__SWIG_1(swigCPtr, this), false);
  }

  public void set_origin(Vec3 value) {
    opensimModelJNI.Cone_set_origin__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_direction(Cone source) {
    opensimModelJNI.Cone_copyProperty_direction(swigCPtr, this, Cone.getCPtr(source), source);
  }

  public Vec3 get_direction(int i) {
    return new Vec3(opensimModelJNI.Cone_get_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_direction(int i) {
    return new Vec3(opensimModelJNI.Cone_upd_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_direction(int i, Vec3 value) {
    opensimModelJNI.Cone_set_direction__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_direction(Vec3 value) {
    return opensimModelJNI.Cone_append_direction(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_direction(Vec3 initValue) {
    opensimModelJNI.Cone_constructProperty_direction(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_direction() {
    return new Vec3(opensimModelJNI.Cone_get_direction__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_direction() {
    return new Vec3(opensimModelJNI.Cone_upd_direction__SWIG_1(swigCPtr, this), false);
  }

  public void set_direction(Vec3 value) {
    opensimModelJNI.Cone_set_direction__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_base_radius(Cone source) {
    opensimModelJNI.Cone_copyProperty_base_radius(swigCPtr, this, Cone.getCPtr(source), source);
  }

  public double get_base_radius(int i) {
    return opensimModelJNI.Cone_get_base_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_base_radius(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Cone_upd_base_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_base_radius(int i, double value) {
    opensimModelJNI.Cone_set_base_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_base_radius(double value) {
    return opensimModelJNI.Cone_append_base_radius(swigCPtr, this, value);
  }

  public void constructProperty_base_radius(double initValue) {
    opensimModelJNI.Cone_constructProperty_base_radius(swigCPtr, this, initValue);
  }

  public double get_base_radius() {
    return opensimModelJNI.Cone_get_base_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_base_radius() {
    return new SWIGTYPE_p_double(opensimModelJNI.Cone_upd_base_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_base_radius(double value) {
    opensimModelJNI.Cone_set_base_radius__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_height(Cone source) {
    opensimModelJNI.Cone_copyProperty_height(swigCPtr, this, Cone.getCPtr(source), source);
  }

  public double get_height(int i) {
    return opensimModelJNI.Cone_get_height__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_height(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Cone_upd_height__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_height(int i, double value) {
    opensimModelJNI.Cone_set_height__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_height(double value) {
    return opensimModelJNI.Cone_append_height(swigCPtr, this, value);
  }

  public void constructProperty_height(double initValue) {
    opensimModelJNI.Cone_constructProperty_height(swigCPtr, this, initValue);
  }

  public double get_height() {
    return opensimModelJNI.Cone_get_height__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_height() {
    return new SWIGTYPE_p_double(opensimModelJNI.Cone_upd_height__SWIG_1(swigCPtr, this), false);
  }

  public void set_height(double value) {
    opensimModelJNI.Cone_set_height__SWIG_1(swigCPtr, this, value);
  }

  public Cone() {
    this(opensimModelJNI.new_Cone__SWIG_0(), true);
  }

  public Cone(Vec3 o, UnitVec3 dir, double height, double base) {
    this(opensimModelJNI.new_Cone__SWIG_1(Vec3.getCPtr(o), o, UnitVec3.getCPtr(dir), dir, height, base), true);
  }

  public void createDecorativeGeometry(ArrayDecorativeGeometry decoGeoms) {
    opensimModelJNI.Cone_createDecorativeGeometry(swigCPtr, this, ArrayDecorativeGeometry.getCPtr(decoGeoms), decoGeoms);
  }

}
