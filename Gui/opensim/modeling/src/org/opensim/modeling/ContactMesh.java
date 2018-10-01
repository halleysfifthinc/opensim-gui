/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ContactMesh extends ContactGeometry {
  private transient long swigCPtr;

  public ContactMesh(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ContactMesh_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ContactMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactMesh safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ContactMesh_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactMesh(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ContactMesh_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ContactMesh_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ContactMesh_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactMesh(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ContactMesh_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_filename(ContactMesh source) {
    opensimSimulationJNI.ContactMesh_copyProperty_filename(swigCPtr, this, ContactMesh.getCPtr(source), source);
  }

  public String get_filename(int i) {
    return opensimSimulationJNI.ContactMesh_get_filename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_filename(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ContactMesh_upd_filename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_filename(int i, String value) {
    opensimSimulationJNI.ContactMesh_set_filename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_filename(String value) {
    return opensimSimulationJNI.ContactMesh_append_filename(swigCPtr, this, value);
  }

  public void constructProperty_filename(String initValue) {
    opensimSimulationJNI.ContactMesh_constructProperty_filename(swigCPtr, this, initValue);
  }

  public String get_filename() {
    return opensimSimulationJNI.ContactMesh_get_filename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_filename() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.ContactMesh_upd_filename__SWIG_1(swigCPtr, this), false);
  }

  public void set_filename(String value) {
    opensimSimulationJNI.ContactMesh_set_filename__SWIG_1(swigCPtr, this, value);
  }

  public ContactMesh() {
    this(opensimSimulationJNI.new_ContactMesh__SWIG_0(), true);
  }

  public ContactMesh(String filename, Vec3 location, Vec3 orientation, PhysicalFrame frame) {
    this(opensimSimulationJNI.new_ContactMesh__SWIG_1(filename, Vec3.getCPtr(location), location, Vec3.getCPtr(orientation), orientation, PhysicalFrame.getCPtr(frame), frame), true);
  }

  public ContactMesh(String filename, Vec3 location, Vec3 orientation, PhysicalFrame frame, String name) {
    this(opensimSimulationJNI.new_ContactMesh__SWIG_2(filename, Vec3.getCPtr(location), location, Vec3.getCPtr(orientation), orientation, PhysicalFrame.getCPtr(frame), frame, name), true);
  }

  public SWIGTYPE_p_SimTK__ContactGeometry createSimTKContactGeometry() {
    return new SWIGTYPE_p_SimTK__ContactGeometry(opensimSimulationJNI.ContactMesh_createSimTKContactGeometry(swigCPtr, this), true);
  }

  public String getFilename() {
    return opensimSimulationJNI.ContactMesh_getFilename(swigCPtr, this);
  }

  public void setFilename(String filename) {
    opensimSimulationJNI.ContactMesh_setFilename(swigCPtr, this, filename);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State s, ArrayDecorativeGeometry geometry) {
    opensimSimulationJNI.ContactMesh_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(s), s, ArrayDecorativeGeometry.getCPtr(geometry), geometry);
  }

}
