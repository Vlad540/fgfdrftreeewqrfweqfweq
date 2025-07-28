package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: we2  reason: default package */
public final class we2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rh8 Y;
    public final /* synthetic */ gf2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public we2(gf2 gf2, rh8 rh8, Continuation continuation) {
        super(2, continuation);
        this.Y = rh8;
        this.Z = gf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new we2(this.Z, this.Y, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: o10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: o10} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r6 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e9, code lost:
        if (r6 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0118, code lost:
        if (r6 == null) goto L_0x013b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r7 = r20
            pu3 r8 = pu3.a
            int r0 = r7.X
            jue r9 = jue.a
            gf2 r10 = r7.Z
            r1 = 3
            r2 = 2
            r3 = 1
            rh8 r4 = r7.Y
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x002c
            if (r0 == r2) goto L_0x0026
            if (r0 != r1) goto L_0x001e
            wx3.H(r21)
            r0 = r21
            goto L_0x0131
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            wx3.H(r21)
            r0 = r21
            goto L_0x0072
        L_0x002c:
            wx3.H(r21)
            goto L_0x0164
        L_0x0031:
            wx3.H(r21)
            boolean r0 = r4 instanceof defpackage.oh8
            if (r0 == 0) goto L_0x0043
            oh8 r4 = (defpackage.oh8) r4
            r7.X = r3
            java.lang.Object r0 = defpackage.gf2.r(r10, r4, r7)
            if (r0 != r8) goto L_0x0164
            return r8
        L_0x0043:
            boolean r0 = r4 instanceof defpackage.ph8
            if (r0 == 0) goto L_0x005e
            ph8 r4 = (defpackage.ph8) r4
            java.lang.CharSequence r0 = r4.Z
            if (r0 != 0) goto L_0x004e
            return r9
        L_0x004e:
            l05 r1 = r10.O0
            ld2 r2 = new ld2
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            defpackage.taf.o(r1, r2)
            goto L_0x0164
        L_0x005e:
            boolean r0 = r4 instanceof defpackage.qh8
            if (r0 == 0) goto L_0x013c
            r0 = r4
            qh8 r0 = (defpackage.qh8) r0
            long r5 = r0.b
            r7.X = r2
            k77[] r0 = defpackage.gf2.V0
            java.lang.Object r0 = r10.y(r5, r7)
            if (r0 != r8) goto L_0x0072
            return r8
        L_0x0072:
            xm8 r0 = (defpackage.xm8) r0
            if (r0 != 0) goto L_0x0077
            return r9
        L_0x0077:
            qh8 r4 = (defpackage.qh8) r4
            int r5 = r4.X
            int r5 = hr1.t(r5)
            r6 = 0
            vo8 r0 = r0.a
            if (r5 == 0) goto L_0x00ec
            if (r5 == r3) goto L_0x00bd
            if (r5 != r2) goto L_0x00b7
            jj7 r0 = r0.D0
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00b6
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r0.next()
            r3 = r2
            o10 r3 = (defpackage.o10) r3
            if (r3 == 0) goto L_0x0096
            a10 r3 = r3.b
            if (r3 == 0) goto L_0x0096
            long r11 = r4.c
            long r13 = r3.w0
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0096
            r6 = r2
        L_0x00b2:
            o10 r6 = (defpackage.o10) r6
            if (r6 != 0) goto L_0x011b
        L_0x00b6:
            return r9
        L_0x00b7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00bd:
            jj7 r0 = r0.D0
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00eb
            java.util.Iterator r0 = r0.iterator()
        L_0x00cb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e7
            java.lang.Object r2 = r0.next()
            r3 = r2
            o10 r3 = (defpackage.o10) r3
            if (r3 == 0) goto L_0x00cb
            n10 r3 = r3.d
            if (r3 == 0) goto L_0x00cb
            long r11 = r4.c
            long r13 = r3.a
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00cb
            r6 = r2
        L_0x00e7:
            o10 r6 = (defpackage.o10) r6
            if (r6 != 0) goto L_0x011b
        L_0x00eb:
            return r9
        L_0x00ec:
            jj7 r0 = r0.D0
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x013b
            java.util.Iterator r0 = r0.iterator()
        L_0x00fa:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r0.next()
            r3 = r2
            o10 r3 = (defpackage.o10) r3
            if (r3 == 0) goto L_0x00fa
            a10 r3 = r3.b
            if (r3 == 0) goto L_0x00fa
            long r11 = r4.c
            long r13 = r3.w0
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00fa
            r6 = r2
        L_0x0116:
            o10 r6 = (defpackage.o10) r6
            if (r6 != 0) goto L_0x011b
            goto L_0x013b
        L_0x011b:
            long r2 = r10.b
            long r4 = r4.b
            r7.X = r1
            r11 = 0
            java.lang.String r6 = r6.q
            r0 = r10
            r1 = r2
            r3 = r6
            r6 = r11
            r7 = r20
            java.lang.Object r0 = r0.z(r1, r3, r4, r6, r7)
            if (r0 != r8) goto L_0x0131
            return r8
        L_0x0131:
            qd2 r0 = (defpackage.qd2) r0
            if (r0 == 0) goto L_0x0164
            l05 r1 = r10.O0
            defpackage.taf.o(r1, r0)
            goto L_0x0164
        L_0x013b:
            return r9
        L_0x013c:
            boolean r0 = r4 instanceof defpackage.jh8
            if (r0 == 0) goto L_0x0165
            k77[] r0 = defpackage.gf2.V0
            t97 r0 = r10.E0
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            sya r11 = (defpackage.sya) r11
            jh8 r4 = (defpackage.jh8) r4
            long r14 = r4.b
            java.lang.String r0 = r4.o
            java.lang.String r1 = r4.X
            java.lang.String r2 = r4.w0
            java.lang.String r3 = r4.Y
            long r12 = r10.b
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r3
            r11.a(r12, r14, r16, r17, r18, r19)
        L_0x0164:
            return r9
        L_0x0165:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we2.o(java.lang.Object):java.lang.Object");
    }
}
