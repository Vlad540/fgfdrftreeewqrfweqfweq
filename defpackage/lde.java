package defpackage;

/* renamed from: lde  reason: default package */
public final class lde implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ lde(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x027b;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01ea;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01a7;
                case 5: goto L_0x019f;
                case 6: goto L_0x0186;
                case 7: goto L_0x017d;
                case 8: goto L_0x0171;
                case 9: goto L_0x015c;
                case 10: goto L_0x013a;
                case 11: goto L_0x0116;
                case 12: goto L_0x010e;
                case 13: goto L_0x00f2;
                case 14: goto L_0x00e2;
                case 15: goto L_0x00e0;
                case 16: goto L_0x00af;
                case 17: goto L_0x00a0;
                case 18: goto L_0x0085;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r8.b
            w4g r8 = (defpackage.w4g) r8
            java.lang.Object r0 = r8.b
            android.content.Context r0 = (android.content.Context) r0
            android.content.SharedPreferences r0 = defpackage.w4g.y(r0)
            java.lang.String r1 = "app_set_id_last_used_time"
            r2 = -1
            long r4 = r0.getLong(r1, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0024
            r6 = 33696000000(0x7d8702800, double:1.66480360023E-313)
            long r4 = r4 + r6
            goto L_0x0025
        L_0x0024:
            r4 = r2
        L_0x0025:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0084
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            java.lang.Object r8 = r8.b
            android.content.Context r8 = (android.content.Context) r8
            android.content.SharedPreferences r0 = defpackage.w4g.y(r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "app_set_id"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = "Failed to clear app set ID generated for App "
            r2.concat(r0)
        L_0x005c:
            java.lang.String r0 = "app_set_id_storage"
            r2 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0084
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "Failed to clear app set ID last used time for App "
            r0.concat(r8)
        L_0x0084:
            return
        L_0x0085:
            java.lang.Object r0 = r8.b
            z3g r0 = (defpackage.z3g) r0
            java.lang.Object r0 = r0.c
            monitor-enter(r0)
            java.lang.Object r8 = r8.b     // Catch:{ all -> 0x009a }
            z3g r8 = (defpackage.z3g) r8     // Catch:{ all -> 0x009a }
            java.lang.Object r8 = r8.o     // Catch:{ all -> 0x009a }
            gx9 r8 = (defpackage.gx9) r8     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x009c
            r8.d()     // Catch:{ all -> 0x009a }
            goto L_0x009c
        L_0x009a:
            r8 = move-exception
            goto L_0x009e
        L_0x009c:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            return
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r8
        L_0x00a0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TIMEOUT"
            r0.<init>(r1)
            java.lang.Object r8 = r8.b
            vde r8 = (defpackage.vde) r8
            r8.c(r0)
            return
        L_0x00af:
            java.lang.Object r8 = r8.b
            jef r8 = (defpackage.jef) r8
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            boolean r1 = r8.b()     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00c0
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            goto L_0x00dd
        L_0x00be:
            r8 = move-exception
            goto L_0x00de
        L_0x00c0:
            java.lang.String r1 = r8.j     // Catch:{ all -> 0x00be }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            r1.concat(r2)     // Catch:{ all -> 0x00be }
            r8.d()     // Catch:{ all -> 0x00be }
            boolean r1 = r8.b()     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00d6
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            goto L_0x00dd
        L_0x00d6:
            r1 = 1
            r8.c = r1     // Catch:{ all -> 0x00be }
            r8.e()     // Catch:{ all -> 0x00be }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
        L_0x00dd:
            return
        L_0x00de:
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            throw r8
        L_0x00e0:
            r8 = 0
            throw r8
        L_0x00e2:
            java.lang.Object r8 = r8.b
            rzf r8 = (defpackage.rzf) r8
            pd r8 = r8.j
            nd3 r0 = new nd3
            r1 = 4
            r0.<init>(r1)
            r8.i(r0)
            return
        L_0x00f2:
            java.lang.Object r8 = r8.b
            vbe r8 = (vbe) r8
            java.lang.Object r8 = r8.a
            dzf r8 = (defpackage.dzf) r8
            ok r8 = r8.d
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " disconnecting because it was signed out."
            java.lang.String r0 = r0.concat(r1)
            r8.b(r0)
            return
        L_0x010e:
            java.lang.Object r8 = r8.b
            dzf r8 = (defpackage.dzf) r8
            r8.e()
            return
        L_0x0116:
            java.lang.Object r0 = r8.b
            j8e r0 = (defpackage.j8e) r0
            java.lang.Object r1 = r0.o     // Catch:{ all -> 0x012b }
            jl7 r1 = (jl7) r1     // Catch:{ all -> 0x012b }
            java.util.concurrent.Executor r1 = r1.g     // Catch:{ all -> 0x012b }
            pfe r2 = new pfe     // Catch:{ all -> 0x012b }
            r3 = 21
            r2.<init>(r3, r8)     // Catch:{ all -> 0x012b }
            r1.execute(r2)     // Catch:{ all -> 0x012b }
            goto L_0x0139
        L_0x012b:
            r8 = move-exception
            java.lang.Object r0 = r0.o
            jl7 r0 = (jl7) r0
            xwb r0 = r0.n
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "Unexpected executor usage error"
            r0.logException(r1, r2, r8)
        L_0x0139:
            return
        L_0x013a:
            java.lang.Object r8 = r8.b
            gx0 r8 = (gx0) r8
            xwb r0 = r8.Z0
            java.lang.String r1 = "OKRTCCall"
            java.lang.String r2 = "💀 pc.timeout"
            r0.log(r1, r2)
            fe6 r0 = fe6.a
            r8.d(r0)
            r8.U0 = r0
            qe4 r0 = r8.o2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$PeerConnectionTimeout r1 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.PeerConnectionTimeout.INSTANCE
            r0.J(r1)
            g41 r0 = g41.c
            r1 = 0
            r8.k(r0, r1)
            return
        L_0x015c:
            java.lang.Object r8 = r8.b
            androidx.work.Worker r8 = (androidx.work.Worker) r8
            gh7 r0 = r8.b()     // Catch:{ all -> 0x016a }
            b4d r1 = r8.a     // Catch:{ all -> 0x016a }
            r1.j(r0)     // Catch:{ all -> 0x016a }
            goto L_0x0170
        L_0x016a:
            r0 = move-exception
            b4d r8 = r8.a
            r8.k(r0)
        L_0x0170:
            return
        L_0x0171:
            r0 = 0
            java.lang.Object r8 = r8.b
            androidx.viewpager.widget.ViewPager r8 = (androidx.viewpager.widget.ViewPager) r8
            r8.setScrollState(r0)
            r8.q()
            return
        L_0x017d:
            java.lang.Object r8 = r8.b
            iaf r8 = (defpackage.iaf) r8
            r0 = 0
            r8.m(r0)
            return
        L_0x0186:
            java.lang.Object r8 = r8.b
            kte r8 = (kte) r8
            boolean r0 = r8.B0
            if (r0 != 0) goto L_0x018f
            goto L_0x019e
        L_0x018f:
            r8.invalidateSelf()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 8
            long r0 = r0 + r2
            lde r2 = r8.A0
            r8.scheduleSelf(r2, r0)
        L_0x019e:
            return
        L_0x019f:
            java.lang.Object r8 = r8.b
            ur3 r8 = (defpackage.ur3) r8
            r8.q()
            return
        L_0x01a7:
            java.lang.Object r8 = r8.b
            wle r8 = (defpackage.wle) r8
            android.view.Window$Callback r0 = r8.g
            android.view.Menu r8 = r8.g0()
            boolean r1 = r8 instanceof defpackage.pl8
            r2 = 0
            if (r1 == 0) goto L_0x01ba
            r1 = r8
            pl8 r1 = (defpackage.pl8) r1
            goto L_0x01bb
        L_0x01ba:
            r1 = r2
        L_0x01bb:
            if (r1 == 0) goto L_0x01c0
            r1.w()
        L_0x01c0:
            r8.clear()     // Catch:{ all -> 0x01d1 }
            r3 = 0
            boolean r4 = r0.onCreatePanelMenu(r3, r8)     // Catch:{ all -> 0x01d1 }
            if (r4 == 0) goto L_0x01d3
            boolean r0 = r0.onPreparePanel(r3, r2, r8)     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x01d6
            goto L_0x01d3
        L_0x01d1:
            r8 = move-exception
            goto L_0x01dc
        L_0x01d3:
            r8.clear()     // Catch:{ all -> 0x01d1 }
        L_0x01d6:
            if (r1 == 0) goto L_0x01db
            r1.v()
        L_0x01db:
            return
        L_0x01dc:
            if (r1 == 0) goto L_0x01e1
            r1.v()
        L_0x01e1:
            throw r8
        L_0x01e2:
            java.lang.Object r8 = r8.b
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r8.w()
            return
        L_0x01ea:
            java.lang.Object r8 = r8.b
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            gy4 r8 = r8.c
            com.google.android.material.internal.CheckableImageButton r8 = r8.y0
            r8.performClick()
            r8.jumpDrawablesToCurrentState()
            return
        L_0x01f9:
            java.lang.Object r0 = r8.b
            kee r0 = (defpackage.kee) r0
            monitor-enter(r0)
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0278 }
            kee r1 = (defpackage.kee) r1     // Catch:{ all -> 0x0278 }
            rde r1 = r1.c()     // Catch:{ all -> 0x0278 }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0277
            hee r0 = r1.a
            java.util.logging.Logger r2 = defpackage.kee.i
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r2 = r2.isLoggable(r3)
            if (r2 == 0) goto L_0x0226
            kee r3 = r0.e
            x3a r3 = r3.g
            r3.getClass()
            long r3 = java.lang.System.nanoTime()
            java.lang.String r5 = "starting"
            defpackage.xie.d(r1, r0, r5)
            goto L_0x0228
        L_0x0226:
            r3 = -1
        L_0x0228:
            java.lang.Object r5 = r8.b     // Catch:{ all -> 0x024b }
            kee r5 = (defpackage.kee) r5     // Catch:{ all -> 0x024b }
            defpackage.kee.a(r5, r1)     // Catch:{ all -> 0x024b }
            if (r2 == 0) goto L_0x01f9
            kee r2 = r0.e
            x3a r2 = r2.g
            r2.getClass()
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            java.lang.String r2 = defpackage.xie.q(r5)
            java.lang.String r3 = "finished run in "
            java.lang.String r2 = r3.concat(r2)
            defpackage.xie.d(r1, r0, r2)
            goto L_0x01f9
        L_0x024b:
            r5 = move-exception
            java.lang.Object r6 = r8.b     // Catch:{ all -> 0x025a }
            kee r6 = (defpackage.kee) r6     // Catch:{ all -> 0x025a }
            x3a r6 = r6.g     // Catch:{ all -> 0x025a }
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x025a }
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6     // Catch:{ all -> 0x025a }
            r6.execute(r8)     // Catch:{ all -> 0x025a }
            throw r5     // Catch:{ all -> 0x025a }
        L_0x025a:
            r8 = move-exception
            if (r2 == 0) goto L_0x0276
            kee r2 = r0.e
            x3a r2 = r2.g
            r2.getClass()
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r3
            java.lang.String r2 = defpackage.xie.q(r5)
            java.lang.String r3 = "failed a run in "
            java.lang.String r2 = r3.concat(r2)
            defpackage.xie.d(r1, r0, r2)
        L_0x0276:
            throw r8
        L_0x0277:
            return
        L_0x0278:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x027b:
            r0 = 0
            java.lang.Object r8 = r8.b
            wde r8 = (defpackage.wde) r8
            bolts.Task r8 = r8.a
            r8.trySetResult(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lde.run():void");
    }

    public lde(zyf zyf, og0 og0) {
        this.a = 15;
        this.b = og0;
    }
}
