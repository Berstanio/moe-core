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
import apple.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNLookAtConstraint
 * <p>
 * A SCNLookAtConstraint applies on a node's orientation so that it always look at another node.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNLookAtConstraint extends SCNConstraint {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNLookAtConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNLookAtConstraint alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * lookAtConstraintWithTarget:
     * <p>
     * Creates and returns a SCNLookAtConstraint object with the specified target.
     *
     * @param target The target node to look at.
     */
    @Generated
    @Selector("lookAtConstraintWithTarget:")
    public static native SCNLookAtConstraint lookAtConstraintWithTarget(SCNNode target);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] gimbalLockEnabled
     * <p>
     * Specifies whether the receiver enables the gimbal lock. Defaults to NO.
     * <p>
     * Enabling the gimbal lock prevents the receiver from rotating the constrained node around to roll axis.
     */
    @Generated
    @Selector("gimbalLockEnabled")
    public native boolean gimbalLockEnabled();

    @Generated
    @Selector("init")
    public native SCNLookAtConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNLookAtConstraint initWithCoder(NSCoder coder);

    /**
     * [@property] gimbalLockEnabled
     * <p>
     * Specifies whether the receiver enables the gimbal lock. Defaults to NO.
     * <p>
     * Enabling the gimbal lock prevents the receiver from rotating the constrained node around to roll axis.
     */
    @Generated
    @Selector("setGimbalLockEnabled:")
    public native void setGimbalLockEnabled(boolean value);

    @Generated
    @Selector("setTarget:")
    public native void setTarget(SCNNode target);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("target")
    public native SCNNode target();

    /**
     * [@property] targetOffset
     * <p>
     * Front direction in the constraint owner local space. Defaults to -[SCNNode localFront]. Animatable
     */
    @Generated
    @Selector("localFront")
    @ByValue
    public native SCNVector3 localFront();

    /**
     * [@property] targetOffset
     * <p>
     * Front direction in the constraint owner local space. Defaults to -[SCNNode localFront]. Animatable
     */
    @Generated
    @Selector("setLocalFront:")
    public native void setLocalFront(@ByValue SCNVector3 value);

    /**
     * [@property] targetOffset
     * <p>
     * Offset look at position in target space. Defaults to zero. Animatable
     */
    @Generated
    @Selector("setTargetOffset:")
    public native void setTargetOffset(@ByValue SCNVector3 value);

    /**
     * [@property] worldUp
     * <p>
     * Up reference direction in world space. Defaults to -[SCNNode localUp]. Animatable
     */
    @Generated
    @Selector("setWorldUp:")
    public native void setWorldUp(@ByValue SCNVector3 value);

    /**
     * [@property] targetOffset
     * <p>
     * Offset look at position in target space. Defaults to zero. Animatable
     */
    @Generated
    @Selector("targetOffset")
    @ByValue
    public native SCNVector3 targetOffset();

    /**
     * [@property] worldUp
     * <p>
     * Up reference direction in world space. Defaults to -[SCNNode localUp]. Animatable
     */
    @Generated
    @Selector("worldUp")
    @ByValue
    public native SCNVector3 worldUp();
}
