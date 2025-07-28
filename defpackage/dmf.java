package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dmf  reason: default package */
public final class dmf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kmf Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ byte[] w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ String y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dmf(kmf kmf, String str, byte[] bArr, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.Y = kmf;
        this.Z = str;
        this.w0 = bArr;
        this.x0 = str2;
        this.y0 = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dmf(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r5 = r7.y0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r4 = r7.x0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            pu3 r0 = pu3.a
            int r1 = r7.X
            jue r2 = jue.a
            r3 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r3) goto L_0x000f
            wx3.H(r8)
            goto L_0x005d
        L_0x000f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0017:
            wx3.H(r8)
            kmf r8 = r7.Y
            b0d r8 = r8.G0
            r7.X = r3
            r8.getClass()
            r57 r1 = r57.d
            r1.getClass()
            jnf r3 = defpackage.knf.Companion
            l77 r3 = r3.serializer()
            java.lang.String r4 = r7.Z
            java.lang.Object r1 = r1.a(r3, r4)
            knf r1 = (defpackage.knf) r1
            byte[] r3 = r7.w0
            if (r3 == 0) goto L_0x0048
            java.lang.String r4 = r7.x0
            if (r4 == 0) goto L_0x0048
            java.lang.String r5 = r7.y0
            if (r5 == 0) goto L_0x0048
            hnf r6 = new hnf
            r6.<init>(r4, r5, r3)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            g57 r3 = new g57
            r3.<init>(r1, r6)
            java.lang.Object r8 = r8.X
            us0 r8 = (us0) r8
            java.lang.Object r7 = r8.o(r3, r7)
            if (r7 != r0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r7 = r2
        L_0x005a:
            if (r7 != r0) goto L_0x005d
            return r0
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmf.o(java.lang.Object):java.lang.Object");
    }
}
