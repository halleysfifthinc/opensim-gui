/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is a compile-time equivalent of "true", used in compile-time<br>
 * condition checking in templatized implementations. *
 */
public class TrueType {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public TrueType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(TrueType obj) {
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
        opensimSimbodyJNI.delete_TrueType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TrueType() {
    this(opensimSimbodyJNI.new_TrueType(), true);
  }

}
