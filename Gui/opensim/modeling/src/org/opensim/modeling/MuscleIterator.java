/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleIterator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public MuscleIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MuscleIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(MuscleIterator iter) {
    return opensimModelJNI.MuscleIterator_equals(swigCPtr, this, MuscleIterator.getCPtr(iter), iter);
  }

  public Muscle __ref__() {
    return new Muscle(opensimModelJNI.MuscleIterator___ref__(swigCPtr, this), false);
  }

  public Muscle __deref__() {
    long cPtr = opensimModelJNI.MuscleIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public MuscleIterator next() {
    return new MuscleIterator(opensimModelJNI.MuscleIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MuscleIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MuscleIterator_getConcreteClassName(swigCPtr, this);
  }

  public double get_max_isometric_force(int i) {
    return opensimModelJNI.MuscleIterator_get_max_isometric_force__SWIG_0(swigCPtr, this, i);
  }

  public double get_max_isometric_force() {
    return opensimModelJNI.MuscleIterator_get_max_isometric_force__SWIG_1(swigCPtr, this);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimModelJNI.MuscleIterator_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public double get_optimal_fiber_length() {
    return opensimModelJNI.MuscleIterator_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public double get_tendon_slack_length(int i) {
    return opensimModelJNI.MuscleIterator_get_tendon_slack_length__SWIG_0(swigCPtr, this, i);
  }

  public double get_tendon_slack_length() {
    return opensimModelJNI.MuscleIterator_get_tendon_slack_length__SWIG_1(swigCPtr, this);
  }

  public double get_pennation_angle_at_optimal(int i) {
    return opensimModelJNI.MuscleIterator_get_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i);
  }

  public double get_pennation_angle_at_optimal() {
    return opensimModelJNI.MuscleIterator_get_pennation_angle_at_optimal__SWIG_1(swigCPtr, this);
  }

  public double get_max_contraction_velocity(int i) {
    return opensimModelJNI.MuscleIterator_get_max_contraction_velocity__SWIG_0(swigCPtr, this, i);
  }

  public double get_max_contraction_velocity() {
    return opensimModelJNI.MuscleIterator_get_max_contraction_velocity__SWIG_1(swigCPtr, this);
  }

  public boolean get_ignore_tendon_compliance(int i) {
    return opensimModelJNI.MuscleIterator_get_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_ignore_tendon_compliance() {
    return opensimModelJNI.MuscleIterator_get_ignore_tendon_compliance__SWIG_1(swigCPtr, this);
  }

  public boolean get_ignore_activation_dynamics(int i) {
    return opensimModelJNI.MuscleIterator_get_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_ignore_activation_dynamics() {
    return opensimModelJNI.MuscleIterator_get_ignore_activation_dynamics__SWIG_1(swigCPtr, this);
  }

  public double getMaxIsometricForce() {
    return opensimModelJNI.MuscleIterator_getMaxIsometricForce(swigCPtr, this);
  }

  public double getOptimalFiberLength() {
    return opensimModelJNI.MuscleIterator_getOptimalFiberLength(swigCPtr, this);
  }

  public double getTendonSlackLength() {
    return opensimModelJNI.MuscleIterator_getTendonSlackLength(swigCPtr, this);
  }

  public double getPennationAngleAtOptimalFiberLength() {
    return opensimModelJNI.MuscleIterator_getPennationAngleAtOptimalFiberLength(swigCPtr, this);
  }

  public double getMaxContractionVelocity() {
    return opensimModelJNI.MuscleIterator_getMaxContractionVelocity(swigCPtr, this);
  }

  public boolean getIgnoreTendonCompliance(State s) {
    return opensimModelJNI.MuscleIterator_getIgnoreTendonCompliance(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIgnoreTendonCompliance(State s, boolean ignore) {
    opensimModelJNI.MuscleIterator_setIgnoreTendonCompliance(swigCPtr, this, State.getCPtr(s), s, ignore);
  }

  public boolean getIgnoreActivationDynamics(State s) {
    return opensimModelJNI.MuscleIterator_getIgnoreActivationDynamics(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIgnoreActivationDynamics(State s, boolean ignore) {
    opensimModelJNI.MuscleIterator_setIgnoreActivationDynamics(swigCPtr, this, State.getCPtr(s), s, ignore);
  }

  public double getActivation(State s) {
    return opensimModelJNI.MuscleIterator_getActivation(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberLength(State s) {
    return opensimModelJNI.MuscleIterator_getFiberLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPennationAngle(State s) {
    return opensimModelJNI.MuscleIterator_getPennationAngle(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getCosPennationAngle(State s) {
    return opensimModelJNI.MuscleIterator_getCosPennationAngle(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonLength(State s) {
    return opensimModelJNI.MuscleIterator_getTendonLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getNormalizedFiberLength(State s) {
    return opensimModelJNI.MuscleIterator_getNormalizedFiberLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberLengthAlongTendon(State s) {
    return opensimModelJNI.MuscleIterator_getFiberLengthAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonStrain(State s) {
    return opensimModelJNI.MuscleIterator_getTendonStrain(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberPotentialEnergy(State s) {
    return opensimModelJNI.MuscleIterator_getFiberPotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonPotentialEnergy(State s) {
    return opensimModelJNI.MuscleIterator_getTendonPotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMusclePotentialEnergy(State s) {
    return opensimModelJNI.MuscleIterator_getMusclePotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPassiveForceMultiplier(State s) {
    return opensimModelJNI.MuscleIterator_getPassiveForceMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getActiveForceLengthMultiplier(State s) {
    return opensimModelJNI.MuscleIterator_getActiveForceLengthMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberVelocity(State s) {
    return opensimModelJNI.MuscleIterator_getFiberVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getNormalizedFiberVelocity(State s) {
    return opensimModelJNI.MuscleIterator_getNormalizedFiberVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberVelocityAlongTendon(State s) {
    return opensimModelJNI.MuscleIterator_getFiberVelocityAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPennationAngularVelocity(State s) {
    return opensimModelJNI.MuscleIterator_getPennationAngularVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonVelocity(State s) {
    return opensimModelJNI.MuscleIterator_getTendonVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getForceVelocityMultiplier(State s) {
    return opensimModelJNI.MuscleIterator_getForceVelocityMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberForce(State s) {
    return opensimModelJNI.MuscleIterator_getFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberForceAlongTendon(State s) {
    return opensimModelJNI.MuscleIterator_getFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getActiveFiberForce(State s) {
    return opensimModelJNI.MuscleIterator_getActiveFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPassiveFiberForce(State s) {
    return opensimModelJNI.MuscleIterator_getPassiveFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getActiveFiberForceAlongTendon(State s) {
    return opensimModelJNI.MuscleIterator_getActiveFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPassiveFiberForceAlongTendon(State s) {
    return opensimModelJNI.MuscleIterator_getPassiveFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonForce(State s) {
    return opensimModelJNI.MuscleIterator_getTendonForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberStiffness(State s) {
    return opensimModelJNI.MuscleIterator_getFiberStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberStiffnessAlongTendon(State s) {
    return opensimModelJNI.MuscleIterator_getFiberStiffnessAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonStiffness(State s) {
    return opensimModelJNI.MuscleIterator_getTendonStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMuscleStiffness(State s) {
    return opensimModelJNI.MuscleIterator_getMuscleStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberActivePower(State s) {
    return opensimModelJNI.MuscleIterator_getFiberActivePower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberPassivePower(State s) {
    return opensimModelJNI.MuscleIterator_getFiberPassivePower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonPower(State s) {
    return opensimModelJNI.MuscleIterator_getTendonPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMusclePower(State s) {
    return opensimModelJNI.MuscleIterator_getMusclePower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getStress(State s) {
    return opensimModelJNI.MuscleIterator_getStress(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setExcitation(State s, double excitation) {
    opensimModelJNI.MuscleIterator_setExcitation(swigCPtr, this, State.getCPtr(s), s, excitation);
  }

  public double getExcitation(State s) {
    return opensimModelJNI.MuscleIterator_getExcitation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setActivation(State s, double activation) {
    opensimModelJNI.MuscleIterator_setActivation(swigCPtr, this, State.getCPtr(s), s, activation);
  }

  public double computeActuation(State s) {
    return opensimModelJNI.MuscleIterator_computeActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void equilibrate(State s) {
    opensimModelJNI.MuscleIterator_equilibrate(swigCPtr, this, State.getCPtr(s), s);
  }

  public double calcInextensibleTendonActiveFiberForce(State s, double aActivation) {
    return opensimModelJNI.MuscleIterator_calcInextensibleTendonActiveFiberForce(swigCPtr, this, State.getCPtr(s), s, aActivation);
  }

  public GeometryPath get_GeometryPath(int i) {
    return new GeometryPath(opensimModelJNI.MuscleIterator_get_GeometryPath__SWIG_0(swigCPtr, this, i), false);
  }

  public GeometryPath get_GeometryPath() {
    return new GeometryPath(opensimModelJNI.MuscleIterator_get_GeometryPath__SWIG_1(swigCPtr, this), false);
  }

  public double get_optimal_force(int i) {
    return opensimModelJNI.MuscleIterator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public double get_optimal_force() {
    return opensimModelJNI.MuscleIterator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public GeometryPath getGeometryPath() {
    return new GeometryPath(opensimModelJNI.MuscleIterator_getGeometryPath(swigCPtr, this), false);
  }

  public boolean hasGeometryPath() {
    return opensimModelJNI.MuscleIterator_hasGeometryPath(swigCPtr, this);
  }

  public double getOptimalForce() {
    return opensimModelJNI.MuscleIterator_getOptimalForce(swigCPtr, this);
  }

  public double getLength(State s) {
    return opensimModelJNI.MuscleIterator_getLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getLengtheningSpeed(State s) {
    return opensimModelJNI.MuscleIterator_getLengtheningSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPower(State s) {
    return opensimModelJNI.MuscleIterator_getPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double computeMomentArm(State s, Coordinate aCoord) {
    return opensimModelJNI.MuscleIterator_computeMomentArm(swigCPtr, this, State.getCPtr(s), s, Coordinate.getCPtr(aCoord), aCoord);
  }

  public double get_min_control(int i) {
    return opensimModelJNI.MuscleIterator_get_min_control__SWIG_0(swigCPtr, this, i);
  }

  public double get_min_control() {
    return opensimModelJNI.MuscleIterator_get_min_control__SWIG_1(swigCPtr, this);
  }

  public double get_max_control(int i) {
    return opensimModelJNI.MuscleIterator_get_max_control__SWIG_0(swigCPtr, this, i);
  }

  public double get_max_control() {
    return opensimModelJNI.MuscleIterator_get_max_control__SWIG_1(swigCPtr, this);
  }

  public double getControl(State s) {
    return opensimModelJNI.MuscleIterator_getControl(swigCPtr, this, State.getCPtr(s), s);
  }

  public int numControls() {
    return opensimModelJNI.MuscleIterator_numControls(swigCPtr, this);
  }

  public void setActuation(State s, double aActuation) {
    opensimModelJNI.MuscleIterator_setActuation(swigCPtr, this, State.getCPtr(s), s, aActuation);
  }

  public double getActuation(State s) {
    return opensimModelJNI.MuscleIterator_getActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setSpeed(State s, double aspeed) {
    opensimModelJNI.MuscleIterator_setSpeed(swigCPtr, this, State.getCPtr(s), s, aspeed);
  }

  public double getSpeed(State s) {
    return opensimModelJNI.MuscleIterator_getSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMinControl() {
    return opensimModelJNI.MuscleIterator_getMinControl(swigCPtr, this);
  }

  public double getMaxControl() {
    return opensimModelJNI.MuscleIterator_getMaxControl(swigCPtr, this);
  }

  public void overrideActuation(State s, boolean flag) {
    opensimModelJNI.MuscleIterator_overrideActuation(swigCPtr, this, State.getCPtr(s), s, flag);
  }

  public boolean isActuationOverriden(State s) {
    return opensimModelJNI.MuscleIterator_isActuationOverriden(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setOverrideActuation(State s, double value) {
    opensimModelJNI.MuscleIterator_setOverrideActuation(swigCPtr, this, State.getCPtr(s), s, value);
  }

  public double getOverrideActuation(State s) {
    return opensimModelJNI.MuscleIterator_getOverrideActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void getControls(Vector modelControls, Vector actuatorControls) {
    opensimModelJNI.MuscleIterator_getControls(swigCPtr, this, Vector.getCPtr(modelControls), modelControls, Vector.getCPtr(actuatorControls), actuatorControls);
  }

  public void setControls(Vector actuatorControls, Vector modelControls) {
    opensimModelJNI.MuscleIterator_setControls(swigCPtr, this, Vector.getCPtr(actuatorControls), actuatorControls, Vector.getCPtr(modelControls), modelControls);
  }

  public void addInControls(Vector actuatorControls, Vector modelControls) {
    opensimModelJNI.MuscleIterator_addInControls(swigCPtr, this, Vector.getCPtr(actuatorControls), actuatorControls, Vector.getCPtr(modelControls), modelControls);
  }

  public void computeEquilibrium(State s) {
    opensimModelJNI.MuscleIterator_computeEquilibrium(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean get_isDisabled(int i) {
    return opensimModelJNI.MuscleIterator_get_isDisabled__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_isDisabled() {
    return opensimModelJNI.MuscleIterator_get_isDisabled__SWIG_1(swigCPtr, this);
  }

  public boolean shouldBeParallelized() {
    return opensimModelJNI.MuscleIterator_shouldBeParallelized(swigCPtr, this);
  }

  public boolean isDisabled(State s) {
    return opensimModelJNI.MuscleIterator_isDisabled(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setDisabled(State s, boolean disabled) {
    opensimModelJNI.MuscleIterator_setDisabled(swigCPtr, this, State.getCPtr(s), s, disabled);
  }

  public Geometry get_GeometrySet(int i) {
    return new Geometry(opensimModelJNI.MuscleIterator_get_GeometrySet(swigCPtr, this, i), false);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.MuscleIterator_getModel(swigCPtr, this), false);
  }

  public int getGeometrySize() {
    return opensimModelJNI.MuscleIterator_getGeometrySize(swigCPtr, this);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.MuscleIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.MuscleIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelJNI.MuscleIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.MuscleIterator_getSystem(swigCPtr, this), false);
  }

  public Component getComponent(String name) {
    return new Component(opensimModelJNI.MuscleIterator_getComponent(swigCPtr, this, name), false);
  }

  public Component updComponent(String name) {
    return new Component(opensimModelJNI.MuscleIterator_updComponent(swigCPtr, this, name), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.MuscleIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.MuscleIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelJNI.MuscleIterator_getNumConnectors(swigCPtr, this);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelJNI.MuscleIterator_getConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelJNI.MuscleIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelJNI.MuscleIterator_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.MuscleIterator_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.MuscleIterator_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelJNI.MuscleIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelJNI.MuscleIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelJNI.MuscleIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelJNI.MuscleIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelJNI.MuscleIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelJNI.MuscleIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelJNI.MuscleIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelJNI.MuscleIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelJNI.MuscleIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelJNI.MuscleIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelJNI.MuscleIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public String getPathName() {
    return opensimModelJNI.MuscleIterator_getPathName(swigCPtr, this);
  }

  public void dumpPathName() {
    opensimModelJNI.MuscleIterator_dumpPathName(swigCPtr, this);
  }

  public FramesList getFramesList() {
    return new FramesList(opensimModelJNI.MuscleIterator_getFramesList(swigCPtr, this), true);
  }

  public BodiesList getBodiesList() {
    return new BodiesList(opensimModelJNI.MuscleIterator_getBodiesList(swigCPtr, this), true);
  }

  public MusclesList getMusclesList() {
    return new MusclesList(opensimModelJNI.MuscleIterator_getMusclesList(swigCPtr, this), true);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelJNI.MuscleIterator_getComponentsList(swigCPtr, this), true);
  }

  public ModelComponentList getModelComponentList() {
    return new ModelComponentList(opensimModelJNI.MuscleIterator_getModelComponentList(swigCPtr, this), true);
  }

  public JointsList getJointList() {
    return new JointsList(opensimModelJNI.MuscleIterator_getJointList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelJNI.MuscleIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelJNI.MuscleIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelJNI.MuscleIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelJNI.MuscleIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelJNI.MuscleIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelJNI.MuscleIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.MuscleIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelJNI.MuscleIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.MuscleIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelJNI.MuscleIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelJNI.MuscleIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelJNI.MuscleIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelJNI.MuscleIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelJNI.MuscleIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelJNI.MuscleIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelJNI.MuscleIterator_toString(swigCPtr, this);
  }

}
