package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vg9  reason: default package */
public final class vg9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ xg9 Z;
    public final /* synthetic */ mnc w0;
    public final /* synthetic */ eja x0;
    public final /* synthetic */ ln7 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg9(int i, xg9 xg9, mnc mnc, eja eja, ln7 ln7, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = xg9;
        this.w0 = mnc;
        this.x0 = eja;
        this.y0 = ln7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vg9(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r0 = pu3.a
            int r1 = r12.X
            mnc r2 = r12.w0
            r3 = 1
            jue r4 = jue.a
            xg9 r5 = r12.Z
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x0022
            if (r1 == r7) goto L_0x001e
            if (r1 != r6) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001e:
            wx3.H(r13)
            goto L_0x0067
        L_0x0022:
            wx3.H(r13)
            goto L_0x0036
        L_0x0026:
            wx3.H(r13)
            int r8 = r12.Y
            if (r8 != r3) goto L_0x004f
            r12.X = r3
            java.lang.Object r13 = defpackage.xg9.a(r5, r12)
            if (r13 != r0) goto L_0x0036
            return r0
        L_0x0036:
            r12.X = r7
            r5.getClass()
            int r6 = r2.a
            r7 = 0
            int r8 = r12.Y
            eja r9 = r12.x0
            r10 = 1
            r11 = r12
            java.lang.Object r12 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r12 = r4
        L_0x004c:
            if (r12 != r0) goto L_0x0067
            return r0
        L_0x004f:
            r12.X = r6
            r5.getClass()
            int r6 = r2.a
            ln7 r7 = r12.y0
            eja r9 = r12.x0
            r10 = 0
            r11 = r12
            java.lang.Object r12 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r12 = r4
        L_0x0064:
            if (r12 != r0) goto L_0x0067
            return r0
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.o(java.lang.Object):java.lang.Object");
    }
}
