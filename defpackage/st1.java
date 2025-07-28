package defpackage;

import android.content.Context;
import android.util.Range;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: st1  reason: default package */
public abstract class st1 {
    public static final qt1 D = new Object();
    public final HashSet A;
    public final Context B;
    public final HashMap C;
    public wu1 a = wu1.c;
    public int b = 3;
    public b3b c;
    public bq6 d;
    public kp6 e;
    public h2f f;
    public a6c g = null;
    public final HashMap h = new HashMap();
    public v2b i = y5c.j0;
    public final zq4 j;
    public final zq4 k;
    public final Range l;
    public qb7 m;
    public f4b n;
    public ybf o;
    public a3b p;
    public final ydc q;
    public final rgc r;
    public final boolean s;
    public boolean t;
    public final tw5 u;
    public final tw5 v;
    public final vb9 w;
    public final e3 x;
    public final e3 y;
    public final e3 z;

    /* JADX WARNING: type inference failed for: r4v6, types: [tw5, vh8] */
    /* JADX WARNING: type inference failed for: r4v7, types: [tw5, vh8] */
    /* JADX WARNING: type inference failed for: r4v8, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.Object, e3] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object, e3] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.lang.Object, e3] */
    public st1(Context context) {
        e4b e4b = e4b.f;
        oy1 M = x87.M(context);
        sr1 sr1 = new sr1(5);
        oy1 N = ct0.N(M, new e3(sr1), pa2.j());
        zq4 zq4 = zq4.c;
        this.j = zq4;
        this.k = zq4;
        this.l = va0.f;
        this.s = true;
        this.t = true;
        this.u = new vh8();
        this.v = new vh8();
        this.w = new yh7(0);
        this.x = new Object();
        this.y = new Object();
        this.z = new Object();
        this.A = new HashSet();
        this.C = new HashMap();
        Context g2 = fja.g(context);
        this.B = g2;
        hp6 hp6 = new hp6(2);
        c(hp6);
        zq4 zq42 = this.k;
        hp6.b.j(qq6.A, zq42);
        this.c = hp6.b();
        hp6 hp62 = new hp6(1);
        c(hp62);
        this.d = hp62.a();
        this.e = d((Integer) null, (Integer) null, (Integer) null);
        this.f = e();
        rb7 rb7 = (rb7) this;
        pt1 pt1 = new pt1(0, rb7);
        ct0.N(N, new e3(pt1), pa2.A());
        this.q = new ydc(g2);
        this.r = new rgc(28, rb7);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(defpackage.a3b r7, defpackage.ybf r8) {
        /*
            r6 = this;
            defpackage.gt0.i()
            a3b r0 = r6.p
            if (r0 == r7) goto L_0x000e
            r6.p = r7
            b3b r0 = r6.c
            r0.G(r7)
        L_0x000e:
            ybf r7 = r6.o
            r0 = 0
            if (r7 == 0) goto L_0x0037
            int r7 = r6.g(r8)
            r1 = -1
            if (r7 == r1) goto L_0x0021
            ii5 r2 = new ii5
            r3 = 1
            r2.<init>(r7, r3)
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            ybf r7 = r6.o
            int r7 = r6.g(r7)
            if (r7 == r1) goto L_0x0031
            ii5 r1 = new ii5
            r3 = 1
            r1.<init>(r7, r3)
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r2 == r1) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r7 = 0
            goto L_0x0038
        L_0x0037:
            r7 = 1
        L_0x0038:
            r6.o = r8
            ydc r8 = r6.q
            vd6 r1 = pa2.A()
            rgc r2 = r6.r
            java.lang.Object r3 = r8.b
            monitor-enter(r3)
            java.lang.Object r4 = r8.c     // Catch:{ all -> 0x0051 }
            sfc r4 = (defpackage.sfc) r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r4.canDetectOrientation()     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            r6 = move-exception
            goto L_0x0070
        L_0x0053:
            java.lang.Object r4 = r8.o     // Catch:{ all -> 0x0051 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0051 }
            tfc r5 = new tfc     // Catch:{ all -> 0x0051 }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x0051 }
            r4.put(r2, r5)     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.c     // Catch:{ all -> 0x0051 }
            sfc r8 = (defpackage.sfc) r8     // Catch:{ all -> 0x0051 }
            r8.enable()     // Catch:{ all -> 0x0051 }
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
        L_0x0067:
            if (r7 == 0) goto L_0x006c
            r6.r()
        L_0x006c:
            r6.q(r0)
            return
        L_0x0070:
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.a(a3b, ybf):void");
    }

    public final void b() {
        gt0.i();
        f4b f4b = this.n;
        if (f4b != null) {
            f4b.a(this.c, this.d, this.e, this.f);
        }
        this.c.G((a3b) null);
        this.m = null;
        this.p = null;
        this.o = null;
        ydc ydc = this.q;
        rgc rgc = this.r;
        synchronized (ydc.b) {
            try {
                tfc tfc = (tfc) ((HashMap) ydc.o).get(rgc);
                if (tfc != null) {
                    tfc.c.set(false);
                    ((HashMap) ydc.o).remove(rgc);
                }
                if (((HashMap) ydc.o).isEmpty()) {
                    ((sfc) ydc.c).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(hp6 hp6) {
        ybf ybf = this.o;
        if (ybf != null) {
            int g2 = g(ybf);
            ii5 ii5 = g2 != -1 ? new ii5(g2, 1) : null;
            if (ii5 != null) {
                hp6.c(new ibc(ii5, (jbc) null, 0));
            }
        }
    }

    public final kp6 d(Integer num, Integer num2, Integer num3) {
        hp6 hp6 = new hp6(0);
        fc9 fc9 = hp6.b;
        if (num != null) {
            fc9.j(np6.b, num);
        }
        if (num2 != null) {
            fc9.j(np6.c, num2);
        }
        if (num3 != null) {
            fc9.j(np6.X, num3);
        }
        c(hp6);
        np6 np6 = new np6(hga.a(fc9));
        br6.A(np6);
        return new kp6(np6);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, lb0] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, lb0] */
    public final h2f e() {
        int g2;
        hs1 hs1 = y5c.n0;
        jg8 a2 = z90.a();
        v2b v2b = this.i;
        e07.o(v2b, "The specified quality selector can't be null.");
        mb0 mb0 = (mb0) a2.c;
        if (mb0 != null) {
            ? obj = new Object();
            obj.a = mb0.a;
            obj.b = mb0.b;
            obj.c = mb0.c;
            obj.d = Integer.valueOf(mb0.d);
            obj.a = v2b;
            a2.c = obj.a();
            ybf ybf = this.o;
            if (!(ybf == null || this.i != y5c.j0 || (g2 = g(ybf)) == -1)) {
                mb0 mb02 = (mb0) a2.c;
                if (mb02 != null) {
                    ? obj2 = new Object();
                    obj2.a = mb02.a;
                    obj2.b = mb02.b;
                    obj2.c = mb02.c;
                    obj2.d = Integer.valueOf(mb02.d);
                    obj2.d = Integer.valueOf(g2);
                    a2.c = obj2.a();
                } else {
                    throw new IllegalStateException("Property \"videoSpec\" has not been set");
                }
            }
            hp6 hp6 = new hp6((d7f) new y5c((ExecutorService) null, a2.i(), hs1, hs1));
            z80 z80 = pye.p0;
            Range range = this.l;
            fc9 fc9 = hp6.b;
            fc9.j(z80, range);
            fc9.j(br6.E, 0);
            fc9.j(qq6.A, this.j);
            return new h2f(new i2f(hga.a(fc9)));
        }
        throw new IllegalStateException("Property \"videoSpec\" has not been set");
    }

    public final tnc f() {
        snc snc = snc.b;
        HashMap hashMap = this.C;
        if (hashMap.get(snc) != null) {
            return (tnc) hashMap.get(snc);
        }
        snc snc2 = snc.a;
        if (hashMap.get(snc2) != null) {
            return (tnc) hashMap.get(snc2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.ybf r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
            r1 = r0
            goto L_0x000b
        L_0x0005:
            int r1 = r6.c
            int r1 = defpackage.z3d.O(r1)
        L_0x000b:
            f4b r2 = r5.n
            if (r2 != 0) goto L_0x0011
            r2 = r0
            goto L_0x001f
        L_0x0011:
            wu1 r3 = r5.a
            e4b r2 = r2.a
            fcc r2 = r2.e(r3)
            fu1 r2 = r2.a
            int r2 = r2.b()
        L_0x001f:
            f4b r3 = r5.n
            r4 = 1
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            r5 = r4
            goto L_0x0038
        L_0x0026:
            wu1 r5 = r5.a
            e4b r3 = r3.a
            fcc r5 = r3.e(r5)
            fu1 r5 = r5.a
            int r5 = r5.g()
            if (r5 != r4) goto L_0x0037
            goto L_0x0024
        L_0x0037:
            r5 = r0
        L_0x0038:
            int r5 = defpackage.z3d.x(r1, r2, r5)
            android.util.Rational r6 = r6.b
            r1 = 90
            if (r5 == r1) goto L_0x0046
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 != r1) goto L_0x0054
        L_0x0046:
            android.util.Rational r5 = new android.util.Rational
            int r1 = r6.getDenominator()
            int r6 = r6.getNumerator()
            r5.<init>(r1, r6)
            r6 = r5
        L_0x0054:
            android.util.Rational r5 = new android.util.Rational
            r1 = 4
            r2 = 3
            r5.<init>(r1, r2)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0062
            return r0
        L_0x0062:
            android.util.Rational r5 = new android.util.Rational
            r0 = 16
            r1 = 9
            r5.<init>(r0, r1)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0072
            return r4
        L_0x0072:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.g(ybf):int");
    }

    public final boolean h() {
        return this.m != null;
    }

    public final boolean i() {
        return this.n != null;
    }

    public final void j(f4b f4b) {
        this.n = f4b;
        r();
        q((Runnable) null);
    }

    public final void k(wu1 wu1) {
        gt0.i();
        if (this.a != wu1) {
            Integer b2 = wu1.b();
            if (this.d.H() != 3 || b2 == null || b2.intValue() == 0) {
                wu1 wu12 = this.a;
                this.a = wu1;
                f4b f4b = this.n;
                if (f4b != null) {
                    f4b.a(this.c, this.d, this.e, this.f);
                    q(new dr1((rb7) this, 5, wu12));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
    }

    public final void l(int i2) {
        gt0.i();
        int i3 = this.b;
        if (i2 != i3) {
            this.b = i2;
            gt0.i();
            if ((this.b & 4) == 0) {
                gt0.i();
                a6c a6c = this.g;
                if (a6c != null && !a6c.a.get()) {
                    gt0.i();
                    a6c a6c2 = this.g;
                    if (a6c2 != null) {
                        a6c2.close();
                        this.g = null;
                    }
                }
            }
            q(new n30(i3, 5, (rb7) this));
        }
    }

    public final void m(int i2) {
        gt0.i();
        if (i2 == 3) {
            Integer b2 = this.a.b();
            if (b2 == null || b2.intValue() == 0) {
                tnc f2 = f();
                if (f2 == null) {
                    bq6 bq6 = this.d;
                    qt1 qt1 = D;
                    bq6.getClass();
                    wnc wnc = new wnc(qt1);
                    bq6.u = wnc;
                    bq6.d().g(wnc);
                } else {
                    bq6 bq62 = this.d;
                    bq62.getClass();
                    wnc wnc2 = new wnc(f2.b);
                    bq62.u = wnc2;
                    bq62.d().g(wnc2);
                    f2.a.name();
                }
            } else {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        bq6 bq63 = this.d;
        bq63.getClass();
        if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
            if (i2 != 3) {
                throw new IllegalArgumentException(wn6.h(i2, "Invalid flash mode: "));
            } else if (bq63.u.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            } else if (bq63.c() != null) {
                hu1 c2 = bq63.c();
                if ((c2 != null ? c2.p().g() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (bq63.q) {
            bq63.s = i2;
            bq63.K();
        }
    }

    public final void n(v2b v2b) {
        gt0.i();
        this.i = v2b;
        if (i()) {
            this.n.a(this.f);
        }
        this.f = e();
        q((Runnable) null);
    }

    public final ch7 o(float f2) {
        gt0.i();
        if (h()) {
            return ((ot1) this.m.c.F0.d).d(f2);
        }
        return this.z.g(Float.valueOf(f2));
    }

    public abstract qb7 p();

    public final void q(Runnable runnable) {
        uh8 uh8;
        uh8 uh82;
        try {
            this.m = p();
            if (h()) {
                yh7 r2 = this.m.c.G0.b.r();
                tw5 tw5 = this.u;
                yh7 yh7 = tw5.m;
                if (!(yh7 == null || (uh82 = (uh8) tw5.l.c(yh7)) == null)) {
                    uh82.a.j(uh82);
                }
                tw5.m = r2;
                tw5.l(r2, new mr1(2, tw5));
                yh7 e2 = this.m.c.G0.b.e();
                tw5 tw52 = this.v;
                yh7 yh72 = tw52.m;
                if (!(yh72 == null || (uh8 = (uh8) tw52.l.c(yh72)) == null)) {
                    uh8.a.j(uh8);
                }
                tw52.m = e2;
                tw52.l(e2, new mr1(2, tw52));
                e3 e3Var = this.x;
                e3Var.getClass();
                gt0.i();
                yia yia = (yia) e3Var.a;
                if (yia != null) {
                    Boolean bool = (Boolean) yia.b;
                    boolean booleanValue = bool.booleanValue();
                    gt0.i();
                    ch7 g2 = !h() ? e3Var.g(bool) : ((ot1) this.m.c.F0.d).k(booleanValue);
                    sn1 sn1 = (sn1) ((yia) e3Var.a).a;
                    Objects.requireNonNull(sn1);
                    ct0.C(g2, sn1);
                    e3Var.a = null;
                }
                e3 e3Var2 = this.y;
                e3Var2.getClass();
                gt0.i();
                yia yia2 = (yia) e3Var2.a;
                if (yia2 != null) {
                    Float f2 = (Float) yia2.b;
                    float floatValue = f2.floatValue();
                    gt0.i();
                    ch7 g3 = !h() ? e3Var2.g(f2) : ((ot1) this.m.c.F0.d).b(floatValue);
                    sn1 sn12 = (sn1) ((yia) e3Var2.a).a;
                    Objects.requireNonNull(sn12);
                    ct0.C(g3, sn12);
                    e3Var2.a = null;
                }
                e3 e3Var3 = this.z;
                e3Var3.getClass();
                gt0.i();
                yia yia3 = (yia) e3Var3.a;
                if (yia3 != null) {
                    ch7 o2 = o(((Float) yia3.b).floatValue());
                    sn1 sn13 = (sn1) ((yia) e3Var3.a).a;
                    Objects.requireNonNull(sn13);
                    ct0.C(o2, sn13);
                    e3Var3.a = null;
                }
            }
        } catch (RuntimeException e3) {
            if (runnable != null) {
                runnable.run();
            }
            throw e3;
        }
    }

    public final void r() {
        if (i()) {
            this.n.a(this.c);
        }
        hp6 hp6 = new hp6(2);
        c(hp6);
        zq4 zq4 = this.k;
        hp6.b.j(qq6.A, zq4);
        b3b b2 = hp6.b();
        this.c = b2;
        a3b a3b = this.p;
        if (a3b != null) {
            b2.G(a3b);
        }
        gt0.i();
        Integer valueOf = Integer.valueOf(this.d.p);
        if (i()) {
            this.n.a(this.d);
        }
        int H = this.d.H();
        hp6 hp62 = new hp6(1);
        hp62.b.j(cq6.b, valueOf);
        c(hp62);
        this.d = hp62.a();
        m(H);
        Integer num = (Integer) ((np6) this.e.f).d(np6.b, 0);
        num.intValue();
        Integer num2 = (Integer) ((np6) this.e.f).d(np6.c, 6);
        num2.intValue();
        Integer valueOf2 = Integer.valueOf(this.e.G());
        gt0.i();
        if (i()) {
            this.n.a(this.e);
        }
        this.e = d(num, num2, valueOf2);
        if (i()) {
            this.n.a(this.f);
        }
        this.f = e();
    }
}
