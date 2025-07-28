package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sva  reason: default package */
public final class sva extends l5e implements i26 {
    public i22 X;
    public long Y;
    public long Z;
    public int w0;
    public final /* synthetic */ tva x0;
    public final /* synthetic */ int y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sva(tva tva, int i, Continuation continuation) {
        super(2, continuation);
        this.x0 = tva;
        this.y0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sva(this.x0, this.y0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: i22} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r6 = r25
            pu3 r7 = pu3.a
            int r0 = r6.w0
            jue r8 = jue.a
            r9 = 2
            r1 = 1
            tva r10 = r6.x0
            if (r0 == 0) goto L_0x002f
            if (r0 == r1) goto L_0x001f
            if (r0 != r9) goto L_0x0017
            wx3.H(r26)
            goto L_0x008a
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            long r0 = r6.Z
            long r2 = r6.Y
            i22 r4 = r6.X
            wx3.H(r26)
            r22 = r0
            r20 = r2
            r19 = r4
            goto L_0x0065
        L_0x002f:
            wx3.H(r26)
            zqd r0 = r10.a
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            i22 r11 = (defpackage.i22) r11
            if (r11 != 0) goto L_0x003e
            return r8
        L_0x003e:
            o62 r0 = r11.b
            long r12 = r0.a
            xm8 r0 = r11.X
            if (r0 == 0) goto L_0x008a
            vo8 r0 = r0.a
            long r14 = r0.b
            r6.X = r11
            r6.Y = r12
            r6.Z = r14
            r6.w0 = r1
            long r1 = r11.a
            kp2 r0 = r10.c
            r3 = r12
            r5 = r25
            r0.a(r1, r3, r5)
            if (r8 != r7) goto L_0x005f
            return r7
        L_0x005f:
            r19 = r11
            r20 = r12
            r22 = r14
        L_0x0065:
            pae r0 = r10.b
            n3a r0 = (n3a) r0
            zr7 r0 = r0.c()
            rva r1 = new rva
            r24 = 0
            tva r2 = r6.x0
            int r3 = r6.y0
            r16 = r1
            r17 = r2
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r22, r24)
            r2 = 0
            r6.X = r2
            r6.w0 = r9
            java.lang.Object r0 = xs7.U(r0, r1, r6)
            if (r0 != r7) goto L_0x008a
            return r7
        L_0x008a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sva.o(java.lang.Object):java.lang.Object");
    }
}
