package defpackage;

/* renamed from: q4b  reason: default package */
public final /* synthetic */ class q4b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4b b;
    public final /* synthetic */ ja0 c;

    public /* synthetic */ q4b(r4b r4b, ja0 ja0, int i) {
        this.a = i;
        this.b = r4b;
        this.c = ja0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0177 A[SYNTHETIC, Splitter:B:65:0x0177] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0067;
                default: goto L_0x0007;
            }
        L_0x0007:
            r4b r1 = r0.b
            r1.getClass()
            ja0 r0 = r0.c
            s4b r2 = r0.a
            r2.getClass()     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            lr6 r0 = r1.b(r0)     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            vd6 r1 = pa2.A()     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            hg9 r3 = new hg9     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            r4 = 19
            r3.<init>(r2, r4, r0)     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            r1.execute(r3)     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            goto L_0x0066
        L_0x0026:
            r0 = move-exception
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            goto L_0x0042
        L_0x002a:
            r0 = move-exception
            goto L_0x0058
        L_0x002c:
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed."
            r1.<init>(r3, r0)
            vd6 r0 = pa2.A()
            hg9 r3 = new hg9
            r4 = 21
            r3.<init>(r2, r4, r1)
            r0.execute(r3)
            goto L_0x0066
        L_0x0042:
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed due to low memory."
            r1.<init>(r3, r0)
            vd6 r0 = pa2.A()
            hg9 r3 = new hg9
            r4 = 21
            r3.<init>(r2, r4, r1)
            r0.execute(r3)
            goto L_0x0066
        L_0x0058:
            vd6 r1 = pa2.A()
            hg9 r3 = new hg9
            r4 = 21
            r3.<init>(r2, r4, r0)
            r1.execute(r3)
        L_0x0066:
            return
        L_0x0067:
            r4b r1 = r0.b
            ia0 r2 = r1.b
            int r2 = r2.d
            r3 = 1
            r4 = 0
            r5 = 256(0x100, float:3.59E-43)
            r6 = 35
            if (r2 == r6) goto L_0x007a
            if (r2 != r5) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r7 = r4
            goto L_0x007b
        L_0x007a:
            r7 = r3
        L_0x007b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Postview only support YUV and JPEG output formats. Output format: "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            defpackage.e07.j(r2, r7)
            ja0 r2 = r0.c
            s4b r0 = r2.a
            m54 r7 = r1.c     // Catch:{ Exception -> 0x017b }
            java.lang.Object r7 = r7.e(r2)     // Catch:{ Exception -> 0x017b }
            ea0 r7 = (defpackage.ea0) r7     // Catch:{ Exception -> 0x017b }
            int r8 = r7.c     // Catch:{ Exception -> 0x017b }
            xhd r1 = r1.i     // Catch:{ Exception -> 0x017b }
            r1.getClass()     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = "Can't convert "
            java.lang.String r9 = "Invalid postview image format : "
            r10 = 0
            java.lang.Object r11 = r7.a     // Catch:{ Exception -> 0x017b }
            int r7 = r7.f     // Catch:{ Exception -> 0x017b }
            if (r8 != r6) goto L_0x010b
            lr6 r11 = (defpackage.lr6) r11     // Catch:{ UnsupportedOperationException -> 0x00bd }
            int r5 = r7 % 180
            if (r5 == 0) goto L_0x00b2
            r5 = r3
            goto L_0x00b3
        L_0x00b2:
            r5 = r4
        L_0x00b3:
            if (r5 == 0) goto L_0x00c0
            int r9 = r11.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            goto L_0x00c4
        L_0x00ba:
            r0 = move-exception
            goto L_0x0175
        L_0x00bd:
            r0 = move-exception
            goto L_0x0157
        L_0x00c0:
            int r9 = r11.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00bd }
        L_0x00c4:
            if (r5 == 0) goto L_0x00cb
            int r5 = r11.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            goto L_0x00cf
        L_0x00cb:
            int r5 = r11.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00bd }
        L_0x00cf:
            yic r12 = new yic     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r13 = 2
            ud r3 = x87.n(r9, r5, r3, r13)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r12.<init>(r3)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            int r3 = r11.getWidth()     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            int r5 = r11.getHeight()     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            int r3 = r3 * r5
            int r3 = r3 * 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            pp6 r3 = androidx.camera.core.ImageProcessingUtil.c(r11, r12, r3, r7, r4)     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            r11.close()     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            if (r3 == 0) goto L_0x0103
            android.graphics.Bitmap r4 = defpackage.am7.h(r3)     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            r3.close()     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            r10 = r12
            goto L_0x0131
        L_0x00fa:
            r10 = r12
            goto L_0x0175
        L_0x00fd:
            r10 = r12
            goto L_0x0157
        L_0x00ff:
            r0 = move-exception
            goto L_0x00fa
        L_0x0101:
            r0 = move-exception
            goto L_0x00fd
        L_0x0103:
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            java.lang.String r3 = "Can't covert YUV to RGB"
            r0.<init>(r3, r10)     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0101, all -> 0x00ff }
        L_0x010b:
            if (r8 != r5) goto L_0x0145
            lr6 r11 = (defpackage.lr6) r11     // Catch:{ UnsupportedOperationException -> 0x00bd }
            android.graphics.Bitmap r12 = defpackage.am7.h(r11)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r11.close()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            float r4 = (float) r7     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r3.postRotate(r4)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            int r15 = r12.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            int r16 = r12.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r13 = 0
            r14 = 0
            r18 = 1
            r17 = r3
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ UnsupportedOperationException -> 0x00bd }
        L_0x0131:
            if (r10 == 0) goto L_0x0136
            r10.close()     // Catch:{ Exception -> 0x017b }
        L_0x0136:
            vd6 r1 = pa2.A()     // Catch:{ Exception -> 0x017b }
            hg9 r3 = new hg9     // Catch:{ Exception -> 0x017b }
            r5 = 20
            r3.<init>(r0, r5, r4)     // Catch:{ Exception -> 0x017b }
            r1.execute(r3)     // Catch:{ Exception -> 0x017b }
            goto L_0x0180
        L_0x0145:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ UnsupportedOperationException -> 0x00bd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r3.<init>(r9)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r3.append(r8)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            java.lang.String r3 = r3.toString()     // Catch:{ UnsupportedOperationException -> 0x00bd }
            r0.<init>(r3)     // Catch:{ UnsupportedOperationException -> 0x00bd }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x00bd }
        L_0x0157:
            if (r8 != r6) goto L_0x015c
            java.lang.String r3 = "YUV"
            goto L_0x015e
        L_0x015c:
            java.lang.String r3 = "JPEG"
        L_0x015e:
            androidx.camera.core.ImageCaptureException r4 = new androidx.camera.core.ImageCaptureException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r5.<init>(r1)     // Catch:{ all -> 0x00ba }
            r5.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = " to bitmap"
            r5.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x0175:
            if (r10 == 0) goto L_0x017a
            r10.close()     // Catch:{ Exception -> 0x017b }
        L_0x017a:
            throw r0     // Catch:{ Exception -> 0x017b }
        L_0x017b:
            lr6 r0 = r2.b
            r0.close()
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4b.run():void");
    }
}
