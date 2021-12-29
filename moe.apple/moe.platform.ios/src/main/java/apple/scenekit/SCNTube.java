/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.MDLMesh;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNTube
 * <p>
 * SCNTube represents a tube with controllable height, inner radius and outer radius.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNTube extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNTube(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNTube alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNTube allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("geometry")
    public static native SCNTube geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNTube geometryWithMDLMesh(MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNTube geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
            NSArray<? extends SCNGeometryElement> elements);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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
    public static native SCNTube new_objc();

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

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * tubeWithInnerRadius:outerRadius:height:
     * <p>
     * Creates and returns a tube with given inner radius, outer radius and height.
     *
     * @param innerRadius The inner radius of the tube.
     * @param outerRadius The outer radius of the tube.
     * @param height      The height of the tube.
     */
    @Generated
    @Selector("tubeWithInnerRadius:outerRadius:height:")
    public static native SCNTube tubeWithInnerRadiusOuterRadiusHeight(@NFloat double innerRadius,
            @NFloat double outerRadius, @NFloat double height);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] height
     * <p>
     * The height of the tube. Animatable.
     * <p>
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("height")
    @NFloat
    public native double height();

    /**
     * [@property] heightSegmentCount
     * <p>
     * The number of subdivisions along the Y axis. Animatable.
     * <p>
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("heightSegmentCount")
    @NInt
    public native long heightSegmentCount();

    @Generated
    @Selector("init")
    public native SCNTube init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNTube initWithCoder(NSCoder coder);

    /**
     * [@property] innerRadius
     * <p>
     * The inner radius of the tube. Animatable.
     * <p>
     * If the value is less than or equal to 0, or if it is greater than or equal to the outer radius, then the geometry is empty. The default value is 0.25.
     */
    @Generated
    @Selector("innerRadius")
    @NFloat
    public native double innerRadius();

    /**
     * [@property] outerRadius
     * <p>
     * The outer radius of the tube. Animatable.
     * <p>
     * If the value is less than or equal to 0, or if it is less than or equal to the inner radius, then the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("outerRadius")
    @NFloat
    public native double outerRadius();

    /**
     * [@property] radialSegmentCount
     * <p>
     * The number of subdivisions along the radial coordinate. Animatable.
     * <p>
     * If the value is less than 3, the behavior is undefined. The default value is 48.
     */
    @Generated
    @Selector("radialSegmentCount")
    @NInt
    public native long radialSegmentCount();

    /**
     * [@property] height
     * <p>
     * The height of the tube. Animatable.
     * <p>
     * If the value is less than or equal to 0, the geometry is empty. The default value is 1.
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NFloat double value);

    /**
     * [@property] heightSegmentCount
     * <p>
     * The number of subdivisions along the Y axis. Animatable.
     * <p>
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@NInt long value);

    /**
     * [@property] innerRadius
     * <p>
     * The inner radius of the tube. Animatable.
     * <p>
     * If the value is less than or equal to 0, or if it is greater than or equal to the outer radius, then the geometry is empty. The default value is 0.25.
     */
    @Generated
    @Selector("setInnerRadius:")
    public native void setInnerRadius(@NFloat double value);

    /**
     * [@property] outerRadius
     * <p>
     * The outer radius of the tube. Animatable.
     * <p>
     * If the value is less than or equal to 0, or if it is less than or equal to the inner radius, then the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("setOuterRadius:")
    public native void setOuterRadius(@NFloat double value);

    /**
     * [@property] radialSegmentCount
     * <p>
     * The number of subdivisions along the radial coordinate. Animatable.
     * <p>
     * If the value is less than 3, the behavior is undefined. The default value is 48.
     */
    @Generated
    @Selector("setRadialSegmentCount:")
    public native void setRadialSegmentCount(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
