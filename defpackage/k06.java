package defpackage;

/* renamed from: k06  reason: default package */
public final class k06 implements iq6 {
    public static final r7e c = new r7e(new fs5(8));
    public static final r7e d = new r7e(new fs5(9));
    public final t97 a;
    public final t97 b;

    public k06(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(p7c r5, java.lang.String r6) {
        /*
            java.util.regex.Pattern r0 = r5.a
            java.util.regex.Matcher r6 = r0.matcher(r6)
            r0 = 0
            boolean r0 = r6.find(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0017
        L_0x0010:
            mn r0 = new mn
            r2 = 21
            r0.<init>(r2, r6)
        L_0x0017:
            if (r0 == 0) goto L_0x0034
            java.lang.Object r6 = r0.c
            nv7 r6 = (nv7) r6
            if (r6 != 0) goto L_0x0026
            nv7 r6 = new nv7
            r6.<init>(r0)
            r0.c = r6
        L_0x0026:
            java.lang.Object r6 = r0.c
            nv7 r6 = (nv7) r6
            if (r6 == 0) goto L_0x0034
            r0 = 1
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0035
        L_0x0034:
            r6 = r1
        L_0x0035:
            if (r6 == 0) goto L_0x0040
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0041
        L_0x0040:
            r6 = r1
        L_0x0041:
            if (r6 == 0) goto L_0x0048
            int r5 = r6.intValue()
            return r5
        L_0x0048:
            java.lang.Class<k06> r6 = defpackage.k06.class
            java.lang.String r6 = r6.getName()
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0053
            goto L_0x006c
        L_0x0053:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x006c
            tn7 r2 = defpackage.tn7.Z
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't determine SVG size by regex "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.d(r2, r6, r5, r1)
        L_0x006c:
            r5 = 100
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k06.b(p7c, java.lang.String):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: kcc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b13 a(ax4 r16, int r17, tjb r18, gq6 r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            t97 r2 = r0.a
            java.lang.Object r2 = r2.getValue()
            g0b r2 = (g0b) r2
            zi5 r2 = r2.b()
            t54 r2 = r2.a(r1)
            java.lang.Object r3 = r2.e0()     // Catch:{ all -> 0x00a1 }
            r4 = r3
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x00a1 }
            int r5 = r4.length     // Catch:{ all -> 0x00a1 }
            r6 = 0
            java.util.Arrays.fill(r4, r6, r5, r6)     // Catch:{ all -> 0x00a1 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x00a1 }
            r4 = r16
            e13 r4 = r4.a     // Catch:{ all -> 0x00a1 }
            e13 r4 = e13.o(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r4 = r4.e0()     // Catch:{ all -> 0x00a1 }
            jl8 r4 = (jl8) r4     // Catch:{ all -> 0x00a1 }
            r4.S(r6, r6, r1, r3)     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00a1 }
            java.nio.charset.Charset r5 = e22.a     // Catch:{ all -> 0x00a1 }
            r4.<init>(r3, r6, r1, r5)     // Catch:{ all -> 0x00a1 }
            r1 = 0
            urd.l(r2, r1)
            r7e r2 = c
            java.lang.Object r2 = r2.getValue()
            p7c r2 = (p7c) r2
            int r13 = b(r2, r4)
            r7e r2 = d
            java.lang.Object r2 = r2.getValue()
            p7c r2 = (p7c) r2
            int r14 = b(r2, r4)
            t97 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            mxa r0 = (mxa) r0
            r2 = r19
            android.graphics.Bitmap$Config r2 = r2.a
            e13 r2 = r0.c(r13, r14, r2)
            java.lang.Object r0 = r2.e0()     // Catch:{ all -> 0x008f }
            r7 = r0
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x008f }
            r7.eraseColor(r6)     // Catch:{ all -> 0x008f }
            int[] r0 = one.me.sdk.uikit.qr.QrCodeGenerator.nativeRenderSvg(r4, r13, r14)     // Catch:{ all -> 0x0074 }
            goto L_0x007b
        L_0x0074:
            r0 = move-exception
            r3 = r0
            kcc r0 = new kcc     // Catch:{ all -> 0x008f }
            r0.<init>(r3)     // Catch:{ all -> 0x008f }
        L_0x007b:
            boolean r3 = r0 instanceof kcc     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0080
            r0 = r1
        L_0x0080:
            r8 = r0
            int[] r8 = (int[]) r8     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008c
            r12 = 0
            r9 = 0
            r11 = 0
            r10 = r13
            r7.setPixels(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x008f }
        L_0x008c:
            r3 = r18
            goto L_0x0092
        L_0x008f:
            r0 = move-exception
            r1 = r0
            goto L_0x009a
        L_0x0092:
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r2, r3, r6)     // Catch:{ all -> 0x008f }
            urd.l(r2, r1)
            return r0
        L_0x009a:
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            r3 = r0
            urd.l(r2, r1)
            throw r3
        L_0x00a1:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            r3 = r0
            urd.l(r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k06.a(ax4, int, tjb, gq6):b13");
    }
}
