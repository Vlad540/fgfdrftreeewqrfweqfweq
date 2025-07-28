package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u17  reason: default package */
public final class u17 extends l5e implements i26 {
    public tf3 X;
    public int Y;
    public final /* synthetic */ w17 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u17(w17 w17, Continuation continuation) {
        super(2, continuation);
        this.Z = w17;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u17) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u17(this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r7 = r16
            pu3 r8 = defpackage.pu3.a
            int r0 = r7.Y
            jue r9 = defpackage.jue.a
            r10 = 0
            r11 = 3
            r1 = 2
            r2 = 1
            w17 r12 = r7.Z
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x002c
            if (r0 == r1) goto L_0x0023
            if (r0 != r11) goto L_0x001b
            defpackage.wx3.H(r17)
            goto L_0x00cf
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            tf3 r0 = r7.X
            defpackage.wx3.H(r17)
            r13 = r0
            r0 = r17
            goto L_0x006f
        L_0x002c:
            defpackage.wx3.H(r17)
            r0 = r17
            goto L_0x0046
        L_0x0032:
            defpackage.wx3.H(r17)
            t97 r0 = r12.c
            java.lang.Object r0 = r0.getValue()
            ap3 r0 = (ap3) r0
            r7.Y = r2
            java.lang.Object r0 = r0.d(r7)
            if (r0 != r8) goto L_0x0046
            return r8
        L_0x0046:
            r13 = r0
            tf3 r13 = (tf3) r13
            fj0 r0 = fj0.c
            java.lang.String r0 = r13.p(r0)
            if (r0 == 0) goto L_0x0072
            fr6 r2 = defpackage.a06.u()
            r3 = 6
            tr6 r3 = bz9.b(r0, r10, r3)
            r7.X = r13
            r7.Y = r1
            r4 = 0
            r6 = 14
            r14 = 0
            r0 = r2
            r1 = r3
            r2 = r14
            r5 = r16
            java.lang.Object r0 = defpackage.hhd.t(r0, r1, r2, r4, r5, r6)
            if (r0 != r8) goto L_0x006f
            return r8
        L_0x006f:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L_0x0073
        L_0x0072:
            r0 = r10
        L_0x0073:
            mjb r1 = new mjb
            java.lang.String r2 = r13.d()
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = ""
        L_0x007d:
            java.lang.String r3 = r13.j()
            mk9 r4 = one.me.sdk.uikit.qr.QrCodeGenerator.a
            t97 r4 = r12.X
            java.lang.Object r4 = r4.getValue()
            xzc r4 = (xzc) r4
            vqc r4 = (vqc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.invite-link
            java.lang.String r6 = "https://max.ru"
            java.lang.String r4 = r4.q(r5, r6)
            r5 = 244(0xf4, float:3.42E-43)
            float r5 = (float) r5
            android.content.res.Resources r6 = dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = defpackage.a24.X(r5)
            r6 = 24
            float r6 = (float) r6
            android.content.res.Resources r13 = dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r6 = r6 * r13
            int r6 = defpackage.a24.X(r6)
            android.graphics.Bitmap r0 = one.me.sdk.uikit.qr.QrCodeGenerator.a(r4, r5, r6, r0)
            r1.<init>(r2, r3, r0)
            r7.X = r10
            r7.Y = r11
            grd r0 = r12.Z
            r0.m(r10, r1)
            if (r9 != r8) goto L_0x00cf
            return r8
        L_0x00cf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u17.o(java.lang.Object):java.lang.Object");
    }
}
