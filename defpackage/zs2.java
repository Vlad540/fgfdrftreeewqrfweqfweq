package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zs2  reason: default package */
public final class zs2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bt2 Y;
    public final /* synthetic */ ba6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zs2(bt2 bt2, ba6 ba6, Continuation continuation) {
        super(2, continuation);
        this.Y = bt2;
        this.Z = ba6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zs2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zs2(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r11.X
            jue r2 = defpackage.jue.a
            r3 = 2
            r4 = 1
            ba6 r5 = r11.Z
            bt2 r6 = r11.Y
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            defpackage.wx3.H(r12)
            goto L_0x0091
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001f:
            defpackage.wx3.H(r12)
            goto L_0x0065
        L_0x0023:
            defpackage.wx3.H(r12)
            k77[] r12 = defpackage.bt2.U0
            t97 r12 = r6.x0
            java.lang.Object r12 = r12.getValue()
            f03 r12 = (f03) r12
            lqc r12 = (lqc) r12
            long r7 = r12.s()
            long r9 = r5.c
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x004e
            int r11 = cic.w2
            hge r12 = new hge
            r12.<init>(r11)
            med r11 = new med
            r11.<init>(r12)
            l05 r12 = r6.M0
            taf.o(r12, r11)
            return r2
        L_0x004e:
            pae r12 = r6.Z
            n3a r12 = (defpackage.n3a) r12
            ju3 r12 = r12.b()
            ys2 r1 = new ys2
            r7 = 0
            r1.<init>(r6, r5, r7)
            r11.X = r4
            java.lang.Object r12 = defpackage.xs7.U(r12, r1, r11)
            if (r12 != r0) goto L_0x0065
            return r0
        L_0x0065:
            uj3 r12 = r5.z0
            tj3 r1 = tj3.c
            java.util.List r12 = r12.y0
            boolean r12 = r12.contains(r1)
            long r7 = r5.c
            if (r12 != 0) goto L_0x0080
            k77[] r11 = defpackage.bt2.U0
            bv2 r11 = r6.s()
            aw2 r11 = (aw2) r11
            i22 r11 = r11.q(r7)
            goto L_0x0094
        L_0x0080:
            k77[] r12 = defpackage.bt2.U0
            bv2 r12 = r6.s()
            r11.X = r3
            aw2 r12 = (aw2) r12
            java.lang.Object r12 = r12.u(r7, r11)
            if (r12 != r0) goto L_0x0091
            return r0
        L_0x0091:
            r11 = r12
            i22 r11 = (i22) r11
        L_0x0094:
            if (r11 == 0) goto L_0x009f
            zu2 r12 = defpackage.zu2.c
            long r0 = r11.a
            a34 r11 = r12.a2(r0)
            goto L_0x00bf
        L_0x009f:
            zu2 r11 = defpackage.zu2.c
            long r0 = r5.c
            r11.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = ":profile?id="
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r12 = "&type=contact"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            a34 r12 = new a34
            r12.<init>(r11)
            r11 = r12
        L_0x00bf:
            l05 r12 = r6.L0
            taf.o(r12, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs2.o(java.lang.Object):java.lang.Object");
    }
}
