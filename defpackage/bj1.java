package defpackage;

/* renamed from: bj1  reason: default package */
public final class bj1 implements kz6 {
    public final boolean a;

    public bj1(boolean z) {
        this.a = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        if ("close".equalsIgnoreCase(r2) != false) goto L_0x014b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xbc a(defpackage.e1c r16) {
        /*
            r15 = this;
            r0 = r16
            java.lang.Object r1 = r0.i
            lac r1 = (defpackage.lac) r1
            d8 r2 = r1.e
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r0.h
            r5 = r0
            pd r5 = (pd) r5
            java.lang.Object r0 = r5.o
            r6 = r0
            j06 r6 = (defpackage.j06) r6
            java.lang.Object r0 = r5.Y
            m15 r0 = (defpackage.m15) r0
            r6.getClass()     // Catch:{ IOException -> 0x019b }
            r0.g(r1)     // Catch:{ IOException -> 0x019b }
            java.lang.String r7 = r1.c
            boolean r7 = defpackage.ez3.S(r7)
            r8 = 1
            r9 = 0
            java.lang.Object r11 = r5.c
            y0c r11 = (defpackage.y0c) r11
            java.lang.Object r12 = r5.o
            j06 r12 = (defpackage.j06) r12
            java.lang.Object r13 = r5.b
            c1c r13 = (defpackage.c1c) r13
            if (r7 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0096
            ye6 r7 = r1.d
            java.lang.String r14 = "Expect"
            java.lang.String r7 = r7.a(r14)
            java.lang.String r14 = "100-continue"
            boolean r7 = r14.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x005d
            r0.h()     // Catch:{ IOException -> 0x0054 }
            wbc r7 = r5.e(r8)
            r12.getClass()
            r14 = r9
            goto L_0x005f
        L_0x0054:
            r0 = move-exception
            r1 = r0
            r12.getClass()
            r5.g(r1)
            throw r1
        L_0x005d:
            r14 = r8
            r7 = 0
        L_0x005f:
            if (r7 != 0) goto L_0x0081
            r5.a = r9
            d8 r8 = r1.e
            long r9 = r8.h()
            r12.getClass()
            fjd r8 = r0.c(r1, r9)
            k15 r11 = new k15
            r11.<init>(r5, r8, r9)
            u0c r8 = new u0c
            r8.<init>(r11)
            r2.J(r8)
            r8.close()
            goto L_0x0092
        L_0x0081:
            r2 = r9
            r9 = 0
            r11.i(r5, r8, r2, r9)
            gl6 r2 = r13.f
            if (r2 == 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            c1c r2 = r0.f()
            r2.k()
        L_0x0092:
            r8 = r14
            r2 = 0
            r9 = 0
            goto L_0x009c
        L_0x0096:
            r2 = r9
            r9 = 0
            r11.i(r5, r8, r2, r9)
            r7 = r9
        L_0x009c:
            r0.b()     // Catch:{ IOException -> 0x0192 }
            if (r7 != 0) goto L_0x00ac
            wbc r7 = r5.e(r2)
            if (r8 == 0) goto L_0x00ac
            r12.getClass()
            r2 = 0
            goto L_0x00ad
        L_0x00ac:
            r2 = r8
        L_0x00ad:
            r7.a = r1
            be6 r8 = r13.d
            r7.e = r8
            r7.k = r3
            long r10 = java.lang.System.currentTimeMillis()
            r7.l = r10
            xbc r7 = r7.a()
            r8 = 100
            int r10 = r7.o
            if (r10 != r8) goto L_0x00e3
            r8 = 0
            wbc r7 = r5.e(r8)
            if (r2 == 0) goto L_0x00cf
            r12.getClass()
        L_0x00cf:
            r7.a = r1
            be6 r1 = r13.d
            r7.e = r1
            r7.k = r3
            long r1 = java.lang.System.currentTimeMillis()
            r7.l = r1
            xbc r7 = r7.a()
            int r10 = r7.o
        L_0x00e3:
            r6.getClass()
            r1 = r15
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x00fc
            r1 = 101(0x65, float:1.42E-43)
            if (r10 != r1) goto L_0x00fc
            wbc r1 = r7.n()
            f1c r2 = defpackage.nze.c
            r1.g = r2
            xbc r1 = r1.a()
            goto L_0x0129
        L_0x00fc:
            wbc r1 = r7.n()
            java.lang.String r2 = "Content-Type"
            ye6 r3 = r7.Y     // Catch:{ IOException -> 0x018d }
            java.lang.String r2 = r3.a(r2)     // Catch:{ IOException -> 0x018d }
            if (r2 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r2 = r9
        L_0x010c:
            long r3 = r0.d(r7)     // Catch:{ IOException -> 0x018d }
            tld r6 = r0.a(r7)     // Catch:{ IOException -> 0x018d }
            l15 r7 = new l15     // Catch:{ IOException -> 0x018d }
            r7.<init>(r5, r6, r3)     // Catch:{ IOException -> 0x018d }
            f1c r6 = new f1c     // Catch:{ IOException -> 0x018d }
            v0c r8 = new v0c     // Catch:{ IOException -> 0x018d }
            r8.<init>(r7)     // Catch:{ IOException -> 0x018d }
            r6.<init>((java.lang.String) r2, (long) r3, (defpackage.v0c) r8)     // Catch:{ IOException -> 0x018d }
            r1.g = r6
            xbc r1 = r1.a()
        L_0x0129:
            lac r2 = r1.a
            ye6 r2 = r2.d
            java.lang.String r3 = "Connection"
            java.lang.String r2 = r2.a(r3)
            java.lang.String r4 = "close"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x014b
            ye6 r2 = r1.Y
            java.lang.String r2 = r2.a(r3)
            if (r2 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r2 = r9
        L_0x0145:
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0152
        L_0x014b:
            c1c r0 = r0.f()
            r0.k()
        L_0x0152:
            r0 = 204(0xcc, float:2.86E-43)
            if (r10 == r0) goto L_0x015a
            r0 = 205(0xcd, float:2.87E-43)
            if (r10 != r0) goto L_0x018c
        L_0x015a:
            f1c r0 = r1.Z
            if (r0 == 0) goto L_0x0163
            long r2 = r0.n()
            goto L_0x0165
        L_0x0163:
            r2 = -1
        L_0x0165:
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x018c
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "HTTP "
            java.lang.String r3 = " had non-zero Content-Length: "
            java.lang.StringBuilder r2 = me4.m(r10, r2, r3)
            if (r0 == 0) goto L_0x0180
            long r3 = r0.n()
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            goto L_0x0181
        L_0x0180:
            r10 = r9
        L_0x0181:
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x018c:
            return r1
        L_0x018d:
            r0 = move-exception
            r5.g(r0)
            throw r0
        L_0x0192:
            r0 = move-exception
            r1 = r0
            r6.getClass()
            r5.g(r1)
            throw r1
        L_0x019b:
            r0 = move-exception
            r6.getClass()
            r5.g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj1.a(e1c):xbc");
    }
}
