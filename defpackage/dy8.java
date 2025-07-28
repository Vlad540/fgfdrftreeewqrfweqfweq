package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dy8  reason: default package */
public final class dy8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yt0 Y;
    public final /* synthetic */ zz8 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ vw6 x0;
    public final /* synthetic */ eu0 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dy8(yt0 yt0, zz8 zz8, long j, vw6 vw6, eu0 eu0, Continuation continuation) {
        super(2, continuation);
        this.Y = yt0;
        this.Z = zz8;
        this.w0 = j;
        this.x0 = vw6;
        this.y0 = eu0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dy8(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r7.m(ru.ok.tamtam.android.prefs.PmsKey.f10botstartparam, true) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r6 = r19
            pu3 r8 = pu3.a
            int r0 = r6.X
            jue r9 = jue.a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 == r2) goto L_0x0010
            if (r0 != r1) goto L_0x0015
        L_0x0010:
            wx3.H(r20)
            goto L_0x0136
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001d:
            wx3.H(r20)
            yt0 r0 = r6.Y
            hu0 r3 = r0.b
            if (r3 != 0) goto L_0x0028
            r3 = -1
            goto L_0x0030
        L_0x0028:
            int[] r4 = defpackage.cy8.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
        L_0x0030:
            vw6 r4 = r6.x0
            zz8 r5 = r6.Z
            switch(r3) {
                case 1: goto L_0x0121;
                case 2: goto L_0x0121;
                case 3: goto L_0x00df;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0081;
                case 7: goto L_0x003d;
                case 8: goto L_0x0136;
                default: goto L_0x0037;
            }
        L_0x0037:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003d:
            t0c r1 = r5.r1
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            i22 r1 = (defpackage.i22) r1
            if (r1 == 0) goto L_0x0080
            bx8 r3 = defpackage.bx8.c
            java.lang.Long r4 = new java.lang.Long
            long r6 = r1.a
            r4.<init>(r6)
            java.lang.String r1 = r0.X
            r6 = 0
            if (r1 == 0) goto L_0x006d
            t97 r7 = r5.I0
            java.lang.Object r7 = r7.getValue()
            xzc r7 = (defpackage.xzc) r7
            vqc r7 = (defpackage.vqc) r7
            r7.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f10botstartparam
            boolean r2 = r7.m(r8, r2)
            if (r2 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = r6
        L_0x006e:
            bff r2 = defpackage.bff.INLINE_BUTTON
            r3.getClass()
            long r6 = r0.Z
            a34 r0 = defpackage.bx8.c2(r6, r2, r4, r1)
            l05 r1 = r5.B1
            defpackage.taf.o(r1, r0)
            goto L_0x0136
        L_0x0080:
            return r9
        L_0x0081:
            t0c r2 = r5.r1
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            i22 r2 = (defpackage.i22) r2
            if (r2 == 0) goto L_0x00ab
            t97 r3 = r5.h1
            java.lang.Object r3 = r3.getValue()
            h29 r3 = (defpackage.h29) r3
            r6.X = r1
            r5 = 0
            r7 = 24
            long r1 = r2.a
            java.lang.String r4 = r0.a
            r10 = 0
            r0 = r3
            r3 = r4
            r4 = r10
            r6 = r19
            java.lang.Object r0 = defpackage.h29.b(r0, r1, r3, r4, r5, r6, r7)
            if (r0 != r8) goto L_0x0136
            return r8
        L_0x00ab:
            return r9
        L_0x00ac:
            t0c r0 = r5.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (defpackage.i22) r0
            if (r0 == 0) goto L_0x00d8
            bx8 r1 = defpackage.bx8.c
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":location/pick?request_code=1001&chat_id="
            r1.<init>(r2)
            long r2 = r0.a
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            a34 r1 = new a34
            r1.<init>(r0)
            l05 r0 = r5.B1
            defpackage.taf.o(r0, r1)
            goto L_0x0136
        L_0x00d8:
            return r9
        L_0x00d9:
            java.lang.String r0 = r0.o
            r5.C(r0)
            goto L_0x0136
        L_0x00df:
            l05 r0 = r5.y1
            kc3 r1 = defpackage.an8.a
            java.lang.String r13 = r4.b
            jed r1 = new jed
            int r2 = defpackage.c7a.D0
            hge r3 = new hge
            r3.<init>(r2)
            int r2 = defpackage.c7a.C0
            hge r4 = new hge
            r4.<init>(r2)
            kc3 r2 = new kc3
            int r5 = defpackage.a7a.S
            int r7 = defpackage.c7a.B0
            hge r8 = new hge
            r8.<init>(r7)
            r7 = 0
            r10 = 3
            r2.<init>(r5, r8, r10, r7)
            kc3 r5 = defpackage.an8.a
            kc3[] r2 = new defpackage.kc3[]{r2, r5}
            java.util.List r18 = p23.B(r2)
            eu0 r14 = r6.y0
            yt0 r15 = r6.Y
            long r11 = r6.w0
            r10 = r1
            r16 = r3
            r17 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17, r18)
            defpackage.taf.o(r0, r1)
            goto L_0x0136
        L_0x0121:
            nxc r0 = r5.C0
            java.lang.String r3 = r4.b
            r6.X = r2
            eu0 r4 = r6.y0
            yt0 r5 = r6.Y
            long r1 = r6.w0
            r6 = r19
            java.lang.Object r0 = r0.I(r1, r3, r4, r5, r6)
            if (r0 != r8) goto L_0x0136
            return r8
        L_0x0136:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy8.o(java.lang.Object):java.lang.Object");
    }
}
