package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljue;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CallsAudioManagerV3Impl$requestAudioFocusAsync$3 extends b97 implements u16 {
    final /* synthetic */ CallsAudioManagerV3Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsAudioManagerV3Impl$requestAudioFocusAsync$3(CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        super(1);
        this.this$0 = callsAudioManagerV3Impl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return jue.a;
    }

    public final void invoke(Throwable th) {
        this.this$0.logger.e(CallsAudioManagerV3Impl.TAG, "audio focus request failed", th);
    }
}
