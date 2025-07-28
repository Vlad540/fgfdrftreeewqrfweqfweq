package defpackage;

import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: ei1  reason: default package */
public final /* synthetic */ class ei1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj1 b;
    public final /* synthetic */ hy7 c;
    public final /* synthetic */ hy7 o;

    public /* synthetic */ ei1(aj1 aj1, hy7 hy7, hy7 hy72, int i) {
        this.a = i;
        this.b = aj1;
        this.c = hy7;
        this.o = hy72;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                hy7 hy7 = hy7.b;
                boolean z = false;
                boolean z2 = this.c == hy7;
                if (this.o == hy7) {
                    z = true;
                }
                po1 po1 = this.b.c;
                MicrophoneManager c2 = ((rz0) po1.b).c();
                if (c2 != null) {
                    c2.setMicEnabled(z2);
                }
                if (z2) {
                    ((lc9) po1.r.getValue()).g(Boolean.FALSE);
                }
                po1.g(z);
                return jue.a;
            default:
                hy7 hy72 = hy7.b;
                boolean z3 = false;
                boolean z4 = this.c == hy72;
                if (this.o == hy72) {
                    z3 = true;
                }
                po1 po12 = this.b.c;
                MicrophoneManager c3 = ((rz0) po12.b).c();
                if (c3 != null) {
                    c3.setMicEnabled(z4);
                }
                if (z4) {
                    ((lc9) po12.r.getValue()).g(Boolean.FALSE);
                }
                po12.g(z3);
                return jue.a;
        }
    }
}
