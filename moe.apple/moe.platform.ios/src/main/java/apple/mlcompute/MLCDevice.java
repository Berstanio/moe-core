package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MLCDevice
 * <p>
 * A device that will be used to execute a neural network.
 * If a MLCdevice is created with multiple devices using the [devicesWithType:selectMultipleDvices], on configurations
 * where multiple GPUs are available such as on the Mac Pro, the framework may transparently schedule the execution
 * across multiple GPUs.  There are some requirements for a MLCDevice with multiple devices such as there can only be
 * one training and/or inference graph associated with this device.  If multiple graphs are used, they must be compiled using
 * MLCGraphCompilationOptionsLinkGraphs specified in compileOptions and the multiple graphs should be linked together
 * with linkWithGraphs.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCDevice extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property]   actualDeviceType
     * <p>
     * The specific device selected.
     * <p>
     * This can be CPU, GPU or ANE.  If type is MLCDeviceTypeAny, this property
     * can be used to find out the specific device type that is selected.
     */
    @Generated
    @Selector("actualDeviceType")
    public native int actualDeviceType();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCDevice alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MLCDevice allocWithZone(VoidPtr zone);

    /**
     * Creates a device which uses the Apple Neural Engine, if any.
     *
     * @return A new device, or `nil` if no ANE exists.
     */
    @Generated
    @Selector("aneDevice")
    public static native MLCDevice aneDevice();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Creates a device which uses the CPU.
     *
     * @return A new device.
     */
    @Generated
    @Selector("cpuDevice")
    public static native MLCDevice cpuDevice();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a MLCDevice object
     * <p>
     * This method can be used by developers to select specific GPUs
     *
     * @param gpus List of Metal devices
     * @return A new device object
     */
    @Generated
    @Selector("deviceWithGPUDevices:")
    public static native MLCDevice deviceWithGPUDevices(NSArray<?> gpus);

    /**
     * Create a MLCDevice object
     *
     * @param type A device type
     * @return A new device object
     */
    @Generated
    @Selector("deviceWithType:")
    public static native MLCDevice deviceWithType(int type);

    /**
     * Create a MLCDevice object that uses multiple devices if available
     *
     * @param type                          A device type
     * @param selectsMultipleComputeDevices A boolean to indicate whether to select multiple compute devices
     * @return A new device object
     */
    @Generated
    @Selector("deviceWithType:selectsMultipleComputeDevices:")
    public static native MLCDevice deviceWithTypeSelectsMultipleComputeDevices(int type,
            boolean selectsMultipleComputeDevices);

    /**
     * Creates a device which uses a GPU, if any.
     *
     * @return A new device, or `nil` if no GPU exists.
     */
    @Generated
    @Selector("gpuDevice")
    public static native MLCDevice gpuDevice();

    @Generated
    @Selector("gpuDevices")
    public native NSArray<?> gpuDevices();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCDevice init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCDevice new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property]   type
     * <p>
     * The type specified when the device is created
     * <p>
     * Recommend that developers use MLCDeviceTypeAny as the device type.
     * This will ensure that MLCompute will select the best device to execute the neural network.
     * If developers want to be able to control device selection, they can select CPU or GPU and
     * for the GPU, they can also select a specific Metal device.
     */
    @Generated
    @Selector("type")
    public native int type();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}