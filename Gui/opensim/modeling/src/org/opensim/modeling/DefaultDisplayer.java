/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DefaultDisplayer extends DisplayerInterface {
  private long swigCPtr;

  public DefaultDisplayer(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.DefaultDisplayer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DefaultDisplayer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_DefaultDisplayer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DefaultDisplayer() {
    this(opensimModelJNI.new_DefaultDisplayer(), true);
  }

  public DisplayerInterface clone() {
    long cPtr = opensimModelJNI.DefaultDisplayer_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DefaultDisplayer(cPtr, true);
  }

  public void generateDecorations(ModelComponent mc, boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.DefaultDisplayer_generateDecorations(swigCPtr, this, ModelComponent.getCPtr(mc), mc, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
