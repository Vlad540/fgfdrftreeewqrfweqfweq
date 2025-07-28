package defpackage;

/* renamed from: nv0  reason: default package */
public final class nv0 implements kz6 {
    public static final nv0 b = new nv0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ nv0(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [pd, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0180, code lost:
        if (defpackage.p0e.Q(r3, "1", false) != false) goto L_0x0182;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xbc a(defpackage.e1c r17) {
        /*
            r16 = this;
            r0 = r17
            r1 = 6
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = r16
            int r5 = r5.a
            switch(r5) {
                case 0: goto L_0x00c1;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r1 = r0.f
            y0c r1 = (defpackage.y0c) r1
            monitor-enter(r1)
            boolean r5 = r1.A0     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x00b3
            boolean r5 = r1.z0     // Catch:{ all -> 0x00a5 }
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x00a7
            boolean r5 = r1.y0     // Catch:{ all -> 0x00a5 }
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x0099
            monitor-exit(r1)
            n15 r5 = r1.Y
            qw9 r13 = r1.E0
            r5.getClass()
            int r7 = r0.c     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            int r8 = r0.d     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            int r9 = r0.e     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            int r10 = r13.P0     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            boolean r11 = r13.Y     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            java.lang.Object r6 = r0.i     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            lac r6 = (defpackage.lac) r6     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            java.lang.String r6 = r6.c     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            java.lang.String r12 = "GET"
            boolean r6 = defpackage.hhd.f(r6, r12)     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            r12 = r6 ^ 1
            r6 = r5
            c1c r6 = r6.a(r7, r8, r9, r10, r11, r12)     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            m15 r6 = r6.j(r13, r0)     // Catch:{ RouteException -> 0x0088, IOException -> 0x0086 }
            pd r7 = new pd
            j06 r8 = defpackage.j06.o
            r7.<init>()
            r7.c = r1
            r7.o = r8
            r7.X = r5
            r7.Y = r6
            c1c r5 = r6.f()
            r7.b = r5
            r1.x0 = r7
            r1.C0 = r7
            monitor-enter(r1)
            r1.y0 = r3     // Catch:{ all -> 0x0083 }
            r1.z0 = r3     // Catch:{ all -> 0x0083 }
            monitor-exit(r1)
            boolean r1 = r1.B0
            if (r1 != 0) goto L_0x007b
            r1 = 61
            e1c r1 = defpackage.e1c.c(r0, r4, r7, r2, r1)
            java.lang.Object r0 = r0.i
            lac r0 = (defpackage.lac) r0
            xbc r0 = r1.d(r0)
            return r0
        L_0x007b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0086:
            r0 = move-exception
            goto L_0x008a
        L_0x0088:
            r0 = move-exception
            goto L_0x0093
        L_0x008a:
            r5.b(r0)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x0093:
            java.io.IOException r1 = r0.a
            r5.b(r1)
            throw r0
        L_0x0099:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            goto L_0x00bf
        L_0x00a7:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00b3:
            java.lang.String r0 = "released"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00bf:
            monitor-exit(r1)
            throw r0
        L_0x00c1:
            java.lang.System.currentTimeMillis()
            b2b r5 = new b2b
            java.lang.Object r6 = r0.i
            lac r6 = (defpackage.lac) r6
            r5.<init>(r6, r2, r4, r1)
            if (r6 == 0) goto L_0x00e6
            dv0 r7 = r6.a
            if (r7 != 0) goto L_0x00dd
            int r7 = defpackage.dv0.n
            ye6 r7 = r6.d
            dv0 r7 = defpackage.udd.L(r7)
            r6.a = r7
        L_0x00dd:
            boolean r7 = r7.j
            if (r7 == 0) goto L_0x00e6
            b2b r5 = new b2b
            r5.<init>(r2, r2, r4, r1)
        L_0x00e6:
            java.lang.Object r1 = r0.f
            y0c r1 = (defpackage.y0c) r1
            boolean r7 = r1 instanceof defpackage.y0c
            if (r7 != 0) goto L_0x00ef
            r1 = r2
        L_0x00ef:
            if (r1 == 0) goto L_0x00f3
            j06 r1 = r1.b
        L_0x00f3:
            java.lang.Object r1 = r5.b
            lac r1 = (defpackage.lac) r1
            java.lang.Object r5 = r5.c
            xbc r5 = (defpackage.xbc) r5
            if (r1 != 0) goto L_0x0126
            if (r5 != 0) goto L_0x0126
            wbc r0 = new wbc
            r0.<init>()
            r0.a = r6
            vhb r1 = defpackage.vhb.HTTP_1_1
            r0.b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.d = r1
            f1c r1 = defpackage.nze.c
            r0.g = r1
            r1 = -1
            r0.k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.l = r1
            xbc r0 = r0.a()
            goto L_0x0258
        L_0x0126:
            java.lang.String r6 = "cacheResponse"
            if (r1 != 0) goto L_0x013d
            wbc r0 = r5.n()
            xbc r1 = defpackage.gk9.c(r5)
            defpackage.wbc.b(r1, r6)
            r0.i = r1
            xbc r0 = r0.a()
            goto L_0x0258
        L_0x013d:
            xbc r0 = r0.d(r1)
            java.lang.String r1 = "networkResponse"
            if (r5 == 0) goto L_0x023e
            r7 = 304(0x130, float:4.26E-43)
            int r8 = r0.o
            if (r8 != r7) goto L_0x0237
            wbc r7 = r5.n()
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 20
            r8.<init>(r9)
            ye6 r9 = r5.Y
            int r10 = r9.size()
            r11 = r4
        L_0x015d:
            java.lang.String r12 = "Content-Type"
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r14 = "Content-Length"
            ye6 r15 = r0.Y
            if (r11 >= r10) goto L_0x01bb
            java.lang.String r2 = r9.b(r11)
            java.lang.String r3 = r9.d(r11)
            java.lang.String r4 = "Warning"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0184
            java.lang.String r4 = "1"
            r16 = r9
            r9 = 0
            boolean r4 = defpackage.p0e.Q(r3, r4, r9)
            if (r4 == 0) goto L_0x0186
        L_0x0182:
            r2 = 1
            goto L_0x01b4
        L_0x0184:
            r16 = r9
        L_0x0186:
            boolean r4 = r14.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x01a5
            boolean r4 = r13.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x01a5
            boolean r4 = r12.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0199
            goto L_0x01a5
        L_0x0199:
            boolean r4 = defpackage.gk9.g(r2)
            if (r4 == 0) goto L_0x01a5
            java.lang.String r4 = r15.a(r2)
            if (r4 != 0) goto L_0x0182
        L_0x01a5:
            r8.add(r2)
            java.lang.CharSequence r2 = defpackage.h0e.B0(r3)
            java.lang.String r2 = r2.toString()
            r8.add(r2)
            goto L_0x0182
        L_0x01b4:
            int r11 = r11 + r2
            r9 = r16
            r3 = r2
            r2 = 0
            r4 = 0
            goto L_0x015d
        L_0x01bb:
            int r2 = r15.size()
            r9 = 0
        L_0x01c0:
            if (r9 >= r2) goto L_0x01f4
            java.lang.String r3 = r15.b(r9)
            boolean r4 = r14.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x01f1
            boolean r4 = r13.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x01f1
            boolean r4 = r12.equalsIgnoreCase(r3)
            if (r4 == 0) goto L_0x01d9
            goto L_0x01f1
        L_0x01d9:
            boolean r4 = defpackage.gk9.g(r3)
            if (r4 == 0) goto L_0x01f1
            java.lang.String r4 = r15.d(r9)
            r8.add(r3)
            java.lang.CharSequence r3 = defpackage.h0e.B0(r4)
            java.lang.String r3 = r3.toString()
            r8.add(r3)
        L_0x01f1:
            r3 = 1
            int r9 = r9 + r3
            goto L_0x01c0
        L_0x01f4:
            r4 = 0
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object[] r2 = r8.toArray(r2)
            if (r2 == 0) goto L_0x022f
            java.lang.String[] r2 = (java.lang.String[]) r2
            xe6 r3 = new xe6
            r3.<init>((int) r4)
            java.util.ArrayList r4 = r3.a
            defpackage.u23.M(r4, r2)
            r7.f = r3
            long r2 = r0.z0
            r7.k = r2
            long r2 = r0.A0
            r7.l = r2
            xbc r2 = defpackage.gk9.c(r5)
            defpackage.wbc.b(r2, r6)
            r7.i = r2
            xbc r2 = defpackage.gk9.c(r0)
            defpackage.wbc.b(r2, r1)
            r7.h = r2
            r7.a()
            f1c r0 = r0.Z
            r0.close()
            r0 = 0
            throw r0
        L_0x022f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x0237:
            f1c r2 = r5.Z
            if (r2 == 0) goto L_0x023e
            defpackage.nze.c(r2)
        L_0x023e:
            wbc r2 = r0.n()
            xbc r3 = defpackage.gk9.c(r5)
            defpackage.wbc.b(r3, r6)
            r2.i = r3
            xbc r0 = defpackage.gk9.c(r0)
            defpackage.wbc.b(r0, r1)
            r2.h = r0
            xbc r0 = r2.a()
        L_0x0258:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv0.a(e1c):xbc");
    }
}
