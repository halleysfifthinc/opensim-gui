/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MocoTranslationTrackingGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoTranslationTrackingGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoTranslationTrackingGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoTranslationTrackingGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoTranslationTrackingGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoTranslationTrackingGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoTranslationTrackingGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoTranslationTrackingGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoTranslationTrackingGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoTranslationTrackingGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoTranslationTrackingGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoTranslationTrackingGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoTranslationTrackingGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoTranslationTrackingGoal() {
    this(opensimMocoJNI.new_MocoTranslationTrackingGoal__SWIG_0(), true);
  }

  public MocoTranslationTrackingGoal(String name) {
    this(opensimMocoJNI.new_MocoTranslationTrackingGoal__SWIG_1(name), true);
  }

  public MocoTranslationTrackingGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoTranslationTrackingGoal__SWIG_2(name, weight), true);
  }

  public void setTranslationReferenceFile(String filepath) {
    opensimMocoJNI.MocoTranslationTrackingGoal_setTranslationReferenceFile(swigCPtr, this, filepath);
  }

  public void setTranslationReference(TimeSeriesTableVec3 ref) {
    opensimMocoJNI.MocoTranslationTrackingGoal_setTranslationReference(swigCPtr, this, TimeSeriesTableVec3.getCPtr(ref), ref);
  }

  public void setStatesReference(TableProcessor ref) {
    opensimMocoJNI.MocoTranslationTrackingGoal_setStatesReference(swigCPtr, this, TableProcessor.getCPtr(ref), ref);
  }

  public void setFramePaths(StdVectorString paths) {
    opensimMocoJNI.MocoTranslationTrackingGoal_setFramePaths(swigCPtr, this, StdVectorString.getCPtr(paths), paths);
  }

  public void setWeightForFrame(String frameName, double weight) {
    opensimMocoJNI.MocoTranslationTrackingGoal_setWeightForFrame(swigCPtr, this, frameName, weight);
  }

  public void setWeightSet(MocoWeightSet weightSet) {
    opensimMocoJNI.MocoTranslationTrackingGoal_setWeightSet(swigCPtr, this, MocoWeightSet.getCPtr(weightSet), weightSet);
  }

  public TableProcessor getStatesReference() {
    return new TableProcessor(opensimMocoJNI.MocoTranslationTrackingGoal_getStatesReference(swigCPtr, this), false);
  }

  public String getTranslationReferenceFile() {
    return opensimMocoJNI.MocoTranslationTrackingGoal_getTranslationReferenceFile(swigCPtr, this);
  }

}