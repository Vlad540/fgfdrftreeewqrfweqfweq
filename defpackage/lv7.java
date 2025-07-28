package defpackage;

import android.os.Handler;

/* renamed from: lv7  reason: default package */
public final class lv7 extends u83 {
    public final yh0 k;
    public final boolean l;
    public final sje m;
    public final pje n;
    public hv7 o;
    public fv7 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public lv7(yh0 yh0, boolean z) {
        boolean z2;
        this.k = yh0;
        if (z) {
            yh0.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new sje();
        this.n = new pje();
        yh0.getClass();
        this.o = new hv7(new jv7(yh0.f()), sje.G0, hv7.X);
    }

    public final j68 f() {
        return this.k.f();
    }

    public final void g() {
    }

    public final void i(bqe bqe) {
        this.j = bqe;
        this.i = mze.m((Handler.Callback) null);
        if (!this.l) {
            this.q = true;
            r((Integer) null, this.k);
        }
    }

    public final void k(r88 r88) {
        fv7 fv7 = (fv7) r88;
        if (fv7.X != null) {
            yh0 yh0 = fv7.o;
            yh0.getClass();
            yh0.k(fv7.X);
        }
        if (r88 == this.p) {
            this.p = null;
        }
    }

    public final void m() {
        this.r = false;
        this.q = false;
        super.m();
    }

    public final re8 p(Object obj, re8 re8) {
        Void voidR = (Void) obj;
        Object obj2 = re8.a;
        Object obj3 = this.o.o;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = hv7.X;
        }
        return re8.b(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.lang.Integer r15, defpackage.yh0 r16, defpackage.uje r17) {
        /*
            r14 = this;
            r0 = r14
            r7 = r17
            r1 = r15
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x0022
            hv7 r1 = r0.o
            hv7 r2 = new hv7
            java.lang.Object r3 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r3, r1)
            r0.o = r2
            fv7 r1 = r0.p
            if (r1 == 0) goto L_0x00c0
            long r1 = r1.Z
            r14.t(r1)
            goto L_0x00c0
        L_0x0022:
            boolean r1 = r17.q()
            java.lang.Object r8 = defpackage.hv7.X
            if (r1 == 0) goto L_0x0045
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x003a
            hv7 r1 = r0.o
            hv7 r2 = new hv7
            java.lang.Object r3 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r3, r1)
            goto L_0x0041
        L_0x003a:
            java.lang.Object r1 = defpackage.sje.G0
            hv7 r2 = new hv7
            r2.<init>(r7, r1, r8)
        L_0x0041:
            r0.o = r2
            goto L_0x00c0
        L_0x0045:
            r1 = 0
            sje r2 = r0.m
            r7.o(r1, r2)
            long r3 = r2.B0
            java.lang.Object r9 = r2.a
            fv7 r5 = r0.p
            if (r5 == 0) goto L_0x0072
            hv7 r6 = r0.o
            re8 r10 = r5.a
            java.lang.Object r10 = r10.a
            pje r11 = r0.n
            r6.h(r10, r11)
            long r10 = r11.X
            long r5 = r5.b
            long r10 = r10 + r5
            hv7 r5 = r0.o
            r12 = 0
            r5.n(r1, r2, r12)
            long r1 = r2.B0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0072
            r5 = r10
            goto L_0x0073
        L_0x0072:
            r5 = r3
        L_0x0073:
            sje r2 = r0.m
            pje r3 = r0.n
            r4 = 0
            r1 = r17
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x0098
            hv7 r1 = r0.o
            hv7 r2 = new hv7
            java.lang.Object r5 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r5, r1)
            goto L_0x009e
        L_0x0098:
            hv7 r1 = new hv7
            r1.<init>(r7, r9, r2)
            r2 = r1
        L_0x009e:
            r0.o = r2
            fv7 r1 = r0.p
            if (r1 == 0) goto L_0x00c0
            r14.t(r3)
            re8 r1 = r1.a
            java.lang.Object r2 = r1.a
            hv7 r3 = r0.o
            java.lang.Object r3 = r3.o
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r2.equals(r8)
            if (r3 == 0) goto L_0x00bb
            hv7 r2 = r0.o
            java.lang.Object r2 = r2.o
        L_0x00bb:
            re8 r1 = r1.b(r2)
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            r2 = 1
            r0.s = r2
            r0.r = r2
            hv7 r2 = r0.o
            r14.j(r2)
            if (r1 == 0) goto L_0x00f4
            fv7 r0 = r0.p
            r0.getClass()
            long r2 = r0.Z
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            long r2 = r0.b
        L_0x00e0:
            yh0 r4 = r0.o
            r4.getClass()
            l34 r5 = r0.c
            r88 r1 = r4.a(r1, r5, r2)
            r0.X = r1
            p88 r4 = r0.Y
            if (r4 == 0) goto L_0x00f4
            r1.L(r0, r2)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv7.q(java.lang.Integer, yh0, uje):void");
    }

    /* renamed from: s */
    public final fv7 a(re8 re8, l34 l34, long j) {
        fv7 fv7 = new fv7(re8, l34, j);
        swb.h(fv7.o == null);
        yh0 yh0 = this.k;
        fv7.o = yh0;
        if (this.r) {
            Object obj = this.o.o;
            Object obj2 = re8.a;
            if (obj != null && obj2.equals(hv7.X)) {
                obj2 = this.o.o;
            }
            re8 b = re8.b(obj2);
            long a = fv7.a(j);
            yh0 yh02 = fv7.o;
            yh02.getClass();
            r88 a2 = yh02.a(b, l34, a);
            fv7.X = a2;
            if (fv7.Y != null) {
                a2.L(fv7, a);
            }
        } else {
            this.p = fv7;
            if (!this.q) {
                this.q = true;
                r((Integer) null, yh0);
            }
        }
        return fv7;
    }

    public final void t(long j) {
        fv7 fv7 = this.p;
        int b = this.o.b(fv7.a.a);
        if (b != -1) {
            hv7 hv7 = this.o;
            pje pje = this.n;
            hv7.g(b, pje, false);
            long j2 = pje.o;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            fv7.Z = j;
        }
    }
}
