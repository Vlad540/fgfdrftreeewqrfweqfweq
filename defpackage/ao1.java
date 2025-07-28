package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* renamed from: ao1  reason: default package */
public final class ao1 implements CallsAudioManager.DisabledAudioDeviceUsagePolicy {
    public final boolean isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType audioDeviceType) {
        return audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH;
    }
}
