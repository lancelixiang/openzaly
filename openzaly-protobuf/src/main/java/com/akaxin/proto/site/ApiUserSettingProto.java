// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_user_setting.proto

package com.akaxin.proto.site;

public final class ApiUserSettingProto {
  private ApiUserSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ApiUserSettingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserSettingRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *用户ID
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    java.lang.String getSiteUserId();
    /**
     * <pre>
     *用户ID
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteUserIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiUserSettingRequest}
   */
  public  static final class ApiUserSettingRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiUserSettingRequest)
      ApiUserSettingRequestOrBuilder {
    // Use ApiUserSettingRequest.newBuilder() to construct.
    private ApiUserSettingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiUserSettingRequest() {
      siteUserId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiUserSettingRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              siteUserId_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.class, com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.Builder.class);
    }

    public static final int SITE_USER_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object siteUserId_;
    /**
     * <pre>
     *用户ID
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    public java.lang.String getSiteUserId() {
      java.lang.Object ref = siteUserId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        siteUserId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *用户ID
     * </pre>
     *
     * <code>optional string site_user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteUserIdBytes() {
      java.lang.Object ref = siteUserId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        siteUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getSiteUserIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, siteUserId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSiteUserIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, siteUserId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest other = (com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest) obj;

      boolean result = true;
      result = result && getSiteUserId()
          .equals(other.getSiteUserId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + SITE_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSiteUserId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code site.ApiUserSettingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserSettingRequest)
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.class, com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        siteUserId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingRequest_descriptor;
      }

      public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest build() {
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest buildPartial() {
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest result = new com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest(this);
        result.siteUserId_ = siteUserId_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest) {
          return mergeFrom((com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest other) {
        if (other == com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest.getDefaultInstance()) return this;
        if (!other.getSiteUserId().isEmpty()) {
          siteUserId_ = other.siteUserId_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object siteUserId_ = "";
      /**
       * <pre>
       *用户ID
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public java.lang.String getSiteUserId() {
        java.lang.Object ref = siteUserId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          siteUserId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *用户ID
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteUserIdBytes() {
        java.lang.Object ref = siteUserId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          siteUserId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *用户ID
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder setSiteUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        siteUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户ID
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder clearSiteUserId() {
        
        siteUserId_ = getDefaultInstance().getSiteUserId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户ID
       * </pre>
       *
       * <code>optional string site_user_id = 1;</code>
       */
      public Builder setSiteUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        siteUserId_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:site.ApiUserSettingRequest)
    }

    // @@protoc_insertion_point(class_scope:site.ApiUserSettingRequest)
    private static final com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest();
    }

    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiUserSettingRequest>
        PARSER = new com.google.protobuf.AbstractParser<ApiUserSettingRequest>() {
      public ApiUserSettingRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiUserSettingRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiUserSettingRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiUserSettingRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ApiUserSettingResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserSettingResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiUserSettingResponse}
   */
  public  static final class ApiUserSettingResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiUserSettingResponse)
      ApiUserSettingResponseOrBuilder {
    // Use ApiUserSettingResponse.newBuilder() to construct.
    private ApiUserSettingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiUserSettingResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiUserSettingResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.class, com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse other = (com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code site.ApiUserSettingResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserSettingResponse)
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.class, com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiUserSettingProto.internal_static_site_ApiUserSettingResponse_descriptor;
      }

      public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse build() {
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse buildPartial() {
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse result = new com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse) {
          return mergeFrom((com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse other) {
        if (other == com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:site.ApiUserSettingResponse)
    }

    // @@protoc_insertion_point(class_scope:site.ApiUserSettingResponse)
    private static final com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse();
    }

    public static com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiUserSettingResponse>
        PARSER = new com.google.protobuf.AbstractParser<ApiUserSettingResponse>() {
      public ApiUserSettingResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiUserSettingResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiUserSettingResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiUserSettingResponse> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiUserSettingProto.ApiUserSettingResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiUserSettingRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiUserSettingRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiUserSettingResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiUserSettingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033site/api_user_setting.proto\022\004site\032\017cor" +
      "e/user.proto\"-\n\025ApiUserSettingRequest\022\024\n" +
      "\014site_user_id\030\001 \001(\t\"\030\n\026ApiUserSettingRes" +
      "ponse2]\n\025ApiUserSettingService\022D\n\007settin" +
      "g\022\033.site.ApiUserSettingRequest\032\034.site.Ap" +
      "iUserSettingResponseB,\n\025com.akaxin.proto" +
      ".siteB\023ApiUserSettingProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.akaxin.proto.core.UserProto.getDescriptor(),
        }, assigner);
    internal_static_site_ApiUserSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_site_ApiUserSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiUserSettingRequest_descriptor,
        new java.lang.String[] { "SiteUserId", });
    internal_static_site_ApiUserSettingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_site_ApiUserSettingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiUserSettingResponse_descriptor,
        new java.lang.String[] { });
    com.akaxin.proto.core.UserProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
