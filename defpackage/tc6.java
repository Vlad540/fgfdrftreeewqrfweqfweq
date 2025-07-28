package defpackage;

/* renamed from: tc6  reason: default package */
public final class tc6 {
    public static final long i = mt0.P(5, eq4.o);
    public static final /* synthetic */ int j = 0;
    public final zqd a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final grd e;
    public final t0c f;
    public final hcd g;
    public final s0c h;

    static {
        int i2 = zp4.o;
    }

    public tc6(ou3 ou3, pae pae, zqd zqd, t97 t97, t97 t972, t97 t973) {
        this.a = zqd;
        this.b = t972;
        this.c = t973;
        this.d = t97;
        grd a2 = hrd.a(vc6.a);
        this.e = a2;
        this.f = new t0c(a2);
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 4);
        this.g = b2;
        this.h = new s0c(b2);
        ez3.N(ez3.J(new ck5(new v11(new ik5(zqd, 2), ((so1) t972.getValue()).I, oc6.w0, 4), new zv(2, this, tc6.class, "handleChat", "handleChat(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 21), 5), ((n3a) pae).b()), ou3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.tc6 r9, wia r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.pc6
            if (r0 == 0) goto L_0x0016
            r0 = r11
            pc6 r0 = (defpackage.pc6) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x001b
        L_0x0016:
            pc6 r0 = new pc6
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            dge r9 = r0.Y
            java.lang.String r10 = r0.X
            grd r0 = r0.o
            wx3.H(r11)
            goto L_0x00b3
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            wx3.H(r11)
            java.lang.Object r11 = r10.a
            i22 r11 = (defpackage.i22) r11
            java.lang.Object r10 = r10.b
            zw3 r10 = (zw3) r10
            o62 r2 = r11.b
            r4 = 0
            if (r2 != 0) goto L_0x004b
            r2 = r4
            goto L_0x004d
        L_0x004b:
            n00 r2 = r2.T
        L_0x004d:
            java.lang.String r10 = r10.c
            t97 r5 = r9.b
            java.lang.Object r5 = r5.getValue()
            so1 r5 = (so1) r5
            ep1 r5 = (ep1) r5
            boolean r5 = r5.p()
            r6 = 0
            if (r5 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x0065
            java.lang.String r5 = r2.a
            goto L_0x0066
        L_0x0065:
            r5 = r4
        L_0x0066:
            boolean r10 = hhd.f(r10, r5)
            if (r10 != 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r10 = r6
            goto L_0x0070
        L_0x006f:
            r10 = r3
        L_0x0070:
            o62 r5 = r11.b
            if (r5 == 0) goto L_0x0085
            n00 r5 = r5.T
            if (r5 == 0) goto L_0x0085
            java.lang.String r7 = r5.c
            boolean r7 = r1g.q(r7)
            if (r7 == 0) goto L_0x0085
            int r5 = r5.d
            if (r5 <= 0) goto L_0x0085
            r6 = r3
        L_0x0085:
            grd r5 = r9.e
            if (r6 == 0) goto L_0x00be
            boolean r11 = r11.J()
            if (r11 != 0) goto L_0x00be
            if (r2 == 0) goto L_0x00be
            if (r10 == 0) goto L_0x00be
            int r10 = defpackage.a8a.a
            dge r11 = new dge
            int r4 = r2.d
            r11.<init>(r10, r4)
            r0.o = r5
            java.lang.String r10 = r2.a
            r0.X = r10
            r0.Y = r11
            r0.x0 = r3
            java.util.List r2 = r2.e
            java.io.Serializable r9 = r9.b(r2, r0)
            if (r9 != r1) goto L_0x00af
            goto L_0x00c5
        L_0x00af:
            r0 = r5
            r8 = r11
            r11 = r9
            r9 = r8
        L_0x00b3:
            java.util.List r11 = (java.util.List) r11
            uc6 r1 = new uc6
            r1.<init>(r10, r9, r11)
            r0.setValue(r1)
            goto L_0x00c3
        L_0x00be:
            vc6 r9 = defpackage.vc6.a
            r5.m(r4, r9)
        L_0x00c3:
            jue r1 = jue.a
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc6.a(tc6, wia, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable b(java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.rc6
            if (r0 == 0) goto L_0x0013
            r0 = r12
            rc6 r0 = (defpackage.rc6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            rc6 r0 = new rc6
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            hw4 r3 = hw4.a
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            wx3.H(r12)
            goto L_0x0097
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            wx3.H(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x003d
            return r3
        L_0x003d:
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r11, r2)
            r12.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L_0x004c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x006c
            java.lang.Object r7 = r2.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            t97 r9 = r10.d
            java.lang.Object r9 = r9.getValue()
            ap3 r9 = (defpackage.ap3) r9
            t0c r7 = r9.c(r7)
            r12.add(r7)
            goto L_0x004c
        L_0x006c:
            java.util.List r12 = o23.s0(r12)
            pj5[] r2 = new pj5[r5]
            java.lang.Object[] r12 = r12.toArray(r2)
            pj5[] r12 = (pj5[]) r12
            v11 r2 = new v11
            r7 = 5
            r2.<init>(r12, r11, r10, r7)
            long r10 = i
            long r10 = zp4.e(r10)
            sc6 r12 = new sc6
            r7 = 2
            r12.<init>(r7, r6)
            bc r10 = vx3.n(r2, r10, r12)
            r0.Y = r4
            java.lang.Object r12 = ez3.D(r10, r0)
            if (r12 != r1) goto L_0x0097
            return r1
        L_0x0097:
            mcc r12 = (mcc) r12
            java.lang.Object r10 = r12.a
            boolean r11 = r10 instanceof kcc
            if (r11 == 0) goto L_0x00a0
            r10 = r6
        L_0x00a0:
            tf3[] r10 = (defpackage.tf3[]) r10
            if (r10 == 0) goto L_0x00d3
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r10.length
        L_0x00aa:
            if (r5 >= r12) goto L_0x00d2
            r0 = r10[r5]
            if (r0 != 0) goto L_0x00b2
            r1 = r6
            goto L_0x00ca
        L_0x00b2:
            wia r1 = new wia
            ub0 r2 = new ub0
            long r7 = r0.n()
            java.lang.CharSequence r4 = r0.m()
            r2.<init>(r4, r7)
            fj0 r4 = defpackage.fj0.a
            java.lang.String r0 = r0.p(r4)
            r1.<init>(r2, r0)
        L_0x00ca:
            if (r1 == 0) goto L_0x00cf
            r11.add(r1)
        L_0x00cf:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00d2:
            r6 = r11
        L_0x00d3:
            if (r6 != 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r3 = r6
        L_0x00d7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc6.b(java.util.List, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
