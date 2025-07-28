package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: q36  reason: default package */
public final class q36 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ q36(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v20, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r0v111, types: [ch7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v56, types: [an6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 4
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r11.a
            switch(r4) {
                case 0: goto L_0x056b;
                case 1: goto L_0x0538;
                case 2: goto L_0x0526;
                case 3: goto L_0x0506;
                case 4: goto L_0x04fa;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c9;
                case 7: goto L_0x0444;
                case 8: goto L_0x0438;
                case 9: goto L_0x0409;
                case 10: goto L_0x03ef;
                case 11: goto L_0x03e1;
                case 12: goto L_0x03d5;
                case 13: goto L_0x03c9;
                case 14: goto L_0x039b;
                case 15: goto L_0x034b;
                case 16: goto L_0x033f;
                case 17: goto L_0x0316;
                case 18: goto L_0x02e8;
                case 19: goto L_0x02c0;
                case 20: goto L_0x029e;
                case 21: goto L_0x026a;
                case 22: goto L_0x0252;
                case 23: goto L_0x0239;
                case 24: goto L_0x0225;
                case 25: goto L_0x0192;
                case 26: goto L_0x0144;
                case 27: goto L_0x00e8;
                case 28: goto L_0x0056;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r11.c
            i2g r0 = (defpackage.i2g) r0
            cr3 r1 = r0.c     // Catch:{ RuntimeExecutionException -> 0x0034, Exception -> 0x0032 }
            java.lang.Object r11 = r11.b     // Catch:{ RuntimeExecutionException -> 0x0034, Exception -> 0x0032 }
            com.google.android.gms.tasks.Task r11 = (com.google.android.gms.tasks.Task) r11     // Catch:{ RuntimeExecutionException -> 0x0034, Exception -> 0x0032 }
            java.lang.Object r11 = r1.l(r11)     // Catch:{ RuntimeExecutionException -> 0x0034, Exception -> 0x0032 }
            com.google.android.gms.tasks.Task r11 = (com.google.android.gms.tasks.Task) r11     // Catch:{ RuntimeExecutionException -> 0x0034, Exception -> 0x0032 }
            if (r11 != 0) goto L_0x0026
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r1 = "Continuation returned null"
            r11.<init>(r1)
            r0.onFailure(r11)
            goto L_0x0055
        L_0x0026:
            mh4 r1 = defpackage.cee.b
            r11.d(r1, r0)
            r11.c(r1, r0)
            r11.a(r1, r0)
            goto L_0x0055
        L_0x0032:
            r11 = move-exception
            goto L_0x0036
        L_0x0034:
            r11 = move-exception
            goto L_0x003c
        L_0x0036:
            n6g r0 = r0.o
            r0.m(r11)
            goto L_0x0055
        L_0x003c:
            java.lang.Throwable r1 = r11.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L_0x0050
            n6g r0 = r0.o
            java.lang.Throwable r11 = r11.getCause()
            java.lang.Exception r11 = (java.lang.Exception) r11
            r0.m(r11)
            goto L_0x0055
        L_0x0050:
            n6g r0 = r0.o
            r0.m(r11)
        L_0x0055:
            return
        L_0x0056:
            java.lang.Object r4 = r11.b
            k0g r4 = (defpackage.k0g) r4
            nd3 r5 = r4.b
            int r6 = r5.b
            if (r6 != 0) goto L_0x0061
            r3 = r2
        L_0x0061:
            java.lang.Object r11 = r11.c
            rzf r11 = (defpackage.rzf) r11
            if (r3 == 0) goto L_0x00dd
            q0g r3 = r4.c
            defpackage.a24.o(r3)
            nd3 r4 = r3.c
            int r5 = r4.b
            if (r5 != 0) goto L_0x00be
            pd r4 = r11.j
            android.os.IBinder r3 = r3.b
            if (r3 != 0) goto L_0x0079
            goto L_0x008f
        L_0x0079:
            int r1 = defpackage.x4.d
            java.lang.String r1 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r5 = r3.queryLocalInterface(r1)
            boolean r6 = r5 instanceof defpackage.an6
            if (r6 == 0) goto L_0x0089
            an6 r5 = (defpackage.an6) r5
        L_0x0087:
            r1 = r5
            goto L_0x008f
        L_0x0089:
            k6g r5 = new k6g
            r5.<init>(r3, r1, r2)
            goto L_0x0087
        L_0x008f:
            r4.getClass()
            if (r1 == 0) goto L_0x00a9
            java.util.Set r2 = r11.g
            if (r2 != 0) goto L_0x0099
            goto L_0x00a9
        L_0x0099:
            r4.o = r1
            r4.X = r2
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r4.b
            ok r0 = (defpackage.ok) r0
            r0.k(r1, r2)
            goto L_0x00e2
        L_0x00a9:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "GoogleApiManager"
            java.lang.String r3 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r2, r3, r1)
            nd3 r1 = new nd3
            r1.<init>(r0)
            r4.i(r1)
            goto L_0x00e2
        L_0x00be:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "SignInCoordinator"
            android.util.Log.wtf(r2, r0, r1)
            pd r0 = r11.j
            r0.i(r4)
            dfd r11 = r11.i
            r11.disconnect()
            goto L_0x00e7
        L_0x00dd:
            pd r0 = r11.j
            r0.i(r5)
        L_0x00e2:
            dfd r11 = r11.i
            r11.disconnect()
        L_0x00e7:
            return
        L_0x00e8:
            java.lang.Object r0 = r11.c
            pd r0 = (pd) r0
            java.lang.Object r4 = r0.Y
            qa6 r4 = (defpackage.qa6) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.y0
            java.lang.Object r5 = r0.c
            zk r5 = (defpackage.zk) r5
            java.lang.Object r4 = r4.get(r5)
            dzf r4 = (defpackage.dzf) r4
            if (r4 != 0) goto L_0x00ff
            goto L_0x0143
        L_0x00ff:
            java.lang.Object r11 = r11.b
            nd3 r11 = (defpackage.nd3) r11
            int r5 = r11.b
            if (r5 != 0) goto L_0x0108
            r3 = r2
        L_0x0108:
            if (r3 == 0) goto L_0x0140
            r0.a = r2
            java.lang.Object r11 = r0.b
            ok r11 = (defpackage.ok) r11
            boolean r2 = r11.j()
            if (r2 == 0) goto L_0x0128
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x0143
            java.lang.Object r1 = r0.o
            an6 r1 = (defpackage.an6) r1
            if (r1 == 0) goto L_0x0143
            java.lang.Object r0 = r0.X
            java.util.Set r0 = (java.util.Set) r0
            r11.k(r1, r0)
            goto L_0x0143
        L_0x0128:
            java.util.Set r0 = r11.a()     // Catch:{ SecurityException -> 0x0130 }
            r11.k(r1, r0)     // Catch:{ SecurityException -> 0x0130 }
            goto L_0x0143
        L_0x0130:
            java.lang.String r0 = "Failed to get service from broker."
            r11.b(r0)
            nd3 r11 = new nd3
            r0 = 10
            r11.<init>(r0)
            r4.m(r11, r1)
            goto L_0x0143
        L_0x0140:
            r4.m(r11, r1)
        L_0x0143:
            return
        L_0x0144:
            java.lang.String r0 = "Starting work for "
            java.lang.Object r1 = r11.c
            nuf r1 = (defpackage.nuf) r1
            b4d r1 = r1.F0
            java.lang.Object r1 = r1.a
            boolean r1 = r1 instanceof defpackage.r0
            if (r1 == 0) goto L_0x0153
            goto L_0x0191
        L_0x0153:
            java.lang.Object r1 = r11.b     // Catch:{ all -> 0x0187 }
            ch7 r1 = (defpackage.ch7) r1     // Catch:{ all -> 0x0187 }
            r1.get()     // Catch:{ all -> 0x0187 }
            a24 r1 = defpackage.a24.B()     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = defpackage.nuf.H0     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r3.<init>(r0)     // Catch:{ all -> 0x0187 }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x0187 }
            nuf r0 = (defpackage.nuf) r0     // Catch:{ all -> 0x0187 }
            ztf r0 = r0.X     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x0187 }
            r3.append(r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0187 }
            r1.t(r2, r0)     // Catch:{ all -> 0x0187 }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x0187 }
            nuf r0 = (defpackage.nuf) r0     // Catch:{ all -> 0x0187 }
            b4d r1 = r0.F0     // Catch:{ all -> 0x0187 }
            hh7 r0 = r0.Y     // Catch:{ all -> 0x0187 }
            ch7 r0 = r0.startWork()     // Catch:{ all -> 0x0187 }
            r1.l(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0191
        L_0x0187:
            r0 = move-exception
            java.lang.Object r11 = r11.c
            nuf r11 = (defpackage.nuf) r11
            b4d r11 = r11.F0
            r11.k(r0)
        L_0x0191:
            return
        L_0x0192:
            java.lang.String r0 = "Updating notification for "
            java.lang.String r1 = "Worker was marked important ("
            java.lang.Object r2 = r11.c
            zsf r2 = (defpackage.zsf) r2
            b4d r2 = r2.a
            java.lang.Object r2 = r2.a
            boolean r2 = r2 instanceof defpackage.r0
            if (r2 == 0) goto L_0x01a4
            goto L_0x0224
        L_0x01a4:
            java.lang.Object r2 = r11.b     // Catch:{ all -> 0x01fa }
            b4d r2 = (defpackage.b4d) r2     // Catch:{ all -> 0x01fa }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x01fa }
            r7 = r2
            hu5 r7 = (defpackage.hu5) r7     // Catch:{ all -> 0x01fa }
            if (r7 == 0) goto L_0x01fc
            a24 r1 = defpackage.a24.B()     // Catch:{ all -> 0x01fa }
            java.lang.String r2 = defpackage.zsf.Z     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r3.<init>(r0)     // Catch:{ all -> 0x01fa }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x01fa }
            zsf r0 = (defpackage.zsf) r0     // Catch:{ all -> 0x01fa }
            ztf r0 = r0.c     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x01fa }
            r3.append(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01fa }
            r1.t(r2, r0)     // Catch:{ all -> 0x01fa }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x01fa }
            zsf r0 = (defpackage.zsf) r0     // Catch:{ all -> 0x01fa }
            b4d r1 = r0.a     // Catch:{ all -> 0x01fa }
            ku5 r2 = r0.X     // Catch:{ all -> 0x01fa }
            android.content.Context r8 = r0.b     // Catch:{ all -> 0x01fa }
            hh7 r0 = r0.o     // Catch:{ all -> 0x01fa }
            java.util.UUID r6 = r0.getId()     // Catch:{ all -> 0x01fa }
            atf r2 = (defpackage.atf) r2     // Catch:{ all -> 0x01fa }
            r2.getClass()     // Catch:{ all -> 0x01fa }
            b4d r0 = new b4d     // Catch:{ all -> 0x01fa }
            r0.<init>()     // Catch:{ all -> 0x01fa }
            s18 r10 = new s18     // Catch:{ all -> 0x01fa }
            r9 = 2
            r3 = r10
            r4 = r2
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01fa }
            bee r2 = r2.a     // Catch:{ all -> 0x01fa }
            r2.c(r10)     // Catch:{ all -> 0x01fa }
            r1.l(r0)     // Catch:{ all -> 0x01fa }
            goto L_0x0224
        L_0x01fa:
            r0 = move-exception
            goto L_0x021b
        L_0x01fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r0.<init>(r1)     // Catch:{ all -> 0x01fa }
            java.lang.Object r1 = r11.c     // Catch:{ all -> 0x01fa }
            zsf r1 = (defpackage.zsf) r1     // Catch:{ all -> 0x01fa }
            ztf r1 = r1.c     // Catch:{ all -> 0x01fa }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x01fa }
            r0.append(r1)     // Catch:{ all -> 0x01fa }
            java.lang.String r1 = ") but did not provide ForegroundInfo"
            r0.append(r1)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01fa }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01fa }
            r1.<init>(r0)     // Catch:{ all -> 0x01fa }
            throw r1     // Catch:{ all -> 0x01fa }
        L_0x021b:
            java.lang.Object r11 = r11.c
            zsf r11 = (defpackage.zsf) r11
            b4d r11 = r11.a
            r11.k(r0)
        L_0x0224:
            return
        L_0x0225:
            java.lang.Object r0 = r11.b
            vpe r0 = (defpackage.vpe) r0
            r0.o = r2
            java.lang.Object r0 = r11.c
            wpe r0 = (defpackage.wpe) r0
            java.util.concurrent.PriorityBlockingQueue r0 = r0.a
            java.lang.Object r11 = r11.b
            vpe r11 = (defpackage.vpe) r11
            r0.remove(r11)
            return
        L_0x0239:
            java.lang.Object r0 = r11.b
            wde r0 = (defpackage.wde) r0
            java.lang.Object r11 = r11.c     // Catch:{ CancellationException -> 0x024e, Exception -> 0x0249 }
            java.util.concurrent.Callable r11 = (java.util.concurrent.Callable) r11     // Catch:{ CancellationException -> 0x024e, Exception -> 0x0249 }
            java.lang.Object r11 = r11.call()     // Catch:{ CancellationException -> 0x024e, Exception -> 0x0249 }
            r0.c(r11)     // Catch:{ CancellationException -> 0x024e, Exception -> 0x0249 }
            goto L_0x0251
        L_0x0249:
            r11 = move-exception
            r0.b(r11)
            goto L_0x0251
        L_0x024e:
            r0.a()
        L_0x0251:
            return
        L_0x0252:
            java.lang.Object r0 = r11.c
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            iaf r0 = r0.a
            if (r0 == 0) goto L_0x0269
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0269
            java.util.WeakHashMap r0 = defpackage.eaf.a
            java.lang.Object r0 = r11.b
            android.view.View r0 = (android.view.View) r0
            r0.postOnAnimation(r11)
        L_0x0269:
            return
        L_0x026a:
            java.lang.Object r0 = r11.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0296
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            k77[] r2 = one.me.stickerssearch.StickersSearchScreen.y0
            java.lang.Object r11 = r11.c
            one.me.stickerssearch.StickersSearchScreen r11 = (one.me.stickerssearch.StickersSearchScreen) r11
            r11.getClass()
            k77[] r2 = one.me.stickerssearch.StickersSearchScreen.y0
            r3 = 2
            r2 = r2[r3]
            n0c r3 = r11.Y
            java.lang.Object r11 = r3.T0(r11, r2)
            raa r11 = (raa) r11
            int r11 = r11.getMeasuredHeight()
            r1.topMargin = r11
            r0.setLayoutParams(r1)
            return
        L_0x0296:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r11.<init>(r0)
            throw r11
        L_0x029e:
            k77[] r0 = one.me.stickerssettings.stickersscreen.StickersScreen.z0
            java.lang.Object r0 = r11.c
            one.me.stickerssettings.stickersscreen.StickersScreen r0 = (one.me.stickerssettings.stickersscreen.StickersScreen) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.l0()
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredHeight()
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r11, r2, r3)
            return
        L_0x02c0:
            java.lang.Object r0 = r11.b
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
        L_0x02c8:
            if (r3 >= r1) goto L_0x02e7
            java.lang.Object r4 = r0.get(r3)
            android.view.View r4 = (android.view.View) r4
            java.util.WeakHashMap r5 = defpackage.eaf.a
            java.lang.String r5 = defpackage.t9f.k(r4)
            java.lang.Object r6 = r11.c
            ccd r6 = (defpackage.ccd) r6
            yr r6 = r6.Z
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            defpackage.t9f.v(r4, r5)
            int r3 = r3 + r2
            goto L_0x02c8
        L_0x02e7:
            return
        L_0x02e8:
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x0302 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0302 }
            r0.run()     // Catch:{ all -> 0x0302 }
            java.lang.Object r0 = r11.b
            qm r0 = (defpackage.qm) r0
            java.lang.Object r0 = r0.X
            monitor-enter(r0)
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x02ff }
            qm r11 = (defpackage.qm) r11     // Catch:{ all -> 0x02ff }
            r11.a()     // Catch:{ all -> 0x02ff }
            monitor-exit(r0)     // Catch:{ all -> 0x02ff }
            return
        L_0x02ff:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02ff }
            throw r11
        L_0x0302:
            r0 = move-exception
            java.lang.Object r1 = r11.b
            qm r1 = (defpackage.qm) r1
            java.lang.Object r1 = r1.X
            monitor-enter(r1)
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x0313 }
            qm r11 = (defpackage.qm) r11     // Catch:{ all -> 0x0313 }
            r11.a()     // Catch:{ all -> 0x0313 }
            monitor-exit(r1)     // Catch:{ all -> 0x0313 }
            throw r0
        L_0x0313:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0313 }
            throw r11
        L_0x0316:
            java.lang.Object r0 = r11.b
            yv1 r0 = (defpackage.yv1) r0
            java.lang.Object r11 = r11.c     // Catch:{ all -> 0x0326 }
            ch7 r11 = (defpackage.ch7) r11     // Catch:{ all -> 0x0326 }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x0326 }
            r0.resumeWith(r11)     // Catch:{ all -> 0x0326 }
            goto L_0x033e
        L_0x0326:
            r11 = move-exception
            java.lang.Throwable r1 = r11.getCause()
            if (r1 != 0) goto L_0x032e
            r1 = r11
        L_0x032e:
            boolean r11 = r11 instanceof java.util.concurrent.CancellationException
            if (r11 == 0) goto L_0x0336
            r0.cancel(r1)
            goto L_0x033e
        L_0x0336:
            kcc r11 = new kcc
            r11.<init>(r1)
            r0.resumeWith(r11)
        L_0x033e:
            return
        L_0x033f:
            java.lang.Object r0 = r11.c
            yv1 r0 = (defpackage.yv1) r0
            java.lang.Object r11 = r11.b
            ju3 r11 = (defpackage.ju3) r11
            r0.c(r11)
            return
        L_0x034b:
            k77[] r2 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.B0
            java.lang.Object r2 = r11.b
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r2 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r2
            r2.getClass()
            k77[] r4 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.B0
            r0 = r4[r0]
            n0c r4 = r2.x0
            java.lang.Object r0 = r4.T0(r2, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r11 = r11.c
            one.me.sdk.uikit.common.button.OneMeButton r11 = (one.me.sdk.uikit.common.button.OneMeButton) r11
            int r2 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0373
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0374
        L_0x0373:
            r4 = r1
        L_0x0374:
            if (r4 == 0) goto L_0x0379
            int r4 = r4.bottomMargin
            goto L_0x037a
        L_0x0379:
            r4 = r3
        L_0x037a:
            int r2 = r2 + r4
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r4 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x0386
            r1 = r11
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0386:
            if (r1 == 0) goto L_0x038a
            int r3 = r1.topMargin
        L_0x038a:
            int r2 = r2 + r3
            int r11 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            r0.setPadding(r11, r1, r3, r2)
            return
        L_0x039b:
            k77[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.z0
            java.lang.Object r0 = r11.c
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r0 = (one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r0
            r0.getClass()
            k77[] r1 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.z0
            r2 = 5
            r1 = r1[r2]
            n0c r2 = r0.y0
            java.lang.Object r0 = r2.T0(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getMeasuredHeight()
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r11, r2, r3)
            return
        L_0x03c9:
            java.lang.Object r0 = r11.b
            jca r0 = (jca) r0
            java.lang.Object r11 = r11.c
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            r0.removeCallbacks(r11)
            return
        L_0x03d5:
            java.lang.Object r0 = r11.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r0
            java.lang.Object r11 = r11.c
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            one.me.sdk.uikit.common.views.OneMeDraweeView.n(r0, r11)
            return
        L_0x03e1:
            java.lang.Object r0 = r11.c
            ov9 r0 = (defpackage.ov9) r0
            nv9 r0 = r0.a
            java.lang.Object r11 = r11.b
            pn1 r11 = (defpackage.pn1) r11
            r0.a(r11)
            return
        L_0x03ef:
            java.lang.Object r0 = r11.c
            ft9 r0 = (defpackage.ft9) r0
            bw9 r1 = r0.a     // Catch:{ all -> 0x0402 }
            java.lang.Object r11 = r11.b     // Catch:{ all -> 0x0402 }
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch:{ all -> 0x0402 }
            r1.onError(r11)     // Catch:{ all -> 0x0402 }
            omc r11 = r0.o
            r11.f()
            return
        L_0x0402:
            r11 = move-exception
            omc r0 = r0.o
            r0.f()
            throw r11
        L_0x0409:
            java.lang.Object r0 = r11.b
            u18 r0 = (defpackage.u18) r0
            v18 r0 = (defpackage.v18) r0
            android.os.Messenger r0 = r0.a
            android.os.IBinder r0 = r0.getBinder()
            java.lang.Object r11 = r11.c
            x3a r11 = (defpackage.x3a) r11
            java.lang.Object r11 = r11.b
            wd8 r11 = (defpackage.wd8) r11
            yr r11 = r11.X
            java.lang.Object r11 = r11.remove(r0)
            l18 r11 = (defpackage.l18) r11
            if (r11 == 0) goto L_0x0437
            u18 r0 = r11.e
            r0.getClass()
            v18 r0 = (defpackage.v18) r0
            android.os.Messenger r0 = r0.a
            android.os.IBinder r0 = r0.getBinder()
            r0.unlinkToDeath(r11, r3)
        L_0x0437:
            return
        L_0x0438:
            java.lang.Object r0 = r11.c
            ay7 r0 = (defpackage.ay7) r0
            java.lang.Object r11 = r11.b
            wx7 r11 = (defpackage.wx7) r11
            r0.a(r11)
            return
        L_0x0444:
            java.lang.Object r0 = r11.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x048a
            java.lang.String r1 = "evgeniiJsEvaluatorException"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x048a
            java.lang.Object r0 = r11.c
            nvf r0 = (nvf) r0
            java.lang.Object r11 = r11.b
            java.lang.String r11 = (java.lang.String) r11
            r1 = 27
            r11.substring(r1)
            ue3 r11 = r0.a
            java.lang.Object r0 = r11.o
            ovf r0 = (ovf) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.lock()
            java.lang.String r0 = ovf.g     // Catch:{ all -> 0x047f }
            java.lang.Object r0 = r11.o     // Catch:{ all -> 0x047f }
            ovf r0 = (ovf) r0     // Catch:{ all -> 0x047f }
            java.util.concurrent.locks.Condition r0 = r0.f     // Catch:{ all -> 0x047f }
            r0.signal()     // Catch:{ all -> 0x047f }
            java.lang.Object r11 = r11.o
            ovf r11 = (ovf) r11
            java.util.concurrent.locks.ReentrantLock r11 = r11.e
            r11.unlock()
            goto L_0x04bb
        L_0x047f:
            r0 = move-exception
            java.lang.Object r11 = r11.o
            ovf r11 = (ovf) r11
            java.util.concurrent.locks.ReentrantLock r11 = r11.e
            r11.unlock()
            throw r0
        L_0x048a:
            java.lang.Object r0 = r11.c
            nvf r0 = (nvf) r0
            java.lang.Object r11 = r11.b
            java.lang.String r11 = (java.lang.String) r11
            ue3 r1 = r0.a
            java.lang.Object r1 = r1.o
            ovf r1 = (ovf) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.lock()
            ue3 r1 = r0.a     // Catch:{ all -> 0x04bc }
            java.lang.Object r1 = r1.o     // Catch:{ all -> 0x04bc }
            ovf r1 = (ovf) r1     // Catch:{ all -> 0x04bc }
            r1.d = r11     // Catch:{ all -> 0x04bc }
            ue3 r11 = r0.a     // Catch:{ all -> 0x04bc }
            java.lang.Object r11 = r11.o     // Catch:{ all -> 0x04bc }
            ovf r11 = (ovf) r11     // Catch:{ all -> 0x04bc }
            java.util.concurrent.locks.Condition r11 = r11.f     // Catch:{ all -> 0x04bc }
            r11.signal()     // Catch:{ all -> 0x04bc }
            ue3 r11 = r0.a
            java.lang.Object r11 = r11.o
            ovf r11 = (ovf) r11
            java.util.concurrent.locks.ReentrantLock r11 = r11.e
            r11.unlock()
        L_0x04bb:
            return
        L_0x04bc:
            r11 = move-exception
            ue3 r0 = r0.a
            java.lang.Object r0 = r0.o
            ovf r0 = (ovf) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.unlock()
            throw r11
        L_0x04c9:
            java.lang.Object r0 = r11.b
            yv1 r0 = (defpackage.yv1) r0
            java.lang.Object r11 = r11.c
            sd6 r11 = (defpackage.sd6) r11
            r0.c(r11)
            return
        L_0x04d5:
            java.lang.Object r0 = r11.c
            mfd r0 = (mfd) r0
            xwb r1 = r0.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<!> send retry -> "
            r2.<init>(r3)
            java.lang.Object r11 = r11.b
            zx3 r11 = (zx3) r11
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "OKSignaling"
            r1.log(r3, r2)
            eef r0 = r0.g
            java.lang.String r11 = r11.a
            r0.f(r11)
            return
        L_0x04fa:
            java.lang.Object r0 = r11.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r11 = r11.c
            bi5 r11 = (bi5) r11
            tge.b(r0, r11)
            return
        L_0x0506:
            java.lang.Object r0 = r11.b
            sy4 r0 = (sy4) r0
            java.lang.Object r1 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0525
            java.lang.Object r11 = r11.c
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r11 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r11
            r11.Y()
            re r1 = new re
            r2 = 19
            r1.<init>(r2, r0)
            r11.post(r1)
        L_0x0525:
            return
        L_0x0526:
            java.lang.Object r0 = r11.b
            fte r0 = (defpackage.fte) r0
            java.lang.Object r0 = r0.a
            vx3 r0 = (defpackage.vx3) r0
            if (r0 == 0) goto L_0x0537
            java.lang.Object r11 = r11.c
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            r0.E(r11)
        L_0x0537:
            return
        L_0x0538:
            java.lang.Object r0 = r11.c
            i7 r0 = (defpackage.i7) r0
            pl8 r2 = r0.c
            if (r2 == 0) goto L_0x0547
            nl8 r4 = r2.X
            if (r4 == 0) goto L_0x0547
            r4.r(r2)
        L_0x0547:
            jm8 r2 = r0.w0
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0568
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto L_0x0568
            java.lang.Object r11 = r11.b
            f7 r11 = (defpackage.f7) r11
            boolean r2 = r11.b()
            if (r2 == 0) goto L_0x055e
            goto L_0x0566
        L_0x055e:
            android.view.View r2 = r11.f
            if (r2 != 0) goto L_0x0563
            goto L_0x0568
        L_0x0563:
            r11.d(r3, r3, r3, r3)
        L_0x0566:
            r0.H0 = r11
        L_0x0568:
            r0.J0 = r1
            return
        L_0x056b:
            java.lang.Object r0 = r11.c
            i36 r0 = (defpackage.i36) r0
            java.lang.Object r11 = r11.b     // Catch:{ ExecutionException -> 0x057d, Error | RuntimeException -> 0x057b }
            java.util.concurrent.Future r11 = (java.util.concurrent.Future) r11     // Catch:{ ExecutionException -> 0x057d, Error | RuntimeException -> 0x057b }
            java.lang.Object r11 = ct0.m(r11)     // Catch:{ ExecutionException -> 0x057d, Error | RuntimeException -> 0x057b }
            r0.a(r11)
            goto L_0x0590
        L_0x057b:
            r11 = move-exception
            goto L_0x057f
        L_0x057d:
            r11 = move-exception
            goto L_0x0583
        L_0x057f:
            r0.e(r11)
            goto L_0x0590
        L_0x0583:
            java.lang.Throwable r1 = r11.getCause()
            if (r1 != 0) goto L_0x058d
            r0.e(r11)
            goto L_0x0590
        L_0x058d:
            r0.e(r1)
        L_0x0590:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q36.run():void");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return q36.class.getSimpleName() + "," + ((i36) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q36(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ q36(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public q36(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 22;
        this.c = swipeDismissBehavior;
        this.b = view;
    }
}
