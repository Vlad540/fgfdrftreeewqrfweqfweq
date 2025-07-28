package defpackage;

import android.content.Context;

/* renamed from: qr2  reason: default package */
public final class qr2 {
    public final Context a;
    public final s16 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;

    public qr2(Context context, s16 s16, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = context;
        this.b = s16;
        this.c = t97;
        this.d = t972;
        this.e = t973;
        this.f = t974;
        this.g = t975;
        this.h = t976;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023d, code lost:
        if (r2.u() == true) goto L_0x0245;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pi2 a(i22 r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            tf3 r2 = r37.k()
            t97 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            f03 r3 = (f03) r3
            lqc r3 = (lqc) r3
            long r3 = r3.s()
            o62 r5 = r1.b
            boolean r3 = r5.f(r3)
            r5 = 1
            if (r3 != 0) goto L_0x0047
            if (r2 == 0) goto L_0x0047
            t97 r6 = r0.f
            java.lang.Object r6 = r6.getValue()
            q2b r6 = (q2b) r6
            long r7 = r2.n()
            o2b r6 = r6.d()
            l2b r6 = r6.b(r7)
            int r6 = r6.a
            r7 = 10
            if (r6 == r7) goto L_0x0044
            r7 = 20
            if (r6 == r7) goto L_0x0044
            r7 = 40
            if (r6 == r7) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r18 = r5
            goto L_0x0049
        L_0x0047:
            r18 = 0
        L_0x0049:
            if (r3 != 0) goto L_0x0055
            if (r2 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            fj0 r6 = fj0.c
            java.lang.String r6 = r2.p(r6)
            goto L_0x005d
        L_0x0055:
            fj0 r6 = fj0.b
            ej0 r7 = ej0.a
            java.lang.String r6 = r1.f(r6, r7)
        L_0x005d:
            r7 = 0
            if (r6 == 0) goto L_0x0070
            boolean r8 = defpackage.h0e.c0(r6)
            if (r8 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r6 = r7
        L_0x0068:
            if (r6 == 0) goto L_0x0070
            android.net.Uri r6 = defpackage.at7.x(r6)
            r11 = r6
            goto L_0x0071
        L_0x0070:
            r11 = r7
        L_0x0071:
            s16 r6 = r0.b
            java.lang.Object r6 = r6.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x008a
            o62 r6 = r1.b
            f62 r6 = r6.a()
            long r12 = r6.e
            r27 = r12
            goto L_0x008c
        L_0x008a:
            r27 = 0
        L_0x008c:
            if (r2 == 0) goto L_0x00b4
            boolean r6 = r2.s()
            if (r6 != r5) goto L_0x00b4
            java.lang.Class<qr2> r6 = defpackage.qr2.class
            java.lang.String r6 = r6.getName()
            fn6 r10 = defpackage.udd.e
            if (r10 != 0) goto L_0x009f
            goto L_0x00b4
        L_0x009f:
            boolean r12 = r10.c()
            if (r12 == 0) goto L_0x00b4
            tn7 r12 = tn7.X
            long r13 = r2.n()
            java.lang.String r15 = "ONEME-6453| show chat with blocked user, userId="
            java.lang.String r13 = us8.i(r13, r15)
            r10.d(r12, r6, r13, r7)
        L_0x00b4:
            t97 r6 = r0.g
            java.lang.Object r6 = r6.getValue()
            ho2 r6 = (ho2) r6
            ma2 r6 = (defpackage.ma2) r6
            r6.getClass()
            ha2 r10 = new ha2
            r10.<init>(r1)
            ja2 r6 = r6.t
            java.lang.Object r6 = r6.c(r10)
            r10 = r6
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x00d7
            boolean r10 = defpackage.h0e.c0(r10)
            if (r10 == 0) goto L_0x00d8
        L_0x00d7:
            r6 = r7
        L_0x00d8:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 != 0) goto L_0x00e6
            if (r3 == 0) goto L_0x00e6
            android.content.Context r3 = r0.a
            int r6 = whc.o
            java.lang.String r6 = r3.getString(r6)
        L_0x00e6:
            long r12 = r1.a
            t97 r3 = r0.g
            java.lang.Object r3 = r3.getValue()
            ho2 r3 = (ho2) r3
            ma2 r3 = (defpackage.ma2) r3
            r3.getClass()
            r37.h0()
            java.lang.CharSequence r3 = r1.y0
            t97 r10 = r0.h
            java.lang.Object r10 = r10.getValue()
            go2 r10 = (go2) r10
            java.lang.CharSequence r14 = r10.a(r1)
            if (r6 != 0) goto L_0x010a
            java.lang.String r6 = ""
        L_0x010a:
            t97 r10 = r0.g
            java.lang.Object r10 = r10.getValue()
            ho2 r10 = (ho2) r10
            ma2 r10 = (defpackage.ma2) r10
            r10.getClass()
            o62 r15 = r1.b
            j4a r15 = r15.f0
            if (r15 != 0) goto L_0x0121
            r22 = r6
            r15 = r7
            goto L_0x018f
        L_0x0121:
            java.lang.String r15 = r15.c()
            if (r15 != 0) goto L_0x012b
            r22 = r6
            r5 = r7
            goto L_0x018e
        L_0x012b:
            int r4 = cic.X
            android.content.Context r7 = r10.a
            java.lang.String r4 = r7.getString(r4)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            whe r9 = new whe
            s59 r5 = defpackage.km4.y0
            km4 r5 = r5.n(r7)
            pda r5 = r5.g()
            hd1 r7 = new hd1
            r22 = r6
            r6 = 8
            r7.<init>(r6)
            r9.<init>(r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r9}
            defpackage.udd.d(r8, r4, r5)
            wld r4 = new wld
            r5 = 6
            float r5 = (float) r5
            android.content.res.Resources r6 = dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = defpackage.a24.X(r5)
            r4.<init>(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 8288(0x2060, float:1.1614E-41)
            defpackage.udd.c(r8, r5, r4)
            t97 r4 = r10.d
            java.lang.Object r4 = r4.getValue()
            w6a r4 = (defpackage.w6a) r4
            nu4 r4 = r4.j
            java.lang.CharSequence r4 = r4.e(r15)
            r8.append(r4)
            int r4 = bmd.a
            r4 = 1
            bmd r5 = oa2.F(r8, r4)
        L_0x018e:
            r15 = r5
        L_0x018f:
            t97 r4 = r0.g
            java.lang.Object r4 = r4.getValue()
            ho2 r4 = (ho2) r4
            long r5 = r1.a
            ma2 r4 = (defpackage.ma2) r4
            java.lang.CharSequence r4 = r4.f(r5)
            long r31 = r37.l()
            r5 = 0
            int r5 = (r31 > r5 ? 1 : (r31 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01ab
            r5 = 0
            goto L_0x01d1
        L_0x01ab:
            java.lang.String r5 = r1.D0
            if (r5 != 0) goto L_0x01cf
            go2 r5 = r1.F0
            nj4 r5 = r5.b
            java.lang.Object r5 = r5.get()
            w6a r5 = (defpackage.w6a) r5
            i03 r6 = r5.c
            java.util.Locale r30 = r6.u()
            long r33 = r6.m()
            android.content.Context r5 = r5.a
            r35 = 1
            r29 = r5
            java.lang.String r5 = defpackage.xs7.o(r29, r30, r31, r33, r35)
            r1.D0 = r5
        L_0x01cf:
            java.lang.String r5 = r1.D0
        L_0x01d1:
            xm8 r6 = r1.c
            if (r6 == 0) goto L_0x01f1
            tf3 r6 = r6.b
            if (r6 == 0) goto L_0x01f1
            long r6 = r6.n()
            t97 r8 = r0.c
            java.lang.Object r8 = r8.getValue()
            f03 r8 = (f03) r8
            lqc r8 = (lqc) r8
            long r8 = r8.s()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01f1
            r6 = 1
            goto L_0x01f2
        L_0x01f1:
            r6 = 0
        L_0x01f2:
            xm8 r7 = r1.c
            if (r7 == 0) goto L_0x022e
            if (r6 != 0) goto L_0x01f9
            goto L_0x022e
        L_0x01f9:
            vo8 r6 = r7.a
            bp8 r6 = r6.y0
            if (r6 != 0) goto L_0x0202
            r6 = -1
        L_0x0200:
            r7 = 1
            goto L_0x020b
        L_0x0202:
            int[] r7 = defpackage.pr2.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r7[r6]
            goto L_0x0200
        L_0x020b:
            if (r6 == r7) goto L_0x022b
            r7 = 2
            if (r6 == r7) goto L_0x0228
            r7 = 3
            if (r6 == r7) goto L_0x0225
            r7 = 4
            if (r6 == r7) goto L_0x0222
            r7 = 5
            if (r6 != r7) goto L_0x021c
            oi2 r6 = defpackage.oi2.X
            goto L_0x0230
        L_0x021c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0222:
            oi2 r6 = defpackage.oi2.o
            goto L_0x0230
        L_0x0225:
            oi2 r6 = defpackage.oi2.c
            goto L_0x0230
        L_0x0228:
            oi2 r6 = defpackage.oi2.b
            goto L_0x0230
        L_0x022b:
            oi2 r6 = defpackage.oi2.a
            goto L_0x0230
        L_0x022e:
            oi2 r6 = defpackage.oi2.a
        L_0x0230:
            boolean r7 = r37.U()
            if (r7 != 0) goto L_0x0244
            if (r2 == 0) goto L_0x0240
            boolean r2 = r2.u()
            r7 = 1
            if (r2 != r7) goto L_0x0241
            goto L_0x0245
        L_0x0240:
            r7 = 1
        L_0x0241:
            r19 = 0
            goto L_0x0247
        L_0x0244:
            r7 = 1
        L_0x0245:
            r19 = r7
        L_0x0247:
            long r20 = r37.n()
            o62 r2 = r1.b
            int r2 = r2.m
            t97 r8 = r0.c
            java.lang.Object r8 = r8.getValue()
            f03 r8 = (f03) r8
            boolean r24 = r1.S(r8)
            t97 r8 = r0.d
            java.lang.Object r8 = r8.getValue()
            xzc r8 = (xzc) r8
            r8.getClass()
            o62 r8 = r1.b
            java.lang.String r8 = r8.m0
            if (r8 == 0) goto L_0x0276
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0273
            goto L_0x0276
        L_0x0273:
            r25 = r7
            goto L_0x0278
        L_0x0276:
            r25 = 0
        L_0x0278:
            boolean r26 = r37.z()
            tf3 r8 = r37.k()
            if (r8 == 0) goto L_0x0293
            long r8 = r8.n()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r9 = r37.e0()
            if (r9 == 0) goto L_0x0293
            r29 = r8
            goto L_0x0295
        L_0x0293:
            r29 = 0
        L_0x0295:
            long r30 = r37.e()
            r37.i0()
            java.lang.CharSequence r9 = r1.B0
            t97 r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            jb5 r0 = (jb5) r0
            boolean r33 = r1.R(r0)
            o62 r0 = r1.b
            if (r0 == 0) goto L_0x02c3
            n00 r1 = r0.T
            if (r1 == 0) goto L_0x02c3
            java.lang.String r1 = r1.c
            boolean r1 = defpackage.r1g.q(r1)
            if (r1 == 0) goto L_0x02c3
            n00 r0 = r0.T
            int r0 = r0.d
            if (r0 <= 0) goto L_0x02c3
            r34 = r7
            goto L_0x02c5
        L_0x02c3:
            r34 = 0
        L_0x02c5:
            pi2 r0 = new pi2
            r8 = r0
            r1 = r9
            r9 = r12
            r12 = r3
            r13 = r14
            r14 = r22
            r16 = r4
            r17 = r5
            r22 = r6
            r23 = r2
            r32 = r1
            r8.<init>(r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r34)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr2.a(i22):pi2");
    }
}
