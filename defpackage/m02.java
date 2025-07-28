package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: m02  reason: default package */
public final class m02 {
    public final /* synthetic */ int a;

    public /* synthetic */ m02(int i) {
        this.a = i;
    }

    public static List a(mge mge, hge hge, i22 i22) {
        String f = i22.f(fj0.b, ej0.a);
        i22.i0();
        return Collections.singletonList(new y62(mge, hge, f, i22.B0, i22.e(), hw4.a));
    }

    public final List b(i22 i22) {
        switch (this.a) {
            case 0:
                return (i22 == null || !i22.G()) ? hw4.a : i22.Y() ? a(new hge(c7a.F0), new hge(c7a.E0), i22) : i22.W() ? a(new lge(i22.p()), new hge(c7a.G0), i22) : a(new lge(i22.p()), new hge(c7a.H0), i22);
            default:
                if (i22 == null || !i22.H()) {
                    return hw4.a;
                }
                lge lge = new lge(i22.p());
                hge hge = new hge(c7a.L0);
                String f = i22.f(fj0.b, ej0.a);
                i22.i0();
                return Collections.singletonList(new y62(lge, hge, f, i22.B0, i22.e(), p23.B(new mge[]{new hge(c7a.I0), new hge(c7a.J0), new hge(c7a.K0)})));
        }
    }
}
