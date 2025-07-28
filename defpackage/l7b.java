package defpackage;

/* renamed from: l7b  reason: default package */
public final class l7b implements rj5 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rj5 c;
    public final /* synthetic */ q7b o;

    public /* synthetic */ l7b(rj5 rj5, q7b q7b, int i) {
        this.a = i;
        this.o = q7b;
        this.c = rj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r12 instanceof defpackage.n7b
            if (r0 == 0) goto L_0x0018
            r0 = r12
            n7b r0 = (defpackage.n7b) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            n7b r0 = new n7b
            r0.<init>(r10, r12)
        L_0x001d:
            java.lang.Object r12 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            wx3.H(r12)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            wx3.H(r12)
            int r12 = r10.b
            int r2 = r12 + 1
            r10.b = r2
            if (r12 < 0) goto L_0x0059
            if (r12 != 0) goto L_0x004b
            r12 = r11
            z6b r12 = (defpackage.z6b) r12
            q7b r2 = r10.o
            grd r2 = r2.C0
            r2.setValue(r12)
        L_0x004b:
            r0.X = r3
            rj5 r10 = r10.c
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            jue r1 = jue.a
        L_0x0058:
            return r1
        L_0x0059:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        L_0x0061:
            boolean r0 = r12 instanceof defpackage.k7b
            if (r0 == 0) goto L_0x0074
            r0 = r12
            k7b r0 = (defpackage.k7b) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0074
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0079
        L_0x0074:
            k7b r0 = new k7b
            r0.<init>(r10, r12)
        L_0x0079:
            java.lang.Object r12 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            r4 = 3
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x00b5
            if (r2 == r3) goto L_0x00a5
            if (r2 == r5) goto L_0x0098
            if (r2 != r4) goto L_0x0090
            wx3.H(r12)
            goto L_0x0122
        L_0x0090:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0098:
            java.lang.Object r10 = r0.x0
            mc9 r10 = (mc9) r10
            java.lang.Object r11 = r0.Z
            l7b r2 = r0.Y
            wx3.H(r12)
            goto L_0x010d
        L_0x00a5:
            grd r10 = r0.z0
            tf3 r11 = r0.y0
            java.lang.Object r2 = r0.x0
            i22 r2 = (defpackage.i22) r2
            java.lang.Object r3 = r0.Z
            l7b r7 = r0.Y
            wx3.H(r12)
            goto L_0x00ec
        L_0x00b5:
            wx3.H(r12)
            int r12 = r10.b
            int r2 = r12 + 1
            r10.b = r2
            if (r12 < 0) goto L_0x0125
            if (r12 != 0) goto L_0x0111
            r12 = r11
            wia r12 = (wia) r12
            java.lang.Object r2 = r12.a
            i22 r2 = (defpackage.i22) r2
            java.lang.Object r12 = r12.b
            tf3 r12 = (defpackage.tf3) r12
            q7b r7 = r10.o
            grd r8 = r7.C0
            r0.Y = r10
            r0.Z = r11
            r0.x0 = r2
            r0.y0 = r12
            r0.z0 = r8
            r0.X = r3
            boolean r3 = r7.D0
            java.lang.Object r3 = defpackage.q7b.q(r7, r2, r12, r3, r0)
            if (r3 != r1) goto L_0x00e6
            goto L_0x0124
        L_0x00e6:
            r7 = r10
            r10 = r8
            r9 = r3
            r3 = r11
            r11 = r12
            r12 = r9
        L_0x00ec:
            r10.setValue(r12)
            q7b r10 = r7.o
            grd r12 = r10.B0
            r0.Y = r7
            r0.Z = r3
            r0.x0 = r12
            r0.y0 = r6
            r0.z0 = r6
            r0.X = r5
            boolean r5 = r10.D0
            java.lang.Object r10 = defpackage.q7b.q(r10, r2, r11, r5, r0)
            if (r10 != r1) goto L_0x0108
            goto L_0x0124
        L_0x0108:
            r11 = r3
            r2 = r7
            r9 = r12
            r12 = r10
            r10 = r9
        L_0x010d:
            r10.setValue(r12)
            r10 = r2
        L_0x0111:
            rj5 r10 = r10.c
            r0.Y = r6
            r0.Z = r6
            r0.x0 = r6
            r0.X = r4
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            jue r1 = jue.a
        L_0x0124:
            return r1
        L_0x0125:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7b.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
