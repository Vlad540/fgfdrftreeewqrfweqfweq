package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ln2  reason: default package */
public final class ln2 extends l5e implements m26 {
    public /* synthetic */ i22 X;
    public /* synthetic */ mge Y;
    public /* synthetic */ mge Z;
    public final /* synthetic */ nn2 w0;
    public final /* synthetic */ t97 x0;
    public final /* synthetic */ t97 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ln2(nn2 nn2, t97 t97, t97 t972, Continuation continuation) {
        super(4, continuation);
        this.w0 = nn2;
        this.x0 = t97;
        this.y0 = t972;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        ln2 ln2 = new ln2(this.w0, this.x0, this.y0, (Continuation) obj4);
        ln2.X = (i22) obj;
        ln2.Y = (mge) obj2;
        ln2.Z = (mge) obj3;
        return ln2.o(jue.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            defpackage.wx3.H(r21)
            i22 r1 = r0.X
            mge r2 = r0.Y
            mge r3 = r0.Z
            nn2 r4 = r0.w0
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "toolbarParams update"
            defpackage.udd.P(r4, r5, new java.lang.Object[0])
            tf3 r4 = r1.k()
            r5 = 0
            if (r4 == 0) goto L_0x002b
            long r6 = r4.n()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            t97 r6 = r0.x0
            java.lang.Object r6 = r6.getValue()
            f03 r6 = (f03) r6
            lqc r6 = (lqc) r6
            long r6 = r6.s()
            o62 r8 = r1.b
            boolean r6 = r8.f(r6)
            boolean r7 = r1.M()
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x005a
            t97 r7 = r0.y0
            java.lang.Object r7 = r7.getValue()
            jb5 r7 = (jb5) r7
            kb5 r7 = (kb5) r7
            boolean r7 = r7.q()
            if (r7 == 0) goto L_0x005a
            r7 = r9
            goto L_0x005b
        L_0x005a:
            r7 = r8
        L_0x005b:
            if (r6 == 0) goto L_0x0074
            aea r4 = new aea
            gea r7 = new gea
            int r10 = phc.O0
            nn2 r0 = r0.w0
            kn2 r11 = new kn2
            r12 = 0
            r11.<init>(r0, r12)
            r7.<init>(r10, r11)
            r4.<init>(r5, r7)
        L_0x0071:
            r19 = r4
            goto L_0x00a8
        L_0x0074:
            gea r10 = new gea
            int r11 = phc.t0
            nn2 r12 = r0.w0
            kn2 r13 = new kn2
            r14 = 1
            r13.<init>(r12, r14)
            r10.<init>(r11, r13)
            boolean r11 = r12.w()
            if (r11 == 0) goto L_0x0091
            if (r4 == 0) goto L_0x0091
            boolean r11 = r1.F()
            if (r11 == 0) goto L_0x0093
        L_0x0091:
            if (r7 == 0) goto L_0x00a2
        L_0x0093:
            gea r5 = new gea
            int r7 = phc.c0
            nn2 r0 = r0.w0
            to1 r11 = new to1
            r12 = 2
            r11.<init>(r1, r0, r4, r12)
            r5.<init>(r7, r11)
        L_0x00a2:
            aea r4 = new aea
            r4.<init>(r5, r10)
            goto L_0x0071
        L_0x00a8:
            if (r6 == 0) goto L_0x00b3
            int r0 = c7a.u0
            hge r2 = new hge
            r2.<init>(r0)
        L_0x00b1:
            r15 = r2
            goto L_0x00d0
        L_0x00b3:
            boolean r0 = r1.F()
            if (r0 == 0) goto L_0x00c1
            int r0 = c7a.u
            hge r2 = new hge
            r2.<init>(r0)
            goto L_0x00b1
        L_0x00c1:
            if (r3 != 0) goto L_0x00cf
            if (r2 != 0) goto L_0x00b1
            java.lang.CharSequence r0 = r1.o()
            lge r2 = new lge
            r2.<init>(r0)
            goto L_0x00b1
        L_0x00cf:
            r15 = r3
        L_0x00d0:
            long r12 = r1.e()
            if (r6 != 0) goto L_0x00eb
            boolean r0 = r1.U()
            if (r0 != 0) goto L_0x00e8
            tf3 r0 = r1.k()
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.u()
            if (r0 != r9) goto L_0x00eb
        L_0x00e8:
            r16 = r9
            goto L_0x00ed
        L_0x00eb:
            r16 = r8
        L_0x00ed:
            r1.i0()
            java.lang.CharSequence r0 = r1.B0
            r1.h0()
            java.lang.CharSequence r14 = r1.y0
            fj0 r2 = fj0.b
            ej0 r3 = ej0.a
            java.lang.String r17 = r1.f(r2, r3)
            hp2 r1 = new hp2
            r11 = r1
            r18 = r0
            r11.<init>(r12, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln2.o(java.lang.Object):java.lang.Object");
    }
}
