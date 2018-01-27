/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

/**
 * @Copyright 2017 www.bestpay.io Inc. All rights reserved.
 */

package io.bestpay.framework.base;

import org.apache.avro.specific.SpecificData;

import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@SuppressWarnings("all")
/** 路由 */
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlType(name="RouteTest", namespace="io.bestpay.framework.base")
@org.apache.avro.specific.AvroGenerated
public class RouteTest extends io.bestpay.framework.base.SpecificRecordBase implements io.bestpay.framework.base.SpecificRecord {
  private static final long serialVersionUID = 8986510662911121529L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RouteTest\",\"namespace\":\"io.bestpay.framework.base\",\"doc\":\"路由\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"名称\",\"default\":\"\"},{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"值\",\"default\":\"\"},{\"name\":\"next\",\"type\":[\"null\",\"RouteTest\"]},{\"name\":\"children\",\"type\":{\"type\":\"array\",\"items\":\"RouteTest\"}},{\"name\":\"map\",\"type\":{\"type\":\"map\",\"values\":\"RouteTest\",\"avro.java.string\":\"String\"}},{\"name\":\"list\",\"type\":{\"type\":\"array\",\"items\":\"RouteTest\"}},{\"name\":\"fixedType\",\"type\":{\"type\":\"fixed\",\"name\":\"MD5\",\"size\":16}},{\"name\":\"decimal\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\"}}],\"aliases\":[\"RouteTest\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** 名称 */
  @javax.xml.bind.annotation.XmlElement(name="name")
  private java.lang.String name;
  /** 值 */
  @javax.xml.bind.annotation.XmlElement(name="value")
  private java.lang.String value;
  @javax.xml.bind.annotation.XmlElement(name="next")
  private io.bestpay.framework.base.RouteTest next;
  @javax.xml.bind.annotation.XmlElement(name="children")
  private java.util.List<io.bestpay.framework.base.RouteTest> children;
  @javax.xml.bind.annotation.XmlElement(name="map")
  private java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> map;
  @javax.xml.bind.annotation.XmlElement(name="list")
  private java.util.List<io.bestpay.framework.base.RouteTest> list;
  @javax.xml.bind.annotation.XmlElement(name="fixedType")
  private io.bestpay.framework.base.MD5 fixedType;
  @javax.xml.bind.annotation.XmlElement(name="decimal")
  private java.nio.ByteBuffer decimal;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RouteTest() {}

  /**
   * All-args constructor.
   * @param name 名称
   * @param value 值
   * @param next The new value for next
   * @param children The new value for children
   * @param map The new value for map
   * @param list The new value for list
   * @param fixedType The new value for fixedType
   * @param decimal The new value for decimal
   */
  public RouteTest(java.lang.String name, java.lang.String value, io.bestpay.framework.base.RouteTest next, java.util.List<io.bestpay.framework.base.RouteTest> children, java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> map, java.util.List<io.bestpay.framework.base.RouteTest> list, io.bestpay.framework.base.MD5 fixedType, java.nio.ByteBuffer decimal) {
    this.name = name;
    this.value = value;
    this.next = next;
    this.children = children;
    this.map = map;
    this.list = list;
    this.fixedType = fixedType;
    this.decimal = decimal;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  @org.codehaus.jackson.annotate.JsonIgnore
  @javax.xml.bind.annotation.XmlTransient
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return value;
    case 2: return next;
    case 3: return children;
    case 4: return map;
    case 5: return list;
    case 6: return fixedType;
    case 7: return decimal;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: value = (java.lang.String)value$; break;
    case 2: next = (io.bestpay.framework.base.RouteTest)value$; break;
    case 3: children = (java.util.List<io.bestpay.framework.base.RouteTest>)value$; break;
    case 4: map = (java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest>)value$; break;
    case 5: list = (java.util.List<io.bestpay.framework.base.RouteTest>)value$; break;
    case 6: fixedType = (io.bestpay.framework.base.MD5)value$; break;
    case 7: decimal = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return 名称
   */
  @com.fasterxml.jackson.annotation.JsonGetter("name")
  @org.codehaus.jackson.annotate.JsonProperty("name")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * 名称
   * @param value the value to set.
   */
  protected void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return 值
   */
  @com.fasterxml.jackson.annotation.JsonGetter("value")
  @org.codehaus.jackson.annotate.JsonProperty("value")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * 值
   * @param value the value to set.
   */
  protected void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'next' field.
   * @return The value of the 'next' field.
   */
  @com.fasterxml.jackson.annotation.JsonGetter("next")
  @org.codehaus.jackson.annotate.JsonProperty("next")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public io.bestpay.framework.base.RouteTest getNext() {
    return next;
  }

  /**
   * Sets the value of the 'next' field.
   * @param value the value to set.
   */
  protected void setNext(io.bestpay.framework.base.RouteTest value) {
    this.next = value;
  }

  /**
   * Gets the value of the 'children' field.
   * @return The value of the 'children' field.
   */
  @com.fasterxml.jackson.annotation.JsonGetter("children")
  @org.codehaus.jackson.annotate.JsonProperty("children")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public java.util.List<io.bestpay.framework.base.RouteTest> getChildren() {
    return children;
  }

  /**
   * Sets the value of the 'children' field.
   * @param value the value to set.
   */
  protected void setChildren(java.util.List<io.bestpay.framework.base.RouteTest> value) {
    this.children = value;
  }

  /**
   * Gets the value of the 'map' field.
   * @return The value of the 'map' field.
   */
  @com.fasterxml.jackson.annotation.JsonGetter("map")
  @org.codehaus.jackson.annotate.JsonProperty("map")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> getMap() {
    return map;
  }

  /**
   * Sets the value of the 'map' field.
   * @param value the value to set.
   */
  protected void setMap(java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> value) {
    this.map = value;
  }

  /**
   * Gets the value of the 'list' field.
   * @return The value of the 'list' field.
   */
  @com.fasterxml.jackson.annotation.JsonGetter("list")
  @org.codehaus.jackson.annotate.JsonProperty("list")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public java.util.List<io.bestpay.framework.base.RouteTest> getList() {
    return list;
  }

  /**
   * Sets the value of the 'list' field.
   * @param value the value to set.
   */
  protected void setList(java.util.List<io.bestpay.framework.base.RouteTest> value) {
    this.list = value;
  }

  /**
   * Gets the value of the 'fixedType' field.
   * @return The value of the 'fixedType' field.
   */
  @com.fasterxml.jackson.annotation.JsonGetter("fixedType")
  @org.codehaus.jackson.annotate.JsonProperty("fixedType")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public io.bestpay.framework.base.MD5 getFixedType() {
    return fixedType;
  }

  /**
   * Sets the value of the 'fixedType' field.
   * @param value the value to set.
   */
  protected void setFixedType(io.bestpay.framework.base.MD5 value) {
    this.fixedType = value;
  }

  /**
   * Gets the value of the 'decimal' field.
   * @return The value of the 'decimal' field.
   */
  @com.fasterxml.jackson.annotation.JsonGetter("decimal")
  @org.codehaus.jackson.annotate.JsonProperty("decimal")   
  @com.fasterxml.jackson.annotation.JsonInclude(Include.NON_NULL)
  @org.codehaus.jackson.map.annotate.JsonSerialize(include=Inclusion.NON_NULL)  
  @javax.xml.bind.annotation.XmlTransient
  public java.nio.ByteBuffer getDecimal() {
    return decimal;
  }

  /**
   * Sets the value of the 'decimal' field.
   * @param value the value to set.
   */
  protected void setDecimal(java.nio.ByteBuffer value) {
    this.decimal = value;
  }

  /**
   * Creates a new RouteTest RecordBuilder.
   * @return A new RouteTest RecordBuilder
   */
  public static io.bestpay.framework.base.RouteTest.Builder newBuilder() {
    return new io.bestpay.framework.base.RouteTest.Builder();
  }

  /**
   * Creates a new RouteTest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RouteTest RecordBuilder
   */
  public static io.bestpay.framework.base.RouteTest.Builder newBuilder(io.bestpay.framework.base.RouteTest.Builder other) {
    return new io.bestpay.framework.base.RouteTest.Builder(other);
  }

  /**
   * Creates a new RouteTest RecordBuilder by copying an existing RouteTest instance.
   * @param other The existing instance to copy.
   * @return A new RouteTest RecordBuilder
   */
  public static io.bestpay.framework.base.RouteTest.Builder newBuilder(io.bestpay.framework.base.RouteTest other) {
    return new io.bestpay.framework.base.RouteTest.Builder(other);
  }

  /**
   * RecordBuilder for RouteTest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RouteTest>
    implements org.apache.avro.data.RecordBuilder<RouteTest> {

    /** 名称 */
    private java.lang.String name;
    /** 值 */
    private java.lang.String value;
    private io.bestpay.framework.base.RouteTest next;
    private io.bestpay.framework.base.RouteTest.Builder nextBuilder;
    private java.util.List<io.bestpay.framework.base.RouteTest> children;
    private java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> map;
    private java.util.List<io.bestpay.framework.base.RouteTest> list;
    private io.bestpay.framework.base.MD5 fixedType;
    private java.nio.ByteBuffer decimal;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.bestpay.framework.base.RouteTest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.next)) {
        this.next = data().deepCopy(fields()[2].schema(), other.next);
        fieldSetFlags()[2] = true;
      }
      if (other.hasNextBuilder()) {
        this.nextBuilder = io.bestpay.framework.base.RouteTest.newBuilder(other.getNextBuilder());
      }
      if (isValidValue(fields()[3], other.children)) {
        this.children = data().deepCopy(fields()[3].schema(), other.children);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.map)) {
        this.map = data().deepCopy(fields()[4].schema(), other.map);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.list)) {
        this.list = data().deepCopy(fields()[5].schema(), other.list);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.fixedType)) {
        this.fixedType = data().deepCopy(fields()[6].schema(), other.fixedType);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.decimal)) {
        this.decimal = data().deepCopy(fields()[7].schema(), other.decimal);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RouteTest instance
     * @param other The existing instance to copy.
     */
    private Builder(io.bestpay.framework.base.RouteTest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.next)) {
        this.next = data().deepCopy(fields()[2].schema(), other.next);
        fieldSetFlags()[2] = true;
      }
      this.nextBuilder = null;
      if (isValidValue(fields()[3], other.children)) {
        this.children = data().deepCopy(fields()[3].schema(), other.children);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.map)) {
        this.map = data().deepCopy(fields()[4].schema(), other.map);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.list)) {
        this.list = data().deepCopy(fields()[5].schema(), other.list);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.fixedType)) {
        this.fixedType = data().deepCopy(fields()[6].schema(), other.fixedType);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.decimal)) {
        this.decimal = data().deepCopy(fields()[7].schema(), other.decimal);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * 名称
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * 名称
      * @param value The value of 'name'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * 名称
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * 名称
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * 值
      * @return The value.
      */
    public java.lang.String getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * 值
      * @param value The value of 'value'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setValue(java.lang.String value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * 值
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'value' field.
      * 值
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearValue() {
      value = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'next' field.
      * @return The value.
      */
    public io.bestpay.framework.base.RouteTest getNext() {
      return next;
    }

    /**
      * Sets the value of the 'next' field.
      * @param value The value of 'next'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setNext(io.bestpay.framework.base.RouteTest value) {
      validate(fields()[2], value);
      this.nextBuilder = null;
      this.next = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'next' field has been set.
      * @return True if the 'next' field has been set, false otherwise.
      */
    public boolean hasNext() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'next' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.bestpay.framework.base.RouteTest.Builder getNextBuilder() {
      if (nextBuilder == null) {
        if (hasNext()) {
          setNextBuilder(io.bestpay.framework.base.RouteTest.newBuilder(next));
        } else {
          setNextBuilder(io.bestpay.framework.base.RouteTest.newBuilder());
        }
      }
      return nextBuilder;
    }

    /**
     * Sets the Builder instance for the 'next' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public io.bestpay.framework.base.RouteTest.Builder setNextBuilder(io.bestpay.framework.base.RouteTest.Builder value) {
      clearNext();
      nextBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'next' field has an active Builder instance
     * @return True if the 'next' field has an active Builder instance
     */
    public boolean hasNextBuilder() {
      return nextBuilder != null;
    }

    /**
      * Clears the value of the 'next' field.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearNext() {
      next = null;
      nextBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'children' field.
      * @return The value.
      */
    public java.util.List<io.bestpay.framework.base.RouteTest> getChildren() {
      return children;
    }

    /**
      * Sets the value of the 'children' field.
      * @param value The value of 'children'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setChildren(java.util.List<io.bestpay.framework.base.RouteTest> value) {
      validate(fields()[3], value);
      this.children = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'children' field has been set.
      * @return True if the 'children' field has been set, false otherwise.
      */
    public boolean hasChildren() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'children' field.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearChildren() {
      children = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'map' field.
      * @return The value.
      */
    public java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> getMap() {
      return map;
    }

    /**
      * Sets the value of the 'map' field.
      * @param value The value of 'map'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setMap(java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest> value) {
      validate(fields()[4], value);
      this.map = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'map' field has been set.
      * @return True if the 'map' field has been set, false otherwise.
      */
    public boolean hasMap() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'map' field.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearMap() {
      map = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'list' field.
      * @return The value.
      */
    public java.util.List<io.bestpay.framework.base.RouteTest> getList() {
      return list;
    }

    /**
      * Sets the value of the 'list' field.
      * @param value The value of 'list'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setList(java.util.List<io.bestpay.framework.base.RouteTest> value) {
      validate(fields()[5], value);
      this.list = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'list' field has been set.
      * @return True if the 'list' field has been set, false otherwise.
      */
    public boolean hasList() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'list' field.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearList() {
      list = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'fixedType' field.
      * @return The value.
      */
    public io.bestpay.framework.base.MD5 getFixedType() {
      return fixedType;
    }

    /**
      * Sets the value of the 'fixedType' field.
      * @param value The value of 'fixedType'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setFixedType(io.bestpay.framework.base.MD5 value) {
      validate(fields()[6], value);
      this.fixedType = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'fixedType' field has been set.
      * @return True if the 'fixedType' field has been set, false otherwise.
      */
    public boolean hasFixedType() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'fixedType' field.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearFixedType() {
      fixedType = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'decimal' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getDecimal() {
      return decimal;
    }

    /**
      * Sets the value of the 'decimal' field.
      * @param value The value of 'decimal'.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder setDecimal(java.nio.ByteBuffer value) {
      validate(fields()[7], value);
      this.decimal = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'decimal' field has been set.
      * @return True if the 'decimal' field has been set, false otherwise.
      */
    public boolean hasDecimal() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'decimal' field.
      * @return This builder.
      */
    public io.bestpay.framework.base.RouteTest.Builder clearDecimal() {
      decimal = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public RouteTest build() {
      try {
        RouteTest record = new RouteTest();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.String) defaultValue(fields()[1]);
        if (nextBuilder != null) {
          record.next = this.nextBuilder.build();
        } else {
          record.next = fieldSetFlags()[2] ? this.next : (io.bestpay.framework.base.RouteTest) defaultValue(fields()[2]);
        }
        record.children = fieldSetFlags()[3] ? this.children : (java.util.List<io.bestpay.framework.base.RouteTest>) defaultValue(fields()[3]);
        record.map = fieldSetFlags()[4] ? this.map : (java.util.Map<java.lang.String,io.bestpay.framework.base.RouteTest>) defaultValue(fields()[4]);
        record.list = fieldSetFlags()[5] ? this.list : (java.util.List<io.bestpay.framework.base.RouteTest>) defaultValue(fields()[5]);
        record.fixedType = fieldSetFlags()[6] ? this.fixedType : (io.bestpay.framework.base.MD5) defaultValue(fields()[6]);
        record.decimal = fieldSetFlags()[7] ? this.decimal : (java.nio.ByteBuffer) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}