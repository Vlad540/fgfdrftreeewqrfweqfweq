package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jq9  reason: default package */
public final class jq9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kq9 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq9(kq9 kq9, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = kq9;
        this.Z = j;
        this.w0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jq9(this.Y, this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r6 = pu3.a
            int r0 = r12.X
            r7 = 5
            r8 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            long r9 = r12.Z
            kq9 r11 = r12.Y
            if (r0 == 0) goto L_0x003a
            if (r0 == r3) goto L_0x0035
            if (r0 == r2) goto L_0x0030
            if (r0 == r1) goto L_0x002b
            if (r0 == r8) goto L_0x0026
            if (r0 != r7) goto L_0x001e
            wx3.H(r13)
            goto L_0x00ca
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            wx3.H(r13)
            r0 = r13
            goto L_0x0091
        L_0x002b:
            wx3.H(r13)
            r0 = r13
            goto L_0x0076
        L_0x0030:
            wx3.H(r13)
            r0 = r13
            goto L_0x005f
        L_0x0035:
            wx3.H(r13)
            r0 = r13
            goto L_0x0050
        L_0x003a:
            wx3.H(r13)
            t97 r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            bv2 r0 = (defpackage.bv2) r0
            r12.X = r3
            aw2 r0 = (defpackage.aw2) r0
            java.lang.Object r0 = r0.k(r9, r12)
            if (r0 != r6) goto L_0x0050
            return r6
        L_0x0050:
            i22 r0 = (defpackage.i22) r0
            if (r0 == 0) goto L_0x0066
            r12.X = r2
            long r1 = r12.w0
            java.lang.Object r0 = defpackage.kq9.b(r11, r0, r1, r12)
            if (r0 != r6) goto L_0x005f
            return r6
        L_0x005f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x007c
        L_0x0066:
            r12.X = r1
            long r1 = r12.Z
            long r3 = r12.w0
            kq9 r0 = r12.Y
            r5 = r12
            java.lang.Object r0 = r0.c(r1, r3, r5)
            if (r0 != r6) goto L_0x0076
            return r6
        L_0x0076:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x007c:
            if (r0 == 0) goto L_0x00ca
            t97 r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            bv2 r0 = (defpackage.bv2) r0
            r12.X = r8
            aw2 r0 = (defpackage.aw2) r0
            java.lang.Object r0 = r0.k(r9, r12)
            if (r0 != r6) goto L_0x0091
            return r6
        L_0x0091:
            i22 r0 = (defpackage.i22) r0
            if (r0 == 0) goto L_0x00b4
            o62 r0 = r0.b
            int r1 = r0.m
            if (r1 <= 0) goto L_0x00a7
            t97 r0 = r11.o
            java.lang.Object r0 = r0.getValue()
            p7a r0 = (p7a) r0
            r0.f(r9)
            goto L_0x00b4
        L_0x00a7:
            t97 r1 = r11.o
            java.lang.Object r1 = r1.getValue()
            p7a r1 = (p7a) r1
            long r2 = r0.a
            r1.a(r2)
        L_0x00b4:
            t97 r0 = r11.X
            java.lang.Object r0 = r0.getValue()
            mr9 r0 = (defpackage.mr9) r0
            r12.X = r7
            long r1 = r12.Z
            long r3 = r12.w0
            r5 = r12
            java.lang.Object r0 = r0.g(r1, r3, r5)
            if (r0 != r6) goto L_0x00ca
            return r6
        L_0x00ca:
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq9.o(java.lang.Object):java.lang.Object");
    }
}
