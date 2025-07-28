package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m78  reason: default package */
public final class m78 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ r78 Y;
    public final /* synthetic */ xm8 Z;
    public final /* synthetic */ Long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m78(Object obj, Continuation continuation, r78 r78, xm8 xm8, Long l) {
        super(2, continuation);
        this.X = obj;
        this.Y = r78;
        this.Z = xm8;
        this.w0 = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m78(this.X, continuation, this.Y, this.Z, this.w0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            wx3.H(r21)
            java.lang.Object r1 = r0.X
            o10 r1 = (defpackage.o10) r1
            if (r1 == 0) goto L_0x000e
            v00 r3 = r1.j
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            if (r3 == 0) goto L_0x0144
            java.lang.String r3 = r1.q
            int r3 = r3.hashCode()
            long r5 = (long) r3
            r78 r3 = r0.Y
            android.content.Context r4 = r3.a
            f03 r7 = r3.b
            lqc r7 = (defpackage.lqc) r7
            java.util.Locale r7 = r7.u()
            xm8 r8 = r0.Z
            vo8 r9 = r8.a
            long r9 = r9.o
            r11 = 1
            java.lang.String r13 = xs7.y(r4, r7, r9, r11)
            v00 r4 = r1.j
            o10 r7 = r4.d
            r9 = 3
            r10 = 2
            if (r7 == 0) goto L_0x0040
            boolean r12 = r7.i()
            if (r12 == 0) goto L_0x0040
            r17 = r10
            goto L_0x0053
        L_0x0040:
            if (r7 == 0) goto L_0x0051
            boolean r12 = r7.f()
            if (r12 == 0) goto L_0x0051
            a10 r12 = r7.b
            boolean r12 = r12.X
            if (r12 != 0) goto L_0x0051
            r17 = r11
            goto L_0x0053
        L_0x0051:
            r17 = r9
        L_0x0053:
            g10 r12 = r1.n
            if (r12 != 0) goto L_0x0059
            r12 = -1
            goto L_0x0061
        L_0x0059:
            int[] r14 = defpackage.j78.$EnumSwitchMapping$1
            int r12 = r12.ordinal()
            r12 = r14[r12]
        L_0x0061:
            android.content.Context r3 = r3.a
            vo8 r8 = r8.a
            r14 = 0
            r15 = r3
            long r2 = r4.b
            if (r12 == r11) goto L_0x00ff
            if (r12 == r10) goto L_0x00ff
            if (r12 == r9) goto L_0x00ff
            r9 = 4
            java.lang.Long r0 = r0.w0
            if (r12 == r9) goto L_0x00de
            r9 = 5
            if (r12 == r9) goto L_0x009a
            kh8 r9 = new kh8
            r10 = r15
            java.lang.String r12 = defpackage.dhe.w(r2, r14, r10)
            lge r15 = new lge
            r15.<init>(r12)
            long r11 = r8.b
            if (r0 != 0) goto L_0x0088
            goto L_0x0092
        L_0x0088:
            long r18 = r0.longValue()
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0092
            r11 = 1
            goto L_0x0093
        L_0x0092:
            r11 = r14
        L_0x0093:
            r9.<init>(r15, r11)
        L_0x0096:
            r18 = r9
            goto L_0x0110
        L_0x009a:
            r10 = r15
            long r11 = r4.a
            r18 = 0
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            float r9 = r1.p
            if (r0 != 0) goto L_0x00ad
            float r0 = (float) r2
            r11 = 1120403456(0x42c80000, float:100.0)
            float r11 = r9 / r11
            float r11 = r11 * r0
            long r11 = (long) r11
            goto L_0x00af
        L_0x00ad:
            long r11 = r1.u
        L_0x00af:
            long r14 = r1.t
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
            r0 = 0
            java.lang.String r11 = defpackage.dhe.w(r11, r0, r10)
            int r0 = defpackage.dhe.m(r14)
            r12 = 1
            java.lang.String r0 = defpackage.dhe.v(r14, r0, r12, r10)
            java.lang.String r12 = "/"
            java.lang.String r0 = defpackage.me4.i(r11, r12, r0)
            lge r11 = new lge
            r11.<init>(r0)
            goto L_0x00d6
        L_0x00cf:
            int r0 = defpackage.c7a.t
            hge r11 = new hge
            r11.<init>(r0)
        L_0x00d6:
            lh8 r0 = new lh8
            r0.<init>(r11, r9)
        L_0x00db:
            r18 = r0
            goto L_0x0110
        L_0x00de:
            r12 = r11
            r10 = r15
            kh8 r9 = new kh8
            r11 = 0
            java.lang.String r14 = defpackage.dhe.w(r2, r11, r10)
            lge r11 = new lge
            r11.<init>(r14)
            long r14 = r8.b
            if (r0 != 0) goto L_0x00f1
            goto L_0x00fa
        L_0x00f1:
            long r18 = r0.longValue()
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r12 = 0
        L_0x00fb:
            r9.<init>(r11, r12)
            goto L_0x0096
        L_0x00ff:
            r10 = r15
            mh8 r0 = new mh8
            r9 = 0
            java.lang.String r11 = defpackage.dhe.w(r2, r9, r10)
            lge r9 = new lge
            r9.<init>(r11)
            r0.<init>(r9)
            goto L_0x00db
        L_0x0110:
            oh8 r0 = new oh8
            long r8 = r8.b
            if (r7 == 0) goto L_0x011d
            java.lang.String r7 = ez3.b0(r7)
            r11 = r7
            r7 = 0
            goto L_0x011f
        L_0x011d:
            r7 = 0
            r11 = 0
        L_0x011f:
            java.lang.String r14 = defpackage.dhe.w(r2, r7, r10)
            j06 r2 = defpackage.kc5.b
            java.lang.String r3 = ete.C(r4)
            r2.getClass()
            kc5 r19 = j06.f(r3)
            long r2 = r4.a
            java.lang.String r15 = r1.r
            java.lang.String r12 = r4.c
            java.lang.String r1 = r1.q
            r4 = r0
            r7 = r8
            r9 = r2
            r2 = r15
            r15 = r1
            r16 = r2
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = r0
            goto L_0x0145
        L_0x0144:
            r2 = 0
        L_0x0145:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m78.o(java.lang.Object):java.lang.Object");
    }
}
