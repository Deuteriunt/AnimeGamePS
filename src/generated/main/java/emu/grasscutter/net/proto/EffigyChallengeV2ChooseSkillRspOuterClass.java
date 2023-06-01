// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2ChooseSkillRsp.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV2ChooseSkillRspOuterClass {
  private EffigyChallengeV2ChooseSkillRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2ChooseSkillRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2ChooseSkillRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 challenge_mode_skill_no = 4;</code>
     * @return The challengeModeSkillNo.
     */
    int getChallengeModeSkillNo();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 20703
   * Obf: POOMFOBDAAA
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2ChooseSkillRsp}
   */
  public static final class EffigyChallengeV2ChooseSkillRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2ChooseSkillRsp)
      EffigyChallengeV2ChooseSkillRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2ChooseSkillRsp.newBuilder() to construct.
    private EffigyChallengeV2ChooseSkillRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2ChooseSkillRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2ChooseSkillRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeV2ChooseSkillRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              challengeModeSkillNo_ = input.readUInt32();
              break;
            }
            case 48: {

              levelId_ = input.readUInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.internal_static_EffigyChallengeV2ChooseSkillRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.internal_static_EffigyChallengeV2ChooseSkillRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.class, emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 6;
    private int levelId_;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CHALLENGE_MODE_SKILL_NO_FIELD_NUMBER = 4;
    private int challengeModeSkillNo_;
    /**
     * <code>uint32 challenge_mode_skill_no = 4;</code>
     * @return The challengeModeSkillNo.
     */
    @java.lang.Override
    public int getChallengeModeSkillNo() {
      return challengeModeSkillNo_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (challengeModeSkillNo_ != 0) {
        output.writeUInt32(4, challengeModeSkillNo_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeModeSkillNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, challengeModeSkillNo_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp other = (emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getChallengeModeSkillNo()
          != other.getChallengeModeSkillNo()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + CHALLENGE_MODE_SKILL_NO_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeSkillNo();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * CmdId: 20703
     * Obf: POOMFOBDAAA
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2ChooseSkillRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2ChooseSkillRsp)
        emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.internal_static_EffigyChallengeV2ChooseSkillRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.internal_static_EffigyChallengeV2ChooseSkillRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.class, emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        challengeModeSkillNo_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.internal_static_EffigyChallengeV2ChooseSkillRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp build() {
        emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp buildPartial() {
        emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp result = new emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp(this);
        result.levelId_ = levelId_;
        result.challengeModeSkillNo_ = challengeModeSkillNo_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp other) {
        if (other == emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getChallengeModeSkillNo() != 0) {
          setChallengeModeSkillNo(other.getChallengeModeSkillNo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 6;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int challengeModeSkillNo_ ;
      /**
       * <code>uint32 challenge_mode_skill_no = 4;</code>
       * @return The challengeModeSkillNo.
       */
      @java.lang.Override
      public int getChallengeModeSkillNo() {
        return challengeModeSkillNo_;
      }
      /**
       * <code>uint32 challenge_mode_skill_no = 4;</code>
       * @param value The challengeModeSkillNo to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeSkillNo(int value) {
        
        challengeModeSkillNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_skill_no = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeSkillNo() {
        
        challengeModeSkillNo_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2ChooseSkillRsp)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2ChooseSkillRsp)
    private static final emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp();
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2ChooseSkillRsp>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2ChooseSkillRsp>() {
      @java.lang.Override
      public EffigyChallengeV2ChooseSkillRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeV2ChooseSkillRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeV2ChooseSkillRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2ChooseSkillRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyChallengeV2ChooseSkillRspOuterClass.EffigyChallengeV2ChooseSkillRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2ChooseSkillRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2ChooseSkillRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%EffigyChallengeV2ChooseSkillRsp.proto\"" +
      "e\n\037EffigyChallengeV2ChooseSkillRsp\022\020\n\010le" +
      "vel_id\030\006 \001(\r\022\037\n\027challenge_mode_skill_no\030" +
      "\004 \001(\r\022\017\n\007retcode\030\013 \001(\005B\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2ChooseSkillRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2ChooseSkillRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2ChooseSkillRsp_descriptor,
        new java.lang.String[] { "LevelId", "ChallengeModeSkillNo", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}