package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CallsAudioManagerV3Impl$requestAudioFocusAsync$1 extends x26 implements s16 {
    public CallsAudioManagerV3Impl$requestAudioFocusAsync$1(Object obj) {
        super(0, 0, CallsAudioManagerV3Impl.class, obj, "requestAudioFocus", "requestAudioFocus()V");
    }

    public final void invoke() {
        ((CallsAudioManagerV3Impl) this.receiver).requestAudioFocus();
    }
}
