package defpackage;

import java.util.List;

/* renamed from: eeb  reason: default package */
public final class eeb implements i5b {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public eeb(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public static void c(List list, tf3 tf3, mge mge, String str, boolean z, b7b b7b) {
        long n = tf3.n();
        String d2 = tf3.d();
        if (d2 == null) {
            d2 = "";
        }
        String str2 = d2;
        List list2 = list;
        list.add(new xj3(n, str2, b7b == b7b.SETUP_NEW_ADMIN ? mge.a : mge, str, z, tf3.m(), b7b, 0, true, 128));
    }

    public static void d(List list, z6b z6b, boolean z) {
        List list2 = list;
        int i = f8a.I;
        long j = g8a.c;
        hge hge = new hge(i8a.U0);
        y6b y6b = z6b.m;
        boolean z2 = y6b.b;
        o7d o7d = r3;
        o7d o7d2 = new o7d(j, 0, hge, z2 ? d7d.b : d7d.o, (mge) null, (Integer) null, new z6d(y6b.a, z2), (u6d) null, (mge) null, 0, (r6d) null, 1968);
        list2.add(new b7(i, o7d));
        if (z) {
            list2.add(new xsc(new hge(i8a.V0), nte.o, 4096, 2));
        }
    }

    public static void e(List list, z6b z6b, boolean z) {
        int i = f8a.F;
        long j = g8a.b;
        hge hge = new hge(z ? i8a.y1 : i8a.J1);
        hge hge2 = new hge(i8a.K1);
        y6b y6b = z6b.k;
        boolean z2 = y6b.b;
        o7d o7d = r2;
        o7d o7d2 = new o7d(j, 0, hge, z2 ? d7d.b : d7d.o, hge2, (Integer) null, new z6d(y6b.a, z2), (u6d) null, (mge) null, 0, (r6d) null, 1952);
        list.add(new b7(i, o7d));
    }

    public static void g(List list, boolean z, boolean z2, b7b b7b) {
        List list2 = list;
        if (z && b7b == b7b.CHANGE_ADMIN) {
            if (z2) {
                int i = f8a.D;
                o7d o7d = r3;
                o7d o7d2 = new o7d(g8a.a, 0, new hge(i8a.e), (d7d) null, (mge) null, Integer.valueOf(phc.Q0), w6d.a, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                list2.add(new b7(i, o7d, 1024));
            }
            list2.add(new ge4(new hge(i8a.W0)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.tf3 r32, defpackage.i22 r33, defpackage.z6b r34, defpackage.b7b r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r36
            r4 = r37
            boolean r5 = r4 instanceof defpackage.zdb
            if (r5 == 0) goto L_0x001d
            r5 = r4
            zdb r5 = (defpackage.zdb) r5
            int r6 = r5.E0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.E0 = r6
            goto L_0x0022
        L_0x001d:
            zdb r5 = new zdb
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.C0
            pu3 r6 = pu3.a
            int r7 = r5.E0
            r8 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0080
            if (r7 == r10) goto L_0x0057
            if (r7 != r8) goto L_0x004f
            int r0 = r5.B0
            java.lang.Object r1 = r5.A0
            mge r1 = (defpackage.mge) r1
            java.io.Serializable r2 = r5.z0
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r5.y0
            java.lang.Object r6 = r5.x0
            java.util.List r6 = (java.util.List) r6
            b7b r7 = r5.w0
            z6b r8 = r5.Z
            i22 r11 = r5.Y
            tf3 r12 = r5.X
            eeb r5 = r5.o
            wx3.H(r4)
            goto L_0x010f
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            int r0 = r5.B0
            java.lang.Object r1 = r5.A0
            java.lang.String r1 = (java.lang.String) r1
            java.io.Serializable r2 = r5.z0
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r5.y0
            java.lang.Object r7 = r5.x0
            java.lang.Long r7 = (java.lang.Long) r7
            b7b r11 = r5.w0
            z6b r12 = r5.Z
            i22 r13 = r5.Y
            tf3 r14 = r5.X
            eeb r15 = r5.o
            wx3.H(r4)
            r29 = r2
            r2 = r1
            r1 = r4
            r4 = r29
            r30 = r7
            r7 = r3
            r3 = r30
            goto L_0x00e1
        L_0x0080:
            wx3.H(r4)
            lg7 r4 = hwf.c()
            t97 r7 = r0.a
            java.lang.Object r7 = r7.getValue()
            o2b r7 = (defpackage.o2b) r7
            long r11 = r32.n()
            l2b r7 = r7.b(r11)
            r11 = 10
            int r7 = r7.a
            if (r7 == r11) goto L_0x00a7
            r11 = 20
            if (r7 == r11) goto L_0x00a7
            r11 = 40
            if (r7 == r11) goto L_0x00a7
            r7 = 0
            goto L_0x00a8
        L_0x00a7:
            r7 = r10
        L_0x00a8:
            fj0 r11 = defpackage.fj0.c
            java.lang.String r11 = r1.p(r11)
            if (r11 != 0) goto L_0x00b2
            java.lang.String r11 = ""
        L_0x00b2:
            r5.o = r0
            r5.X = r1
            r5.Y = r2
            r12 = r34
            r5.Z = r12
            r13 = r35
            r5.w0 = r13
            r5.x0 = r3
            r5.y0 = r4
            r5.z0 = r4
            r5.A0 = r11
            r5.B0 = r7
            r5.E0 = r10
            java.lang.Object r14 = r0.j(r3, r1, r2, r5)
            if (r14 != r6) goto L_0x00d3
            return r6
        L_0x00d3:
            r15 = r0
            r0 = r7
            r7 = r4
            r29 = r14
            r14 = r1
            r1 = r29
            r30 = r13
            r13 = r2
            r2 = r11
            r11 = r30
        L_0x00e1:
            mge r1 = (defpackage.mge) r1
            boolean r9 = r13.q()
            r5.o = r15
            r5.X = r14
            r5.Y = r13
            r5.Z = r12
            r5.w0 = r11
            r5.x0 = r7
            r5.y0 = r4
            r5.z0 = r2
            r5.A0 = r1
            r5.B0 = r0
            r5.E0 = r8
            java.lang.Object r3 = r15.h(r3, r9, r13, r5)
            if (r3 != r6) goto L_0x0104
            return r6
        L_0x0104:
            r6 = r7
            r7 = r11
            r8 = r12
            r11 = r13
            r12 = r14
            r5 = r15
            r29 = r4
            r4 = r3
            r3 = r29
        L_0x010f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r0 == 0) goto L_0x0119
            r0 = r10
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            r5.getClass()
            r31 = r3
            r32 = r12
            r33 = r1
            r34 = r2
            r35 = r0
            r36 = r7
            c(r31, r32, r33, r34, r35, r36)
            e(r3, r8, r10)
            b7 r0 = new b7
            int r1 = defpackage.f8a.R
            o7d r2 = new o7d
            long r14 = defpackage.g8a.i
            int r9 = defpackage.i8a.v1
            hge r13 = new hge
            r13.<init>(r9)
            y6b r9 = r8.g
            boolean r10 = r9.b
            d7d r27 = defpackage.d7d.o
            d7d r28 = defpackage.d7d.b
            r31 = r6
            if (r10 == 0) goto L_0x014d
            r18 = r28
            goto L_0x014f
        L_0x014d:
            r18 = r27
        L_0x014f:
            z6d r6 = new z6d
            boolean r9 = r9.a
            r6.<init>(r9, r10)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r9 = r13
            r13 = r2
            r17 = r9
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            b7 r0 = new b7
            int r1 = defpackage.f8a.O
            o7d r2 = new o7d
            long r14 = defpackage.g8a.g
            int r6 = defpackage.i8a.u1
            hge r9 = new hge
            r9.<init>(r6)
            y6b r6 = r8.h
            boolean r10 = r6.b
            if (r10 == 0) goto L_0x0190
            r18 = r28
            goto L_0x0192
        L_0x0190:
            r18 = r27
        L_0x0192:
            z6d r13 = new z6d
            boolean r6 = r6.a
            r13.<init>(r6, r10)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r6 = r13
            r13 = r2
            r17 = r9
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 1073742848(0x40000400, float:2.0002441)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            b7 r0 = new b7
            int r1 = defpackage.f8a.L
            o7d r2 = new o7d
            long r14 = defpackage.g8a.d
            int r9 = defpackage.i8a.r1
            hge r10 = new hge
            r10.<init>(r9)
            y6b r9 = r8.i
            boolean r13 = r9.b
            if (r13 == 0) goto L_0x01d3
            r18 = r28
            goto L_0x01d5
        L_0x01d3:
            r18 = r27
        L_0x01d5:
            z6d r6 = new z6d
            boolean r9 = r9.a
            r6.<init>(r9, r13)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r13 = r2
            r17 = r10
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 1073742848(0x40000400, float:2.0002441)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            b7 r0 = new b7
            int r1 = defpackage.f8a.P
            o7d r2 = new o7d
            long r14 = defpackage.g8a.h
            int r6 = defpackage.i8a.i1
            hge r9 = new hge
            r9.<init>(r6)
            y6b r6 = r8.j
            boolean r10 = r6.b
            if (r10 == 0) goto L_0x0215
            r18 = r28
            goto L_0x0217
        L_0x0215:
            r18 = r27
        L_0x0217:
            z6d r13 = new z6d
            boolean r6 = r6.a
            r13.<init>(r6, r10)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r6 = r13
            r13 = r2
            r17 = r9
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            r0 = 0
            r1 = 1
            r5.f(r3, r8, r1, r0)
            boolean r2 = r12.Y
            if (r2 != 0) goto L_0x0255
            long r5 = r12.n()
            boolean r5 = r11.V(r5)
            if (r5 != 0) goto L_0x0255
            r5 = r1
            goto L_0x0256
        L_0x0255:
            r5 = r0
        L_0x0256:
            d(r3, r8, r5)
            if (r4 == 0) goto L_0x0269
            if (r2 != 0) goto L_0x0269
            long r4 = r12.n()
            boolean r2 = r11.V(r4)
            if (r2 != 0) goto L_0x0269
            r9 = r1
            goto L_0x026a
        L_0x0269:
            r9 = r0
        L_0x026a:
            boolean r0 = r11.a0()
            g(r3, r9, r0, r7)
            lg7 r0 = hwf.a(r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeb.a(tf3, i22, z6b, b7b, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.tf3 r32, defpackage.i22 r33, defpackage.z6b r34, defpackage.b7b r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r36
            r4 = r37
            boolean r5 = r4 instanceof defpackage.aeb
            if (r5 == 0) goto L_0x001d
            r5 = r4
            aeb r5 = (defpackage.aeb) r5
            int r6 = r5.E0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.E0 = r6
            goto L_0x0022
        L_0x001d:
            aeb r5 = new aeb
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.C0
            pu3 r6 = pu3.a
            int r7 = r5.E0
            r8 = 2
            r9 = 0
            r10 = 1
            if (r7 == 0) goto L_0x0082
            if (r7 == r10) goto L_0x0058
            if (r7 != r8) goto L_0x0050
            int r0 = r5.B0
            java.lang.Object r1 = r5.A0
            mge r1 = (defpackage.mge) r1
            java.io.Serializable r2 = r5.z0
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r5.y0
            java.lang.Object r6 = r5.x0
            java.util.List r6 = (java.util.List) r6
            b7b r7 = r5.w0
            z6b r8 = r5.Z
            i22 r11 = r5.Y
            tf3 r12 = r5.X
            eeb r5 = r5.o
            wx3.H(r4)
            goto L_0x0111
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            int r0 = r5.B0
            java.lang.Object r1 = r5.A0
            java.lang.String r1 = (java.lang.String) r1
            java.io.Serializable r2 = r5.z0
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r5.y0
            java.lang.Object r7 = r5.x0
            java.lang.Long r7 = (java.lang.Long) r7
            b7b r11 = r5.w0
            z6b r12 = r5.Z
            i22 r13 = r5.Y
            tf3 r14 = r5.X
            eeb r15 = r5.o
            wx3.H(r4)
            r29 = r2
            r2 = r1
            r1 = r4
            r4 = r29
            r30 = r7
            r7 = r3
            r3 = r30
            goto L_0x00e3
        L_0x0082:
            wx3.H(r4)
            lg7 r4 = hwf.c()
            t97 r7 = r0.a
            java.lang.Object r7 = r7.getValue()
            o2b r7 = (defpackage.o2b) r7
            long r11 = r32.n()
            l2b r7 = r7.b(r11)
            r11 = 10
            int r7 = r7.a
            if (r7 == r11) goto L_0x00a9
            r11 = 20
            if (r7 == r11) goto L_0x00a9
            r11 = 40
            if (r7 == r11) goto L_0x00a9
            r7 = r9
            goto L_0x00aa
        L_0x00a9:
            r7 = r10
        L_0x00aa:
            fj0 r11 = defpackage.fj0.c
            java.lang.String r11 = r1.p(r11)
            if (r11 != 0) goto L_0x00b4
            java.lang.String r11 = ""
        L_0x00b4:
            r5.o = r0
            r5.X = r1
            r5.Y = r2
            r12 = r34
            r5.Z = r12
            r13 = r35
            r5.w0 = r13
            r5.x0 = r3
            r5.y0 = r4
            r5.z0 = r4
            r5.A0 = r11
            r5.B0 = r7
            r5.E0 = r10
            java.lang.Object r14 = r0.j(r3, r1, r2, r5)
            if (r14 != r6) goto L_0x00d5
            return r6
        L_0x00d5:
            r15 = r0
            r0 = r7
            r7 = r4
            r29 = r14
            r14 = r1
            r1 = r29
            r30 = r13
            r13 = r2
            r2 = r11
            r11 = r30
        L_0x00e3:
            mge r1 = (defpackage.mge) r1
            boolean r10 = r13.q()
            r5.o = r15
            r5.X = r14
            r5.Y = r13
            r5.Z = r12
            r5.w0 = r11
            r5.x0 = r7
            r5.y0 = r4
            r5.z0 = r2
            r5.A0 = r1
            r5.B0 = r0
            r5.E0 = r8
            java.lang.Object r3 = r15.h(r3, r10, r13, r5)
            if (r3 != r6) goto L_0x0106
            return r6
        L_0x0106:
            r6 = r7
            r7 = r11
            r8 = r12
            r11 = r13
            r12 = r14
            r5 = r15
            r29 = r4
            r4 = r3
            r3 = r29
        L_0x0111:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0121
            y6b r10 = r8.l
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x0121
            r10 = 1
            goto L_0x0122
        L_0x0121:
            r10 = r9
        L_0x0122:
            if (r0 == 0) goto L_0x0126
            r0 = 1
            goto L_0x0127
        L_0x0126:
            r0 = r9
        L_0x0127:
            r5.getClass()
            r31 = r3
            r32 = r12
            r33 = r1
            r34 = r2
            r35 = r0
            r36 = r7
            c(r31, r32, r33, r34, r35, r36)
            e(r3, r8, r9)
            b7 r0 = new b7
            int r1 = defpackage.f8a.O
            o7d r2 = new o7d
            long r14 = defpackage.g8a.d
            int r13 = defpackage.i8a.c1
            hge r9 = new hge
            r9.<init>(r13)
            y6b r13 = r8.i
            r31 = r6
            boolean r6 = r13.b
            d7d r27 = defpackage.d7d.o
            d7d r28 = defpackage.d7d.b
            r32 = r7
            if (r6 == 0) goto L_0x015c
            r18 = r28
            goto L_0x015e
        L_0x015c:
            r18 = r27
        L_0x015e:
            z6d r7 = new z6d
            boolean r13 = r13.a
            r7.<init>(r13, r6)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r13 = r2
            r17 = r9
            r21 = r7
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = 536871936(0x20000400, float:1.0843345E-19)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            b7 r0 = new b7
            int r1 = defpackage.f8a.P
            o7d r2 = new o7d
            long r14 = defpackage.g8a.h
            int r6 = defpackage.i8a.i1
            hge r7 = new hge
            r7.<init>(r6)
            y6b r6 = r8.j
            boolean r9 = r6.b
            if (r9 == 0) goto L_0x019e
            r18 = r28
            goto L_0x01a0
        L_0x019e:
            r18 = r27
        L_0x01a0:
            z6d r13 = new z6d
            boolean r6 = r6.a
            r13.<init>(r6, r9)
            r23 = 0
            r26 = 1968(0x7b0, float:2.758E-42)
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r6 = r13
            r13 = r2
            r17 = r7
            r21 = r6
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6 = -2147482624(0xffffffff80000400, float:-1.435E-42)
            r0.<init>(r1, r2, r6)
            r3.add(r0)
            r0 = 0
            r5.f(r3, r8, r0, r10)
            boolean r1 = r12.Y
            if (r1 != 0) goto L_0x01dd
            long r5 = r12.n()
            boolean r2 = r11.V(r5)
            if (r2 != 0) goto L_0x01dd
            r2 = 1
            goto L_0x01de
        L_0x01dd:
            r2 = r0
        L_0x01de:
            d(r3, r8, r2)
            if (r4 == 0) goto L_0x01f1
            if (r1 != 0) goto L_0x01f1
            long r1 = r12.n()
            boolean r1 = r11.V(r1)
            if (r1 != 0) goto L_0x01f1
            r9 = 1
            goto L_0x01f2
        L_0x01f1:
            r9 = r0
        L_0x01f2:
            boolean r0 = r11.a0()
            r11 = r32
            g(r3, r9, r0, r11)
            lg7 r0 = hwf.a(r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeb.b(tf3, i22, z6b, b7b, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(List list, z6b z6b, boolean z, boolean z2) {
        List list2 = list;
        z6b z6b2 = z6b;
        int i = f8a.N;
        long j = g8a.f;
        hge hge = new hge(z ? i8a.s1 : i8a.b1);
        y6b y6b = z6b2.l;
        boolean z3 = y6b.b;
        d7d d7d = d7d.o;
        d7d d7d2 = d7d.b;
        y6b y6b2 = y6b;
        o7d o7d = r4;
        o7d o7d2 = new o7d(j, 0, hge, z3 ? d7d2 : d7d, (mge) null, (Integer) null, new z6d(y6b.a, z3), (u6d) null, (mge) null, 0, (r6d) null, 1968);
        t97 t97 = this.d;
        list2.add(new b7(i, o7d, (!((kb5) ((jb5) t97.getValue())).o() || z) ? 1024 : 536871936));
        if (((kb5) ((jb5) t97.getValue())).o() && !z) {
            list2.add(new b7(f8a.M, new o7d(g8a.e, 0, new hge(i8a.a1), y6b2.b ? d7d2 : d7d, (mge) null, (Integer) null, new z6d(z6b2.f, z2), (u6d) null, (mge) null, 0, (r6d) null, 1936), -2147482624));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.Long r5, boolean r6, defpackage.i22 r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.beb
            if (r0 == 0) goto L_0x0013
            r0 = r8
            beb r0 = (defpackage.beb) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            beb r0 = new beb
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r6 = r0.o
            java.lang.Long r5 = r0.Y
            i22 r7 = r0.X
            wx3.H(r8)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            wx3.H(r8)
            t97 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            ap3 r4 = (defpackage.ap3) r4
            r0.X = r7
            r0.Y = r5
            r0.o = r6
            r0.x0 = r3
            java.lang.Object r8 = r4.d(r0)
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            tf3 r8 = (defpackage.tf3) r8
            long r0 = r8.n()
            if (r5 != 0) goto L_0x0058
            goto L_0x0062
        L_0x0058:
            long r4 = r5.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            if (r6 != 0) goto L_0x006a
        L_0x0062:
            boolean r4 = r7.a0()
            if (r4 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeb.h(java.lang.Long, boolean, i22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Long r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ceb
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ceb r0 = (defpackage.ceb) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            ceb r0 = new ceb
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wx3.H(r12)
            goto L_0x0086
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            long r10 = r0.Y
            long r6 = r0.X
            eeb r2 = r0.o
            wx3.H(r12)
            goto L_0x0061
        L_0x003d:
            wx3.H(r12)
            if (r11 == 0) goto L_0x009f
            long r11 = r11.longValue()
            t97 r2 = r10.c
            java.lang.Object r2 = r2.getValue()
            ap3 r2 = (defpackage.ap3) r2
            r0.o = r10
            r0.X = r11
            r0.Y = r11
            r0.x0 = r4
            java.lang.Object r2 = r2.d(r0)
            if (r2 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r6 = r11
            r12 = r2
            r2 = r10
            r10 = r6
        L_0x0061:
            tf3 r12 = (defpackage.tf3) r12
            long r8 = r12.n()
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0073
            int r10 = defpackage.i8a.f1
            hge r5 = new hge
            r5.<init>(r10)
            goto L_0x009f
        L_0x0073:
            t97 r10 = r2.c
            java.lang.Object r10 = r10.getValue()
            ap3 r10 = (defpackage.ap3) r10
            r0.o = r5
            r0.x0 = r3
            java.lang.Comparable r12 = r10.b(r6, r0)
            if (r12 != r1) goto L_0x0086
            return r1
        L_0x0086:
            tf3 r12 = (defpackage.tf3) r12
            if (r12 == 0) goto L_0x009f
            java.lang.String r10 = r12.d()
            if (r10 == 0) goto L_0x009f
            int r11 = defpackage.i8a.e1
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            jge r5 = new jge
            java.util.List r10 = cs.g0(r10)
            r5.<init>(r11, r10)
        L_0x009f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeb.i(java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Long r5, defpackage.tf3 r6, defpackage.i22 r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.deb
            if (r0 == 0) goto L_0x0013
            r0 = r8
            deb r0 = (defpackage.deb) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            deb r0 = new deb
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            i22 r7 = r0.Y
            tf3 r6 = r0.X
            eeb r4 = r0.o
            wx3.H(r8)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            wx3.H(r8)
            r0.o = r4
            r0.X = r6
            r0.Y = r7
            r0.x0 = r3
            java.lang.Object r8 = r4.i(r5, r0)
            if (r8 != r1) goto L_0x0047
            return r1
        L_0x0047:
            mge r8 = (defpackage.mge) r8
            boolean r5 = r6.Y
            if (r5 == 0) goto L_0x0055
            int r4 = defpackage.i8a.g1
            hge r8 = new hge
            r8.<init>(r4)
            goto L_0x0082
        L_0x0055:
            long r0 = r6.n()
            boolean r5 = r7.V(r0)
            if (r5 == 0) goto L_0x0067
            int r4 = defpackage.i8a.d1
            hge r8 = new hge
            r8.<init>(r4)
            goto L_0x0082
        L_0x0067:
            if (r8 != 0) goto L_0x0082
            t97 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            s2b r4 = (defpackage.s2b) r4
            t97 r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            q2b r4 = (defpackage.q2b) r4
            java.lang.CharSequence r4 = r4.b(r6)
            lge r8 = new lge
            r8.<init>(r4)
        L_0x0082:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeb.j(java.lang.Long, tf3, i22, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
