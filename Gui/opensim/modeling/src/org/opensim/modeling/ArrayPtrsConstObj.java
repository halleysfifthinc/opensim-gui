/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 * A class for storing an array of pointers to objects of type T.<br>
 * <br>
 * In contrast to class Array&lt;T&gt;, when an object is added to this array<br>
 * a copy is not made.  Rather, a pointer to the added object is<br>
 * stored in the array.<br>
 * <br>
 * When an ArrayPtrs object falls out of scope or is deleted, all objects<br>
 * pointed to by the pointers in the array are deleted unless the array<br>
 * is set not to own the memory associated with the objects to which its<br>
 * array points.<br>
 * <br>
 * The capacity of the class grows as needed.  To use this template for a<br>
 * class of type T, class T should implement the following methods:<br>
 * default constructor, copy constructor, T* clone(),<br>
 * assignment operator (=), equality operator (==), less than<br>
 * operator (&lt;), and the output operator (&lt;<).<br>
 * <br>
 * @version 1.0<br>
 * @author Frank C. Anderson
 */
public class ArrayPtrsConstObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayPtrsConstObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayPtrsConstObj obj) {
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
        opensimCommonJNI.delete_ArrayPtrsConstObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   * Default constructor.<br>
   * <br>
   * @param aCapacity Initial capacity of the array.  The capacity<br>
   * must be 1 or greater.
   */
  public ArrayPtrsConstObj(int aCapacity) {
    this(opensimCommonJNI.new_ArrayPtrsConstObj__SWIG_0(aCapacity), true);
  }

  /**
   * Default constructor.<br>
   * <br>
   * 
   */
  public ArrayPtrsConstObj() {
    this(opensimCommonJNI.new_ArrayPtrsConstObj__SWIG_1(), true);
  }

  /**
   * Copy constructor.<br>
   * <br>
   * @param aArray Array to be copied.
   */
  public ArrayPtrsConstObj(ArrayPtrsConstObj aArray) {
    this(opensimCommonJNI.new_ArrayPtrsConstObj__SWIG_2(ArrayPtrsConstObj.getCPtr(aArray), aArray), true);
  }

  /**
   * Destroy all objects pointed to by this array and set the size of the<br>
   * array to zero.  When this method is called, the objects pointed to by<br>
   * this array are destroyed (deleted) even if this array is not set as<br>
   * the memory owner.<br>
   * <br>
   * @see setMemoryOwner()
   */
  public void clearAndDestroy() {
    opensimCommonJNI.ArrayPtrsConstObj_clearAndDestroy(swigCPtr, this);
  }

  /**
   * Assign this array to a specified array.<br>
   * This operator makes a complete copy of the specified array; all member<br>
   * variables and objects in the array are copied.  Because all objects are<br>
   * copied, this object takes ownership of the newly allocated objects (i.e.,<br>
   * _memoryOwner is set to true. So, the result is two independent,<br>
   * identical arrays, with the possible exception of the _memoryOwner flag.<br>
   * <br>
   * <br>
   * @return Reference to this array.<br>
   * <br>
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
    return opensimCommonJNI.ArrayPtrsConstObj_setSize(swigCPtr, this, aSize);
  }

  /**
   * Get the size of the array.<br>
   * <br>
   * @return Size of the array.
   */
  public int getSize() {
    return opensimCommonJNI.ArrayPtrsConstObj_getSize(swigCPtr, this);
  }

  /**
   *  Alternate name for getSize(). *
   */
  public int size() {
    return opensimCommonJNI.ArrayPtrsConstObj_size(swigCPtr, this);
  }

  /**
   * Get the index of an object by specifying its name.<br>
   * <br>
   * @param aObject Address of the object whose index is sought.<br>
   * @param aStartIndex Index at which to start searching.  If the object is<br>
   * not found at or following aStartIndex, the array is searched from<br>
   * its beginning.<br>
   * @return Index of the object with the address aObject.  If no such object<br>
   * exists in the array, -1 is returned.
   */
  public int getIndex(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject, int aStartIndex) {
    return opensimCommonJNI.ArrayPtrsConstObj_getIndex__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject), aStartIndex);
  }

  /**
   * Get the index of an object by specifying its name.<br>
   * <br>
   * @param aObject Address of the object whose index is sought.<br>
   * <br>
   * @return Index of the object with the address aObject.  If no such object<br>
   * exists in the array, -1 is returned.
   */
  public int getIndex(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject) {
    return opensimCommonJNI.ArrayPtrsConstObj_getIndex__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject));
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
    return opensimCommonJNI.ArrayPtrsConstObj_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
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
    return opensimCommonJNI.ArrayPtrsConstObj_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  /**
   * Append to the array.  A copy of the specified object is NOT made.<br>
   * <br>
   * @param aObject Object to be appended.<br>
   * @return True if the append was successful, false otherwise.
   */
  public boolean append(OpenSimObject aObject) {
    return opensimCommonJNI.ArrayPtrsConstObj_append__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  /**
   * Append an array of objects.  Copies of the objects are NOT made<br>
   * <br>
   * @param aArray Array of objects to be appended.<br>
   * @return True if the append was successful, false otherwise.
   */
  public boolean append(ArrayPtrsConstObj aArray) {
    return opensimCommonJNI.ArrayPtrsConstObj_append__SWIG_1(swigCPtr, this, ArrayPtrsConstObj.getCPtr(aArray), aArray);
  }

  /**
   * Insert an object into the array at a specified index.  A copy of the<br>
   * specified object is NOT made.<br>
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
  public boolean insert(int aIndex, OpenSimObject aObject) {
    return opensimCommonJNI.ArrayPtrsConstObj_insert(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aObject), aObject);
  }

  /**
   * Remove an object from the array at a specified index.<br>
   * The object is deleted when it is removed.<br>
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
    return opensimCommonJNI.ArrayPtrsConstObj_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  /**
   * Remove an object from the array by specifying its address.<br>
   * If this array is set as the memory owner, the object is deleted when it<br>
   * is removed.<br>
   * <br>
   * This method is relatively computationally costly since many of the array<br>
   * elements may need to be shifted.<br>
   * <br>
   * @param aObject Pointer to the object to be removed.  If an object with the<br>
   * specified address is not found, no action is taken.<br>
   * @return True if the removal was successful, false otherwise.
   */
  public boolean remove(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject) {
    return opensimCommonJNI.ArrayPtrsConstObj_remove__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject));
  }

  /**
   * %Set the object at a specified index.  A copy of the object is NOT made.<br>
   * <br>
   * If the set method is successful and the array is set as the memory<br>
   * owner, the previous object stored at the specified index is deleted.<br>
   * <br>
   * @param aIndex Index of the array element to be set.  aIndex must be<br>
   * greater than zero and less than or equal to the size of the array.  Note<br>
   * that if aIndex is equal to the size of the array, the set is equivalent<br>
   * to an append.<br>
   * @param aObject Object to be set.<br>
   * @return True if the set was successful, false otherwise.<br>
   * @see setMemoryOwner()
   */
  public boolean set(int aIndex, OpenSimObject aObject) {
    return opensimCommonJNI.ArrayPtrsConstObj_set(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aObject), aObject);
  }

  /**
   * Get the object at a specified array index.<br>
   * <br>
   * If the index is negative or passed the end of the array, an exception<br>
   * is thrown.<br>
   * <br>
   * For faster execution, the array elements can be accessed through the<br>
   * overloaded operator[], which does no bounds checking.<br>
   * <br>
   * @param aIndex Array index of the desired object.<br>
   * @return Pointer to the desired object.<br>
   * @throws Exception if (aIndex&lt;0)||(aIndex&gt;=_size) or if the pointer<br>
   * at aIndex is NULL.<br>
   * @see operator[].
   */
  public OpenSimObject get(int aIndex) {
    long cPtr = opensimCommonJNI.ArrayPtrsConstObj_get__SWIG_0(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   * Get the object at a specified array index.<br>
   * <br>
   * If the index is negative or passed the end of the array, an exception<br>
   * is thrown.<br>
   * <br>
   * For faster execution, the array elements can be accessed through the<br>
   * overloaded operator[], which does no bounds checking.<br>
   * <br>
   * <br>
   * @return Pointer to the desired object.<br>
   * @throws Exception if (aIndex&lt;0)||(aIndex&gt;=_size) or if the pointer<br>
   * at aIndex is NULL.<br>
   * @see operator[].<br>
   * <br>
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
  public OpenSimObject get(String aName) {
    long cPtr = opensimCommonJNI.ArrayPtrsConstObj_get__SWIG_1(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   * Get the first object that has a specified name.<br>
   * <br>
   * If the array doesn't contain an object of the specified name, an<br>
   * exception is thrown.<br>
   * <br>
   * <br>
   * @return Pointer to the object.<br>
   * @throws Exception if no such object exists.<br>
   * @see getIndex()<br>
   * <br>
   * Get the last value in the array.<br>
   * <br>
   * @return Last value in the array.<br>
   * @throws Exception if the array is empty.
   */
  public OpenSimObject getLast() {
    long cPtr = opensimCommonJNI.ArrayPtrsConstObj_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   * Search for the largest value in the array that is less than or<br>
   * equal to a specified value.  If there is more than one element with this<br>
   * largest value, the index of the first of these elements can optionally be<br>
   * found, but this can be up to twice as costly.<br>
   * <br>
   * This method assumes that the array element values monotonically<br>
   * increase as the array index increases.  Note that monotonically<br>
   * increase means never decrease, so it is permissible for adjacent elements<br>
   * to have the same value.<br>
   * <br>
   * A binary search is performed (i.e., the array is repeatedly subdivided<br>
   * into two bins one of which must contain the specified until the<br>
   * appropriate element is identified), so the performance of this method<br>
   * is approximately ln(n), where n is the size of the array.<br>
   * <br>
   * <br>
   * @param aFindFirst If true, find the first element that satisfies<br>
   * the search.  If false, the index of any element that satisfies the<br>
   * search can be returned- which index will be returned depends on the<br>
   * length of the array and is therefore somewhat arbitrary. By default,<br>
   * this flag is false.<br>
   * @param aLo Lowest array index to consider in the search.<br>
   * @param aHi Highest array index to consider in the search.<br>
   * @return Index of the array element that has the largest value that is less<br>
   * than or equal to aValue.  If there is more than one such elements with the<br>
   * same value and aFindFirst is set to true, the index of the first of<br>
   * these elements is returned.  If an error is encountered (e.g., the array<br>
   * is empty), or the array contains no element that is less than or equal<br>
   * to aValue, -1 is returned.
   */
  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimCommonJNI.ArrayPtrsConstObj_searchBinary__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject), aFindFirst, aLo, aHi);
  }

  /**
   * Search for the largest value in the array that is less than or<br>
   * equal to a specified value.  If there is more than one element with this<br>
   * largest value, the index of the first of these elements can optionally be<br>
   * found, but this can be up to twice as costly.<br>
   * <br>
   * This method assumes that the array element values monotonically<br>
   * increase as the array index increases.  Note that monotonically<br>
   * increase means never decrease, so it is permissible for adjacent elements<br>
   * to have the same value.<br>
   * <br>
   * A binary search is performed (i.e., the array is repeatedly subdivided<br>
   * into two bins one of which must contain the specified until the<br>
   * appropriate element is identified), so the performance of this method<br>
   * is approximately ln(n), where n is the size of the array.<br>
   * <br>
   * <br>
   * @param aFindFirst If true, find the first element that satisfies<br>
   * the search.  If false, the index of any element that satisfies the<br>
   * search can be returned- which index will be returned depends on the<br>
   * length of the array and is therefore somewhat arbitrary. By default,<br>
   * this flag is false.<br>
   * @param aLo Lowest array index to consider in the search.<br>
   * <br>
   * @return Index of the array element that has the largest value that is less<br>
   * than or equal to aValue.  If there is more than one such elements with the<br>
   * same value and aFindFirst is set to true, the index of the first of<br>
   * these elements is returned.  If an error is encountered (e.g., the array<br>
   * is empty), or the array contains no element that is less than or equal<br>
   * to aValue, -1 is returned.
   */
  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject, boolean aFindFirst, int aLo) {
    return opensimCommonJNI.ArrayPtrsConstObj_searchBinary__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject), aFindFirst, aLo);
  }

  /**
   * Search for the largest value in the array that is less than or<br>
   * equal to a specified value.  If there is more than one element with this<br>
   * largest value, the index of the first of these elements can optionally be<br>
   * found, but this can be up to twice as costly.<br>
   * <br>
   * This method assumes that the array element values monotonically<br>
   * increase as the array index increases.  Note that monotonically<br>
   * increase means never decrease, so it is permissible for adjacent elements<br>
   * to have the same value.<br>
   * <br>
   * A binary search is performed (i.e., the array is repeatedly subdivided<br>
   * into two bins one of which must contain the specified until the<br>
   * appropriate element is identified), so the performance of this method<br>
   * is approximately ln(n), where n is the size of the array.<br>
   * <br>
   * <br>
   * @param aFindFirst If true, find the first element that satisfies<br>
   * the search.  If false, the index of any element that satisfies the<br>
   * search can be returned- which index will be returned depends on the<br>
   * length of the array and is therefore somewhat arbitrary. By default,<br>
   * this flag is false.<br>
   * <br>
   * <br>
   * @return Index of the array element that has the largest value that is less<br>
   * than or equal to aValue.  If there is more than one such elements with the<br>
   * same value and aFindFirst is set to true, the index of the first of<br>
   * these elements is returned.  If an error is encountered (e.g., the array<br>
   * is empty), or the array contains no element that is less than or equal<br>
   * to aValue, -1 is returned.
   */
  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject, boolean aFindFirst) {
    return opensimCommonJNI.ArrayPtrsConstObj_searchBinary__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject), aFindFirst);
  }

  /**
   * Search for the largest value in the array that is less than or<br>
   * equal to a specified value.  If there is more than one element with this<br>
   * largest value, the index of the first of these elements can optionally be<br>
   * found, but this can be up to twice as costly.<br>
   * <br>
   * This method assumes that the array element values monotonically<br>
   * increase as the array index increases.  Note that monotonically<br>
   * increase means never decrease, so it is permissible for adjacent elements<br>
   * to have the same value.<br>
   * <br>
   * A binary search is performed (i.e., the array is repeatedly subdivided<br>
   * into two bins one of which must contain the specified until the<br>
   * appropriate element is identified), so the performance of this method<br>
   * is approximately ln(n), where n is the size of the array.<br>
   * <br>
   * <br>
   * <br>
   * <br>
   * <br>
   * @return Index of the array element that has the largest value that is less<br>
   * than or equal to aValue.  If there is more than one such elements with the<br>
   * same value and aFindFirst is set to true, the index of the first of<br>
   * these elements is returned.  If an error is encountered (e.g., the array<br>
   * is empty), or the array contains no element that is less than or equal<br>
   * to aValue, -1 is returned.
   */
  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type aObject) {
    return opensimCommonJNI.ArrayPtrsConstObj_searchBinary__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Object_const_t__type.getCPtr(aObject));
  }

}
