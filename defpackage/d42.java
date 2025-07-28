package defpackage;

/* renamed from: d42  reason: default package */
public final class d42 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ o42 c;

    public /* synthetic */ d42(rj5 rj5, o42 o42, int i) {
        this.a = i;
        this.b = rj5;
        this.c = o42;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            jue r2 = jue.a
            rj5 r3 = r0.b
            o42 r4 = r0.c
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            pu3 r7 = pu3.a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x00f8;
                default: goto L_0x0016;
            }
        L_0x0016:
            boolean r9 = r1 instanceof defpackage.f42
            if (r9 == 0) goto L_0x0027
            r9 = r1
            f42 r9 = (defpackage.f42) r9
            int r10 = r9.X
            r11 = r10 & r8
            if (r11 == 0) goto L_0x0027
            int r10 = r10 - r8
            r9.X = r10
            goto L_0x002c
        L_0x0027:
            f42 r9 = new f42
            r9.<init>(r0, r1)
        L_0x002c:
            java.lang.Object r0 = r9.o
            int r1 = r9.X
            if (r1 == 0) goto L_0x003f
            if (r1 != r6) goto L_0x0039
            wx3.H(r0)
            goto L_0x00f7
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x003f:
            wx3.H(r0)
            r0 = r19
            lg0 r0 = (defpackage.lg0) r0
            boolean r1 = r0 instanceof defpackage.lg0
            r5 = 0
            if (r1 != 0) goto L_0x004d
            goto L_0x00ec
        L_0x004d:
            long r10 = r0.a
            java.util.concurrent.atomic.AtomicLong r1 = r4.t
            long r12 = r1.get()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            gz1 r8 = defpackage.gz1.a
            fz1 r12 = defpackage.fz1.a
            uae r0 = r0.b
            java.lang.String r13 = "io.exception"
            java.lang.String r14 = "service.timeout"
            java.lang.String r15 = "service.unavailable"
            if (r1 != 0) goto L_0x00a9
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.w
            r4 = 0
            r1.set(r4)
            java.lang.String r1 = r0.o
            if (r1 == 0) goto L_0x0083
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0076
            goto L_0x0083
        L_0x0076:
            ez1 r0 = new ez1
            lge r4 = new lge
            r4.<init>(r1)
            r0.<init>(r4)
        L_0x0080:
            r5 = r0
            goto L_0x00ec
        L_0x0083:
            java.lang.String r0 = r0.b
            boolean r1 = hhd.f(r0, r15)
            if (r1 != 0) goto L_0x00a7
            boolean r1 = hhd.f(r0, r14)
            if (r1 == 0) goto L_0x0092
            goto L_0x00a7
        L_0x0092:
            boolean r0 = hhd.f(r0, r13)
            if (r0 == 0) goto L_0x009a
        L_0x0098:
            r5 = r12
            goto L_0x00ec
        L_0x009a:
            hz1 r0 = new hz1
            int r1 = defpackage.cic.E
            hge r4 = new hge
            r4.<init>(r1)
            r0.<init>(r4)
            goto L_0x0080
        L_0x00a7:
            r5 = r8
            goto L_0x00ec
        L_0x00a9:
            java.util.concurrent.atomic.AtomicLong r1 = r4.u
            long r16 = r1.get()
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00ec
            java.lang.String r1 = r0.o
            if (r1 == 0) goto L_0x00c9
            int r4 = r1.length()
            if (r4 != 0) goto L_0x00be
            goto L_0x00c9
        L_0x00be:
            ez1 r0 = new ez1
            lge r4 = new lge
            r4.<init>(r1)
            r0.<init>(r4)
            goto L_0x0080
        L_0x00c9:
            java.lang.String r0 = r0.b
            boolean r1 = hhd.f(r0, r15)
            if (r1 != 0) goto L_0x00a7
            boolean r1 = hhd.f(r0, r14)
            if (r1 == 0) goto L_0x00d8
            goto L_0x00a7
        L_0x00d8:
            boolean r0 = hhd.f(r0, r13)
            if (r0 == 0) goto L_0x00df
            goto L_0x0098
        L_0x00df:
            hz1 r0 = new hz1
            int r1 = defpackage.cic.E
            hge r4 = new hge
            r4.<init>(r1)
            r0.<init>(r4)
            goto L_0x0080
        L_0x00ec:
            if (r5 == 0) goto L_0x00f7
            r9.X = r6
            java.lang.Object r0 = r3.a(r5, r9)
            if (r0 != r7) goto L_0x00f7
            r2 = r7
        L_0x00f7:
            return r2
        L_0x00f8:
            boolean r9 = r1 instanceof defpackage.c42
            if (r9 == 0) goto L_0x0109
            r9 = r1
            c42 r9 = (defpackage.c42) r9
            int r10 = r9.X
            r11 = r10 & r8
            if (r11 == 0) goto L_0x0109
            int r10 = r10 - r8
            r9.X = r10
            goto L_0x010e
        L_0x0109:
            c42 r9 = new c42
            r9.<init>(r0, r1)
        L_0x010e:
            java.lang.Object r0 = r9.o
            int r1 = r9.X
            if (r1 == 0) goto L_0x0120
            if (r1 != r6) goto L_0x011a
            wx3.H(r0)
            goto L_0x0139
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0120:
            wx3.H(r0)
            r0 = r19
            i22 r0 = (defpackage.i22) r0
            k77[] r1 = defpackage.o42.x
            r4.getClass()
            sz1 r0 = defpackage.o42.t(r0)
            r9.X = r6
            java.lang.Object r0 = r3.a(r0, r9)
            if (r0 != r7) goto L_0x0139
            r2 = r7
        L_0x0139:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d42.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
