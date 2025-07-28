package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import java.util.Iterator;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1 extends b97 implements s16 {
    final /* synthetic */ u16 $onSuccess;
    final /* synthetic */ CallsAudioManagerV3Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1(u16 u16, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        super(0);
        this.$onSuccess = u16;
        this.this$0 = callsAudioManagerV3Impl;
    }

    public final void invoke() {
        Object obj;
        u16 u16 = this.$onSuccess;
        Iterator it = this.this$0.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CallsAudioDeviceInfo) obj).getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                break;
            }
        }
        u16.invoke(Boolean.valueOf(obj != null));
    }
}
