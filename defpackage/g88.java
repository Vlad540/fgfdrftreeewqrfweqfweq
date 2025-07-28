package defpackage;

/* renamed from: g88  reason: default package */
public final /* synthetic */ class g88 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ g88(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.Y = obj4;
        this.b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135 A[SYNTHETIC, Splitter:B:57:0x0135] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x0139;
                case 1: goto L_0x00cc;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.o
            ol r0 = (ol) r0
            java.lang.Object r1 = r13.Y
            qce r1 = (qce) r1
            java.lang.Object r2 = r13.c
            ybe r2 = (ybe) r2
            r2.getClass()
            java.lang.String r3 = "app.exception"
            java.lang.String r4 = "getRequest is null "
            r5 = 0
            t97 r6 = r2.E0     // Catch:{ Exception -> 0x005c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x005c }
            pl r6 = (pl) r6     // Catch:{ Exception -> 0x005c }
            r0.c = r6     // Catch:{ Exception -> 0x005c }
            ibe r8 = r0.s()     // Catch:{ Exception -> 0x005c }
            if (r8 == 0) goto L_0x007c
            ibe r4 = r0.s()     // Catch:{ Exception -> 0x005c }
            long r10 = r2.d(r4)     // Catch:{ Exception -> 0x005c }
            boolean r4 = r13.b
            java.lang.Object r13 = r13.X
            r12 = r13
            iae r12 = (iae) r12
            t97 r13 = r2.B0
            if (r4 == 0) goto L_0x005e
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x005c }
            dce r13 = (dce) r13     // Catch:{ Exception -> 0x005c }
            java.util.concurrent.atomic.AtomicReference r4 = r13.Z     // Catch:{ Exception -> 0x005c }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x005c }
            r7 = r4
            u1d r7 = (u1d) r7     // Catch:{ Exception -> 0x005c }
            if (r7 != 0) goto L_0x004f
            goto L_0x00cb
        L_0x004f:
            boolean r13 = r13.e(r8, r12)     // Catch:{ Exception -> 0x005c }
            if (r13 == 0) goto L_0x0057
            goto L_0x00cb
        L_0x0057:
            r9 = 1
            r7.g(r8, r9, r10, r12)     // Catch:{ Exception -> 0x005c }
            goto L_0x00cb
        L_0x005c:
            r13 = move-exception
            goto L_0x00aa
        L_0x005e:
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x005c }
            dce r13 = (dce) r13     // Catch:{ Exception -> 0x005c }
            java.util.concurrent.atomic.AtomicReference r4 = r13.Z     // Catch:{ Exception -> 0x005c }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x005c }
            r7 = r4
            u1d r7 = (u1d) r7     // Catch:{ Exception -> 0x005c }
            if (r7 != 0) goto L_0x0070
            goto L_0x00cb
        L_0x0070:
            boolean r13 = r13.e(r8, r12)     // Catch:{ Exception -> 0x005c }
            if (r13 == 0) goto L_0x0077
            goto L_0x00cb
        L_0x0077:
            r9 = 0
            r7.g(r8, r9, r10, r12)     // Catch:{ Exception -> 0x005c }
            goto L_0x00cb
        L_0x007c:
            java.lang.Class r13 = r0.getClass()     // Catch:{ Exception -> 0x005c }
            java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x005c }
            java.lang.String r13 = r4.concat(r13)     // Catch:{ Exception -> 0x005c }
            uae r4 = new uae     // Catch:{ Exception -> 0x005c }
            r4.<init>(r3, r13, r5)     // Catch:{ Exception -> 0x005c }
            r2.f(r0, r4)     // Catch:{ Exception -> 0x005c }
            pce r6 = r1.b()     // Catch:{ Exception -> 0x005c }
            rbe r7 = new rbe     // Catch:{ Exception -> 0x005c }
            r8 = 0
            r7.<init>(r1, r4, r8)     // Catch:{ Exception -> 0x005c }
            r6.a(r7)     // Catch:{ Exception -> 0x005c }
            java.lang.String r4 = ybe.F0     // Catch:{ Exception -> 0x005c }
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x005c }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r7, r6)     // Catch:{ Exception -> 0x005c }
            defpackage.udd.R(r4, r5, r13, r6)     // Catch:{ Exception -> 0x005c }
            goto L_0x00cb
        L_0x00aa:
            uae r4 = new uae
            java.lang.String r6 = r13.getMessage()
            r4.<init>(r3, r6, r5)
            r2.f(r0, r4)
            pce r0 = r1.b()
            rbe r3 = new rbe
            r5 = 1
            r3.<init>(r1, r4, r5)
            r0.a(r3)
            g15 r0 = r2.x0
            r4a r0 = (defpackage.r4a) r0
            r1 = 1
            r0.c(r13, r1)
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.Object r0 = r13.X
            r2 = r0
            pd8 r2 = (defpackage.pd8) r2
            java.lang.Object r0 = r13.Y
            md3 r0 = (defpackage.md3) r0
            boolean r5 = r13.b
            java.lang.Object r1 = r13.c
            ud8 r1 = (defpackage.ud8) r1
            java.util.Set r3 = r1.f
            java.lang.Object r13 = r13.o
            hn6 r13 = (defpackage.hn6) r13
            r3.remove(r13)
            r8 = 0
            r9 = 1
            java.lang.ref.WeakReference r1 = r1.c     // Catch:{ all -> 0x0127 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0127 }
            r10 = r1
            vd8 r10 = (defpackage.vd8) r10     // Catch:{ all -> 0x0127 }
            if (r10 != 0) goto L_0x00f5
        L_0x00f1:
            r13.c(r8)     // Catch:{ RemoteException -> 0x0132 }
            goto L_0x0132
        L_0x00f5:
            ic8 r11 = new ic8     // Catch:{ all -> 0x0127 }
            int r3 = r0.a     // Catch:{ all -> 0x0127 }
            int r4 = r0.b     // Catch:{ all -> 0x0127 }
            ie8 r6 = new ie8     // Catch:{ all -> 0x0127 }
            r6.<init>(r13)     // Catch:{ all -> 0x0127 }
            android.os.Bundle r7 = r0.e     // Catch:{ all -> 0x0127 }
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0127 }
            r0 = r10
            one.me.android.media.service.OneMeMediaSessionService r0 = (one.me.android.media.service.OneMeMediaSessionService) r0     // Catch:{ Exception -> 0x0129 }
            java.lang.String r1 = "OneMeMediaSessionService"
            java.lang.String r2 = "onGetSession"
            defpackage.udd.p(r1, r2, new java.lang.Object[0])     // Catch:{ Exception -> 0x0129 }
            kc8 r0 = r0.w0     // Catch:{ Exception -> 0x0129 }
            if (r0 != 0) goto L_0x0115
            goto L_0x00f1
        L_0x0115:
            r10.a(r0)     // Catch:{ Exception -> 0x0129 }
            cd8 r0 = r0.a     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            me8 r0 = r0.g     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r0.k(r13, r11)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r9 = r8
            goto L_0x012f
        L_0x0121:
            r0 = move-exception
            r9 = r8
            goto L_0x0133
        L_0x0124:
            r0 = move-exception
            r9 = r8
            goto L_0x012a
        L_0x0127:
            r0 = move-exception
            goto L_0x0133
        L_0x0129:
            r0 = move-exception
        L_0x012a:
            java.lang.String r1 = "Failed to add a session to session service"
            defpackage.ez3.k0(r1, r0)     // Catch:{ all -> 0x0127 }
        L_0x012f:
            if (r9 == 0) goto L_0x0132
            goto L_0x00f1
        L_0x0132:
            return
        L_0x0133:
            if (r9 == 0) goto L_0x0138
            r13.c(r8)     // Catch:{ RemoteException -> 0x0138 }
        L_0x0138:
            throw r0
        L_0x0139:
            java.lang.Object r0 = r13.c
            ue r0 = (defpackage.ue) r0
            java.lang.Object r1 = r0.e
            og0 r1 = (defpackage.og0) r1
            java.lang.Object r2 = r0.d
            e88 r2 = (defpackage.e88) r2
            i94 r2 = (defpackage.i94) r2
            java.lang.Object r3 = r13.X
            ws6 r3 = (defpackage.ws6) r3
            java.lang.Object r4 = r13.Y
            ph0 r4 = (ph0) r4
            java.lang.Object r5 = r13.o
            kc8 r5 = (defpackage.kc8) r5
            og0 r1 = r2.a(r5, r3, r1, r4)
            se5 r2 = new se5
            boolean r13 = r13.b
            r2.<init>(r0, r5, r1, r13)
            java.lang.Object r13 = r0.g
            y44 r13 = (defpackage.y44) r13
            r13.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.run():void");
    }

    public /* synthetic */ g88(ybe ybe, ol olVar, boolean z, it4 it4, qce qce) {
        this.a = 2;
        this.c = ybe;
        this.o = olVar;
        this.b = z;
        this.X = it4;
        this.Y = qce;
    }
}
