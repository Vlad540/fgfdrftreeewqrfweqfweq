package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x6b  reason: default package */
public final class x6b implements i5b {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public x6b(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    public final Object a(tf3 tf3, i22 i22, z6b z6b, b7b b7b, Long l, Continuation continuation) {
        tf3 tf32 = tf3;
        z6b z6b2 = z6b;
        lg7 c2 = hwf.c();
        boolean z = true;
        int i = ((o2b) this.a.getValue()).b(tf3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String p = tf32.p(fj0.c);
        String str = p == null ? "" : p;
        CharSequence b2 = ((q2b) ((s2b) this.b.getValue()).a.getValue()).b(tf32);
        boolean q = i22.q();
        if (z6b2.a || !q) {
            z = false;
        }
        long n = tf3.n();
        String d = tf3.d();
        c2.add(new xj3(n, d == null ? "" : d, new lge(b2), str, z2, tf3.m(), b7b, 536903680, false, 256));
        int i2 = f8a.S;
        c2.add(new b7(i2, new o7d((long) i2, 0, new hge(i8a.l1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.a, q), (u6d) null, (mge) null, 0, (r6d) null, 1944), -2147482624));
        c2.add(new xsc(new hge(i8a.w1), nte.o, 4096, 2));
        c2.add(new xsc(new hge(i8a.k1), (nge) null, 2048, 6));
        int i3 = f8a.O;
        c2.add(new b7(i3, new o7d((long) i3, 0, new hge(i8a.t1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.b, z), (u6d) null, (mge) null, 0, (r6d) null, 1944), 536871936));
        int i4 = f8a.P;
        c2.add(new b7(i4, new o7d((long) i4, 0, new hge(i8a.i1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.c, z), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        int i5 = f8a.F;
        c2.add(new b7(i5, new o7d((long) i5, 0, new hge(i8a.p1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.d, z), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        int i6 = f8a.N;
        c2.add(new b7(i6, new o7d((long) i6, 0, new hge(i8a.s1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.e, z), (u6d) null, (mge) null, 0, (r6d) null, 1944), -2147482624));
        c2.add(new xsc(mge.a, (nge) null, 0, 14));
        if (q && b7b == b7b.CHANGE_ADMIN) {
            int i7 = f8a.D;
            c2.add(new b7(i7, new o7d((long) i7, 0, new hge(i8a.e), (d7d) null, (mge) null, new Integer(phc.Q0), w6d.a, (u6d) null, (mge) null, 0, (r6d) null, 1944), 1024));
            c2.add(new ge4(new hge(i8a.W0)));
        }
        return hwf.a(c2);
    }

    public final Object b(tf3 tf3, i22 i22, z6b z6b, b7b b7b, Long l, Continuation continuation) {
        tf3 tf32 = tf3;
        z6b z6b2 = z6b;
        lg7 c2 = hwf.c();
        boolean z = true;
        int i = ((o2b) this.a.getValue()).b(tf3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        String p = tf32.p(fj0.c);
        String str = "";
        String str2 = p == null ? str : p;
        CharSequence b2 = ((q2b) ((s2b) this.b.getValue()).a.getValue()).b(tf32);
        boolean q = i22.q();
        boolean z3 = !z6b2.a && q;
        boolean z4 = z6b2.e;
        if (!z3 || !z4) {
            z = false;
        }
        long n = tf3.n();
        String d = tf3.d();
        if (d != null) {
            str = d;
        }
        boolean z5 = z4;
        String str3 = str;
        boolean z6 = z3;
        boolean z7 = z;
        boolean z8 = q;
        c2.add(new xj3(n, str3, new lge(b2), str2, z2, tf3.m(), b7b, 536903680, false, 256));
        int i2 = f8a.S;
        o7d o7d = r8;
        o7d o7d2 = new o7d((long) i2, 0, new hge(i8a.l1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.a, z8), (u6d) null, (mge) null, 0, (r6d) null, 1944);
        c2.add(new b7(i2, o7d, -2147482624));
        c2.add(new xsc(new hge(i8a.m1), nte.o, 4096, 2));
        c2.add(new xsc(new hge(i8a.k1), (nge) null, 2048, 6));
        int i3 = f8a.O;
        c2.add(new b7(i3, new o7d((long) i3, 0, new hge(i8a.c1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.b, z6), (u6d) null, (mge) null, 0, (r6d) null, 1944), 536871936));
        int i4 = f8a.P;
        int i5 = 1073742848;
        c2.add(new b7(i4, new o7d((long) i4, 0, new hge(i8a.i1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.c, z6), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        int i6 = f8a.F;
        c2.add(new b7(i6, new o7d((long) i6, 0, new hge(i8a.N0), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.d, z6), (u6d) null, (mge) null, 0, (r6d) null, 1944), 1073742848));
        int i7 = f8a.N;
        o7d o7d3 = new o7d((long) i7, 0, new hge(i8a.b1), (d7d) null, (mge) null, (Integer) null, new z6d(z5, z6), (u6d) null, (mge) null, 0, (r6d) null, 1944);
        t97 t97 = this.c;
        if (!((kb5) ((jb5) t97.getValue())).o()) {
            i5 = -2147482624;
        }
        c2.add(new b7(i7, o7d3, i5));
        if (((kb5) ((jb5) t97.getValue())).o()) {
            int i8 = f8a.M;
            c2.add(new b7(i8, new o7d((long) i8, 0, new hge(i8a.a1), (d7d) null, (mge) null, (Integer) null, new z6d(z6b2.f, z7), (u6d) null, (mge) null, 0, (r6d) null, 1944), -2147482624));
        }
        c2.add(new xsc(mge.a, (nge) null, 0, 14));
        if (z8 && b7b == b7b.CHANGE_ADMIN) {
            int i9 = f8a.D;
            c2.add(new b7(i9, new o7d((long) i9, 0, new hge(i8a.e), (d7d) null, (mge) null, new Integer(phc.Q0), w6d.a, (u6d) null, (mge) null, 0, (r6d) null, 1944), 1024));
            c2.add(new ge4(new hge(i8a.W0)));
        }
        return hwf.a(c2);
    }
}
