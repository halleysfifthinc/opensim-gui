/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetMuscles extends OpenSimObject {
  private transient long swigCPtr;

  public SetMuscles(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetMuscles_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetMuscles obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetMuscles(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetMuscles safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetMuscles_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetMuscles(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetMuscles_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetMuscles_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetMuscles_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetMuscles(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetMuscles_getConcreteClassName(swigCPtr, this);
  }

  public SetMuscles() {
    this(opensimSimulationJNI.new_SetMuscles__SWIG_0(), true);
  }

  public SetMuscles(String aFileName, boolean aUpdateFromXMLNode) throws java.io.IOException {
    this(opensimSimulationJNI.new_SetMuscles__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetMuscles(String aFileName) throws java.io.IOException {
    this(opensimSimulationJNI.new_SetMuscles__SWIG_2(aFileName), true);
  }

  public SetMuscles(SetMuscles aSet) {
    this(opensimSimulationJNI.new_SetMuscles__SWIG_3(SetMuscles.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetMuscles_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetMuscles_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetMuscles_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetMuscles_getSize(swigCPtr, this);
  }

  public int getIndex(Muscle aObject, int aStartIndex) {
    return opensimSimulationJNI.SetMuscles_getIndex__SWIG_0(swigCPtr, this, Muscle.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Muscle aObject) {
    return opensimSimulationJNI.SetMuscles_getIndex__SWIG_1(swigCPtr, this, Muscle.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetMuscles_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetMuscles_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetMuscles_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Muscle aObject) {
    return opensimSimulationJNI.SetMuscles_adoptAndAppend(swigCPtr, this, Muscle.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Muscle aObject) {
    return opensimSimulationJNI.SetMuscles_cloneAndAppend(swigCPtr, this, Muscle.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Muscle aObject) {
    return opensimSimulationJNI.SetMuscles_insert(swigCPtr, this, aIndex, Muscle.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetMuscles_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Muscle aObject) {
    return opensimSimulationJNI.SetMuscles_remove__SWIG_1(swigCPtr, this, Muscle.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetMuscles_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Muscle aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetMuscles_set__SWIG_0(swigCPtr, this, aIndex, Muscle.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Muscle aObject) {
    return opensimSimulationJNI.SetMuscles_set__SWIG_1(swigCPtr, this, aIndex, Muscle.getCPtr(aObject), aObject);
  }

  public Muscle get(int aIndex) {
    return new Muscle(opensimSimulationJNI.SetMuscles_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Muscle get(String aName) {
    return new Muscle(opensimSimulationJNI.SetMuscles_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetMuscles_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetMuscles_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetMuscles_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetMuscles_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetMuscles_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetMuscles_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetMuscles_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetMuscles_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetMuscles_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetMuscles_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
