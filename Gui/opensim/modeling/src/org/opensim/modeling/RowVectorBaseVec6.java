/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a dataless rehash of the MatrixBase class to specialize it for RowVectors.<br>
 *  This mostly entails overriding a few of the methods. Note that all the MatrixBase<br>
 *  operations remain available if you static_cast&lt;&gt; this up to a MatrixBase.
 */
public class RowVectorBaseVec6 extends MatrixBaseVec6 {
  private transient long swigCPtr;

  public RowVectorBaseVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorBaseVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorBaseVec6 obj) {
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
        opensimSimbodyJNI.delete_RowVectorBaseVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  /**
   *  These constructors create new RowVectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are 1 x n with the number of rows locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 1x0 matrix locked at 1 row; you can<br>
   *  provide an initial allocation if you want.
   */
  public RowVectorBaseVec6(int n) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec6__SWIG_0(n), true);
  }

  /**
   *  These constructors create new RowVectorBase objects which own their<br>
   *  own data and are (at least by default) resizable. The resulting matrices<br>
   *  are 1 x n with the number of rows locked at 1. If there is any data<br>
   *  allocated but not explicitly initialized, that data will be uninitialized<br>
   *  garbage in Release builds but will be initialized to NaN (at a performance<br>
   *  cost) in Debug builds.<br>
   *  <br>
   *  Default constructor makes a 1x0 matrix locked at 1 row; you can<br>
   *  provide an initial allocation if you want.
   */
  public RowVectorBaseVec6() {
    this(opensimSimbodyJNI.new_RowVectorBaseVec6__SWIG_1(), true);
  }

  /**
   *  Copy constructor is a deep copy (not appropriate for views!). That<br>
   *  means it creates a new, densely packed vector whose elements are<br>
   *  initialized from the source object.    
   */
  public RowVectorBaseVec6(RowVectorBaseVec6 source) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec6__SWIG_2(RowVectorBaseVec6.getCPtr(source), source), true);
  }

  /**
   *  Construct an owner row vector of length n, with each element initialized to<br>
   *  the given value.
   */
  public RowVectorBaseVec6(int n, Vec6 initialValue) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec6__SWIG_3(n, Vec6.getCPtr(initialValue), initialValue), true);
  }

  public int size() {
    return opensimSimbodyJNI.RowVectorBaseVec6_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.RowVectorBaseVec6_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.RowVectorBaseVec6_ncol(swigCPtr, this);
  }

  public SWIGTYPE_p_ptrdiff_t nelt() {
    return new SWIGTYPE_p_ptrdiff_t(opensimSimbodyJNI.RowVectorBaseVec6_nelt(swigCPtr, this), true);
  }

  public RowVectorViewVec6 index(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewVec6(opensimSimbodyJNI.RowVectorBaseVec6_index(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorViewVec6 updIndex(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewVec6(opensimSimbodyJNI.RowVectorBaseVec6_updIndex(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorBaseVec6 resize(int n) {
    return new RowVectorBaseVec6(opensimSimbodyJNI.RowVectorBaseVec6_resize(swigCPtr, this, n), false);
  }

  public RowVectorBaseVec6 resizeKeep(int n) {
    return new RowVectorBaseVec6(opensimSimbodyJNI.RowVectorBaseVec6_resizeKeep(swigCPtr, this, n), false);
  }

  public void clear() {
    opensimSimbodyJNI.RowVectorBaseVec6_clear(swigCPtr, this);
  }

  public Vec6 sum() {
    return new Vec6(opensimSimbodyJNI.RowVectorBaseVec6_sum(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__VecT_6_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_6_double_1_t_t_t begin() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__VecT_6_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_6_double_1_t_t_t(opensimSimbodyJNI.RowVectorBaseVec6_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__VecT_6_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_6_double_1_t_t_t end() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__VecT_6_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_6_double_1_t_t_t(opensimSimbodyJNI.RowVectorBaseVec6_end(swigCPtr, this), true);
  }

}
