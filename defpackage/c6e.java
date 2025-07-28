package defpackage;

/* renamed from: c6e  reason: default package */
public final class c6e implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ h6e c;

    public /* synthetic */ c6e(rj5 rj5, h6e h6e, int i) {
        this.a = i;
        this.b = rj5;
        this.c = h6e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: wve} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: wve} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: wve} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: wve} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x016f;
                case 1: goto L_0x0063;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r14 instanceof defpackage.f6e
            if (r0 == 0) goto L_0x0018
            r0 = r14
            f6e r0 = (defpackage.f6e) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            f6e r0 = new f6e
            r0.<init>(r12, r14)
        L_0x001d:
            java.lang.Object r14 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            wx3.H(r14)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0037:
            rj5 r12 = r0.Y
            wx3.H(r14)
            goto L_0x0054
        L_0x003d:
            wx3.H(r14)
            wve r13 = (defpackage.wve) r13
            rj5 r14 = r12.b
            r0.Y = r14
            r0.X = r4
            h6e r12 = r12.c
            java.lang.Object r12 = defpackage.h6e.b(r12, r13, r0)
            if (r12 != r1) goto L_0x0051
            goto L_0x0062
        L_0x0051:
            r11 = r14
            r14 = r12
            r12 = r11
        L_0x0054:
            r13 = 0
            r0.Y = r13
            r0.X = r3
            java.lang.Object r12 = r12.a(r14, r0)
            if (r12 != r1) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            jue r1 = jue.a
        L_0x0062:
            return r1
        L_0x0063:
            boolean r0 = r14 instanceof defpackage.e6e
            if (r0 == 0) goto L_0x0076
            r0 = r14
            e6e r0 = (defpackage.e6e) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0076
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x007b
        L_0x0076:
            e6e r0 = new e6e
            r0.<init>(r12, r14)
        L_0x007b:
            java.lang.Object r14 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0093
            if (r2 != r3) goto L_0x008b
            wx3.H(r14)
            goto L_0x016c
        L_0x008b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0093:
            wx3.H(r14)
            wve r13 = (defpackage.wve) r13
            h6e r14 = r12.c
            r14.getClass()
            fwe r2 = r13.a
            int r2 = r2.c
            r4 = 3
            if (r2 != r4) goto L_0x00a6
            r4 = r3
            goto L_0x00a7
        L_0x00a6:
            r4 = 0
        L_0x00a7:
            java.lang.String r5 = r14.b
            zpe r14 = r14.a
            java.lang.String r6 = r13.b
            if (r4 != 0) goto L_0x0109
            boolean r4 = defpackage.sxe.a(r2)
            if (r4 == 0) goto L_0x00b6
            goto L_0x0109
        L_0x00b6:
            boolean r2 = defpackage.sxe.b(r2)
            if (r2 == 0) goto L_0x0161
            vve r13 = r13.b()
            java.lang.String r2 = "resizeSticker: path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x00ef }
            udd.p(r5, r2, r4)     // Catch:{ IOException -> 0x00ef }
            java.lang.String r2 = "png"
            t97 r4 = r14.f     // Catch:{ IOException -> 0x00ef }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x00ef }
            bf5 r4 = (defpackage.bf5) r4     // Catch:{ IOException -> 0x00ef }
            java.io.File r2 = r4.a(r2)     // Catch:{ IOException -> 0x00ef }
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00ef }
            boolean r14 = r14.f(r6, r4)     // Catch:{ IOException -> 0x00ef }
            if (r14 == 0) goto L_0x00f1
            java.lang.String r14 = "resizeSticker: resized for path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x00ef }
            udd.p(r5, r14, r4)     // Catch:{ IOException -> 0x00ef }
            java.lang.String r6 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00ef }
            goto L_0x0100
        L_0x00ef:
            r14 = move-exception
            goto L_0x00fb
        L_0x00f1:
            java.lang.String r14 = "resizeSticker: no resize needed for path = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x00ef }
            udd.p(r5, r14, r2)     // Catch:{ IOException -> 0x00ef }
            goto L_0x0100
        L_0x00fb:
            java.lang.String r2 = "resizeSticker: failed"
            udd.s(r5, r2, r14)
        L_0x0100:
            r13.b = r6
            wve r14 = new wve
            r14.<init>(r13)
        L_0x0107:
            r13 = r14
            goto L_0x0161
        L_0x0109:
            vve r13 = r13.b()
            java.lang.String r2 = "resizePhoto: path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x0148 }
            udd.p(r5, r2, r4)     // Catch:{ IOException -> 0x0148 }
            java.lang.String r2 = "jpg"
            t97 r4 = r14.f     // Catch:{ IOException -> 0x0148 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0148 }
            bf5 r4 = (defpackage.bf5) r4     // Catch:{ IOException -> 0x0148 }
            java.io.File r2 = r4.a(r2)     // Catch:{ IOException -> 0x0148 }
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0148 }
            t97 r14 = r14.g     // Catch:{ IOException -> 0x0148 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ IOException -> 0x0148 }
            u98 r14 = (defpackage.u98) r14     // Catch:{ IOException -> 0x0148 }
            xh0 r14 = (defpackage.xh0) r14     // Catch:{ IOException -> 0x0148 }
            xzc r14 = r14.c     // Catch:{ IOException -> 0x0148 }
            boolean r14 = at7.I(r14, r6, r4)     // Catch:{ IOException -> 0x0148 }
            if (r14 == 0) goto L_0x014a
            java.lang.String r14 = "resizePhoto: resized for path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x0148 }
            udd.p(r5, r14, r4)     // Catch:{ IOException -> 0x0148 }
            java.lang.String r6 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0148 }
            goto L_0x0159
        L_0x0148:
            r14 = move-exception
            goto L_0x0154
        L_0x014a:
            java.lang.String r14 = "resizePhoto: no resize needed for path = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x0148 }
            udd.p(r5, r14, r2)     // Catch:{ IOException -> 0x0148 }
            goto L_0x0159
        L_0x0154:
            java.lang.String r2 = "resizePhoto: failed"
            udd.s(r5, r2, r14)
        L_0x0159:
            r13.b = r6
            wve r14 = new wve
            r14.<init>(r13)
            goto L_0x0107
        L_0x0161:
            r0.X = r3
            rj5 r12 = r12.b
            java.lang.Object r12 = r12.a(r13, r0)
            if (r12 != r1) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            jue r1 = jue.a
        L_0x016e:
            return r1
        L_0x016f:
            boolean r0 = r14 instanceof defpackage.b6e
            if (r0 == 0) goto L_0x0182
            r0 = r14
            b6e r0 = (defpackage.b6e) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0182
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0187
        L_0x0182:
            b6e r0 = new b6e
            r0.<init>(r12, r14)
        L_0x0187:
            java.lang.Object r14 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x01aa
            if (r2 == r5) goto L_0x01a3
            if (r2 != r4) goto L_0x019b
            wx3.H(r14)
            goto L_0x0274
        L_0x019b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x01a3:
            rj5 r12 = r0.Y
            wx3.H(r14)
            goto L_0x0269
        L_0x01aa:
            wx3.H(r14)
            rj5 r14 = r12.b
            wve r13 = (defpackage.wve) r13
            h6e r12 = r12.c
            r0.Y = r14
            r0.X = r5
            java.lang.String r2 = r12.b
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x01be
            goto L_0x01d7
        L_0x01be:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x01d7
            tn7 r6 = defpackage.tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "prepareFilesForUpload of upload="
            r7.<init>(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r2, r7, r3)
        L_0x01d7:
            java.lang.String r2 = r13.b
            if (r2 == 0) goto L_0x01fe
            int r2 = r2.length()
            if (r2 != 0) goto L_0x01e2
            goto L_0x01fe
        L_0x01e2:
            java.lang.String r12 = r12.b
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x01ea
            goto L_0x0264
        L_0x01ea:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0264
            tn7 r5 = defpackage.tn7.X
            java.lang.String r6 = r13.b
            java.lang.String r7 = "prepareFilesForUpload: path already prepared="
            java.lang.String r6 = defpackage.rf0.h(r7, r6)
            r2.d(r5, r12, r6, r3)
            goto L_0x0264
        L_0x01fe:
            zpe r2 = r12.a
            fwe r5 = r13.a
            java.lang.String r5 = r5.a
            t97 r2 = r2.g
            java.lang.Object r2 = r2.getValue()
            u98 r2 = (defpackage.u98) r2
            xh0 r2 = (defpackage.xh0) r2
            eq3 r2 = r2.c(r5)
            if (r2 == 0) goto L_0x0286
            long r5 = r2.b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0277
            java.lang.String r5 = r2.e
            if (r5 == 0) goto L_0x023d
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0227
            goto L_0x023d
        L_0x0227:
            vve r12 = r13.b()
            java.lang.String r13 = r2.c
            r12.c = r13
            java.lang.String r13 = r2.e
            r12.b = r13
            long r5 = r2.b
            r12.f = r5
            wve r13 = new wve
            r13.<init>(r12)
            goto L_0x0264
        L_0x023d:
            java.lang.String r5 = r12.b
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0244
            goto L_0x025f
        L_0x0244:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x025f
            tn7 r7 = defpackage.tn7.X
            fwe r8 = r13.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "prepareFilesForUpload: need copy for upload="
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r6.d(r7, r5, r8, r3)
        L_0x025f:
            java.lang.Object r12 = r12.e(r13, r2, r0)
            r13 = r12
        L_0x0264:
            if (r13 != r1) goto L_0x0267
            goto L_0x0276
        L_0x0267:
            r12 = r14
            r14 = r13
        L_0x0269:
            r0.Y = r3
            r0.X = r4
            java.lang.Object r12 = r12.a(r14, r0)
            if (r12 != r1) goto L_0x0274
            goto L_0x0276
        L_0x0274:
            jue r1 = jue.a
        L_0x0276:
            return r1
        L_0x0277:
            java.lang.String r12 = r12.b
            java.lang.String r13 = "ContentUriParams are created with zero length"
            udd.s(r12, r13, r3)
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r13 = "content is zero length"
            r12.<init>(r13)
            throw r12
        L_0x0286:
            java.lang.String r12 = r12.b
            java.lang.String r13 = "ContentUriParams are null during preparing"
            udd.s(r12, r13, r3)
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r13 = "failed to prepare upload files"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6e.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
