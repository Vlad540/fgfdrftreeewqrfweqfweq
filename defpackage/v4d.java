package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: v4d  reason: default package */
public final class v4d extends taf {
    public static final /* synthetic */ k77[] K0;
    public final yd3 A0;
    public final l05 B0 = new l05(0);
    public final l05 C0 = new l05(0);
    public final grd D0;
    public final t0c E0;
    public final grd F0;
    public final t0c G0;
    public final AtomicReference H0;
    public final AtomicLong I0;
    public final e3 J0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final q0a b;
    public final w76 c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        k77 hc9 = new hc9(v4d.class, "sectionItemsJob", "getSectionItemsJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        K0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [yd3, java.lang.Object] */
    public v4d(t97 t97, t97 t972, q0a q0a, w76 w76, sab sab, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, ap3 ap3, t97 t978) {
        r7e d = s7d.a.getAccessor().d(xzc.class);
        this.b = q0a;
        this.c = w76;
        this.o = t97;
        this.X = t972;
        this.Y = t973;
        this.Z = t974;
        this.w0 = t976;
        this.x0 = t975;
        this.y0 = t977;
        this.z0 = t978;
        ? obj = new Object();
        obj.b = ez3.O(3, new vfc(15));
        obj.a = ez3.O(3, new vfc(16));
        obj.c = ez3.O(3, new vfc(17));
        obj.d = ez3.O(3, new r9c(2, d));
        obj.e = ez3.O(3, new vfc(18));
        obj.f = ez3.O(3, new vfc(19));
        this.A0 = obj;
        grd a = hrd.a(u9d.h);
        this.D0 = a;
        this.E0 = new t0c(a);
        grd a2 = hrd.a(hw4.a);
        this.F0 = a2;
        this.G0 = new t0c(a2);
        this.H0 = new AtomicReference();
        this.I0 = new AtomicLong();
        this.J0 = hwf.t();
        q();
        xs7.E(this.a, ((pae) t973.getValue()).a(), (ru3) null, new l4d(t97, ap3, this, (Continuation) null), 2);
        ez3.N(new ck5(new s0c(sab.a), new m4d(this, (Continuation) null), 5), this.a);
    }

    public final void q() {
        qod D = xs7.D(this.a, r().a(), ru3.b, new p4d(this, (Continuation) null));
        this.J0.o1(this, K0[0], D);
    }

    public final pae r() {
        return (pae) this.Y.getValue();
    }

    public final g2b s() {
        return (g2b) this.o.getValue();
    }

    public final Long t() {
        long j = ((u9d) this.E0.a.getValue()).a;
        Long valueOf = Long.valueOf(j);
        if (j != -1) {
            return valueOf;
        }
        return null;
    }

    public final void u() {
        if (!((qna) this.Z.getValue()).b(qna.l)) {
            taf.o(this.B0, n8d.b);
            return;
        }
        xs7.E(this.a, r().b(), (ru3) null, new u4d(this, (Continuation) null), 2);
    }

    public final void v() {
        this.H0.set((Object) null);
        taf.o(this.B0, new t8d(new hge(zaa.n), Integer.valueOf(phc.J)));
    }

    public final void w() {
        this.H0.set((Object) null);
        taf.o(this.B0, new t8d(new hge(zaa.p), Integer.valueOf(phc.J)));
    }
}
