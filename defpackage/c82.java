package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c82  reason: default package */
public final class c82 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ b92 Z;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c82(b92 b92, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c82(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 4
            pu3 r1 = pu3.a
            int r2 = r11.Y
            jue r3 = jue.a
            r4 = 1
            java.lang.String r5 = r11.w0
            r6 = 3
            r7 = 2
            b92 r8 = r11.Z
            if (r2 == 0) goto L_0x0034
            if (r2 == r4) goto L_0x0030
            if (r2 == r7) goto L_0x002c
            if (r2 == r6) goto L_0x0025
            if (r2 != r0) goto L_0x001d
            wx3.H(r12)
            goto L_0x00b3
        L_0x001d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0025:
            b92 r8 = r11.X
            wx3.H(r12)
            goto L_0x00a5
        L_0x002c:
            wx3.H(r12)
            goto L_0x0094
        L_0x0030:
            wx3.H(r12)
            goto L_0x0064
        L_0x0034:
            wx3.H(r12)
            java.lang.String r12 = defpackage.b92.O0
            udc r12 = r8.e()
            r11.Y = r4
            r12.getClass()
            java.lang.String r2 = "SELECT options FROM chat_folder WHERE id=? "
            pec r2 = pec.a(r4, r2)
            if (r5 != 0) goto L_0x004e
            r2.W(r4)
            goto L_0x0051
        L_0x004e:
            r2.f(r4, r5)
        L_0x0051:
            android.os.CancellationSignal r9 = new android.os.CancellationSignal
            r9.<init>()
            sdc r10 = new sdc
            r10.<init>(r12, r2, r0)
            aec r12 = r12.a
            java.lang.Object r12 = r1g.g(r12, r9, r10, r11)
            if (r12 != r1) goto L_0x0064
            return r1
        L_0x0064:
            byte[] r12 = (byte[]) r12
            java.util.Set r12 = kjd.u(r12)
            fr5 r2 = defpackage.fr5.NO_DELETE
            boolean r12 = r12.contains(r2)
            if (r12 == 0) goto L_0x007a
            java.lang.String r11 = defpackage.b92.O0
            java.lang.String r12 = "try to delete not deleted folder!"
            udd.U(r11, r12)
            return r3
        L_0x007a:
            java.lang.String r12 = defpackage.b92.O0
            udc r12 = r8.e()
            r11.Y = r7
            r12.getClass()
            ndc r2 = new ndc
            r7 = 0
            r2.<init>(r12, r5, r7)
            aec r12 = r12.a
            java.lang.Object r12 = a24.m0(r12, r2, r11)
            if (r12 != r1) goto L_0x0094
            return r1
        L_0x0094:
            java.lang.String r12 = defpackage.b92.O0
            udc r12 = r8.e()
            r11.X = r8
            r11.Y = r6
            java.lang.Object r12 = r12.d(r11)
            if (r12 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            java.util.List r12 = (java.util.List) r12
            r2 = 0
            r11.X = r2
            r11.Y = r0
            java.lang.Object r11 = defpackage.b92.j(r8, r12, r4, r11)
            if (r11 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c82.o(java.lang.Object):java.lang.Object");
    }
}
