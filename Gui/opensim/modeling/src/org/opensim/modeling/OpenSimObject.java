/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

/**
 *  This is the base class for all %OpenSim objects that are serializable <br>
 * (meaning they can be written to and read back from files). In particular, all <br>
 * ModelComponent objects derive from %Object. It provides a common base class <br>
 * from which to derive serializable objects and also some basic functionality, <br>
 * such as writing to files in XML format, managing properties, and the equality, <br>
 * less than, and output operators.<br>
 * <br>
 * An %Object maintains a table of "properties" that know how to read themselves <br>
 * from XML and write themselves to XML. The available Property types are<br>
 *   -# Primitive data types (int, bool, double, std::string, ...) <br>
 *   -# Properties that contain other Objects, <br>
 *   -# Properties containing lists of either of the previous 2 categories<br>
 * <br>
 * It is important to note that Objects and Properties together form a recursive<br>
 * tree structure that is the representation of an %OpenSim Model. See the<br>
 * documentation for the OpenSim::Property class for more information.<br>
 * <br>
 * <h3>%Object declaration</h3><br>
 * <br>
 * The declaration of every class derived from %Object <i>must</i> have its first line<br>
 * (that is, immediately after the "{" in the class declaration) one of four<br>
 * standard "boilerplate" macros:<br>
 * {@code 
  OpenSim_DECLARE_CONCRETE_OBJECT  (ClassName, SuperclassName);
  OpenSim_DECLARE_CONCRETE_OBJECT_T(ClassName, T, SuperclassName);
  OpenSim_DECLARE_ABSTRACT_OBJECT  (ClassName, SuperclassName);
  OpenSim_DECLARE_ABSTRACT_OBJECT_T(ClassName, T, SuperclassName);
}<br>
 * ("Superclass" means the immediate class from which the class derives; that<br>
 * terminology is borrowed from Java. It is often called the "Parent" class but <br>
 * we'll use "Super" which is more precise.) The "_T" variants of the above macros <br>
 * are used for objects that are templatized, like Set&lt;T&gt;. <br>
 * <br>
 * These macros provide a standardized set of declarations for every object, <br>
 * including<br>
 * {@code 
    typedef ClassName      Self;                // for all classes
    typedef SuperclassName Super;               // for all classes
    static const std::string& getClassName();   // for all classes
    const std::string& getConcreteClassName();  // for concrete classes only
    ClassName* clone() const;                   // see below
}<br>
 * getClassName() is a static method that returns the name of the %Object-derived <br>
 * class for which it is invoked. For example, ModelComponent::getClassName() <br>
 * returns "ModelComponent". In contrast, getConcreteClassName() is a pure virtual <br>
 * method of %Object that returns the class name of the actual concrete object <br>
 * being referenced through the abstract base class. This method is implemented <br>
 * only in concrete classes.<br>
 * <br>
 * Note that getClassName() and getConcreteClassName() will return the same string<br>
 * only if the referenced class is concrete. For example,<br>
 * {@code 
    Function* funcp = new LinearFunction(...);
    std::cout << funcp->getClassName();          // output: "Function"
    std::cout << funcp->getConcreteClassName();  // output: "LinearFunction"
}<br>
 * <br>
 * For concrete objects, the class name is used as the "object type tag", the tag <br>
 * string that will appear in XML files. Also, when a Property&lt;T&gt; has no name<br>
 * (allowed for properties that contain just a single object) the object class <br>
 * name T (which may be abstract like Function or ModelComponent) is used to <br>
 * select the property. See OpenSim::Property for more information.<br>
 * <br>
 * The standard clone() method produces a duplicate of a concrete object and thus<br>
 * is implemented only for concrete classes. However, the return type must<br>
 * always match the type of the invoking object (this is called a "covariant type"<br>
 * and does not change the method's identity). It is therefore redeclared even in<br>
 * abstract classes, but remains pure virtual in those cases. That means if you<br>
 * invoke Function::clone() you'll get back a Function* rather than an Object*;<br>
 * this avoids many unnecessary invocations of the awkward and expensive<br>
 * dynamic_cast operator.<br>
 * <br>
 * <h3>%Object registration and renaming</h3><br>
 * <br>
 * An %Object type needs to be "registered" by calling Object::registerType() with<br>
 * an instance of a concrete object so that the serialization infrastructure knows <br>
 * what kind of %Object to create when it encounters a specific XML tag. This <br>
 * associates the concrete object's class name (object type tag) with a default <br>
 * instance of that object. The registration process is normally done during <br>
 * dynamic library (DLL) loading, that is, as part of the static initializer<br>
 * execution that occurs before program execution.<br>
 * <br>
 * For backwards compatibility, we support a renaming mechanism in which <br>
 * now-deprecated class names can be mapped to their current equivalents. This<br>
 * is done via a string-to-string table mapping the old names to the new ones;<br>
 * only the current names appear in the registered objects table. Specification of<br>
 * these aliases is done immediately after registration in the DLL static <br>
 * initializer.<br>
 * <br>
 * <h3>Defaults mechanism</h3><br>
 * <br>
 * When an %Object is registered (either programmatically, or<br>
 * overridden in the defaults section of a document), a copy of it is maintained <br>
 * in a dictionary as a "default" object of its class. When new instances of this <br>
 * class are requested, the contents of the default object are used to populate the<br>
 * new instance before deserialization. This allows for specifying default values<br>
 * that will be commonly used in one place in the XML file rather than with each <br>
 * object which leads to smaller files that are easier to read. Property values<br>
 * that obtain their values from the defaults and are not subsequently overridden<br>
 * are marked as being default values, allowing us to avoid writing<br>
 * them back out when serializing.<br>
 * <br>
 * @author Frank C. Anderson, Ayman Habib, Ajay Seth, Michael Sherman <br>
 * @see OpenSim#Property
 */
public class OpenSimObject {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public OpenSimObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OpenSimObject obj) {
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
        opensimCommonJNI.delete_OpenSimObject(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof OpenSimObject)
      equal = (((OpenSimObject)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  // cache the Id to avoid recomputation for hashing purposes
  private int cacheId=-1;  
 
  public int hashCode() {
     if (cacheId==-1)
        cacheId=(int)swigCPtr;
     
    return( cacheId );
  }
  // Flag to indicate if an object is pickable in the GUI
  // Example of a non-pickable object would be a PathWrapPoint
  private boolean pickable=true;
  
  public boolean isPickable() {
	 return pickable;
  }
  
  public void setPickable(boolean onOff) {
	 pickable=onOff;
  }
  public void markAdopted() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) swigCMemOwn = false;
    }
  }  

  /**
   *  Create a new heap-allocated copy of the concrete object to which this <br>
   *     %Object refers. It is up to the caller to delete the returned object<br>
   *     when no longer needed. Every concrete object deriving from %Object <br>
   *     implements this pure virtual method automatically, via the declaration<br>
   *     macro it invokes (e.g., OpenSim_DECLARE_CONCRETE_OBJECT()). Note that the <br>
   *     concrete class overrides modify the return type to be a pointer to the<br>
   *     <i>concrete</i> object; that still overrides the base class method because the <br>
   *     return type is covariant with (that is, derives from) %Object. *
   */
  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.OpenSimObject_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, true);
  }

  /**
   *  Returns the class name of the concrete %Object-derived class of the<br>
   *     actual object referenced by this %Object, as a string. This is the <br>
   *     string that is used as the tag for this concrete object in an XML file.<br>
   *     Every concrete class derived from %Object automatically overrides this<br>
   *     method via the declaration macro it uses. See getClassName() to get the <br>
   *     class name of the referencing (possibly abstract) class rather than the <br>
   *     concrete object.<br>
   *     @see getClassName() *
   */
  public String getConcreteClassName() {
    return opensimCommonJNI.OpenSimObject_getConcreteClassName(swigCPtr, this);
  }

  /**
   *  Conditional comment: 
   */
  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.OpenSimObject_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  /**
   *  End of conditional comment.<br>
   * Equality operator wrapper for use from languages not supporting operator<br>
   * overloading.
   */
  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObject_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  /**
   *  %Set the name of the Object. 
   */
  public void setName(String name) {
    opensimCommonJNI.OpenSimObject_setName(swigCPtr, this, name);
  }

  /**
   *  Get the name of this Object. 
   */
  public String getName() {
    return opensimCommonJNI.OpenSimObject_getName(swigCPtr, this);
  }

  /**
   *  %Set description, a one-liner summary. 
   */
  public void setDescription(String description) {
    opensimCommonJNI.OpenSimObject_setDescription(swigCPtr, this, description);
  }

  /**
   *  Get description, a one-liner summary. 
   */
  public String getDescription() {
    return opensimCommonJNI.OpenSimObject_getDescription(swigCPtr, this);
  }

  /**
   *  Get Authors of this Object 
   */
  public String getAuthors() {
    return opensimCommonJNI.OpenSimObject_getAuthors(swigCPtr, this);
  }

  /**
   *  %Set Authors of this object. Call this method in your constructor if needed. 
   */
  public void setAuthors(String authors) {
    opensimCommonJNI.OpenSimObject_setAuthors(swigCPtr, this, authors);
  }

  /**
   *  Get references or publications to cite if using this object. 
   */
  public String getReferences() {
    return opensimCommonJNI.OpenSimObject_getReferences(swigCPtr, this);
  }

  /**
   *  %Set references or publications to cite if using this object. 
   */
  public void setReferences(String references) {
    opensimCommonJNI.OpenSimObject_setReferences(swigCPtr, this, references);
  }

  /**
   * * Determine how many properties are stored with this %Object. These<br>
   *     are numbered 0..n-1 in the order they were created. *
   */
  public int getNumProperties() {
    return opensimCommonJNI.OpenSimObject_getNumProperties(swigCPtr, this);
  }

  /**
   *  Get a const reference to a property by its index number, returned as<br>
   *     an AbstractProperty. *
   */
  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimCommonJNI.OpenSimObject_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  /**
   *  Get a writable reference to a property by its index number, returned as<br>
   *     an AbstractProperty. *
   */
  public AbstractProperty updPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimCommonJNI.OpenSimObject_updPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  /**
   *  Return true if this %Object has a property of any type with the <br>
   *     given <i>name</i>, which must not be empty. *
   */
  public boolean hasProperty(String name) {
    return opensimCommonJNI.OpenSimObject_hasProperty(swigCPtr, this, name);
  }

  /**
   *  Get a const reference to a property by its name, returned as<br>
   *     an AbstractProperty. An exception is thrown if no property by this name<br>
   *     is present in this %Object. *
   */
  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimCommonJNI.OpenSimObject_getPropertyByName(swigCPtr, this, name), false);
  }

  /**
   *  Get a writable reference to a property by its name, returned as<br>
   *     an AbstractProperty. An exception is thrown if no property by this name<br>
   *     is present in this %Object. *
   */
  public AbstractProperty updPropertyByName(String name) {
    return new AbstractProperty(opensimCommonJNI.OpenSimObject_updPropertyByName(swigCPtr, this, name), false);
  }

  /**
   *  Returns <code>true</code> if no property's value has changed since the last time<br>
   *     setObjectIsUpToDateWithProperties() was called. *
   */
  public boolean isObjectUpToDateWithProperties() {
    return opensimCommonJNI.OpenSimObject_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  /**
   *  Dump formatted property information to a given output stream, useful<br>
   *     for creating a "help" facility for registered objects. Object name, <br>
   *     property name, and property comment are output. Input is a<br>
   *     class name and property name. If the property name is the empty string or<br>
   *     just "*", then information for all properties in the class is printed. If <br>
   *     the class name is empty, information in all properties of all registered <br>
   *     classes is printed.<br>
   *     @param os <br>
   *         Output stream to which info is printed.<br>
   *     @param classNameDotPropertyName <br>
   *         A string combining the class name and property name. The two names <br>
   *         should be separated by a period (ClassName.PropertyName). If <br>
   *         PropertyName is empty or "*", the information for all properties in the <br>
   *         class is printed. If ClassName is empty, the information for the <br>
   *         properties of all registered classes is printed.<br>
   *     @param printFlagInfo <br>
   *         Print to the ostream some instructions for using the -PropertyInfo<br>
   *         command line flag.<br>
   * <br>
   *     Returns false if the provided names do not match known classes or<br>
   *     properties; otherwise, returns true. *
   */
  public static boolean PrintPropertyInfo(SWIGTYPE_p_std__ostream os, String classNameDotPropertyName, boolean printFlagInfo) {
    return opensimCommonJNI.OpenSimObject_PrintPropertyInfo__SWIG_0(SWIGTYPE_p_std__ostream.getCPtr(os), classNameDotPropertyName, printFlagInfo);
  }

  /**
   *  Dump formatted property information to a given output stream, useful<br>
   *     for creating a "help" facility for registered objects. Object name, <br>
   *     property name, and property comment are output. Input is a<br>
   *     class name and property name. If the property name is the empty string or<br>
   *     just "*", then information for all properties in the class is printed. If <br>
   *     the class name is empty, information in all properties of all registered <br>
   *     classes is printed.<br>
   *     @param os <br>
   *         Output stream to which info is printed.<br>
   *     @param classNameDotPropertyName <br>
   *         A string combining the class name and property name. The two names <br>
   *         should be separated by a period (ClassName.PropertyName). If <br>
   *         PropertyName is empty or "*", the information for all properties in the <br>
   *         class is printed. If ClassName is empty, the information for the <br>
   *         properties of all registered classes is printed.<br>
   *     <br>
   * <br>
   *     Returns false if the provided names do not match known classes or<br>
   *     properties; otherwise, returns true. *
   */
  public static boolean PrintPropertyInfo(SWIGTYPE_p_std__ostream os, String classNameDotPropertyName) {
    return opensimCommonJNI.OpenSimObject_PrintPropertyInfo__SWIG_1(SWIGTYPE_p_std__ostream.getCPtr(os), classNameDotPropertyName);
  }

  /**
   *  Same as the other signature but the class name and property name are<br>
   *     provided as two separate strings. <br>
   *     Returns false if the provided names do not match known classes or<br>
   *     properties; otherwise, returns true. *
   */
  public static boolean PrintPropertyInfo(SWIGTYPE_p_std__ostream os, String className, String propertyName, boolean printFlagInfo) {
    return opensimCommonJNI.OpenSimObject_PrintPropertyInfo__SWIG_2(SWIGTYPE_p_std__ostream.getCPtr(os), className, propertyName, printFlagInfo);
  }

  /**
   *  Same as the other signature but the class name and property name are<br>
   *     provided as two separate strings. <br>
   *     Returns false if the provided names do not match known classes or<br>
   *     properties; otherwise, returns true. *
   */
  public static boolean PrintPropertyInfo(SWIGTYPE_p_std__ostream os, String className, String propertyName) {
    return opensimCommonJNI.OpenSimObject_PrintPropertyInfo__SWIG_3(SWIGTYPE_p_std__ostream.getCPtr(os), className, propertyName);
  }

  /**
   * ** Register an instance of a class; if the class is already registered it<br>
   *     will be replaced. This is normally called as part of the static<br>
   *     initialization of a dynamic library (DLL). The supplied object's concrete<br>
   *     class name will be used as a key, and a <i>copy</i> (via clone()) of the <br>
   *     supplied %Object is used as the default value for objects of this type when <br>
   *     created (typically during the deserialization process when reading an <br>
   *     XML file). *
   */
  public static void registerType(OpenSimObject defaultObject) {
    opensimCommonJNI.OpenSimObject_registerType(OpenSimObject.getCPtr(defaultObject), defaultObject);
  }

  /**
   *  Support versioning by associating the current %Object type with an <br>
   *     old name. This is only allowed if <i>newTypeName</i> has already been <br>
   *     registered with registerType(). Renaming is applied first prior to lookup<br>
   *     so can be used both for translating now-obsolete names to their new names<br>
   *     and for overriding one registered type with another. *
   */
  public static void renameType(String oldTypeName, String newTypeName) {
    opensimCommonJNI.OpenSimObject_renameType(oldTypeName, newTypeName);
  }

  /**
   *  Return a pointer to the default instance of the registered (concrete)<br>
   *     %Object whose class name is given, or NULL if the type is not registered.<br>
   *     Note that this refers to the default %Object instance that is stored with<br>
   *     the %Object class; do not delete it! If you want a copy of this object<br>
   *     instead, use newInstanceOfType(). The given <i>concreteClassName</i> will be<br>
   *     mapped through the renamed type table if necessary but the returned object<br>
   *     will always have the new type name, which may differ from the supplied <br>
   *     one. Note that renaming is applied first, prior to looking up the name<br>
   *     in the registered objects table.<br>
   *     @see registerType(), renameType() *
   */
  public static OpenSimObject getDefaultInstanceOfType(String concreteClassName) {
    long cPtr = opensimCommonJNI.OpenSimObject_getDefaultInstanceOfType(concreteClassName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   *  Create a new instance of the concrete %Object type whose class name is <br>
   *     given as <i>concreteClassName</i>. The instance is initialized to the default <br>
   *     object of corresponding type, possibly after renaming to the current class <br>
   *     name. Writes a message to stderr and returns null if the tag isn't <br>
   *     registered. *
   */
  public static OpenSimObject newInstanceOfType(String concreteClassName) {
    long cPtr = opensimCommonJNI.OpenSimObject_newInstanceOfType(concreteClassName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   *  Retrieve all the typenames registered so far. This is done by traversing<br>
   *     the registered objects map, so only concrete classes that have registered <br>
   *     instances are returned; renamed types will not appear unless they were<br>
   *     separately registered. (Note that even if one registered type has been<br>
   *     renamed to another, both will appear in the returned list.) The result <br>
   *     returned in <i>typeNames</i> should not be cached while more shared libraries <br>
   *     or plugins are loaded, because more types may be registered as a result. <br>
   *     Instead the list should be reconstructed whenever in doubt. *
   */
  public static void getRegisteredTypenames(ArrayStr typeNames) {
    opensimCommonJNI.OpenSimObject_getRegisteredTypenames(ArrayStr.getCPtr(typeNames), typeNames);
  }

  /**
   * ** Create an %OpenSim object whose type is based on the tag at the root <br>
   *     node of the XML file passed in. This is useful since the constructor of <br>
   *     %Object doesn't have the proper type info. This works by using the defaults <br>
   *     table so that %Object does not need to know about its derived classes. It <br>
   *     uses the defaults table to get an instance. *
   */
  public static OpenSimObject makeObjectFromFile(String fileName) {
    long cPtr = opensimCommonJNI.OpenSimObject_makeObjectFromFile(fileName);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   *  We're given an XML element from which we are to populate this %Object.<br>
   *     If the element has a <code>file</code> attribute, we'll instead read the %Object from<br>
   *     that file. Otherwise we'll invoke updateFromXMLNode() to read the %Object<br>
   *     directly from the supplied element. Note that a relative file name will<br>
   *     be interpreted relative to the current working directory, but that will<br>
   *     normally have been set earlier to the directory containing the top-level <br>
   *     (root) %Object, such as the Model file. *
   */
  public void readObjectFromXMLNodeOrFile(SWIGTYPE_p_SimTK__Xml__Element objectElement, int versionNumber) {
    opensimCommonJNI.OpenSimObject_readObjectFromXMLNodeOrFile(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(objectElement), versionNumber);
  }

  /**
   *  Use this method to deserialize an object from a SimTK::Xml::Element. The <br>
   *     element is assumed to be in the format consistent with the passed-in <br>
   *     <i>versionNumber</i>. If there is a file attribute in <i>objectElement</i> it<br>
   *     will be ignored; if you want it processed you should call <br>
   *     readObjectFromXMLNodeOrFile() instead. *
   */
  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element objectElement, int versionNumber) {
    opensimCommonJNI.OpenSimObject_updateFromXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(objectElement), versionNumber);
  }

  /**
   *  Serialize this object into the XML node that represents it.   <br>
   *     @param parent <br>
   *         Parent XML node of this object. Sending in a parent node allows an XML <br>
   *         node to be generated for this object if it doesn't already have one. If <br>
   *         no parent node is supplied and this object doesn't already have an XML <br>
   *         node, this object will become the root node for a new XML document. If <br>
   *         this object already has an XML node associated with it, no new nodes <br>
   *         are ever generated and the parent node is not used.<br>
   *     @param prop (optional)<br>
   *         The pointer to the property that contains this object. If it is<br>
   *         present, check if the property is unnamed and if NOT, use the property<br>
   *         name as its name when updating the XML node. *
   */
  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent, AbstractProperty prop) {
    opensimCommonJNI.OpenSimObject_updateXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent), AbstractProperty.getCPtr(prop), prop);
  }

  /**
   *  Serialize this object into the XML node that represents it.   <br>
   *     @param parent <br>
   *         Parent XML node of this object. Sending in a parent node allows an XML <br>
   *         node to be generated for this object if it doesn't already have one. If <br>
   *         no parent node is supplied and this object doesn't already have an XML <br>
   *         node, this object will become the root node for a new XML document. If <br>
   *         this object already has an XML node associated with it, no new nodes <br>
   *         are ever generated and the parent node is not used.<br>
   *     
   */
  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimCommonJNI.OpenSimObject_updateXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  /**
   *  Inlined means an in-memory Object that is not associated with<br>
   *     an XMLDocument. *
   */
  public boolean getInlined() {
    return opensimCommonJNI.OpenSimObject_getInlined(swigCPtr, this);
  }

  /**
   *  Mark this as inlined or not and optionally provide a file name<br>
   *     to associate with the new XMLDocument for the non-inline case. If <br>
   *     there was already a document associated with this object it is<br>
   *     deleted. *
   */
  public void setInlined(boolean aInlined, String aFileName) {
    opensimCommonJNI.OpenSimObject_setInlined__SWIG_0(swigCPtr, this, aInlined, aFileName);
  }

  /**
   *  Mark this as inlined or not and optionally provide a file name<br>
   *     to associate with the new XMLDocument for the non-inline case. If <br>
   *     there was already a document associated with this object it is<br>
   *     deleted. *
   */
  public void setInlined(boolean aInlined) {
    opensimCommonJNI.OpenSimObject_setInlined__SWIG_1(swigCPtr, this, aInlined);
  }

  /**
   *  If there is a document associated with this object then return the<br>
   *     file name maintained by the document. Otherwise return an empty string. *
   */
  public String getDocumentFileName() {
    return opensimCommonJNI.OpenSimObject_getDocumentFileName(swigCPtr, this);
  }

  /**
   *  If there is a document associated with this object then return its<br>
   *         version number. For example this is 30000 for OpenSim 3.x documents <br>
   *         and is 305xx for OpenSim 4.0 beta and above. If there is no document<br>
   *         associated with the object, the method returns -1.
   */
  public int getDocumentFileVersion() {
    return opensimCommonJNI.OpenSimObject_getDocumentFileVersion(swigCPtr, this);
  }

  public void setAllPropertiesUseDefault(boolean aUseDefault) {
    opensimCommonJNI.OpenSimObject_setAllPropertiesUseDefault(swigCPtr, this, aUseDefault);
  }

  /**
   *  Write this %Object into an XML file of the given name; conventionally<br>
   *     the suffix to use is ".osim". This is useful for writing out a Model that<br>
   *     has been created programmatically, and also very useful for testing and<br>
   *     debugging. If object has invalid connections, then printing is aborted.<br>
   *     You can override this behavior by setting the debug level to at least 1 <br>
   *     (e.g., Object::setDebugLevel(1)) prior to printing. *
   */
  public boolean print(String fileName) {
    return opensimCommonJNI.OpenSimObject_print(swigCPtr, this, fileName);
  }

  /**
   *  dump the XML representation of this %Object into an std::string and return it.<br>
   *     Mainly intended for debugging and for use by the XML browser in the GUI. *
   */
  public String dump() {
    return opensimCommonJNI.OpenSimObject_dump(swigCPtr, this);
  }

  /**
   * ** Return the name of this class as a string; i.e., "Object". See <br>
   *     getConcreteClassName() if you want the class name of the underlying concrete <br>
   *     object instead. Note that this method is automatically supplied for <br>
   *     every class declaration that derives from Object via the standard macro<br>
   *     provided for that purpose. See introductory text for this Object class<br>
   *     for more information. *
   */
  public static String getClassName() {
    return opensimCommonJNI.OpenSimObject_getClassName();
  }

  /**
   *  Static function to control whether all registered objects and<br>
   *     their properties are written to the defaults section of output files rather<br>
   *     than only those values for which the default was explicitly overwritten<br>
   *     when read in from an input file or set programmatically. *
   */
  public static void setSerializeAllDefaults(boolean shouldSerializeDefaults) {
    opensimCommonJNI.OpenSimObject_setSerializeAllDefaults(shouldSerializeDefaults);
  }

  /**
   *  Report the value of the "serialize all defaults" flag. *
   */
  public static boolean getSerializeAllDefaults() {
    return opensimCommonJNI.OpenSimObject_getSerializeAllDefaults();
  }

  /**
   *  Returns true if the passed-in string is "Object"; each %Object-derived<br>
   *     class defines a method of this name for its own class name. *
   */
  public static boolean isKindOf(String type) {
    return opensimCommonJNI.OpenSimObject_isKindOf(type);
  }

  /**
   *  The default implementation returns true only if the supplied string<br>
   *     is "Object"; each %Object-derived class overrides this to match its own<br>
   *     class name. *
   */
  public boolean isA(String type) {
    return opensimCommonJNI.OpenSimObject_isA(swigCPtr, this, type);
  }

  /**
   *  %Set the amount of logging output. Higher numbers generate more logging<br>
   *     output.<br>
   *      - -4: Off<br>
   *      - -3: Critical<br>
   *      - -2: Error<br>
   *      - -1: Warn<br>
   *      -  0: Info<br>
   *      -  1: Debug<br>
   *      -  2: Trace<br>
   *      -  3: Trace (for backwards compatibility).<br>
   *     <b>(Deprecated)</b> Use Log::setLevel() instead. *
   */
  public static void setDebugLevel(int newLevel) {
    opensimCommonJNI.OpenSimObject_setDebugLevel(newLevel);
  }

  /**
   *  Get the current setting of debug level.<br>
   *     <b>(Deprecated)</b> Use Log::getLevel() instead. *
   */
  public static int getDebugLevel() {
    return opensimCommonJNI.OpenSimObject_getDebugLevel();
  }

  /**
   *  Wrapper to be used on Java side to display objects in tree; this returns<br>
   *     just the object's name. *
   */
  public String toString() {
    return opensimCommonJNI.OpenSimObject_toString(swigCPtr, this);
  }

  /**
   *  Use the clone() method to duplicate the given object unless the pointer<br>
   *     is null in which case null is returned. *
   */
  public static OpenSimObject SafeCopy(OpenSimObject aObject) {
    long cPtr = opensimCommonJNI.OpenSimObject_SafeCopy(OpenSimObject.getCPtr(aObject), aObject);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  /**
   *  OBSOLETE alternate name for registerType(). *
   */
  public static void RegisterType(OpenSimObject defaultObject) {
    opensimCommonJNI.OpenSimObject_RegisterType(OpenSimObject.getCPtr(defaultObject), defaultObject);
  }

  /**
   *  OBSOLETE alternate name for renameType(). *
   */
  public static void RenameType(String oldName, String newName) {
    opensimCommonJNI.OpenSimObject_RenameType(oldName, newName);
  }

  public static ArrayStr getFunctionClassNames() {
    return new ArrayStr(opensimCommonJNI.OpenSimObject_getFunctionClassNames(), true);
  }

}
