/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdMapStringTimeSeriesTableVec3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StdMapStringTimeSeriesTableVec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StdMapStringTimeSeriesTableVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_StdMapStringTimeSeriesTableVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdMapStringTimeSeriesTableVec3() {
    this(opensimCommonJNI.new_StdMapStringTimeSeriesTableVec3__SWIG_0(), true);
  }

  public StdMapStringTimeSeriesTableVec3(StdMapStringTimeSeriesTableVec3 arg0) {
    this(opensimCommonJNI.new_StdMapStringTimeSeriesTableVec3__SWIG_1(StdMapStringTimeSeriesTableVec3.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return opensimCommonJNI.StdMapStringTimeSeriesTableVec3_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimCommonJNI.StdMapStringTimeSeriesTableVec3_empty(swigCPtr, this);
  }

  public void clear() {
    opensimCommonJNI.StdMapStringTimeSeriesTableVec3_clear(swigCPtr, this);
  }

  public TimeSeriesTableVec3 get(String key) {
    long cPtr = opensimCommonJNI.StdMapStringTimeSeriesTableVec3_get(swigCPtr, this, key);
    return (cPtr == 0) ? null : new TimeSeriesTableVec3(cPtr, true);
  }

  public void set(String key, TimeSeriesTableVec3 x) {
    opensimCommonJNI.StdMapStringTimeSeriesTableVec3_set(swigCPtr, this, key, TimeSeriesTableVec3.getCPtr(x), x);
  }

  public void del(String key) {
    opensimCommonJNI.StdMapStringTimeSeriesTableVec3_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return opensimCommonJNI.StdMapStringTimeSeriesTableVec3_has_key(swigCPtr, this, key);
  }

}
