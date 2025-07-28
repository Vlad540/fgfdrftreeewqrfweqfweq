package defpackage;

/* renamed from: ile  reason: default package */
public final class ile {
    public final t97 a;
    public final t97 b;
    public final zpe c;
    public final String d = ile.class.getName();
    public final gxc e;

    public ile(r7e r7e, t97 t97, zpe zpe) {
        this.a = r7e;
        this.b = t97;
        this.c = zpe;
        int i = zc3.$EnumSwitchMapping$0[zpe.c().ordinal()];
        int i2 = (i == 1 || i == 2) ? 10 : 7;
        int i3 = hxc.a;
        this.e = new gxc(i2, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: i26} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(i26 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.gle
            if (r0 == 0) goto L_0x0013
            r0 = r13
            gle r0 = (defpackage.gle) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            gle r0 = new gle
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r6) goto L_0x004e
            if (r2 == r5) goto L_0x003b
            if (r2 == r4) goto L_0x0032
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0032:
            java.lang.Object r11 = r0.o
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            wx3.H(r13)
            goto L_0x00e6
        L_0x003b:
            java.lang.Object r11 = r0.X
            fle r11 = (defpackage.fle) r11
            java.lang.Object r12 = r0.o
            ile r12 = (defpackage.ile) r12
            wx3.H(r13)     // Catch:{ all -> 0x0048 }
            goto L_0x00ca
        L_0x0048:
            r13 = move-exception
            r10 = r13
            r13 = r11
        L_0x004b:
            r11 = r10
            goto L_0x00d2
        L_0x004e:
            java.lang.Object r11 = r0.X
            r12 = r11
            i26 r12 = (i26) r12
            java.lang.Object r11 = r0.o
            ile r11 = (defpackage.ile) r11
            wx3.H(r13)
            goto L_0x0095
        L_0x005b:
            wx3.H(r13)
            java.lang.String r13 = r11.d
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0065
            goto L_0x0086
        L_0x0065:
            boolean r7 = r2.c()
            if (r7 == 0) goto L_0x0086
            tn7 r7 = defpackage.tn7.X
            gxc r8 = r11.e
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = gxc.g
            int r8 = r9.get(r8)
            r9 = 0
            int r8 = java.lang.Math.max(r8, r9)
            java.lang.String r9 = "execute: trying acquire connection, current permits="
            java.lang.String r8 = defpackage.wn6.h(r8, r9)
            r2.d(r7, r13, r8, r3)
        L_0x0086:
            gxc r13 = r11.e
            r0.o = r11
            r0.X = r12
            r0.w0 = r6
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto L_0x0095
            return r1
        L_0x0095:
            fle r13 = new fle
            t97 r2 = r11.a
            t97 r7 = r11.b
            zpe r8 = r11.c
            wd3 r8 = r8.c()
            int[] r9 = defpackage.zc3.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r6) goto L_0x00b5
            if (r8 == r5) goto L_0x00b5
            if (r8 == r4) goto L_0x00b2
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x00b8
        L_0x00b2:
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b8
        L_0x00b5:
            r6 = 32768(0x8000, float:4.5918E-41)
        L_0x00b8:
            r7e r2 = (r7e) r2
            r13.<init>(r2, r7, r6)
            r0.o = r11     // Catch:{ all -> 0x00cd }
            r0.X = r13     // Catch:{ all -> 0x00cd }
            r0.w0 = r5     // Catch:{ all -> 0x00cd }
            java.lang.Object r11 = r12.invoke(r13, r0)     // Catch:{ all -> 0x00cd }
            if (r11 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            jue r11 = jue.a
            return r11
        L_0x00cd:
            r12 = move-exception
            r10 = r12
            r12 = r11
            goto L_0x004b
        L_0x00d2:
            java.lang.String r12 = r12.d
            java.lang.String r2 = "Got error during acquiring connection"
            udd.s(r12, r2, r11)
            r0.o = r11
            r0.X = r3
            r0.w0 = r4
            java.lang.Object r12 = r13.a(r0)
            if (r12 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ile.a(uf5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.fle r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hle
            if (r0 == 0) goto L_0x0013
            r0 = r6
            hle r0 = (defpackage.hle) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            hle r0 = new hle
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            ile r4 = r0.o
            wx3.H(r6)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r6)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            gxc r4 = r4.e
            r4.c()
            jue r4 = jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ile.b(fle, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
