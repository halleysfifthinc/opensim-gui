/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for holding a set of pointers to objects.  It is derived from<br>
 * base class C and is implemented as a wrapper around template class<br>
 * ArrayPtrs&lt;T&gt;.  <br>
 * <br>
 * @see ArrayPtrs<br>
 * @author Frank C. Anderson
 */
public class SetMocoWeight extends OpenSimObject {
  private transient long swigCPtr;

  public SetMocoWeight(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.SetMocoWeight_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetMocoWeight obj) {
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
        opensimMocoJNI.delete_SetMocoWeight(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetMocoWeight safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.SetMocoWeight_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetMocoWeight(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.SetMocoWeight_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.SetMocoWeight_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.SetMocoWeight_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetMocoWeight(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.SetMocoWeight_getConcreteClassName(swigCPtr, this);
  }

  /**
   * Default constructor.
   */
  public SetMocoWeight() {
    this(opensimMocoJNI.new_SetMocoWeight__SWIG_0(), true);
  }

  /**
   * Construct from file.<br>
   * <br>
   * @param aFileName             Name of the file.<br>
   * @param aUpdateFromXMLNode    Whether to update from XML.
   */
  public SetMocoWeight(String aFileName, boolean aUpdateFromXMLNode) throws java.io.IOException {
    this(opensimMocoJNI.new_SetMocoWeight__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  /**
   * Construct from file.<br>
   * <br>
   * @param aFileName             Name of the file.<br>
   * 
   */
  public SetMocoWeight(String aFileName) throws java.io.IOException {
    this(opensimMocoJNI.new_SetMocoWeight__SWIG_2(aFileName), true);
  }

  /**
   * Copy constructor.<br>
   * <br>
   * @param aSet Set to be copied.
   */
  public SetMocoWeight(SetMocoWeight aSet) {
    this(opensimMocoJNI.new_SetMocoWeight__SWIG_3(SetMocoWeight.getCPtr(aSet), aSet), true);
  }

  /**
   * Setup groups (match group member names to set members).
   */
  public void setupGroups() {
    opensimMocoJNI.SetMocoWeight_setupGroups(swigCPtr, this);
  }

  /**
   * Assign this set to another set.<br>
   * This operator makes a complete copy of the specified set; all member<br>
   * variables and objects in the set are copied.  Because all objects are<br>
   * copied, this set takes ownership of the newly allocated objects (i.e.,<br>
   * _memoryOwner is set to true. So, the result is two independent,<br>
   * identical sets, with the possible exception of the _memoryOwner flag.<br>
   * <br>
   * <br>
   * @return Reference to this set.<br>
   * <br>
   * %Set whether or not this Set owns the memory pointed to by the pointers<br>
   * it holds.<br>
   * <br>
   * @param aTrueFalse If true, all the memory associated with each of the<br>
   * pointers in this array are deleted upon the array's destruction.  If<br>
   * false, deletes are not issued for each of the pointers.
   */
  public void setMemoryOwner(boolean aTrueFalse) {
    opensimMocoJNI.SetMocoWeight_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  /**
   * %Set the size of the array.  This method can be used only to decrease<br>
   * the size of the array.  If the size of an array is decreased, all objects<br>
   * in the array that become invalid as a result of the decrease are<br>
   * deleted.<br>
   * <br>
   * Note that the size of an array is different than its capacity.  The size<br>
   * indicates how many valid elements are stored in an array.  The capacity<br>
   * indicates how much the size of the array can be increased without<br>
   * allocated more memory.  At all times size &lt;= capacity.<br>
   * <br>
   * @param aSize Desired size of the array.  The size must be greater than<br>
   * or equal to zero and less than or equal to the current size of the<br>
   * array.<br>
   * @return True if the requested size change was carried out, false<br>
   * otherwise.
   */
  public boolean setSize(int aSize) {
    return opensimMocoJNI.SetMocoWeight_setSize(swigCPtr, this, aSize);
  }

  /**
   * Get the size of the array.<br>
   * <br>
   * @return Size of the array.
   */
  public int getSize() {
    return opensimMocoJNI.SetMocoWeight_getSize(swigCPtr, this);
  }

  /**
   * Get the index of an object.<br>
   * <br>
   * @param aObject Address of the object whose index is sought.<br>
   * @param aStartIndex Index at which to start searching.  If the object is<br>
   * not found at or following aStartIndex, the array is searched from<br>
   * its beginning.<br>
   * @return Index of the object with the address aObject.  If no such object<br>
   * exists in the array, -1 is returned.
   */
  public int getIndex(MocoWeight aObject, int aStartIndex) {
    return opensimMocoJNI.SetMocoWeight_getIndex__SWIG_0(swigCPtr, this, MocoWeight.getCPtr(aObject), aObject, aStartIndex);
  }

  /**
   * Get the index of an object.<br>
   * <br>
   * @param aObject Address of the object whose index is sought.<br>
   * <br>
   * @return Index of the object with the address aObject.  If no such object<br>
   * exists in the array, -1 is returned.
   */
  public int getIndex(MocoWeight aObject) {
    return opensimMocoJNI.SetMocoWeight_getIndex__SWIG_1(swigCPtr, this, MocoWeight.getCPtr(aObject), aObject);
  }

  /**
   * Get the index of an object by specifying its name.<br>
   * <br>
   * @param aName Name of the object whose index is sought.<br>
   * @param aStartIndex Index at which to start searching.  If the object is<br>
   * not found at or following aStartIndex, the array is searched from<br>
   * its beginning.<br>
   * @return Index of the object named aName.  If no such object exists in<br>
   * the array, -1 is returned.
   */
  public int getIndex(String aName, int aStartIndex) {
    return opensimMocoJNI.SetMocoWeight_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  /**
   * Get the index of an object by specifying its name.<br>
   * <br>
   * @param aName Name of the object whose index is sought.<br>
   * <br>
   * @return Index of the object named aName.  If no such object exists in<br>
   * the array, -1 is returned.
   */
  public int getIndex(String aName) {
    return opensimMocoJNI.SetMocoWeight_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  /**
   * Get names of groups containing a given object 
   */
  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimMocoJNI.SetMocoWeight_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  /**
   * Append to the array, and adopt passed in pointer.  A copy is NOT made of the specified object.  If<br>
   * getMemoryOwner() is true, this Set takes over ownership of the object and<br>
   * deletes it when the Set itself is deleted.<br>
   * <br>
   * @param aObject Object to be appended.<br>
   * @return True if the append was successful, false otherwise.
   */
  public boolean adoptAndAppend(MocoWeight aObject) {
    return opensimMocoJNI.SetMocoWeight_adoptAndAppend(swigCPtr, this, MocoWeight.getCPtr(aObject), aObject);
  }

  /**
   * cloneAndAppend creates a clone of the passed in object and appends the clone to the array.  <br>
   * The original object is unaffected and is not associated with the Set. The clone is created <br>
   * using the method clone() available to OpenSim::Object<br>
   * <br>
   * @param aObject Object whose clone is to be appended.<br>
   * @return True if the append was successful, false otherwise.
   */
  public boolean cloneAndAppend(MocoWeight aObject) {
    return opensimMocoJNI.SetMocoWeight_cloneAndAppend(swigCPtr, this, MocoWeight.getCPtr(aObject), aObject);
  }

  /**
   * Insert an object into the array at a specified index.  A copy of the<br>
   * specified object is NOT made.  If getMemoryOwner() is true, this Set takes<br>
   * over ownership of the object and deletes it when the Set itself is deleted.<br>
   * <br>
   * This method is relatively computationally costly since many of the array<br>
   * elements may need to be shifted.<br>
   * <br>
   * @param aObject Object to be inserted.<br>
   * @param aIndex Index at which to insert the new object.  All current elements<br>
   * from aIndex to the end of the array are shifted one place in the direction<br>
   * of the end of the array.  The specified index must be less than or<br>
   * equal to the size of the array.  Note that if aIndex is equal to the<br>
   * size of the array, the insertion is equivalent to an append.<br>
   * @return True if the insertion was successful, false otherwise.
   */
  public boolean insert(int aIndex, MocoWeight aObject) {
    return opensimMocoJNI.SetMocoWeight_insert(swigCPtr, this, aIndex, MocoWeight.getCPtr(aObject), aObject);
  }

  /**
   * Remove an object from the array at a specified index.<br>
   * If this set is set as the memory owner, the object is deleted when it<br>
   * is removed.<br>
   * <br>
   * This method is relatively computationally costly since many of the array<br>
   * elements may need to be shifted.<br>
   * <br>
   * @param aIndex Index of the value to remove.  All elements from aIndex to<br>
   * the end of the array are shifted one place toward the beginning of<br>
   * the array.  If aIndex is less than 0 or greater than or equal to the<br>
   * current size of the array, no element is removed.<br>
   * @return True if the removal was successful, false otherwise.
   */
  public boolean remove(int aIndex) {
    return opensimMocoJNI.SetMocoWeight_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  /**
   * Remove an object from the array by specifying its address.<br>
   * The object is deleted when it is removed.<br>
   * <br>
   * This method is relatively computationally costly since many of the array<br>
   * elements may need to be shifted.<br>
   * <br>
   * @param aObject Pointer to the object to be removed.  If an object with the<br>
   * specified address is not found, no action is taken.<br>
   * @return True if the removal was successful, false otherwise.
   */
  public boolean remove(MocoWeight aObject) {
    return opensimMocoJNI.SetMocoWeight_remove__SWIG_1(swigCPtr, this, MocoWeight.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimMocoJNI.SetMocoWeight_clearAndDestroy(swigCPtr, this);
  }

  /**
   * %Set the object at a specified index.  A copy of the object is NOT made.<br>
   * If getMemoryOwner() is true, this Set takes over ownership of the object and<br>
   * deletes it when the Set itself is deleted.<br>
   * <br>
   * @param aIndex Index of the array element to be set.  aIndex must be<br>
   * greater than zero and less than or equal to the size of the array.  Note<br>
   * that if aIndex is equal to the size of the array, the set is equivalent<br>
   * to an append.<br>
   * @param aObject Object to be set.<br>
   * @param preserveGroups If true, the new object will be added to the groups<br>
   * that the object it replaces belonged to<br>
   * @return True if the set was successful, false otherwise.
   */
  public boolean set(int aIndex, MocoWeight aObject, boolean preserveGroups) {
    return opensimMocoJNI.SetMocoWeight_set__SWIG_0(swigCPtr, this, aIndex, MocoWeight.getCPtr(aObject), aObject, preserveGroups);
  }

  /**
   * %Set the object at a specified index.  A copy of the object is NOT made.<br>
   * If getMemoryOwner() is true, this Set takes over ownership of the object and<br>
   * deletes it when the Set itself is deleted.<br>
   * <br>
   * @param aIndex Index of the array element to be set.  aIndex must be<br>
   * greater than zero and less than or equal to the size of the array.  Note<br>
   * that if aIndex is equal to the size of the array, the set is equivalent<br>
   * to an append.<br>
   * @param aObject Object to be set.<br>
   * <br>
   * @return True if the set was successful, false otherwise.
   */
  public boolean set(int aIndex, MocoWeight aObject) {
    return opensimMocoJNI.SetMocoWeight_set__SWIG_1(swigCPtr, this, aIndex, MocoWeight.getCPtr(aObject), aObject);
  }

  /**
   * Get the value at a specified array index.<br>
   * <br>
   * If the index is negative or passed the end of the array, an exception<br>
   * is thrown.<br>
   * <br>
   * For faster execution, the array elements can be accessed through the<br>
   * overloaded operator[], which does no bounds checking.<br>
   * <br>
   * @param aIndex Index of the desired array element.<br>
   * @return Reference to the array element.<br>
   * @throws Exception if (aIndex&lt;0)||(aIndex&gt;=_size) or if the pointer<br>
   * at aIndex is NULL.<br>
   * @see operator[].
   */
  public MocoWeight get(int aIndex) {
    return new MocoWeight(opensimMocoJNI.SetMocoWeight_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  /**
   * Get the first object that has a specified name.<br>
   * <br>
   * If the array doesn't contain an object of the specified name, an<br>
   * exception is thrown.<br>
   * <br>
   * @param aName Name of the desired object.<br>
   * @return Pointer to the object.<br>
   * @throws Exception if no such object exists.<br>
   * @see getIndex()
   */
  public MocoWeight get(String aName) {
    return new MocoWeight(opensimMocoJNI.SetMocoWeight_get__SWIG_1(swigCPtr, this, aName), false);
  }

  /**
   * Get whether this Set contains any object with the specified name.<br>
   * <br>
   * @param aName Name of the desired object.<br>
   * @return true if the object exists
   */
  public boolean contains(String aName) {
    return opensimMocoJNI.SetMocoWeight_contains(swigCPtr, this, aName);
  }

  /**
   * Get names of objects in the set.<br>
   * <br>
   * @param rNames Array of names.  The names are appended to rNames, so it<br>
   * is permissible to send in an non-empty array; the names in the set<br>
   * will simply be appended to the array sent in.
   */
  public void getNames(ArrayStr rNames) {
    opensimMocoJNI.SetMocoWeight_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  /**
   * Get the number of groups.
   */
  public int getNumGroups() {
    return opensimMocoJNI.SetMocoWeight_getNumGroups(swigCPtr, this);
  }

  /**
   * Add an empty group to the set.
   */
  public void addGroup(String aGroupName) {
    opensimMocoJNI.SetMocoWeight_addGroup(swigCPtr, this, aGroupName);
  }

  /**
   * Remove a group from the set. Elements are not removed.
   */
  public void removeGroup(String aGroupName) {
    opensimMocoJNI.SetMocoWeight_removeGroup(swigCPtr, this, aGroupName);
  }

  /**
   * Rename a group.
   */
  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimMocoJNI.SetMocoWeight_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  /**
   * Add an object to a group.
   */
  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimMocoJNI.SetMocoWeight_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  /**
   * Get names of all groups
   */
  public void getGroupNames(ArrayStr rGroupNames) {
    opensimMocoJNI.SetMocoWeight_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  /**
   * Get a group by name.
   */
  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimMocoJNI.SetMocoWeight_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  /**
   * Get a group by index.
   */
  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimMocoJNI.SetMocoWeight_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
