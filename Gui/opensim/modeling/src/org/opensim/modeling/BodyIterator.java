/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodyIterator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public BodyIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodyIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_BodyIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(BodyIterator iter) {
    return opensimModelJNI.BodyIterator_equals(swigCPtr, this, BodyIterator.getCPtr(iter), iter);
  }

  public Body __ref__() {
    return new Body(opensimModelJNI.BodyIterator___ref__(swigCPtr, this), false);
  }

  public Body __deref__() {
    long cPtr = opensimModelJNI.BodyIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public BodyIterator next() {
    return new BodyIterator(opensimModelJNI.BodyIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.BodyIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.BodyIterator_getConcreteClassName(swigCPtr, this);
  }

  public double get_mass(int i) {
    return opensimModelJNI.BodyIterator_get_mass__SWIG_0(swigCPtr, this, i);
  }

  public double get_mass() {
    return opensimModelJNI.BodyIterator_get_mass__SWIG_1(swigCPtr, this);
  }

  public Vec3 get_mass_center(int i) {
    return new Vec3(opensimModelJNI.BodyIterator_get_mass_center__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_mass_center() {
    return new Vec3(opensimModelJNI.BodyIterator_get_mass_center__SWIG_1(swigCPtr, this), false);
  }

  public Vec6 get_inertia(int i) {
    return new Vec6(opensimModelJNI.BodyIterator_get_inertia__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec6 get_inertia() {
    return new Vec6(opensimModelJNI.BodyIterator_get_inertia__SWIG_1(swigCPtr, this), false);
  }

  public double getMass() {
    return opensimModelJNI.BodyIterator_getMass(swigCPtr, this);
  }

  public Vec3 getMassCenter() {
    return new Vec3(opensimModelJNI.BodyIterator_getMassCenter(swigCPtr, this), false);
  }

  public Inertia getInertia() {
    return new Inertia(opensimModelJNI.BodyIterator_getInertia__SWIG_0(swigCPtr, this), false);
  }

  public MassProperties getMassProperties() {
    return new MassProperties(opensimModelJNI.BodyIterator_getMassProperties(swigCPtr, this), true);
  }

  public WrapObjectSet get_WrapObjectSet(int i) {
    return new WrapObjectSet(opensimModelJNI.BodyIterator_get_WrapObjectSet__SWIG_0(swigCPtr, this, i), false);
  }

  public WrapObjectSet get_WrapObjectSet() {
    return new WrapObjectSet(opensimModelJNI.BodyIterator_get_WrapObjectSet__SWIG_1(swigCPtr, this), false);
  }

  public int getMobilizedBodyIndex() {
    return opensimModelJNI.BodyIterator_getMobilizedBodyIndex(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__MobilizedBody getMobilizedBody() {
    return new SWIGTYPE_p_SimTK__MobilizedBody(opensimModelJNI.BodyIterator_getMobilizedBody(swigCPtr, this), false);
  }

  public WrapObject getWrapObject(String aName) {
    long cPtr = opensimModelJNI.BodyIterator_getWrapObject(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public WrapObjectSet getWrapObjectSet() {
    return new WrapObjectSet(opensimModelJNI.BodyIterator_getWrapObjectSet(swigCPtr, this), false);
  }

  public Transform getGroundTransform(State state) {
    return new Transform(opensimModelJNI.BodyIterator_getGroundTransform(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Transform findTransformBetween(State state, Frame otherFrame) {
    return new Transform(opensimModelJNI.BodyIterator_findTransformBetween(swigCPtr, this, State.getCPtr(state), state, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInAnotherFrame(State state, Vec3 vec_F, Frame otherFrame) {
    return new Vec3(opensimModelJNI.BodyIterator_expressVectorInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 findLocationInAnotherFrame(State state, Vec3 point_F, Frame otherFrame) {
    return new Vec3(opensimModelJNI.BodyIterator_findLocationInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(point_F), point_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Frame findBaseFrame() {
    return new Frame(opensimModelJNI.BodyIterator_findBaseFrame(swigCPtr, this), false);
  }

  public Transform findTransformInBaseFrame() {
    return new Transform(opensimModelJNI.BodyIterator_findTransformInBaseFrame(swigCPtr, this), true);
  }

  public Geometry get_geometry(int i) {
    return new Geometry(opensimModelJNI.BodyIterator_get_geometry(swigCPtr, this, i), false);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.BodyIterator_getModel(swigCPtr, this), false);
  }

  public int getNumGeometry() {
    return opensimModelJNI.BodyIterator_getNumGeometry(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.BodyIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelJNI.BodyIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.BodyIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.BodyIterator_getSystem(swigCPtr, this), false);
  }

  public Component getComponent(String name) {
    return new Component(opensimModelJNI.BodyIterator_getComponent(swigCPtr, this, name), false);
  }

  public Component updComponent(String name) {
    return new Component(opensimModelJNI.BodyIterator_updComponent(swigCPtr, this, name), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.BodyIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.BodyIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelJNI.BodyIterator_getNumConnectors(swigCPtr, this);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelJNI.BodyIterator_getConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelJNI.BodyIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelJNI.BodyIterator_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.BodyIterator_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.BodyIterator_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelJNI.BodyIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelJNI.BodyIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelJNI.BodyIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelJNI.BodyIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelJNI.BodyIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelJNI.BodyIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelJNI.BodyIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelJNI.BodyIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelJNI.BodyIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelJNI.BodyIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelJNI.BodyIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public String getPathName() {
    return opensimModelJNI.BodyIterator_getPathName(swigCPtr, this);
  }

  public void dumpPathName() {
    opensimModelJNI.BodyIterator_dumpPathName(swigCPtr, this);
  }

  public FramesList getFramesList() {
    return new FramesList(opensimModelJNI.BodyIterator_getFramesList(swigCPtr, this), true);
  }

  public BodiesList getBodiesList() {
    return new BodiesList(opensimModelJNI.BodyIterator_getBodiesList(swigCPtr, this), true);
  }

  public MusclesList getMusclesList() {
    return new MusclesList(opensimModelJNI.BodyIterator_getMusclesList(swigCPtr, this), true);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelJNI.BodyIterator_getComponentsList(swigCPtr, this), true);
  }

  public ModelComponentList getModelComponentList() {
    return new ModelComponentList(opensimModelJNI.BodyIterator_getModelComponentList(swigCPtr, this), true);
  }

  public JointsList getJointList() {
    return new JointsList(opensimModelJNI.BodyIterator_getJointList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelJNI.BodyIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelJNI.BodyIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelJNI.BodyIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelJNI.BodyIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelJNI.BodyIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelJNI.BodyIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.BodyIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelJNI.BodyIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.BodyIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelJNI.BodyIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelJNI.BodyIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelJNI.BodyIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelJNI.BodyIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelJNI.BodyIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelJNI.BodyIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelJNI.BodyIterator_toString(swigCPtr, this);
  }

}
