package defpackage;

import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: fi1  reason: default package */
public final /* synthetic */ class fi1 implements s16 {
    public final /* synthetic */ aj1 a;
    public final /* synthetic */ hy7 b;
    public final /* synthetic */ hy7 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ fi1(aj1 aj1, hy7 hy7, hy7 hy72, boolean z) {
        this.a = aj1;
        this.b = hy7;
        this.c = hy72;
        this.o = z;
    }

    public final Object invoke() {
        hy7 hy7 = hy7.b;
        int i = 1;
        boolean z = false;
        boolean z2 = this.b == hy7;
        if (this.c == hy7) {
            z = true;
        }
        aj1 aj1 = this.a;
        po1 po1 = aj1.c;
        MicrophoneManager c2 = ((rz0) po1.b).c();
        if (c2 != null) {
            c2.setMicEnabled(z2);
        }
        if (z2) {
            ((lc9) po1.r.getValue()).g(Boolean.FALSE);
        }
        po1.g(z);
        po1 po12 = aj1.c;
        po12.getClass();
        if (!this.o) {
            i = 2;
        }
        CameraManager a2 = po12.e.a();
        if (a2 != null) {
            a2.switchCamera(new qu1(i));
        }
        return jue.a;
    }
}
