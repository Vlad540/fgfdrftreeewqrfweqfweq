package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: a11  reason: default package */
public final /* synthetic */ class a11 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c11 b;

    public /* synthetic */ a11(c11 c11, int i) {
        this.a = i;
        this.b = c11;
    }

    public final Object invoke() {
        jue jue = jue.a;
        boolean z = true;
        c11 c11 = this.b;
        switch (this.a) {
            case 0:
                b11 b11 = c11.L0;
                if (b11 != null) {
                    smc smc = CallScreen.T0;
                    ((CallScreen) ((x3a) b11).b).p0(true);
                }
                return jue;
            default:
                b11 b112 = c11.L0;
                if (b112 != null) {
                    smc smc2 = CallScreen.T0;
                    CallScreen callScreen = (CallScreen) ((x3a) b112).b;
                    callScreen.t0().e(gq1.w0, false);
                    aj1 z0 = callScreen.z0();
                    u81 s = z0.s();
                    ete ete = s.c;
                    hy7 hy7 = hy7.b;
                    boolean z2 = s.q == hy7;
                    if (s.r != hy7) {
                        z = false;
                    }
                    po1 po1 = z0.c;
                    po1.getClass();
                    if (ete != null) {
                        ((ep1) po1.a).A(new gpd(new epd(ete), z2, z, (s16) null));
                    }
                    po1.k();
                    po1.l();
                }
                return jue;
        }
    }
}
