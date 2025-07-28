package defpackage;

import java.util.Collections;
import one.me.profile.screens.invite.ProfileInviteScreen;

/* renamed from: fbb  reason: default package */
public final /* synthetic */ class fbb implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hbb b;

    public /* synthetic */ fbb(hbb hbb, int i) {
        this.a = i;
        this.b = hbb;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ubb l0 = ((ProfileInviteScreen) this.b.X).l0();
                String s = l0.s();
                if (s != null) {
                    wab wab = new wab(s);
                    l05 l05 = l0.G0;
                    taf.o(l05, wab);
                    if (hhd.y()) {
                        i22 r = l0.r();
                        l05.b.g(new zab(phc.s, new hge((r == null || !r.G()) ? l8a.Q0 : l8a.O0)));
                    }
                }
                return jue.a;
            default:
                ubb l02 = ((ProfileInviteScreen) this.b.X).l0();
                l02.getClass();
                taf.o(l02.G0, new yab(Collections.singletonList(new pq3(j8a.K, (mge) new hge(l8a.T0), Integer.valueOf(j9a.J), Integer.valueOf(phc.N1), Integer.valueOf(j9a.F)))));
                return jue.a;
        }
    }
}
