package apple.authenticationservices;

import apple.NSObject;
import apple.authenticationservices.protocol.ASAuthorizationProvider;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAuthorizationSecurityKeyPublicKeyCredentialProvider extends NSObject implements ASAuthorizationProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAuthorizationSecurityKeyPublicKeyCredentialProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAuthorizationSecurityKeyPublicKeyCredentialProvider alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ASAuthorizationSecurityKeyPublicKeyCredentialProvider allocWithZone(VoidPtr zone);

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

    /**
     * Create a request to authenticate using an existing credential.
     *
     * @param challenge The challenge to sign.
     */
    @Generated
    @Selector("createCredentialAssertionRequestWithChallenge:")
    public native ASAuthorizationSecurityKeyPublicKeyCredentialAssertionRequest createCredentialAssertionRequestWithChallenge(
            NSData challenge);

    /**
     * Create a request to register a new security key credential.
     *
     * @param challenge   The challenge to sign.
     * @param displayName The display name for the new credential.
     * @param name        The name for the new credential.
     * @param userID      An identifier to be stored alongside the credential, which will be returned with the credential when it is used to authenticate.
     */
    @Generated
    @Selector("createCredentialRegistrationRequestWithChallenge:displayName:name:userID:")
    public native ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest createCredentialRegistrationRequestWithChallengeDisplayNameNameUserID(
            NSData challenge, String displayName, String name, NSData userID);

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
    @Selector("init")
    public native ASAuthorizationSecurityKeyPublicKeyCredentialProvider init();

    @Generated
    @Selector("initWithRelyingPartyIdentifier:")
    public native ASAuthorizationSecurityKeyPublicKeyCredentialProvider initWithRelyingPartyIdentifier(
            String relyingPartyIdentifier);

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
    public static native ASAuthorizationSecurityKeyPublicKeyCredentialProvider new_objc();

    /**
     * The Relying Party identifier used for all requests created by this object.
     */
    @Generated
    @Selector("relyingPartyIdentifier")
    public native String relyingPartyIdentifier();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}