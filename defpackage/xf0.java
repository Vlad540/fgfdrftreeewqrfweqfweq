package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xf0  reason: default package */
public final class xf0 extends taf {
    public static final /* synthetic */ k77[] y0;
    public static final long z0 = ((long) new Object().hashCode());
    public final t97 X;
    public final grd Y;
    public final grd Z;
    public final pae b;
    public final fg0 c;
    public final s16 o;
    public final t0c w0;
    public final e3 x0;

    static {
        hc9 hc9 = new hc9(xf0.class, "bannerJob", "getBannerJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        y0 = new k77[]{hc9};
    }

    public xf0(t97 t97, boolean z, ll3 ll3, int i) {
        zf0 zf0 = zf0.a;
        qf0 qf0 = (qf0) zf0.getAccessor().c(qf0.class);
        pae pae = (pae) zf0.getAccessor().c(pae.class);
        fg0 fg0 = (fg0) zf0.getAccessor().c(fg0.class);
        z = (i & 16) != 0 ? false : z;
        s16 mVar = (i & 32) != 0 ? new m(18) : ll3;
        this.b = pae;
        this.c = fg0;
        this.o = mVar;
        this.X = t97;
        grd a = hrd.a(Boolean.valueOf(z));
        this.Y = a;
        t0c t0c = new t0c(a);
        boolean z2 = !fg0.e && !fg0.g && !fg0.f;
        hw4 hw4 = hw4.a;
        grd a2 = hrd.a(z2 ? hw4 : q(z));
        this.Z = a2;
        this.w0 = ez3.d0(new uv(a2, 6), this.a, ucd.a, hw4);
        this.x0 = hwf.t();
        ez3.N(new ck5(new v11(new gl5(new ck5(ez3.I(new tj5(2, new pj5[]{new s0c(qf0.b), new uv(qf0.d, 4), new uv(qf0.e, 5)})), new of0(qf0, (Continuation) null)), new pf0((Object) qf0, (Continuation) null, 0)), t0c, new l5e(3, (Continuation) null), 4), new vf0(this, t97, (Continuation) null), 5), this.a);
    }

    public final List q(boolean z) {
        un3 un3;
        un3 un32;
        lg7 c2 = hwf.c();
        fg0 fg0 = this.c;
        un3 un33 = null;
        if (fg0.e) {
            un3 = new un3(((Boolean) this.o.invoke()).booleanValue() ? 1 : z ? 2 : 3);
        } else {
            un3 = null;
        }
        c2.add(un3);
        if (!fg0.g) {
            un32 = null;
        } else {
            un32 = new un3(z ? 5 : 4);
        }
        c2.add(un32);
        if (fg0.f) {
            un33 = new un3(z ? 7 : 6);
        }
        c2.add(un33);
        List T = o23.T(hwf.a(c2));
        boolean z2 = !((ArrayList) T).isEmpty();
        t97 t97 = this.X;
        if (z2) {
            u16 b2 = ((sf0) t97.getValue()).b();
            ArrayList arrayList = new ArrayList();
            for (Object next : T) {
                if (((Boolean) b2.invoke(next)).booleanValue()) {
                    arrayList.add(next);
                }
            }
            T = arrayList;
        }
        return T.isEmpty() ^ true ? o23.m0(T, ((sf0) t97.getValue()).a()) : T;
    }
}
