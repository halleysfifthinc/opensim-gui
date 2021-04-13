/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  The states, controls, dynamics, parameters, goals, and constraints for a<br>
 * phase of the problem.<br>
 * The dynamics are provided by the %OpenSim Model.<br>
 * <br>
 * This class allows you to define your problem, but does not let you do<br>
 * anything with your problem (this class only contains user input).<br>
 * Use MocoProblem::createRep() to create an instance of MocoProblemRep,<br>
 * which provides additional functionality. 
 */
public class MocoPhase extends OpenSimObject {
  private transient long swigCPtr;

  public MocoPhase(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoPhase_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoPhase obj) {
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
        opensimMocoJNI.delete_MocoPhase(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    public static MocoBounds convertArrayToMB(double[] arr) throws Exception {
        MocoBounds bounds = new MocoBounds();
        if (arr == null) {
            return bounds;
        } else if (arr.length > 2) {
            throw new RuntimeException(
                    "Bounds cannot have more than 2 elements.");
        } else if (arr.length == 1) {
            bounds = new MocoBounds(arr[0]);
        } else if (arr.length == 2) {
            bounds = new MocoBounds(arr[0], arr[1]);
        }
        return bounds;
    }
    public static MocoInitialBounds convertArrayToMIB(double[] arr)
            throws Exception {
        MocoInitialBounds bounds = new MocoInitialBounds();
        if (arr == null) {
            return bounds;
        } else if (arr.length > 2) {
            throw new RuntimeException(
                    "Bounds cannot have more than 2 elements.");
        } else if (arr.length == 1) {
            bounds = new MocoInitialBounds(arr[0]);
        } else if (arr.length == 2) {
            bounds = new MocoInitialBounds(arr[0], arr[1]);
        }
        return bounds;
    }
    public static MocoFinalBounds convertArrayToMFB(double[] arr)
            throws Exception {
        MocoFinalBounds bounds = new MocoFinalBounds();
        if (arr == null) {
            return bounds;
        } else if (arr.length > 2) {
            throw new RuntimeException(
                    "Bounds cannot have more than 2 elements.");
        } else if (arr.length == 1) {
            bounds = new MocoFinalBounds(arr[0]);
        } else if (arr.length == 2) {
            bounds = new MocoFinalBounds(arr[0], arr[1]);
        }
        return bounds;
    }

    public void setModel(Model model) {
        private_setModel(model);
        model.markAdopted();
    }
    public void addParameter(MocoParameter obj) {
        private_addParameter(obj);
        obj.markAdopted();
    }
    public void addGoal(MocoGoal obj) {
        private_addGoal(obj);
        obj.markAdopted();
    }
    public void addPathConstraint(MocoPathConstraint obj) {
        private_addPathConstraint(obj);
        obj.markAdopted();
    }
    public void setTimeBounds(double[] ib, double[] fb) throws Exception {
        setTimeBounds(this.convertArrayToMIB(ib), this.convertArrayToMFB(fb));
    }
    public void setStateInfo(String name, double[] b) throws Exception {
        setStateInfo(name, this.convertArrayToMB(b));
    }
    public void setStateInfo(String name, double[] b, double[] ib)
        throws Exception {
        setStateInfo(name, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib));
    }
    public void setStateInfo(String name, double[] b, double[] ib, double[] fb)
        throws Exception {
        setStateInfo(name, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib), this.convertArrayToMFB(fb));
    }
    public void setStateInfoPattern(String pattern, double[] b) 
        throws Exception {
        setStateInfoPattern(pattern, this.convertArrayToMB(b));
    }
    public void setStateInfoPattern(String pattern, double[] b, double[] ib)
        throws Exception {
        setStateInfoPattern(pattern, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib));
    }
    public void 
    setStateInfoPattern(String pattern, double[] b, double[] ib, double[] fb) 
        throws Exception {
        setStateInfoPattern(pattern, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib), this.convertArrayToMFB(fb));
    }

    public void setControlInfo(String name, double[] b) throws Exception {
        setControlInfo(name, this.convertArrayToMB(b));
    }
    public void setControlInfo(String name, double[] b, double[] ib)
        throws Exception {
        setControlInfo(name, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib));
    }
    public void setControlInfo(String name, double[] b, double[] ib, double[] fb)
        throws Exception {
        setControlInfo(name, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib), this.convertArrayToMFB(fb));
    }
    public void setControlInfoPattern(String pattern, double[] b) 
        throws Exception {
        setControlInfoPattern(pattern, this.convertArrayToMB(b));
    }
    public void setControlInfoPattern(String pattern, double[] b, double[] ib)
        throws Exception {
        setControlInfoPattern(pattern, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib));
    }
    public void 
    setControlInfoPattern(String pattern, double[] b, double[] ib, double[] fb) 
        throws Exception {
        setControlInfoPattern(pattern, this.convertArrayToMB(b),
                this.convertArrayToMIB(ib), this.convertArrayToMFB(fb));
    }

  public static MocoPhase safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoPhase_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoPhase(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoPhase_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoPhase_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoPhase_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoPhase(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoPhase_getConcreteClassName(swigCPtr, this);
  }

  public MocoPhase() {
    this(opensimMocoJNI.new_MocoPhase(), true);
  }

  /**
   *  The model is copied into the MocoPhase; further changes made to the<br>
   *  passed-in model will have no effect on this MocoPhase.<br>
   *  This function returns a pointer to the model stored in the phase<br>
   *  (the copy).
   */
  public Model setModelAsCopy(Model model) {
    long cPtr = opensimMocoJNI.MocoPhase_setModelAsCopy(swigCPtr, this, Model.getCPtr(model), model);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  /**
   *  Set a model processor for creating the model for this phase. Use this<br>
   *  to provide a model as a .osim file.
   */
  public void setModelProcessor(ModelProcessor model) {
    opensimMocoJNI.MocoPhase_setModelProcessor(swigCPtr, this, ModelProcessor.getCPtr(model), model);
  }

  /**
   *  Get a mutable reference to the internal ModelProcessor. Use this to<br>
   *  set the processor's base model or to add operators to the processor.
   */
  public ModelProcessor updModelProcessor() {
    return new ModelProcessor(opensimMocoJNI.MocoPhase_updModelProcessor(swigCPtr, this), false);
  }

  /**
   *  Set the bounds on the initial and final time for this phase.<br>
   *  If you want to constrain the initial time to a single value, pass<br>
   *  that value to the constructor of MocoInitialBounds. If you want the<br>
   *  initial time to fall within a range, pass the lower and upper bounds<br>
   *  to the constructor of MocoInitialBounds. Likewise for MocoFinalBounds.<br>
   *  This will overwrite bounds that were set previously, if any.
   */
  public void setTimeBounds(MocoInitialBounds arg0, MocoFinalBounds arg1) {
    opensimMocoJNI.MocoPhase_setTimeBounds(swigCPtr, this, MocoInitialBounds.getCPtr(arg0), arg0, MocoFinalBounds.getCPtr(arg1), arg1);
  }

  /**
   *  Find and print the names of all state variables containing a substring.
   */
  public void printStateNamesWithSubstring(String name) {
    opensimMocoJNI.MocoPhase_printStateNamesWithSubstring(swigCPtr, this, name);
  }

  /**
   *  Set information about a single state variable in this phase.<br>
   *  @param name<br>
   *      The name must match the path of a state variable in the<br>
   *      model (e.g., `/hip/flexion/value` or `/hip/flexion/speed`).<br>
   *  @param bounds<br>
   *      The bounds on this state variable over the entire phase. If<br>
   *      default-constructed (`{}`), then either the variable is<br>
   *      unconstrained or default bounds are used (see below).<br>
   *  @param init<br>
   *      The bounds on this state variable at the start of the phase.<br>
   *      By default, there are no additional bounds on the initial value<br>
   *      (though the `bounds` over the entire phase still apply to the<br>
   *      initial value).<br>
   *  <br>
   * <br>
   *  For all bounds arguments: if you want to constrain to a single value,<br>
   *  pass that single value. If you want to constrain to a range, pass<br>
   *  the lower and upper bounds to the constructor as two arguments.<br>
   * <br>
   *  ### Default bounds<br>
   *  1. Coordinate values: the Coordinate's range is used (regardless of<br>
   *      whether the coordinate is clamped).<br>
   *  2. Coordinate speeds: this class's default_speed_bounds property.<br>
   *  3. All other states: if a component has a SimTK::Vec2 output named<br>
   *     `statebounds_&lt;state-name&gt;`, then this output is used to set default<br>
   *     bounds for the state variable `&lt;state-name&gt;` for that component.<br>
   *     The first element of the Vec2 is the lower bound and the second is<br>
   *     the upper bound.<br>
   * <br>
   *  These defaults are also used if you completely omit state info for a<br>
   *  state variable.<br>
   * <br>
   *  For states with default bounds, if you actually want a variable to<br>
   *  be unconstrained, pass in MocoBounds::unconstrained().<br>
   * <br>
   *  ### Examples<br>
   *  Set bounds over the entire phase, but do not specify additional<br>
   *  bounds on the value at the start and end of the phase.<br>
   *  {@code 
   phase.setStateInfo("/knee/flexion/value", {-1.5*SimTK::Pi, 0});
   }<br>
   * <br>
   *  Allow any value throughout the phase (within the coordinate's range),<br>
   *  but the initial value is 5.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/value", {}, 5);
   }<br>
   * <br>
   *  Constrain the initial and final state to a single value of 0, but<br>
   *  use default speed bounds elsewhere.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/speed", {}, 0, 0);
   }<br>
   * <br>
   *  Make a coordinate value unconstrained.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/value", MocoBounds::unconstrained());
   }<br>
   * <br>
   *  This function will overwrite any info that has previously been set for<br>
   *  this state variable.
   */
  public void setStateInfo(String name, MocoBounds bounds, MocoInitialBounds init, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoPhase_setStateInfo__SWIG_0(swigCPtr, this, name, MocoBounds.getCPtr(bounds), bounds, MocoInitialBounds.getCPtr(init), init, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set information about a single state variable in this phase.<br>
   *  @param name<br>
   *      The name must match the path of a state variable in the<br>
   *      model (e.g., `/hip/flexion/value` or `/hip/flexion/speed`).<br>
   *  @param bounds<br>
   *      The bounds on this state variable over the entire phase. If<br>
   *      default-constructed (`{}`), then either the variable is<br>
   *      unconstrained or default bounds are used (see below).<br>
   *  @param init<br>
   *      The bounds on this state variable at the start of the phase.<br>
   *      By default, there are no additional bounds on the initial value<br>
   *      (though the `bounds` over the entire phase still apply to the<br>
   *      initial value).<br>
   *  <br>
   * <br>
   *  For all bounds arguments: if you want to constrain to a single value,<br>
   *  pass that single value. If you want to constrain to a range, pass<br>
   *  the lower and upper bounds to the constructor as two arguments.<br>
   * <br>
   *  ### Default bounds<br>
   *  1. Coordinate values: the Coordinate's range is used (regardless of<br>
   *      whether the coordinate is clamped).<br>
   *  2. Coordinate speeds: this class's default_speed_bounds property.<br>
   *  3. All other states: if a component has a SimTK::Vec2 output named<br>
   *     `statebounds_&lt;state-name&gt;`, then this output is used to set default<br>
   *     bounds for the state variable `&lt;state-name&gt;` for that component.<br>
   *     The first element of the Vec2 is the lower bound and the second is<br>
   *     the upper bound.<br>
   * <br>
   *  These defaults are also used if you completely omit state info for a<br>
   *  state variable.<br>
   * <br>
   *  For states with default bounds, if you actually want a variable to<br>
   *  be unconstrained, pass in MocoBounds::unconstrained().<br>
   * <br>
   *  ### Examples<br>
   *  Set bounds over the entire phase, but do not specify additional<br>
   *  bounds on the value at the start and end of the phase.<br>
   *  {@code 
   phase.setStateInfo("/knee/flexion/value", {-1.5*SimTK::Pi, 0});
   }<br>
   * <br>
   *  Allow any value throughout the phase (within the coordinate's range),<br>
   *  but the initial value is 5.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/value", {}, 5);
   }<br>
   * <br>
   *  Constrain the initial and final state to a single value of 0, but<br>
   *  use default speed bounds elsewhere.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/speed", {}, 0, 0);
   }<br>
   * <br>
   *  Make a coordinate value unconstrained.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/value", MocoBounds::unconstrained());
   }<br>
   * <br>
   *  This function will overwrite any info that has previously been set for<br>
   *  this state variable.
   */
  public void setStateInfo(String name, MocoBounds bounds, MocoInitialBounds init) {
    opensimMocoJNI.MocoPhase_setStateInfo__SWIG_1(swigCPtr, this, name, MocoBounds.getCPtr(bounds), bounds, MocoInitialBounds.getCPtr(init), init);
  }

  /**
   *  Set information about a single state variable in this phase.<br>
   *  @param name<br>
   *      The name must match the path of a state variable in the<br>
   *      model (e.g., `/hip/flexion/value` or `/hip/flexion/speed`).<br>
   *  @param bounds<br>
   *      The bounds on this state variable over the entire phase. If<br>
   *      default-constructed (`{}`), then either the variable is<br>
   *      unconstrained or default bounds are used (see below).<br>
   *  <br>
   * <br>
   *  For all bounds arguments: if you want to constrain to a single value,<br>
   *  pass that single value. If you want to constrain to a range, pass<br>
   *  the lower and upper bounds to the constructor as two arguments.<br>
   * <br>
   *  ### Default bounds<br>
   *  1. Coordinate values: the Coordinate's range is used (regardless of<br>
   *      whether the coordinate is clamped).<br>
   *  2. Coordinate speeds: this class's default_speed_bounds property.<br>
   *  3. All other states: if a component has a SimTK::Vec2 output named<br>
   *     `statebounds_&lt;state-name&gt;`, then this output is used to set default<br>
   *     bounds for the state variable `&lt;state-name&gt;` for that component.<br>
   *     The first element of the Vec2 is the lower bound and the second is<br>
   *     the upper bound.<br>
   * <br>
   *  These defaults are also used if you completely omit state info for a<br>
   *  state variable.<br>
   * <br>
   *  For states with default bounds, if you actually want a variable to<br>
   *  be unconstrained, pass in MocoBounds::unconstrained().<br>
   * <br>
   *  ### Examples<br>
   *  Set bounds over the entire phase, but do not specify additional<br>
   *  bounds on the value at the start and end of the phase.<br>
   *  {@code 
   phase.setStateInfo("/knee/flexion/value", {-1.5*SimTK::Pi, 0});
   }<br>
   * <br>
   *  Allow any value throughout the phase (within the coordinate's range),<br>
   *  but the initial value is 5.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/value", {}, 5);
   }<br>
   * <br>
   *  Constrain the initial and final state to a single value of 0, but<br>
   *  use default speed bounds elsewhere.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/speed", {}, 0, 0);
   }<br>
   * <br>
   *  Make a coordinate value unconstrained.<br>
   *  {@code 
   phase.setStateInfo("/ankle/flexion/value", MocoBounds::unconstrained());
   }<br>
   * <br>
   *  This function will overwrite any info that has previously been set for<br>
   *  this state variable.
   */
  public void setStateInfo(String name, MocoBounds bounds) {
    opensimMocoJNI.MocoPhase_setStateInfo__SWIG_2(swigCPtr, this, name, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Set information for state variables whose names match the provided<br>
   *  regular expression. You can use this to set bounds for all muscle<br>
   *  activations, etc. Infos provided via setStateInfoPattern() take<br>
   *  precedence over the default values from the model. Infos provided via<br>
   *  setStateInfo() take precedence over infos provided with<br>
   *  setStateInfoPattern().  If a state variable name matches multiple<br>
   *  patterns, the info provided with the last pattern is used for that state<br>
   *  variable.
   */
  public void setStateInfoPattern(String pattern, MocoBounds bounds, MocoInitialBounds init, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoPhase_setStateInfoPattern__SWIG_0(swigCPtr, this, pattern, MocoBounds.getCPtr(bounds), bounds, MocoInitialBounds.getCPtr(init), init, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set information for state variables whose names match the provided<br>
   *  regular expression. You can use this to set bounds for all muscle<br>
   *  activations, etc. Infos provided via setStateInfoPattern() take<br>
   *  precedence over the default values from the model. Infos provided via<br>
   *  setStateInfo() take precedence over infos provided with<br>
   *  setStateInfoPattern().  If a state variable name matches multiple<br>
   *  patterns, the info provided with the last pattern is used for that state<br>
   *  variable.
   */
  public void setStateInfoPattern(String pattern, MocoBounds bounds, MocoInitialBounds init) {
    opensimMocoJNI.MocoPhase_setStateInfoPattern__SWIG_1(swigCPtr, this, pattern, MocoBounds.getCPtr(bounds), bounds, MocoInitialBounds.getCPtr(init), init);
  }

  /**
   *  Set information for state variables whose names match the provided<br>
   *  regular expression. You can use this to set bounds for all muscle<br>
   *  activations, etc. Infos provided via setStateInfoPattern() take<br>
   *  precedence over the default values from the model. Infos provided via<br>
   *  setStateInfo() take precedence over infos provided with<br>
   *  setStateInfoPattern().  If a state variable name matches multiple<br>
   *  patterns, the info provided with the last pattern is used for that state<br>
   *  variable.
   */
  public void setStateInfoPattern(String pattern, MocoBounds bounds) {
    opensimMocoJNI.MocoPhase_setStateInfoPattern__SWIG_2(swigCPtr, this, pattern, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Find and print the names of all control variables containing a substring.
   */
  public void printControlNamesWithSubstring(String name) {
    opensimMocoJNI.MocoPhase_printControlNamesWithSubstring(swigCPtr, this, name);
  }

  /**
   *  Set information about a single control variable in this phase.<br>
   *  Similar to setStateInfo(). The name for a control is the path to the<br>
   *  associated actuator (e.g., "/forceset/soleus_r"). If setting a control<br>
   *  info for an actuator with multiple controls, the name should be the<br>
   *  actuator path appended by the control index (e.g. "/actuator_0");<br>
   *  If info is not specified for a ScalarActuator (or if only the initial<br>
   *  and/or final bounds are provided), the actuator's min and max control<br>
   *  are used for the bounds over the phase. By default, non-ScalarActuators<br>
   *  are unconstrained.
   */
  public void setControlInfo(String name, MocoBounds arg1, MocoInitialBounds arg2, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoPhase_setControlInfo__SWIG_0(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set information about a single control variable in this phase.<br>
   *  Similar to setStateInfo(). The name for a control is the path to the<br>
   *  associated actuator (e.g., "/forceset/soleus_r"). If setting a control<br>
   *  info for an actuator with multiple controls, the name should be the<br>
   *  actuator path appended by the control index (e.g. "/actuator_0");<br>
   *  If info is not specified for a ScalarActuator (or if only the initial<br>
   *  and/or final bounds are provided), the actuator's min and max control<br>
   *  are used for the bounds over the phase. By default, non-ScalarActuators<br>
   *  are unconstrained.
   */
  public void setControlInfo(String name, MocoBounds arg1, MocoInitialBounds arg2) {
    opensimMocoJNI.MocoPhase_setControlInfo__SWIG_1(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2);
  }

  /**
   *  Set information about a single control variable in this phase.<br>
   *  Similar to setStateInfo(). The name for a control is the path to the<br>
   *  associated actuator (e.g., "/forceset/soleus_r"). If setting a control<br>
   *  info for an actuator with multiple controls, the name should be the<br>
   *  actuator path appended by the control index (e.g. "/actuator_0");<br>
   *  If info is not specified for a ScalarActuator (or if only the initial<br>
   *  and/or final bounds are provided), the actuator's min and max control<br>
   *  are used for the bounds over the phase. By default, non-ScalarActuators<br>
   *  are unconstrained.
   */
  public void setControlInfo(String name, MocoBounds arg1) {
    opensimMocoJNI.MocoPhase_setControlInfo__SWIG_2(swigCPtr, this, name, MocoBounds.getCPtr(arg1), arg1);
  }

  /**
   *  Set the bounds on generalized speed state variables<br>
   *  for which explicit bounds are not set.
   */
  public void setDefaultSpeedBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoPhase_setDefaultSpeedBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Set information for control variables whose names match the provided<br>
   *  regular expression. You can use this to set bounds for all muscle<br>
   *  activations, etc. Infos provided via setControlInfoPattern() take<br>
   *  precedence over the default values from the model. Infos provided via<br>
   *  setControlInfo() take precedence over infos provided with<br>
   *  setControlInfoPattern().  If a state variable name matches multiple<br>
   *  patterns, the info provided with the last pattern is used for that<br>
   *  control variable.
   */
  public void setControlInfoPattern(String pattern, MocoBounds arg1, MocoInitialBounds arg2, MocoFinalBounds arg3) {
    opensimMocoJNI.MocoPhase_setControlInfoPattern__SWIG_0(swigCPtr, this, pattern, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2, MocoFinalBounds.getCPtr(arg3), arg3);
  }

  /**
   *  Set information for control variables whose names match the provided<br>
   *  regular expression. You can use this to set bounds for all muscle<br>
   *  activations, etc. Infos provided via setControlInfoPattern() take<br>
   *  precedence over the default values from the model. Infos provided via<br>
   *  setControlInfo() take precedence over infos provided with<br>
   *  setControlInfoPattern().  If a state variable name matches multiple<br>
   *  patterns, the info provided with the last pattern is used for that<br>
   *  control variable.
   */
  public void setControlInfoPattern(String pattern, MocoBounds arg1, MocoInitialBounds arg2) {
    opensimMocoJNI.MocoPhase_setControlInfoPattern__SWIG_1(swigCPtr, this, pattern, MocoBounds.getCPtr(arg1), arg1, MocoInitialBounds.getCPtr(arg2), arg2);
  }

  /**
   *  Set information for control variables whose names match the provided<br>
   *  regular expression. You can use this to set bounds for all muscle<br>
   *  activations, etc. Infos provided via setControlInfoPattern() take<br>
   *  precedence over the default values from the model. Infos provided via<br>
   *  setControlInfo() take precedence over infos provided with<br>
   *  setControlInfoPattern().  If a state variable name matches multiple<br>
   *  patterns, the info provided with the last pattern is used for that<br>
   *  control variable.
   */
  public void setControlInfoPattern(String pattern, MocoBounds arg1) {
    opensimMocoJNI.MocoPhase_setControlInfoPattern__SWIG_2(swigCPtr, this, pattern, MocoBounds.getCPtr(arg1), arg1);
  }

  /**
   *  For muscles without explicit activation bounds, set the bounds for<br>
   *  muscle activation (if activation dynamics are enabled) from the bounds<br>
   *  for muscle control (excitation), using min/max control if explicit<br>
   *  control bounds are not provided. Default: true.
   */
  public void setBoundActivationFromExcitation(boolean tf) {
    opensimMocoJNI.MocoPhase_setBoundActivationFromExcitation(swigCPtr, this, tf);
  }

  /**
   *  Set the bounds on *all* of the kinematic constraint equations in this<br>
   *  phase. When creating a MocoProblemRep, these bounds are used to create<br>
   *  MocoConstraintInfo's for each kinematic constraint equation in the<br>
   *  phase.
   */
  public void setKinematicConstraintBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoPhase_setKinematicConstraintBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Set the bounds on *all* of the Lagrange multipliers in this phase.<br>
   *  When creating a MocoProblemRep, these bounds are used to create<br>
   *  MocoVariableInfo%s for each Lagrange multiplier in the phase.
   */
  public void setMultiplierBounds(MocoBounds bounds) {
    opensimMocoJNI.MocoPhase_setMultiplierBounds(swigCPtr, this, MocoBounds.getCPtr(bounds), bounds);
  }

  /**
   *  Get the base model in the internal ModelProcessor. This throws an<br>
   *  exception if the ModelProcessor does not have a base model. By default,<br>
   *  the model is an empty model.
   */
  public Model getModel() {
    return new Model(opensimMocoJNI.MocoPhase_getModel(swigCPtr, this), false);
  }

  /**
   *  Get a mutable reference to the base model in the internal<br>
   *  ModelProcessor. This throws an exception if the ModelProcessor does not<br>
   *  have a base model. By default, the model is an empty model.
   */
  public Model updModel() {
    return new Model(opensimMocoJNI.MocoPhase_updModel(swigCPtr, this), false);
  }

  /**
   *  Get the ModelProcessor.
   */
  public ModelProcessor getModelProcessor() {
    return new ModelProcessor(opensimMocoJNI.MocoPhase_getModelProcessor(swigCPtr, this), false);
  }

  /**
   *  Note: the return value is constructed fresh on every call from<br>
   *  the internal property. Avoid repeated calls to this function.
   */
  public MocoInitialBounds getTimeInitialBounds() {
    return new MocoInitialBounds(opensimMocoJNI.MocoPhase_getTimeInitialBounds(swigCPtr, this), true);
  }

  /**
   *  
   */
  public MocoFinalBounds getTimeFinalBounds() {
    return new MocoFinalBounds(opensimMocoJNI.MocoPhase_getTimeFinalBounds(swigCPtr, this), true);
  }

  /**
   *  Access explicit state infos provided to this phase. For some state<br>
   *  variables, default bounds are obtained from the model.<br>
   *  This function does *not* provide such automatically-populated bounds<br>
   *  from the model. For that, use see MocoProblemRep::getStateInfo().
   */
  public MocoVariableInfo getStateInfo(String name) {
    return new MocoVariableInfo(opensimMocoJNI.MocoPhase_getStateInfo(swigCPtr, this, name), false);
  }

  /**
   *  Access explicit control infos provided to this phase.<br>
   *  Default bounds are obtained from the model.<br>
   *  This function does *not* provide such automatically-populated bounds<br>
   *  from the model. For that, use see MocoProblemRep::getControlInfo().
   */
  public MocoVariableInfo getControlInfo(String name) {
    return new MocoVariableInfo(opensimMocoJNI.MocoPhase_getControlInfo(swigCPtr, this, name), false);
  }

  public MocoBounds getDefaultSpeedBounds() {
    return new MocoBounds(opensimMocoJNI.MocoPhase_getDefaultSpeedBounds(swigCPtr, this), false);
  }

  public boolean getBoundActivationFromExcitation() {
    return opensimMocoJNI.MocoPhase_getBoundActivationFromExcitation(swigCPtr, this);
  }

  public MocoBounds getKinematicConstraintBounds() {
    return new MocoBounds(opensimMocoJNI.MocoPhase_getKinematicConstraintBounds(swigCPtr, this), false);
  }

  public MocoBounds getMultiplierBounds() {
    return new MocoBounds(opensimMocoJNI.MocoPhase_getMultiplierBounds(swigCPtr, this), false);
  }

  public MocoParameter getParameter(String name) {
    return new MocoParameter(opensimMocoJNI.MocoPhase_getParameter(swigCPtr, this, name), false);
  }

  public MocoParameter updParameter(String name) {
    return new MocoParameter(opensimMocoJNI.MocoPhase_updParameter(swigCPtr, this, name), false);
  }

  public MocoGoal getGoal(String name) {
    return new MocoGoal(opensimMocoJNI.MocoPhase_getGoal(swigCPtr, this, name), false);
  }

  public MocoGoal updGoal(String name) {
    return new MocoGoal(opensimMocoJNI.MocoPhase_updGoal(swigCPtr, this, name), false);
  }

  /**
   *  Get a MocoPathConstraint from this MocoPhase. Note: this does not<br>
   *  include MocoKinematicConstraints, use getKinematicConstraint() instead.
   */
  public MocoPathConstraint getPathConstraint(String name) {
    return new MocoPathConstraint(opensimMocoJNI.MocoPhase_getPathConstraint(swigCPtr, this, name), false);
  }

  public MocoPathConstraint updPathConstraint(String name) {
    return new MocoPathConstraint(opensimMocoJNI.MocoPhase_updPathConstraint(swigCPtr, this, name), false);
  }

  private void private_setModel(Model model) {
    opensimMocoJNI.MocoPhase_private_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  private void private_addParameter(MocoParameter ptr) {
    opensimMocoJNI.MocoPhase_private_addParameter(swigCPtr, this, MocoParameter.getCPtr(ptr), ptr);
  }

  private void private_addGoal(MocoGoal ptr) {
    opensimMocoJNI.MocoPhase_private_addGoal(swigCPtr, this, MocoGoal.getCPtr(ptr), ptr);
  }

  private void private_addPathConstraint(MocoPathConstraint ptr) {
    opensimMocoJNI.MocoPhase_private_addPathConstraint(swigCPtr, this, MocoPathConstraint.getCPtr(ptr), ptr);
  }

}
