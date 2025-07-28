package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bh3  reason: default package */
public final class bh3 extends taf {
    public final l05 A0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final ng3 b;
    public final ikc c;
    public final String o = bh3.class.getName();
    public final t97 w0;
    public volatile int x0;
    public final grd y0;
    public final t0c z0;

    public bh3(ng3 ng3, t97 t97, t97 t972, ikc ikc, t97 t973, t97 t974) {
        this.b = ng3;
        this.c = ikc;
        this.X = t97;
        this.Y = t972;
        this.Z = t973;
        this.w0 = t974;
        grd a = hrd.a(hw4.a);
        this.y0 = a;
        this.z0 = new t0c(a);
        this.A0 = new l05(0);
        taf.n(this, ((pae) t974.getValue()).b(), (ru3) null, new kg3(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable q(defpackage.bh3 r6, int r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.zg3
            if (r0 == 0) goto L_0x0016
            r0 = r8
            zg3 r0 = (defpackage.zg3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            zg3 r0 = new zg3
            r0.<init>(r6, r8)
        L_0x001b:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r8)
            goto L_0x0063
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            wx3.H(r8)
            pn2 r8 = new pn2
            ng3 r2 = r6.b
            boolean r4 = r2 instanceof defpackage.lg3
            if (r4 == 0) goto L_0x0042
            lg3 r2 = (defpackage.lg3) r2
            long r4 = r2.a
            goto L_0x004c
        L_0x0042:
            boolean r4 = r2 instanceof defpackage.mg3
            if (r4 == 0) goto L_0x00ee
            mg3 r2 = (defpackage.mg3) r2
            uj3 r2 = r2.a
            long r4 = r2.a
        L_0x004c:
            r8.<init>((long) r4, (int) r7)
            t97 r6 = r6.Y
            java.lang.Object r6 = r6.getValue()
            pk r6 = (defpackage.pk) r6
            r0.Y = r3
            gy9 r6 = (defpackage.gy9) r6
            java.lang.Object r8 = r6.K(r8, r0)
            if (r8 != r1) goto L_0x0063
            goto L_0x00ed
        L_0x0063:
            qm3 r8 = (defpackage.qm3) r8
            java.util.List r6 = r8.c
            if (r6 == 0) goto L_0x00e0
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0070
            goto L_0x00e0
        L_0x0070:
            java.util.List r6 = r8.o
            if (r6 == 0) goto L_0x00a6
            int r6 = r6.size()
            java.util.List r7 = r8.c
            int r7 = r7.size()
            if (r6 != r7) goto L_0x00a6
            java.util.List r6 = r8.o
            es r7 = new es
            r0 = 2
            r7.<init>(r0, r6)
            java.util.List r6 = r8.c
            es r0 = new es
            r1 = 2
            r0.<init>(r1, r6)
            ij4 r6 = new ij4
            r1 = 2
            r6.<init>(r7, r1, r0)
            t13 r7 = new t13
            r0 = 4
            r7.<init>(r0)
            vqe r0 = new vqe
            r0.<init>(r6, r7)
            java.util.List r6 = myc.U(r0)
            goto L_0x00d3
        L_0x00a6:
            java.util.List r6 = r8.c
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = q23.H(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x00b7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            bg3 r1 = new bg3
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2 = 0
            r1.<init>(r2, r0)
            r7.add(r1)
            goto L_0x00b7
        L_0x00d2:
            r6 = r7
        L_0x00d3:
            int r7 = r8.X
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            wia r1 = new wia
            r1.<init>(r6, r8)
            goto L_0x00ed
        L_0x00e0:
            hw4 r6 = hw4.a
            java.lang.Integer r7 = new java.lang.Integer
            r8 = 0
            r7.<init>(r8)
            wia r1 = new wia
            r1.<init>(r6, r7)
        L_0x00ed:
            return r1
        L_0x00ee:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh3.q(bh3, int, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.bh3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.ah3
            if (r0 == 0) goto L_0x0016
            r0 = r10
            ah3 r0 = (defpackage.ah3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            ah3 r0 = new ah3
            r0.<init>(r9, r10)
        L_0x001b:
            java.lang.Object r10 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            wx3.H(r10)
            goto L_0x00ba
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            wx3.H(r10)
            ng3 r10 = r9.b
            boolean r2 = r10 instanceof defpackage.mg3
            r6 = 0
            if (r2 == 0) goto L_0x009b
            fj0 r9 = defpackage.fj0.a
            fj0 r0 = defpackage.fj0.X
            lg7 r1 = hwf.c()
            pz4 r2 = defpackage.ij0.a
            nv7 r3 = new nv7
            r3.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x0052:
            r3 = r2
            zcc r3 = (zcc) r3
            java.util.ListIterator r3 = r3.b
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r3 = r3.previous()
            fj0 r3 = (defpackage.fj0) r3
            int r4 = r3.compareTo(r9)
            if (r4 < 0) goto L_0x0052
            int r4 = r3.compareTo(r0)
            if (r4 > 0) goto L_0x0052
            r4 = r10
            mg3 r4 = (defpackage.mg3) r4
            uj3 r4 = r4.a
            java.lang.String r4 = r4.o
            boolean r5 = r1g.p(r4)
            if (r5 != 0) goto L_0x0083
            ej0 r5 = defpackage.ej0.b
            java.lang.String r3 = vx3.t(r4, r3, r5)
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            if (r3 == 0) goto L_0x0052
            r1.add(r3)
            goto L_0x0052
        L_0x008a:
            lg7 r9 = hwf.a(r1)
            bg3 r0 = new bg3
            mg3 r10 = (defpackage.mg3) r10
            uj3 r10 = r10.a
            long r1 = r10.a
            r0.<init>(r1, r9)
        L_0x0099:
            r1 = r0
            goto L_0x00e3
        L_0x009b:
            boolean r2 = r10 instanceof defpackage.lg3
            if (r2 == 0) goto L_0x00e4
            lg3 r10 = (defpackage.lg3) r10
            long r7 = r10.a
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00bd
            t97 r9 = r9.X
            java.lang.Object r9 = r9.getValue()
            ap3 r9 = (defpackage.ap3) r9
            r0.Y = r5
            long r5 = r10.a
            java.lang.Comparable r10 = r9.b(r5, r0)
            if (r10 != r1) goto L_0x00ba
            goto L_0x00e3
        L_0x00ba:
            r6 = r10
            tf3 r6 = (defpackage.tf3) r6
        L_0x00bd:
            if (r6 == 0) goto L_0x00db
            oi3 r9 = r6.a
            ni3 r9 = r9.c
            jg3 r10 = new jg3
            r0 = 0
            r10.<init>(r9, r0)
            jg3 r0 = new jg3
            r1 = 1
            r0.<init>(r9, r1)
            lg7 r10 = wx3.f(r10, r0)
            bg3 r0 = new bg3
            long r1 = r9.e
            r0.<init>(r1, r10)
            goto L_0x0099
        L_0x00db:
            bg3 r9 = new bg3
            hw4 r10 = hw4.a
            r9.<init>(r3, r10)
            r1 = r9
        L_0x00e3:
            return r1
        L_0x00e4:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh3.r(bh3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void s(lg7 lg7, int i, int i2) {
        lg7.add(new pq3(i, (mge) new hge(i2), (Integer) null, (Integer) null, 28));
    }
}
