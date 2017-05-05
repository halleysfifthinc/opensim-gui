/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TableSource extends Component {
  private transient long swigCPtr;

  public TableSource(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TableSource_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_TableSource(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableSource safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.TableSource_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableSource(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.TableSource_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.TableSource_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.TableSource_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableSource(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.TableSource_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_filename(TableSource source) {
    opensimCommonJNI.TableSource_copyProperty_filename(swigCPtr, this, TableSource.getCPtr(source), source);
  }

  public String get_filename(int i) {
    return opensimCommonJNI.TableSource_get_filename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_filename(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSource_upd_filename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_filename(int i, String value) {
    opensimCommonJNI.TableSource_set_filename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_filename(String value) {
    return opensimCommonJNI.TableSource_append_filename(swigCPtr, this, value);
  }

  public void constructProperty_filename(String initValue) {
    opensimCommonJNI.TableSource_constructProperty_filename(swigCPtr, this, initValue);
  }

  public String get_filename() {
    return opensimCommonJNI.TableSource_get_filename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_filename() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSource_upd_filename__SWIG_1(swigCPtr, this), false);
  }

  public void set_filename(String value) {
    opensimCommonJNI.TableSource_set_filename__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_tablename(TableSource source) {
    opensimCommonJNI.TableSource_copyProperty_tablename(swigCPtr, this, TableSource.getCPtr(source), source);
  }

  public String get_tablename(int i) {
    return opensimCommonJNI.TableSource_get_tablename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_tablename(int i) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSource_upd_tablename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_tablename(int i, String value) {
    opensimCommonJNI.TableSource_set_tablename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_tablename(String value) {
    return opensimCommonJNI.TableSource_append_tablename(swigCPtr, this, value);
  }

  public void constructProperty_tablename(String initValue) {
    opensimCommonJNI.TableSource_constructProperty_tablename(swigCPtr, this, initValue);
  }

  public String get_tablename() {
    return opensimCommonJNI.TableSource_get_tablename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_tablename() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.TableSource_upd_tablename__SWIG_1(swigCPtr, this), false);
  }

  public void set_tablename(String value) {
    opensimCommonJNI.TableSource_set_tablename__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_all_columns(boolean value) {
    opensimCommonJNI.TableSource__has_output_all_columns_set(swigCPtr, this, value);
  }

  public boolean get_has_output_all_columns() {
    return opensimCommonJNI.TableSource__has_output_all_columns_get(swigCPtr, this);
  }

  public void set_has_output_column(boolean value) {
    opensimCommonJNI.TableSource__has_output_column_set(swigCPtr, this, value);
  }

  public boolean get_has_output_column() {
    return opensimCommonJNI.TableSource__has_output_column_get(swigCPtr, this);
  }

  public TableSource() {
    this(opensimCommonJNI.new_TableSource__SWIG_0(), true);
  }

  public TableSource(TableSource arg0) {
    this(opensimCommonJNI.new_TableSource__SWIG_1(TableSource.getCPtr(arg0), arg0), true);
  }

  public TableSource(TimeSeriesTable table) {
    this(opensimCommonJNI.new_TableSource__SWIG_2(TimeSeriesTable.getCPtr(table), table), true);
  }

  public TableSource(String filename) {
    this(opensimCommonJNI.new_TableSource__SWIG_3(filename), true);
  }

  public TableSource(String filename, String tablename) {
    this(opensimCommonJNI.new_TableSource__SWIG_4(filename, tablename), true);
  }

  public TimeSeriesTable getTable() {
    return new TimeSeriesTable(opensimCommonJNI.TableSource_getTable(swigCPtr, this), true);
  }

  public void setTable(TimeSeriesTable table) {
    opensimCommonJNI.TableSource_setTable__SWIG_0(swigCPtr, this, TimeSeriesTable.getCPtr(table), table);
  }

  public void setTable(String filename) {
    opensimCommonJNI.TableSource_setTable__SWIG_1(swigCPtr, this, filename);
  }

  public void setTable(String filename, String tablename) {
    opensimCommonJNI.TableSource_setTable__SWIG_2(swigCPtr, this, filename, tablename);
  }

}