/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ExpressionBasedPointToPointForce extends Force {
  private long swigCPtr;

  public ExpressionBasedPointToPointForce(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ExpressionBasedPointToPointForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ExpressionBasedPointToPointForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ExpressionBasedPointToPointForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ExpressionBasedPointToPointForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ExpressionBasedPointToPointForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ExpressionBasedPointToPointForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ExpressionBasedPointToPointForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ExpressionBasedPointToPointForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ExpressionBasedPointToPointForce(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_body1(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_body1_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_body1() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_body1_get(swigCPtr, this), true);
  }

  public void copyProperty_body1(ExpressionBasedPointToPointForce source) {
    opensimModelJNI.ExpressionBasedPointToPointForce_copyProperty_body1(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getProperty_body1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ExpressionBasedPointToPointForce_getProperty_body1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t updProperty_body1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ExpressionBasedPointToPointForce_updProperty_body1(swigCPtr, this), false);
  }

  public String get_body1(int i) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_get_body1__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body1(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ExpressionBasedPointToPointForce_upd_body1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body1(int i, String value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_body1__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body1(String value) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_append_body1(swigCPtr, this, value);
  }

  public void constructProperty_body1() {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_body1__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body1(String initValue) {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_body1__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body1() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_get_body1__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body1() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ExpressionBasedPointToPointForce_upd_body1__SWIG_1(swigCPtr, this), false);
  }

  public void set_body1(String value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_body1__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_body2(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_body2_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_body2() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_body2_get(swigCPtr, this), true);
  }

  public void copyProperty_body2(ExpressionBasedPointToPointForce source) {
    opensimModelJNI.ExpressionBasedPointToPointForce_copyProperty_body2(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getProperty_body2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ExpressionBasedPointToPointForce_getProperty_body2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t updProperty_body2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ExpressionBasedPointToPointForce_updProperty_body2(swigCPtr, this), false);
  }

  public String get_body2(int i) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_get_body2__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body2(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ExpressionBasedPointToPointForce_upd_body2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body2(int i, String value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_body2__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body2(String value) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_append_body2(swigCPtr, this, value);
  }

  public void constructProperty_body2() {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_body2__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body2(String initValue) {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_body2__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body2() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_get_body2__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body2() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ExpressionBasedPointToPointForce_upd_body2__SWIG_1(swigCPtr, this), false);
  }

  public void set_body2(String value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_body2__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_point1(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_point1_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_point1() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_point1_get(swigCPtr, this), true);
  }

  public void copyProperty_point1(ExpressionBasedPointToPointForce source) {
    opensimModelJNI.ExpressionBasedPointToPointForce_copyProperty_point1(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t getProperty_point1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t(opensimModelJNI.ExpressionBasedPointToPointForce_getProperty_point1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t updProperty_point1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t(opensimModelJNI.ExpressionBasedPointToPointForce_updProperty_point1(swigCPtr, this), false);
  }

  public Vec3 get_point1(int i) {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_get_point1__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point1(int i) {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_upd_point1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point1(int i, Vec3 value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_point1__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point1(Vec3 value) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_append_point1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point1(Vec3 initValue) {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_point1(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point1() {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_get_point1__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point1() {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_upd_point1__SWIG_1(swigCPtr, this), false);
  }

  public void set_point1(Vec3 value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_point1__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void setPropertyIndex_point2(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_point2_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_point2() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_point2_get(swigCPtr, this), true);
  }

  public void copyProperty_point2(ExpressionBasedPointToPointForce source) {
    opensimModelJNI.ExpressionBasedPointToPointForce_copyProperty_point2(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t getProperty_point2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t(opensimModelJNI.ExpressionBasedPointToPointForce_getProperty_point2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t updProperty_point2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__VecT_3_double_1_t_t(opensimModelJNI.ExpressionBasedPointToPointForce_updProperty_point2(swigCPtr, this), false);
  }

  public Vec3 get_point2(int i) {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_get_point2__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point2(int i) {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_upd_point2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point2(int i, Vec3 value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_point2__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point2(Vec3 value) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_append_point2(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point2(Vec3 initValue) {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_point2(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point2() {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_get_point2__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point2() {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_upd_point2__SWIG_1(swigCPtr, this), false);
  }

  public void set_point2(Vec3 value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_point2__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void setPropertyIndex_expression(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_expression_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_expression() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ExpressionBasedPointToPointForce_PropertyIndex_expression_get(swigCPtr, this), true);
  }

  public void copyProperty_expression(ExpressionBasedPointToPointForce source) {
    opensimModelJNI.ExpressionBasedPointToPointForce_copyProperty_expression(swigCPtr, this, ExpressionBasedPointToPointForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getProperty_expression() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ExpressionBasedPointToPointForce_getProperty_expression(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t updProperty_expression() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ExpressionBasedPointToPointForce_updProperty_expression(swigCPtr, this), false);
  }

  public String get_expression(int i) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_get_expression__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_expression(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ExpressionBasedPointToPointForce_upd_expression__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_expression(int i, String value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_expression__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_expression(String value) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_append_expression(swigCPtr, this, value);
  }

  public void constructProperty_expression(String initValue) {
    opensimModelJNI.ExpressionBasedPointToPointForce_constructProperty_expression(swigCPtr, this, initValue);
  }

  public String get_expression() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_get_expression__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_expression() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ExpressionBasedPointToPointForce_upd_expression__SWIG_1(swigCPtr, this), false);
  }

  public void set_expression(String value) {
    opensimModelJNI.ExpressionBasedPointToPointForce_set_expression__SWIG_1(swigCPtr, this, value);
  }

  public ExpressionBasedPointToPointForce() {
    this(opensimModelJNI.new_ExpressionBasedPointToPointForce__SWIG_0(), true);
  }

  public ExpressionBasedPointToPointForce(String body1Name, Vec3 point1, String body2Name, Vec3 point2, String expression) {
    this(opensimModelJNI.new_ExpressionBasedPointToPointForce__SWIG_1(body1Name, Vec3.getCPtr(point1), point1, body2Name, Vec3.getCPtr(point2), point2, expression), true);
  }

  public void setBody1Name(String body1Name) {
    opensimModelJNI.ExpressionBasedPointToPointForce_setBody1Name(swigCPtr, this, body1Name);
  }

  public void setBody2Name(String body2Name) {
    opensimModelJNI.ExpressionBasedPointToPointForce_setBody2Name(swigCPtr, this, body2Name);
  }

  public String getBody1Name() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_getBody1Name(swigCPtr, this);
  }

  public String getBody2Name() {
    return opensimModelJNI.ExpressionBasedPointToPointForce_getBody2Name(swigCPtr, this);
  }

  public void setPoint1(Vec3 aPosition) {
    opensimModelJNI.ExpressionBasedPointToPointForce_setPoint1(swigCPtr, this, Vec3.getCPtr(aPosition), aPosition);
  }

  public Vec3 getPoint1() {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_getPoint1(swigCPtr, this), false);
  }

  public void setPoint2(Vec3 aPosition) {
    opensimModelJNI.ExpressionBasedPointToPointForce_setPoint2(swigCPtr, this, Vec3.getCPtr(aPosition), aPosition);
  }

  public Vec3 getPoint2() {
    return new Vec3(opensimModelJNI.ExpressionBasedPointToPointForce_getPoint2(swigCPtr, this), false);
  }

  public void setExpression(String expression) {
    opensimModelJNI.ExpressionBasedPointToPointForce_setExpression(swigCPtr, this, expression);
  }

  public double getForceMagnitude(State state) {
    return opensimModelJNI.ExpressionBasedPointToPointForce_getForceMagnitude(swigCPtr, this, State.getCPtr(state), state);
  }

  public void computeForce(State state, VectorOfSpatialVec bodyForces, Vector generalizedForces) {
    opensimModelJNI.ExpressionBasedPointToPointForce_computeForce(swigCPtr, this, State.getCPtr(state), state, VectorOfSpatialVec.getCPtr(bodyForces), bodyForces, Vector.getCPtr(generalizedForces), generalizedForces);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.ExpressionBasedPointToPointForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelJNI.ExpressionBasedPointToPointForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public VisibleObject getDisplayer() {
    long cPtr = opensimModelJNI.ExpressionBasedPointToPointForce_getDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public void updateDisplayer(State s) {
    opensimModelJNI.ExpressionBasedPointToPointForce_updateDisplayer(swigCPtr, this, State.getCPtr(s), s);
  }

  public void updateGeometry(State s) {
    opensimModelJNI.ExpressionBasedPointToPointForce_updateGeometry(swigCPtr, this, State.getCPtr(s), s);
  }

}