package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: rz0  reason: default package */
public final class rz0 implements qz0 {
    public final bo1 a;
    public final t97 b;
    public final AtomicReference c = new AtomicReference();

    public rz0(t97 t97, bo1 bo1) {
        this.a = bo1;
        this.b = t97;
    }

    public final void a(CallsAudioManager.State state) {
        CallsAudioManager callsAudioManager = (CallsAudioManager) this.c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.changeStateAsync$default(callsAudioManager, state, (s16) null, (u16) null, 6, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.getCurrentDevice();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo b() {
        /*
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            java.lang.Object r0 = r0.get()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager r0 = (ru.ok.android.externcalls.sdk.audio.CallsAudioManager) r0
            if (r0 == 0) goto L_0x0010
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r0 = r0.getCurrentDevice()
            if (r0 != 0) goto L_0x0016
        L_0x0010:
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo$Companion r0 = ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo.Companion
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r0 = r0.getNONE()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz0.b():ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo");
    }

    public final MicrophoneManager c() {
        Conversation a2 = ((bt3) this.b.getValue()).a();
        if (a2 != null) {
            return a2.getMicrophoneManager();
        }
        return null;
    }

    public final boolean d() {
        MicrophoneManager c2 = c();
        return c2 != null && c2.isMicEnabled();
    }
}
