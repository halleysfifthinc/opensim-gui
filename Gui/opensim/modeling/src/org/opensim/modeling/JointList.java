/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public JointList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointList obj) {
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
        opensimSimulationJNI.delete_JointList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  Constructor that takes a Component to iterate over (itself and its<br>
   *     descendants) and a ComponentFilter. You can change the filter later<br>
   *     using the setFilter() method. The filter is cloned on<br>
   *     construction and can only be changed using setFilter().
   */
  public JointList(Component root, ComponentFilter f) {
    this(opensimSimulationJNI.new_JointList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  /**
   *  Constructor that takes only a Component to iterate over (itself and its<br>
   *     descendants). ComponentFilterMatchAll is used internally. You can<br>
   *     change the filter using setFilter() method. 
   */
  public JointList(Component root) {
    this(opensimSimulationJNI.new_JointList__SWIG_1(Component.getCPtr(root), root), true);
  }

  /**
   *  Return an iterator pointing to the first component in the tree <br>
   *     traversal of components under and including the root component passed <br>
   *     to the ComponentList constructor. If T is non-const, then this iterator<br>
   *     allows you to modify the elements of this list. 
   */
  public JointIterator begin() {
    return new JointIterator(opensimSimulationJNI.JointList_begin__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Similar to begin(), except it does not permit<br>
   *     modifying the elements of the list, even if T is non-const (e.g., <br>
   *     ComponentList<body>). 
   */
  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Joint_const_t__type_t cbegin() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Joint_const_t__type_t(opensimSimulationJNI.JointList_cbegin(swigCPtr, this), true);
  }

  /**
   *  Use this method to check if you have reached the end of the list.<br>
   *     This points past the end of the list, *not* to the last item in the<br>
   *     list. 
   */
  public JointIterator end() {
    return new JointIterator(opensimSimulationJNI.JointList_end__SWIG_0(swigCPtr, this), true);
  }

  /**
   *  Use this method to check if you have reached the end of the list.<br>
   *     This points past the end of the list, *not* to the last item in the<br>
   *     list. Use this if you used cbegin(). 
   */
  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Joint_const_t__type_t cend() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Joint_const_t__type_t(opensimSimulationJNI.JointList_cend(swigCPtr, this), true);
  }

  /**
   *  Allow users to specify a custom ComponentFilter. This object makes a<br>
   *     clone of the passed in filter. 
   */
  public void setFilter(ComponentFilter filter) {
    opensimSimulationJNI.JointList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

}
