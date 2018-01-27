/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.bestpay.framework.api.protocol;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Page extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8833237257054184439L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Page\",\"namespace\":\"io.bestpay.framework.api.protocol\",\"fields\":[{\"name\":\"page\",\"type\":\"int\",\"default\":1},{\"name\":\"pageSize\",\"type\":\"int\",\"default\":20},{\"name\":\"total\",\"type\":{\"type\":\"string\",\"java-class\":\"java.lang.Long\"},\"default\":0},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"java-class\":\"io.bestpay.framework.base.SpecificRecord\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int page;
  @Deprecated public int pageSize;
  @Deprecated public java.lang.Long total;
  @Deprecated public java.util.List<io.bestpay.framework.base.SpecificRecord> data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Page() {}

  /**
   * All-args constructor.
   * @param page The new value for page
   * @param pageSize The new value for pageSize
   * @param total The new value for total
   * @param data The new value for data
   */
  public Page(java.lang.Integer page, java.lang.Integer pageSize, java.lang.Long total, java.util.List<io.bestpay.framework.base.SpecificRecord> data) {
    this.page = page;
    this.pageSize = pageSize;
    this.total = total;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return page;
    case 1: return pageSize;
    case 2: return total;
    case 3: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: page = (java.lang.Integer)value$; break;
    case 1: pageSize = (java.lang.Integer)value$; break;
    case 2: total = (java.lang.Long)value$; break;
    case 3: data = (java.util.List<io.bestpay.framework.base.SpecificRecord>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'page' field.
   * @return The value of the 'page' field.
   */
  public java.lang.Integer getPage() {
    return page;
  }

  /**
   * Sets the value of the 'page' field.
   * @param value the value to set.
   */
  public void setPage(java.lang.Integer value) {
    this.page = value;
  }

  /**
   * Gets the value of the 'pageSize' field.
   * @return The value of the 'pageSize' field.
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Sets the value of the 'pageSize' field.
   * @param value the value to set.
   */
  public void setPageSize(java.lang.Integer value) {
    this.pageSize = value;
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public java.lang.Long getTotal() {
    return total;
  }

  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(java.lang.Long value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.util.List<io.bestpay.framework.base.SpecificRecord> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<io.bestpay.framework.base.SpecificRecord> value) {
    this.data = value;
  }

  /**
   * Creates a new Page RecordBuilder.
   * @return A new Page RecordBuilder
   */
  public static io.bestpay.framework.api.protocol.Page.Builder newBuilder() {
    return new io.bestpay.framework.api.protocol.Page.Builder();
  }

  /**
   * Creates a new Page RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Page RecordBuilder
   */
  public static io.bestpay.framework.api.protocol.Page.Builder newBuilder(io.bestpay.framework.api.protocol.Page.Builder other) {
    return new io.bestpay.framework.api.protocol.Page.Builder(other);
  }

  /**
   * Creates a new Page RecordBuilder by copying an existing Page instance.
   * @param other The existing instance to copy.
   * @return A new Page RecordBuilder
   */
  public static io.bestpay.framework.api.protocol.Page.Builder newBuilder(io.bestpay.framework.api.protocol.Page other) {
    return new io.bestpay.framework.api.protocol.Page.Builder(other);
  }

  /**
   * RecordBuilder for Page instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Page>
    implements org.apache.avro.data.RecordBuilder<Page> {

    private int page;
    private int pageSize;
    private java.lang.Long total;
    private java.util.List<io.bestpay.framework.base.SpecificRecord> data;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.bestpay.framework.api.protocol.Page.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.page)) {
        this.page = data().deepCopy(fields()[0].schema(), other.page);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[1].schema(), other.pageSize);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Page instance
     * @param other The existing instance to copy.
     */
    private Builder(io.bestpay.framework.api.protocol.Page other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.page)) {
        this.page = data().deepCopy(fields()[0].schema(), other.page);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[1].schema(), other.pageSize);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data)) {
        this.data = data().deepCopy(fields()[3].schema(), other.data);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'page' field.
      * @return The value.
      */
    public java.lang.Integer getPage() {
      return page;
    }

    /**
      * Sets the value of the 'page' field.
      * @param value The value of 'page'.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder setPage(int value) {
      validate(fields()[0], value);
      this.page = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'page' field has been set.
      * @return True if the 'page' field has been set, false otherwise.
      */
    public boolean hasPage() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'page' field.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder clearPage() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'pageSize' field.
      * @return The value.
      */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }

    /**
      * Sets the value of the 'pageSize' field.
      * @param value The value of 'pageSize'.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder setPageSize(int value) {
      validate(fields()[1], value);
      this.pageSize = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'pageSize' field has been set.
      * @return True if the 'pageSize' field has been set, false otherwise.
      */
    public boolean hasPageSize() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'pageSize' field.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder clearPageSize() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public java.lang.Long getTotal() {
      return total;
    }

    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder setTotal(java.lang.Long value) {
      validate(fields()[2], value);
      this.total = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder clearTotal() {
      total = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.util.List<io.bestpay.framework.base.SpecificRecord> getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder setData(java.util.List<io.bestpay.framework.base.SpecificRecord> value) {
      validate(fields()[3], value);
      this.data = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public io.bestpay.framework.api.protocol.Page.Builder clearData() {
      data = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Page build() {
      try {
        Page record = new Page();
        record.page = fieldSetFlags()[0] ? this.page : (java.lang.Integer) defaultValue(fields()[0]);
        record.pageSize = fieldSetFlags()[1] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[1]);
        record.total = fieldSetFlags()[2] ? this.total : (java.lang.Long) defaultValue(fields()[2]);
        record.data = fieldSetFlags()[3] ? this.data : (java.util.List<io.bestpay.framework.base.SpecificRecord>) defaultValue(fields()[3]);
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