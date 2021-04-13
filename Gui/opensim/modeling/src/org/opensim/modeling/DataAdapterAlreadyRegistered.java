/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DataAdapterAlreadyRegistered extends OpenSimException {
  private transient long swigCPtr;

  public DataAdapterAlreadyRegistered(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.DataAdapterAlreadyRegistered_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DataAdapterAlreadyRegistered obj) {
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
        opensimCommonJNI.delete_DataAdapterAlreadyRegistered(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DataAdapterAlreadyRegistered(String file, long line, String func, String key) {
    this(opensimCommonJNI.new_DataAdapterAlreadyRegistered(file, line, func, key), true);
  }

}
