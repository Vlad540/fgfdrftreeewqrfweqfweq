package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ti3  reason: default package */
public final class ti3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ti3(hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ti3(this.Y, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.X
            jue r2 = jue.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            hj3 r7 = r11.Y
            if (r1 == 0) goto L_0x002f
            if (r1 == r6) goto L_0x002b
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0023
            if (r1 != r3) goto L_0x001b
            wx3.H(r12)
            goto L_0x00a5
        L_0x001b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0023:
            wx3.H(r12)
            goto L_0x0098
        L_0x0027:
            wx3.H(r12)
            goto L_0x0074
        L_0x002b:
            wx3.H(r12)
            goto L_0x0044
        L_0x002f:
            wx3.H(r12)
            t97 r12 = r7.w
            java.lang.Object r12 = r12.getValue()
            cn3 r12 = (defpackage.cn3) r12
            r11.X = r6
            long r8 = r7.n
            r12.a(r8)
            if (r2 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r12 = 48
            float r12 = (float) r12
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r12 = r12 * r1
            int r12 = a24.X(r12)
            hcd r1 = r7.e
            v9b r6 = new v9b
            int r8 = defpackage.i8a.F0
            hge r9 = new hge
            r9.<init>(r8)
            zx1 r8 = new zx1
            r10 = 19
            r8.<init>(r10, r7)
            r6.<init>(r9, r12, r8)
            r11.X = r5
            java.lang.Object r12 = r1.a(r6, r11)
            if (r12 != r0) goto L_0x0074
            return r0
        L_0x0074:
            t97 r12 = r7.p
            java.lang.Object r12 = r12.getValue()
            bv2 r12 = (defpackage.bv2) r12
            aw2 r12 = (defpackage.aw2) r12
            long r5 = r7.n
            i22 r12 = r12.q(r5)
            if (r12 == 0) goto L_0x0098
            hcd r1 = r7.d
            y8b r5 = new y8b
            long r8 = r12.a
            r5.<init>(r8)
            r11.X = r4
            java.lang.Object r12 = r1.a(r5, r11)
            if (r12 != r0) goto L_0x0098
            return r0
        L_0x0098:
            hcd r12 = r7.d
            v03 r1 = defpackage.v03.b
            r11.X = r3
            java.lang.Object r11 = r12.a(r1, r11)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti3.o(java.lang.Object):java.lang.Object");
    }
}
