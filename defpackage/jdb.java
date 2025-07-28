package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: jdb  reason: default package */
public final class jdb extends taf {
    public static final /* synthetic */ k77[] F0;
    public final s0c A0;
    public final l05 B0;
    public final AtomicLong C0;
    public final grd D0;
    public i47 E0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final long b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final hcd x0;
    public final e3 y0 = hwf.t();
    public final hcd z0;

    static {
        k77 hc9 = new hc9(jdb.class, "updateOptionsJob", "getUpdateOptionsJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        F0 = new k77[]{hc9};
    }

    public jdb(long j, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        long j2 = j;
        this.b = j2;
        this.c = t97;
        this.o = t972;
        this.X = t973;
        this.Y = t976;
        this.Z = t975;
        this.w0 = t977;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.x0 = b2;
        q02 Q = ez3.Q(new pj5[]{new edb(((ng0) t974.getValue()).b, this, 1), new ik5(b2, 2)});
        hcd a = icd.a(1, 1, 2);
        this.z0 = a;
        this.A0 = new s0c(a);
        this.B0 = new l05(0);
        this.C0 = new AtomicLong(-9223372036854775807L);
        this.D0 = hrd.a(new vcb(false, false, false, false, false));
        h37 a2 = lp.a();
        a2.H();
        this.E0 = a2;
        ez3.N(ez3.J(new djc(new hdb(new edb(new ik5(((aw2) ((bv2) t97.getValue())).m(j2), 2), this, 0), (Continuation) null, this)), ((pae) t972.getValue()).a()), this.a);
        ez3.N(ez3.J(new ck5(Q, new zcb(this, (Continuation) null), 5), ((pae) t972.getValue()).a()), this.a);
    }

    public static final Object q(jdb jdb, vcb vcb, Continuation continuation) {
        jdb jdb2 = jdb;
        vcb vcb2 = vcb;
        jdb.getClass();
        lg7 c2 = hwf.c();
        c2.add(new xsc(new hge(i8a.E1), (nge) null, 0, 14));
        int i = f8a.n0;
        c2.add(new b7(i, new o7d((long) i, 0, new hge(i8a.C1), (d7d) null, (mge) null, new Integer(phc.r0), new z6d(vcb2.a, true), (u6d) null, (mge) null, 0, (r6d) null, 1944), 536871936));
        int i2 = f8a.l0;
        hge hge = new hge(i8a.A1);
        Integer num = new Integer(phc.b);
        boolean z = vcb2.b;
        boolean z2 = z;
        c2.add(new b7(i2, new o7d((long) i2, 0, hge, (d7d) null, (mge) null, num, new z6d(z, true), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        int i3 = f8a.o0;
        c2.add(new b7(i3, new o7d((long) i3, 0, new hge(i8a.D1), (d7d) null, (mge) null, new Integer(phc.D1), new z6d(vcb2.c, true), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        t97 t97 = jdb2.w0;
        if (((kb5) ((jb5) t97.getValue())).q()) {
            kb5 kb5 = (kb5) ((jb5) t97.getValue());
            kb5.getClass();
            if (kb5.m(PmsKey.gcmpe, false)) {
                int i4 = f8a.m0;
                c2.add(new b7(i4, new o7d((long) i4, 0, new hge(i8a.B1), (d7d) null, (mge) null, new Integer(phc.A1), new z6d(vcb2.d, true), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
            }
        }
        if (((kb5) ((jb5) t97.getValue())).o()) {
            int i5 = f8a.p0;
            c2.add(new b7(i5, new o7d((long) i5, 0, new hge(i8a.F1), (d7d) null, (mge) null, new Integer(phc.e1), new z6d(vcb2.e, z2), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        }
        Object obj = c2.get(p23.A(c2));
        b7 b7Var = obj instanceof b7 ? (b7) obj : null;
        if (b7Var != null) {
            c2.set(p23.A(c2), new b7(b7Var.a, b7Var.b, -2147482624));
        }
        Object a = jdb2.z0.a(hwf.a(c2), continuation);
        return a == pu3.a ? a : jue.a;
    }

    public static final vcb r(jdb jdb, i22 i22) {
        jdb.getClass();
        d62 d62 = i22.b.H;
        boolean z = d62.i;
        return new vcb(!d62.b, !d62.d, d62.e, !d62.f, z);
    }

    public final void s(HashMap hashMap) {
        qod D = xs7.D(this.a, ((pae) this.o.getValue()).b(), ru3.b, new idb(this, hashMap, (Continuation) null));
        this.y0.o1(this, F0[0], D);
    }
}
