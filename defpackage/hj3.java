package defpackage;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: hj3  reason: default package */
public final class hj3 extends bs4 {
    public final r7e A = new r7e(new xd3(3));
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final p87 C = new p87(p23.B(new tze[]{new Object(), new yc(), new Object()}));
    public final p87 D = new p87(o23.j0(p23.B(new tze[]{new Object(), new yc(), new Object()}), new Object()));
    public final long n;
    public final t97 o;
    public final t97 p;
    public final t97 q;
    public final t97 r;
    public final t97 s;
    public final t97 t;
    public final t97 u;
    public final t97 v;
    public final t97 w;
    public final t97 x;
    public final ijb y;
    public final t97 z;

    public hj3(long j, ou3 ou3) {
        super(ou3);
        this.n = j;
        z7b z7b = z7b.a;
        r7e d = z7b.getAccessor().d(ap3.class);
        this.o = d;
        this.p = z7b.c();
        this.q = z7b.getAccessor().d(f03.class);
        this.r = z7b.getAccessor().d(qpc.class);
        this.s = z7b.d();
        this.t = z7b.getAccessor().d(zy9.class);
        this.u = z7b.getAccessor().d(so1.class);
        this.v = z7b.getAccessor().d(dn3.class);
        this.w = z7b.getAccessor().d(cn3.class);
        this.x = z7b.getAccessor().d(xf3.class);
        this.y = new ijb(z7b.getAccessor().d(d8a.class));
        this.z = z7b.b();
        ez3.N(ez3.J(new ck5(new bc(new djc(new bj3(new ik5(((ap3) d.getValue()).c(j), 2), (Continuation) null, this)), 15, this), new pi3(this, (Continuation) null), 5), q().b()), ou3);
    }

    public static final Object n(hj3 hj3, Continuation continuation) {
        Object a;
        boolean z2 = hj3.B.get();
        jue jue = jue.a;
        pu3 pu3 = pu3.a;
        hcd hcd = hj3.d;
        if (z2) {
            hj3.c().getClass();
            a = hcd.a(new d9b(new hge(i8a.c0), new hge(i8a.b0), p23.B(new kc3[]{new kc3(f8a.f0, new hge(i8a.a0), 1, false), new kc3(f8a.g0, new hge(i8a.Z), 2, false)})), continuation);
            if (a != pu3) {
                return jue;
            }
        } else {
            tf3 tf3 = (tf3) ((ap3) hj3.o.getValue()).c(hj3.n).a.getValue();
            String d = tf3 != null ? tf3.d() : null;
            if (d == null) {
                d = "";
            }
            hj3.c().getClass();
            jge jge = new jge(i8a.H0, cs.g0(new Object[]{d}));
            lg7 c = hwf.c();
            c.add(new kc3(f8a.f, new hge(i8a.G0), 1, false));
            c.add(new kc3(f8a.e, new hge(i8a.E0), 2, false));
            a = hcd.a(new d9b(jge, (mge) null, hwf.a(c)), continuation);
            if (a != pu3) {
                return jue;
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r17 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.sr4 o(defpackage.hj3 r20, defpackage.tf3 r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = "6M"
            t97 r3 = r0.q
            java.lang.Object r3 = r3.getValue()
            f03 r3 = (defpackage.f03) r3
            lqc r3 = (defpackage.lqc) r3
            java.lang.String r3 = r3.p()
            fj0 r4 = defpackage.fj0.c
            java.lang.String r6 = r1.q(r3, r4)
            long r7 = r21.n()
            java.lang.CharSequence r10 = r21.m()
            java.lang.String r9 = r21.e()
            java.lang.String r12 = r21.f()
            oi3 r3 = r1.a
            ni3 r4 = r3.c
            java.lang.String r14 = r4.o
            java.lang.String r4 = r4.p
            if (r4 == 0) goto L_0x0052
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            ni3 r3 = r3.c
            java.lang.String r3 = r3.p
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r3 = r3.getLastPathSegment()
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            lge r4 = new lge
            r4.<init>(r3)
        L_0x0050:
            r15 = r4
            goto L_0x005a
        L_0x0052:
            int r3 = defpackage.i8a.k2
            hge r4 = new hge
            r4.<init>(r3)
            goto L_0x0050
        L_0x005a:
            long r3 = r21.o()
            java.lang.String r16 = java.lang.String.valueOf(r3)
            t97 r0 = r0.r
            java.lang.Object r0 = r0.getValue()
            qpc r0 = (defpackage.qpc) r0
            kp r0 = (defpackage.kp) r0
            x97 r0 = r0.g
            java.lang.String r1 = "app.privacy.inactive.ttl"
            java.lang.String r0 = r0.getString(r1, r2)
            fze r1 = defpackage.fze.TTL_6M
            if (r0 == 0) goto L_0x00a2
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case 1596: goto L_0x0095;
                case 1658: goto L_0x008a;
                case 1751: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x009f
        L_0x0081:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0088
            goto L_0x009f
        L_0x0088:
            r3 = 2
            goto L_0x009f
        L_0x008a:
            java.lang.String r2 = "3M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            r3 = 1
            goto L_0x009f
        L_0x0095:
            java.lang.String r2 = "1M"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            switch(r3) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a2;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r17 = r1
            goto L_0x00ad
        L_0x00a5:
            fze r0 = defpackage.fze.TTL_3M
        L_0x00a7:
            r17 = r0
            goto L_0x00ad
        L_0x00aa:
            fze r0 = defpackage.fze.TTL_1M
            goto L_0x00a7
        L_0x00ad:
            sr4 r0 = new sr4
            r11 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r5 = r0
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj3.o(hj3, tf3):sr4");
    }

    public static final void p(hj3 hj3, long j) {
        Object value;
        sr4 sr4;
        grd grd;
        Object value2;
        grd grd2 = hj3.j;
        do {
            value = grd2.getValue();
            sr4 sr42 = (sr4) value;
            if (sr42 != null) {
                sr4 = sr4.c(sr42, (String) null, (r33) null, (String) null, (r33) null, (String) null, (mge) null, (fze) null, j != 0, Long.valueOf(j), 2047);
            } else {
                sr4 = null;
            }
        } while (!grd2.b(value, sr4));
        do {
            grd = hj3.c;
            value2 = grd.getValue();
            List list = (List) value2;
        } while (!grd.b(value2, hj3.f().a(hj3)));
    }

    public final void a(int i) {
        xs7.E(this.a, q().a(), (ru3) null, new qi3(i, this, (Continuation) null), 2);
    }

    public final void b() {
    }

    public final boolean d() {
        return this.B.get();
    }

    public final long e() {
        return this.n;
    }

    public final void g(int i) {
        if (i == f8a.b) {
            r(fze.TTL_1M);
        } else if (i == f8a.c) {
            r(fze.TTL_3M);
        } else if (i == f8a.d) {
            r(fze.TTL_6M);
        } else {
            int i2 = f8a.f0;
            ou3 ou3 = this.a;
            if (i == i2) {
                xs7.E(ou3, q().b(), (ru3) null, new ui3(this, true, (Continuation) null), 2);
            } else if (i == f8a.f) {
                xs7.E(ou3, q().b().plus(sk9.a), (ru3) null, new ti3(this, (Continuation) null), 2);
            } else if (i == f8a.k0) {
                ((so1) this.u.getValue()).v();
                xs7.E(ou3, q().b(), (ru3) null, new wi3(this, (Continuation) null), 2);
            }
        }
    }

    public final Object h(String str, RectF rectF, Continuation continuation) {
        this.m.set(((gy9) ((pk) this.z.getValue())).G(str, iu7.i(rectF)));
        Object a = this.d.a(new e9b(new hge(i8a.q), new Integer(phc.m)), continuation);
        return a == pu3.a ? a : jue.a;
    }

    public final jue i() {
        tf3 tf3 = (tf3) ((ap3) this.o.getValue()).c(this.n).a.getValue();
        jue jue = jue.a;
        if (tf3 == null) {
            return jue;
        }
        grd grd = this.b;
        x7b x7b = (x7b) grd.getValue();
        grd.setValue(x7b != null ? x7b.a(x7b, tf3.q(((lqc) ((f03) this.q.getValue())).p(), fj0.c), false, 126) : null);
        return jue;
    }

    public final void j() {
        xs7.E(this.a, q().b(), (ru3) null, new xi3(this, (Continuation) null), 2);
    }

    public final void k() {
        xs7.E(this.a, q().a(), (ru3) null, new yi3(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cj3
            if (r0 == 0) goto L_0x0013
            r0 = r12
            cj3 r0 = (defpackage.cj3) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            cj3 r0 = new cj3
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x0038
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            wx3.H(r12)
            goto L_0x00ff
        L_0x0038:
            sr4 r11 = r0.X
            hj3 r2 = r0.o
            wx3.H(r12)
            r10 = r12
            r12 = r11
            r11 = r2
            r2 = r10
            goto L_0x00b5
        L_0x0044:
            wx3.H(r12)
            grd r12 = r11.j
            java.lang.Object r12 = r12.getValue()
            sr4 r12 = (defpackage.sr4) r12
            if (r12 != 0) goto L_0x0054
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x0054:
            java.util.concurrent.atomic.AtomicBoolean r2 = r11.B
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x00dc
            p87 r2 = r11.D
            boolean r2 = r11.s(r2)
            if (r2 != 0) goto L_0x0067
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x0067:
            fze r2 = r12.k
            if (r2 == 0) goto L_0x00c0
            t97 r3 = r11.r
            java.lang.Object r7 = r3.getValue()
            qpc r7 = (defpackage.qpc) r7
            kp r7 = (defpackage.kp) r7
            x97 r7 = r7.g
            java.lang.String r8 = "6M"
            java.lang.String r9 = "app.privacy.inactive.ttl"
            java.lang.String r7 = r7.getString(r9, r8)
            java.lang.String r8 = r2.a
            boolean r7 = hhd.f(r8, r7)
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r2 = r6
        L_0x008a:
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r3 = r3.getValue()
            qpc r3 = (defpackage.qpc) r3
            kp r3 = (defpackage.kp) r3
            java.lang.String r7 = r2.a
            r3.l(r9, r7)
            pae r3 = r11.q()
            n3a r3 = (n3a) r3
            ju3 r3 = r3.b()
            dj3 r7 = new dj3
            r7.<init>(r11, r2, r6)
            r0.o = r11
            r0.X = r12
            r0.w0 = r5
            java.lang.Object r2 = xs7.U(r3, r7, r0)
            if (r2 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r2)
        L_0x00c0:
            pae r2 = r11.q()
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            ej3 r3 = new ej3
            r3.<init>(r11, r12, r6)
            r0.o = r6
            r0.X = r6
            r0.w0 = r4
            java.lang.Object r11 = xs7.U(r2, r3, r0)
            if (r11 != r1) goto L_0x00ff
            return r1
        L_0x00dc:
            p87 r2 = r11.C
            boolean r2 = r11.s(r2)
            if (r2 != 0) goto L_0x00e7
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L_0x00e7:
            pae r2 = r11.q()
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            fj3 r4 = new fj3
            r4.<init>(r11, r12, r6)
            r0.w0 = r3
            java.lang.Object r11 = xs7.U(r2, r4, r0)
            if (r11 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj3.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(int i, String str) {
        Object value;
        sr4 sr4;
        Object value2;
        sr4 sr42;
        Object value3;
        sr4 sr43;
        grd grd = this.j;
        if (i == 1) {
            do {
                value3 = grd.getValue();
                sr43 = (sr4) value3;
            } while (!grd.b(value3, sr43 != null ? sr4.c(sr43, str, (r33) null, (String) null, (r33) null, (String) null, (mge) null, (fze) null, false, (Long) null, 8171) : null));
        } else if (i == 2) {
            do {
                value2 = grd.getValue();
                sr42 = (sr4) value2;
            } while (!grd.b(value2, sr42 != null ? sr4.c(sr42, (String) null, (r33) null, str, (r33) null, (String) null, (mge) null, (fze) null, false, (Long) null, 8095) : null));
        } else if (i == 4) {
            do {
                value = grd.getValue();
                sr4 = (sr4) value;
            } while (!grd.b(value, sr4 != null ? sr4.c(sr4, (String) null, (r33) null, (String) null, (r33) null, str, (mge) null, (fze) null, false, (Long) null, 8063) : null));
        }
    }

    public final pae q() {
        return (pae) this.s.getValue();
    }

    public final void r(fze fze) {
        grd grd;
        Object value;
        sr4 sr4;
        do {
            grd = this.j;
            value = grd.getValue();
            sr4 = (sr4) value;
        } while (!grd.b(value, sr4 != null ? sr4.c(sr4, (String) null, (r33) null, (String) null, (r33) null, (String) null, (mge) null, fze, false, (Long) null, 7167) : null));
    }

    public final boolean s(p87 p87) {
        Object value;
        sr4 sr4;
        grd grd;
        Object value2;
        String str;
        sr4 sr42;
        String str2;
        p87 p872 = p87;
        grd grd2 = this.j;
        sr4 sr43 = (sr4) grd2.getValue();
        String str3 = sr43 != null ? sr43.c : null;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        boolean z2 = true;
        r33 a = p872.a(1, str3);
        sr4 sr44 = (sr4) grd2.getValue();
        String str5 = sr44 != null ? sr44.f : null;
        if (str5 != null) {
            str4 = str5;
        }
        r33 a2 = p872.a(2, str4);
        sr4 sr45 = (sr4) grd2.getValue();
        if (!(sr45 == null || (str = sr45.c) == null || !h0e.c0(str) || (sr42 = (sr4) grd2.getValue()) == null || (str2 = sr42.f) == null || h0e.c0(str2))) {
            a = new r33(Collections.singletonList(new hge(rhc.m0)));
        }
        if (!(a == null && a2 == null)) {
            z2 = false;
        }
        do {
            value = grd2.getValue();
            sr4 = (sr4) value;
        } while (!grd2.b(value, sr4 != null ? sr4.c(sr4, (String) null, a, (String) null, a2, (String) null, (mge) null, (fze) null, false, (Long) null, 8111) : null));
        do {
            grd = this.c;
            value2 = grd.getValue();
            List list = (List) value2;
        } while (!grd.b(value2, f().a(this)));
        return z2;
    }
}
