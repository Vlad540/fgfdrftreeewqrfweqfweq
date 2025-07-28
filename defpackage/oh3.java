package defpackage;

/* renamed from: oh3  reason: default package */
public final class oh3 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ yh3 c;

    public /* synthetic */ oh3(rj5 rj5, yh3 yh3, int i) {
        this.a = i;
        this.b = rj5;
        this.c = yh3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x00a5;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r10 instanceof defpackage.qh3
            if (r0 == 0) goto L_0x0018
            r0 = r10
            qh3 r0 = (defpackage.qh3) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            qh3 r0 = new qh3
            r0.<init>(r8, r10)
        L_0x001d:
            java.lang.Object r10 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            wx3.H(r10)
            goto L_0x00a2
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            wx3.H(r10)
            lg0 r9 = (defpackage.lg0) r9
            boolean r10 = r9 instanceof defpackage.lg0
            r2 = 0
            if (r10 != 0) goto L_0x0040
            goto L_0x0095
        L_0x0040:
            long r4 = r9.a
            yh3 r10 = r8.c
            java.util.concurrent.atomic.AtomicLong r10 = r10.p
            long r6 = r10.get()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0095
            uae r9 = r9.b
            java.lang.String r10 = r9.o
            if (r10 == 0) goto L_0x0067
            int r2 = r10.length()
            if (r2 != 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            ez1 r9 = new ez1
            lge r2 = new lge
            r2.<init>(r10)
            r9.<init>(r2)
        L_0x0065:
            r2 = r9
            goto L_0x0095
        L_0x0067:
            java.lang.String r9 = r9.b
            java.lang.String r10 = "service.unavailable"
            boolean r10 = hhd.f(r9, r10)
            if (r10 != 0) goto L_0x0092
            java.lang.String r10 = "service.timeout"
            boolean r10 = hhd.f(r9, r10)
            if (r10 == 0) goto L_0x007a
            goto L_0x0092
        L_0x007a:
            java.lang.String r10 = "io.exception"
            boolean r9 = hhd.f(r9, r10)
            if (r9 == 0) goto L_0x0085
            fz1 r9 = defpackage.fz1.a
            goto L_0x0065
        L_0x0085:
            hz1 r9 = new hz1
            int r10 = defpackage.cic.E
            hge r2 = new hge
            r2.<init>(r10)
            r9.<init>(r2)
            goto L_0x0065
        L_0x0092:
            gz1 r9 = defpackage.gz1.a
            goto L_0x0065
        L_0x0095:
            if (r2 == 0) goto L_0x00a2
            r0.X = r3
            rj5 r8 = r8.b
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            jue r1 = jue.a
        L_0x00a4:
            return r1
        L_0x00a5:
            boolean r0 = r10 instanceof defpackage.nh3
            if (r0 == 0) goto L_0x00b8
            r0 = r10
            nh3 r0 = (defpackage.nh3) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00b8
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00bd
        L_0x00b8:
            nh3 r0 = new nh3
            r0.<init>(r8, r10)
        L_0x00bd:
            java.lang.Object r10 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00d4
            if (r2 != r3) goto L_0x00cc
            wx3.H(r10)
            goto L_0x0102
        L_0x00cc:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00d4:
            wx3.H(r10)
            tf3 r9 = (defpackage.tf3) r9
            yh3 r10 = r8.c
            defpackage.yh3.m(r10, r9)
            cz1 r9 = new cz1
            qz1 r2 = new qz1
            int r4 = defpackage.i8a.f2
            r5 = 0
            r2.<init>(r4, r5, r5, r5)
            r7e r4 = r10.g
            java.lang.Object r4 = r4.getValue()
            jz1 r4 = (defpackage.jz1) r4
            java.util.List r10 = r4.a(r10)
            r9.<init>(r2, r10)
            r0.X = r3
            rj5 r8 = r8.b
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            jue r1 = jue.a
        L_0x0104:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh3.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
