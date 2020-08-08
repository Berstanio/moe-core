package apple.intentsui.protocol;

import apple.foundation.NSError;
import apple.foundation.NSUUID;
import apple.intents.INVoiceShortcut;
import apple.intentsui.INUIEditVoiceShortcutViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("IntentsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUIEditVoiceShortcutViewControllerDelegate")
public interface INUIEditVoiceShortcutViewControllerDelegate {
    @Generated
    @Selector("editVoiceShortcutViewController:didDeleteVoiceShortcutWithIdentifier:")
    void editVoiceShortcutViewControllerDidDeleteVoiceShortcutWithIdentifier(
            INUIEditVoiceShortcutViewController controller, NSUUID deletedVoiceShortcutIdentifier);

    @Generated
    @Selector("editVoiceShortcutViewController:didUpdateVoiceShortcut:error:")
    void editVoiceShortcutViewControllerDidUpdateVoiceShortcutError(INUIEditVoiceShortcutViewController controller,
            INVoiceShortcut voiceShortcut, NSError error);

    @Generated
    @Selector("editVoiceShortcutViewControllerDidCancel:")
    void editVoiceShortcutViewControllerDidCancel(INUIEditVoiceShortcutViewController controller);
}