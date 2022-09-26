//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.automatorserver.contracts;

@kotlin.jvm.JvmName("-initializegetNativeWidgetsResponse")
inline fun getNativeWidgetsResponse(block: pl.leancode.automatorserver.contracts.GetNativeWidgetsResponseKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse =
  pl.leancode.automatorserver.contracts.GetNativeWidgetsResponseKt.Dsl._create(pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse.newBuilder()).apply { block() }._build()
object GetNativeWidgetsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class NativeWidgetsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     */
     val nativeWidgets: com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNativeWidgetsList()
      )
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     * @param value The nativeWidgets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNativeWidgets")
    fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>.add(value: pl.leancode.automatorserver.contracts.Contracts.NativeWidget) {
      _builder.addNativeWidgets(value)
    }
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     * @param value The nativeWidgets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNativeWidgets")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>.plusAssign(value: pl.leancode.automatorserver.contracts.Contracts.NativeWidget) {
      add(value)
    }
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     * @param values The nativeWidgets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNativeWidgets")
    fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>.addAll(values: kotlin.collections.Iterable<pl.leancode.automatorserver.contracts.Contracts.NativeWidget>) {
      _builder.addAllNativeWidgets(values)
    }
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     * @param values The nativeWidgets to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNativeWidgets")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>.plusAssign(values: kotlin.collections.Iterable<pl.leancode.automatorserver.contracts.Contracts.NativeWidget>) {
      addAll(values)
    }
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     * @param index The index to set the value at.
     * @param value The nativeWidgets to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNativeWidgets")
    operator fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>.set(index: kotlin.Int, value: pl.leancode.automatorserver.contracts.Contracts.NativeWidget) {
      _builder.setNativeWidgets(index, value)
    }
    /**
     * <code>repeated .patrol.NativeWidget nativeWidgets = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNativeWidgets")
    fun com.google.protobuf.kotlin.DslList<pl.leancode.automatorserver.contracts.Contracts.NativeWidget, NativeWidgetsProxy>.clear() {
      _builder.clearNativeWidgets()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse.copy(block: pl.leancode.automatorserver.contracts.GetNativeWidgetsResponseKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.GetNativeWidgetsResponse =
  pl.leancode.automatorserver.contracts.GetNativeWidgetsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
