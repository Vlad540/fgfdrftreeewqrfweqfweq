package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.arch.Widget;

/* renamed from: p36  reason: default package */
public final class p36 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ p36(ViewGroup viewGroup, RecyclerView recyclerView, Widget widget, int i) {
        this.a = i;
        this.b = recyclerView;
        this.c = widget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        defpackage.qyc.Y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.c     // Catch:{ all -> 0x005e }
            qyc r2 = (defpackage.qyc) r2     // Catch:{ all -> 0x005e }
            java.util.ArrayDeque r2 = r2.b     // Catch:{ all -> 0x005e }
            monitor-enter(r2)     // Catch:{ all -> 0x005e }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.c     // Catch:{ all -> 0x0020 }
            qyc r0 = (defpackage.qyc) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.c     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r10 = move-exception
            goto L_0x0083
        L_0x0022:
            long r6 = r0.o     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.o = r6     // Catch:{ all -> 0x0020 }
            r0.c = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.c     // Catch:{ all -> 0x0020 }
            qyc r4 = (defpackage.qyc) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.b     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            r10.b = r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004d
            java.lang.Object r10 = r10.c     // Catch:{ all -> 0x0020 }
            qyc r10 = (defpackage.qyc) r10     // Catch:{ all -> 0x0020 }
            r10.c = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004c
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x004c:
            return
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x005e }
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch:{ RuntimeException -> 0x0062 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ RuntimeException -> 0x0062 }
            r3.run()     // Catch:{ RuntimeException -> 0x0062 }
        L_0x005b:
            r10.b = r2     // Catch:{ all -> 0x005e }
            goto L_0x0002
        L_0x005e:
            r10 = move-exception
            goto L_0x0085
        L_0x0060:
            r0 = move-exception
            goto L_0x0080
        L_0x0062:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.qyc.Y     // Catch:{ all -> 0x0060 }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r6.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.Object r7 = r10.b     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0060 }
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            r4.log(r5, r6, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x005b
        L_0x0080:
            r10.b = r2     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0083:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x005e }
        L_0x0085:
            if (r1 == 0) goto L_0x008e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x008e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p36.a():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: ztf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: nuf} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v40, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r3v54 */
    /* JADX WARNING: type inference failed for: r3v55 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r0 = 0
            r2 = 1
            r3 = 0
            int r4 = r1.a
            switch(r4) {
                case 0: goto L_0x057a;
                case 1: goto L_0x056e;
                case 2: goto L_0x0547;
                case 3: goto L_0x0509;
                case 4: goto L_0x0462;
                case 5: goto L_0x0437;
                case 6: goto L_0x0422;
                case 7: goto L_0x0416;
                case 8: goto L_0x03e7;
                case 9: goto L_0x039c;
                case 10: goto L_0x035e;
                case 11: goto L_0x0317;
                case 12: goto L_0x02f5;
                case 13: goto L_0x02e9;
                case 14: goto L_0x02d9;
                case 15: goto L_0x02cd;
                case 16: goto L_0x02c1;
                case 17: goto L_0x0293;
                case 18: goto L_0x0289;
                case 19: goto L_0x025f;
                case 20: goto L_0x0247;
                case 21: goto L_0x0209;
                case 22: goto L_0x01ed;
                case 23: goto L_0x01a2;
                case 24: goto L_0x016f;
                case 25: goto L_0x010b;
                case 26: goto L_0x00e1;
                case 27: goto L_0x00c2;
                case 28: goto L_0x00aa;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r1.b
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.c
            r1 = r0
            nuf r1 = (defpackage.nuf) r1
            b4d r0 = r1.F0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            gh7 r0 = (defpackage.gh7) r0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            if (r0 != 0) goto L_0x0043
            a24 r0 = defpackage.a24.B()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r3 = defpackage.nuf.H0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r4.<init>()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            ztf r5 = r1.X     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r5 = r5.c     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r4.append(r5)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r5 = " returned a null result. Treating it as a failure."
            r4.append(r5)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r4 = r4.toString()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r0.x(r3, r4)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            goto L_0x006b
        L_0x003d:
            r0 = move-exception
            goto L_0x00a6
        L_0x003f:
            r0 = move-exception
            goto L_0x006f
        L_0x0041:
            r0 = move-exception
            goto L_0x008a
        L_0x0043:
            a24 r3 = defpackage.a24.B()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r4 = defpackage.nuf.H0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r5.<init>()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            ztf r6 = r1.X     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r6 = r6.c     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r5.append(r6)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r6 = " returned a "
            r5.append(r6)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r5.append(r0)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r6 = "."
            r5.append(r6)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r5 = r5.toString()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r3.t(r4, r5)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r1.w0 = r0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
        L_0x006b:
            r1.b()
            goto L_0x00a5
        L_0x006f:
            a24 r3 = defpackage.a24.B()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = defpackage.nuf.H0     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r5.<init>()     // Catch:{ all -> 0x003d }
            r5.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = " failed because it threw an exception/error"
            r5.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x003d }
            r3.y(r4, r2, r0)     // Catch:{ all -> 0x003d }
            goto L_0x006b
        L_0x008a:
            a24 r3 = defpackage.a24.B()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = defpackage.nuf.H0     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r4.<init>()     // Catch:{ all -> 0x003d }
            r4.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = " was cancelled"
            r4.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x003d }
            r3.Q(r2, r0)     // Catch:{ all -> 0x003d }
            goto L_0x006b
        L_0x00a5:
            return
        L_0x00a6:
            r1.b()
            throw r0
        L_0x00aa:
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x00b9 }
            androidx.work.Worker r0 = (androidx.work.Worker) r0     // Catch:{ all -> 0x00b9 }
            r0.getClass()     // Catch:{ all -> 0x00b9 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`"
            r0.<init>(r2)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            java.lang.Object r1 = r1.b
            b4d r1 = (defpackage.b4d) r1
            r1.k(r0)
            return
        L_0x00c2:
            k77[] r0 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            java.lang.Object r0 = r1.b
            one.me.chatscreen.videomsg.VideoMessageWidget r0 = (one.me.chatscreen.videomsg.VideoMessageWidget) r0
            r0.getClass()
            k77[] r3 = one.me.chatscreen.videomsg.VideoMessageWidget.y0
            r2 = r3[r2]
            n0c r3 = r0.o
            java.lang.Object r0 = r3.T0(r0, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.Object r1 = r1.c
            i5f r1 = (i5f) r1
            boolean r1 = r1.a
            r0.setClickable(r1)
            return
        L_0x00e1:
            java.lang.Object r0 = r1.c
            qie r0 = (defpackage.qie) r0
            rie r0 = r0.c
            java.lang.Object r1 = r1.b
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            ah0 r2 = (defpackage.ah0) r2
            java.lang.Object r1 = r1.second
            z4b r1 = (defpackage.z4b) r1
            r0.getClass()
            r4 = r1
            ji0 r4 = (defpackage.ji0) r4
            c5b r4 = r4.c
            java.lang.String r5 = "ThrottlingProducer"
            r4.a(r1, r5, r3)
            qie r3 = new qie
            r3.<init>(r0, r2)
            y4b r0 = r0.a
            r0.a(r3, r1)
            return
        L_0x010b:
            java.lang.Object r0 = r1.c
            b8e r0 = (defpackage.b8e) r0
            itf r0 = r0.a
            t4b r0 = r0.f
            java.lang.Object r2 = r1.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.A0
            monitor-enter(r4)
            java.util.HashMap r5 = r0.Y     // Catch:{ all -> 0x012e }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x012e }
            nuf r5 = (defpackage.nuf) r5     // Catch:{ all -> 0x012e }
            if (r5 != 0) goto L_0x0130
            java.util.HashMap r0 = r0.Z     // Catch:{ all -> 0x012e }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x012e }
            r5 = r0
            nuf r5 = (defpackage.nuf) r5     // Catch:{ all -> 0x012e }
            goto L_0x0130
        L_0x012e:
            r0 = move-exception
            goto L_0x016d
        L_0x0130:
            if (r5 == 0) goto L_0x0136
            ztf r3 = r5.X     // Catch:{ all -> 0x012e }
            monitor-exit(r4)     // Catch:{ all -> 0x012e }
            goto L_0x0137
        L_0x0136:
            monitor-exit(r4)     // Catch:{ all -> 0x012e }
        L_0x0137:
            if (r3 == 0) goto L_0x016c
            boolean r0 = r3.c()
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r1.c
            b8e r0 = (defpackage.b8e) r0
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0169 }
            b8e r0 = (defpackage.b8e) r0     // Catch:{ all -> 0x0169 }
            java.util.HashMap r0 = r0.Y     // Catch:{ all -> 0x0169 }
            btf r4 = defpackage.vx3.o(r3)     // Catch:{ all -> 0x0169 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0169 }
            b8e r0 = (defpackage.b8e) r0     // Catch:{ all -> 0x0169 }
            java.util.HashSet r0 = r0.Z     // Catch:{ all -> 0x0169 }
            r0.add(r3)     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0169 }
            b8e r0 = (defpackage.b8e) r0     // Catch:{ all -> 0x0169 }
            ydc r1 = r0.w0     // Catch:{ all -> 0x0169 }
            java.util.HashSet r0 = r0.Z     // Catch:{ all -> 0x0169 }
            r1.G(r0)     // Catch:{ all -> 0x0169 }
            monitor-exit(r2)     // Catch:{ all -> 0x0169 }
            goto L_0x016c
        L_0x0169:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0169 }
            throw r0
        L_0x016c:
            return
        L_0x016d:
            monitor-exit(r4)     // Catch:{ all -> 0x012e }
            throw r0
        L_0x016f:
            java.lang.Object r0 = r1.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r0
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 == 0) goto L_0x019a
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            k77[] r4 = one.me.stickersshowcase.StickersShowcaseScreen.z0
            java.lang.Object r1 = r1.c
            one.me.stickersshowcase.StickersShowcaseScreen r1 = (one.me.stickersshowcase.StickersShowcaseScreen) r1
            r1.getClass()
            k77[] r4 = one.me.stickersshowcase.StickersShowcaseScreen.z0
            r2 = r4[r2]
            n0c r4 = r1.X
            java.lang.Object r1 = r4.T0(r1, r2)
            nea r1 = (nea) r1
            int r1 = r1.getMeasuredHeight()
            r3.topMargin = r1
            r0.setLayoutParams(r3)
            return
        L_0x019a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            k77[] r2 = one.me.stickerssettings.stickersscreen.StickersScreen.z0
            java.lang.Object r2 = r1.c
            one.me.stickerssettings.stickersscreen.StickersScreen r2 = (one.me.stickerssettings.stickersscreen.StickersScreen) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.l0()
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            if (r4 == 0) goto L_0x01e5
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            java.lang.Object r1 = r1.b
            android.view.View r1 = (android.view.View) r1
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x01c7
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x01c8
        L_0x01c7:
            r6 = r3
        L_0x01c8:
            if (r6 == 0) goto L_0x01cd
            int r6 = r6.bottomMargin
            goto L_0x01ce
        L_0x01cd:
            r6 = r0
        L_0x01ce:
            int r5 = r5 + r6
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r6 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x01da
            r3 = r1
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x01da:
            if (r3 == 0) goto L_0x01de
            int r0 = r3.topMargin
        L_0x01de:
            int r5 = r5 + r0
            r4.bottomMargin = r5
            r2.setLayoutParams(r4)
            return
        L_0x01e5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x01ed:
            java.lang.Object r0 = r1.c
            one.me.stickerspreview.set.StickerSetBottomSheet r0 = (one.me.stickerspreview.set.StickerSetBottomSheet) r0
            int r0 = one.me.stickerspreview.set.StickerSetBottomSheet.w0(r0)
            java.lang.Object r1 = r1.b
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            r1.setPadding(r2, r3, r4, r0)
            return
        L_0x0209:
            java.lang.Object r4 = r1.b
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = r0
        L_0x0212:
            if (r6 >= r5) goto L_0x0246
            java.lang.Object r7 = r4.get(r6)
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap r8 = defpackage.eaf.a
            java.lang.String r8 = defpackage.t9f.k(r7)
            if (r8 == 0) goto L_0x0244
            java.lang.Object r9 = r1.c
            ccd r9 = (defpackage.ccd) r9
            yr r9 = r9.Z
            int r10 = r9.c
            r11 = r0
        L_0x022b:
            if (r11 >= r10) goto L_0x0240
            java.lang.Object r12 = r9.i(r11)
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x023e
            java.lang.Object r8 = r9.f(r11)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0241
        L_0x023e:
            int r11 = r11 + r2
            goto L_0x022b
        L_0x0240:
            r8 = r3
        L_0x0241:
            defpackage.t9f.v(r7, r8)
        L_0x0244:
            int r6 = r6 + r2
            goto L_0x0212
        L_0x0246:
            return
        L_0x0247:
            r17.a()     // Catch:{ Error -> 0x024b }
            return
        L_0x024b:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r1.c
            qyc r0 = (defpackage.qyc) r0
            java.util.ArrayDeque r4 = r0.b
            monitor-enter(r4)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x025c }
            qyc r0 = (defpackage.qyc) r0     // Catch:{ all -> 0x025c }
            r0.c = r2     // Catch:{ all -> 0x025c }
            monitor-exit(r4)     // Catch:{ all -> 0x025c }
            throw r3
        L_0x025c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x025c }
            throw r0
        L_0x025f:
            java.lang.Object r0 = r1.b
            r2 = r0
            yv1 r2 = (defpackage.yv1) r2
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0270 }
            ch7 r0 = (defpackage.ch7) r0     // Catch:{ all -> 0x0270 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0270 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x0270 }
            goto L_0x0288
        L_0x0270:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 != 0) goto L_0x0278
            r1 = r0
        L_0x0278:
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x0280
            r2.cancel(r1)
            goto L_0x0288
        L_0x0280:
            kcc r0 = new kcc
            r0.<init>(r1)
            r2.resumeWith(r0)
        L_0x0288:
            return
        L_0x0289:
            java.lang.Object r0 = r1.b
            rf3 r0 = (defpackage.rf3) r0
            java.lang.Object r1 = r1.c
            r0.accept(r1)
            return
        L_0x0293:
            k77[] r0 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.B0
            java.lang.Object r0 = r1.c
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            r0.getClass()
            k77[] r2 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.B0
            r3 = 4
            r2 = r2[r3]
            n0c r3 = r0.x0
            java.lang.Object r0 = r3.T0(r0, r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r1 = r1.b
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getMeasuredHeight()
            int r2 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r0.setPadding(r2, r1, r3, r4)
            return
        L_0x02c1:
            java.lang.Object r0 = r1.b
            jca r0 = (jca) r0
            java.lang.Object r1 = r1.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            return
        L_0x02cd:
            java.lang.Object r0 = r1.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r0
            java.lang.Object r1 = r1.c
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            one.me.sdk.uikit.common.views.OneMeDraweeView.n(r0, r1)
            return
        L_0x02d9:
            jue r0 = defpackage.jue.a
            java.lang.Object r2 = r1.b
            zvc r2 = (defpackage.zvc) r2
            yvc r2 = (defpackage.yvc) r2
            java.lang.Object r1 = r1.c
            vx9 r1 = (defpackage.vx9) r1
            r2.g(r1, r0)
            return
        L_0x02e9:
            java.lang.Object r0 = r1.c
            ft9 r0 = (defpackage.ft9) r0
            bw9 r0 = r0.a
            java.lang.Object r1 = r1.b
            r0.c(r1)
            return
        L_0x02f5:
            java.lang.Object r2 = r1.b
            u18 r2 = (defpackage.u18) r2
            v18 r2 = (defpackage.v18) r2
            android.os.Messenger r2 = r2.a
            android.os.IBinder r2 = r2.getBinder()
            java.lang.Object r1 = r1.c
            x3a r1 = (defpackage.x3a) r1
            java.lang.Object r1 = r1.b
            wd8 r1 = (defpackage.wd8) r1
            yr r1 = r1.X
            java.lang.Object r1 = r1.remove(r2)
            l18 r1 = (defpackage.l18) r1
            if (r1 == 0) goto L_0x0316
            r2.unlinkToDeath(r1, r0)
        L_0x0316:
            return
        L_0x0317:
            java.lang.Object r0 = r1.c
            m18 r0 = (defpackage.m18) r0
            java.lang.Object r2 = r0.a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r3 = r2.isEmpty()
            java.lang.Object r1 = r1.b
            uc8 r1 = (defpackage.uc8) r1
            if (r3 != 0) goto L_0x034c
            mn6 r3 = r1.a()
            if (r3 == 0) goto L_0x0349
            java.util.Iterator r4 = r2.iterator()
        L_0x0333:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0349
            java.lang.Object r5 = r4.next()
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "extra_session_binder"
            android.os.IBinder r7 = r3.asBinder()
            r5.putBinder(r6, r7)
            goto L_0x0333
        L_0x0349:
            r2.clear()
        L_0x034c:
            java.lang.Object r0 = r0.b
            o18 r0 = (defpackage.o18) r0
            r0.getClass()
            java.lang.Object r1 = r1.b
            android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
            r1.getClass()
            r0.setSessionToken(r1)
            return
        L_0x035e:
            java.lang.Object r0 = r1.c
            ci7 r0 = (defpackage.ci7) r0
            java.lang.Object r3 = r0.c
            monitor-enter(r3)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0383 }
            ci7 r0 = (defpackage.ci7) r0     // Catch:{ all -> 0x0383 }
            t26 r0 = r0.o     // Catch:{ all -> 0x0383 }
            java.lang.Object r2 = r1.b     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r0.apply(r2)     // Catch:{ all -> 0x0383 }
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0383 }
            ci7 r2 = (defpackage.ci7) r2     // Catch:{ all -> 0x0383 }
            java.lang.Object r4 = r2.a     // Catch:{ all -> 0x0383 }
            if (r4 != 0) goto L_0x0385
            if (r0 == 0) goto L_0x0385
            r2.a = r0     // Catch:{ all -> 0x0383 }
            vh8 r1 = r2.X     // Catch:{ all -> 0x0383 }
            r1.i(r0)     // Catch:{ all -> 0x0383 }
            goto L_0x0398
        L_0x0383:
            r0 = move-exception
            goto L_0x039a
        L_0x0385:
            if (r4 == 0) goto L_0x0398
            boolean r2 = r4.equals(r0)     // Catch:{ all -> 0x0383 }
            if (r2 != 0) goto L_0x0398
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x0383 }
            ci7 r1 = (defpackage.ci7) r1     // Catch:{ all -> 0x0383 }
            r1.a = r0     // Catch:{ all -> 0x0383 }
            vh8 r1 = r1.X     // Catch:{ all -> 0x0383 }
            r1.i(r0)     // Catch:{ all -> 0x0383 }
        L_0x0398:
            monitor-exit(r3)     // Catch:{ all -> 0x0383 }
            return
        L_0x039a:
            monitor-exit(r3)     // Catch:{ all -> 0x0383 }
            throw r0
        L_0x039c:
            java.lang.Object r3 = r1.c
            o27 r3 = (defpackage.o27) r3
            androidx.recyclerview.widget.RecyclerView r4 = r3.G0
            if (r4 == 0) goto L_0x03e6
            boolean r4 = r4.K0
            if (r4 == 0) goto L_0x03e6
            java.lang.Object r4 = r1.b
            k27 r4 = (defpackage.k27) r4
            boolean r5 = r4.k
            if (r5 != 0) goto L_0x03e6
            b7c r4 = r4.e
            int r4 = r4.g()
            r5 = -1
            if (r4 == r5) goto L_0x03e6
            androidx.recyclerview.widget.RecyclerView r4 = r3.G0
            k6c r4 = r4.getItemAnimator()
            if (r4 == 0) goto L_0x03c7
            boolean r4 = r4.f()
            if (r4 != 0) goto L_0x03d9
        L_0x03c7:
            java.util.ArrayList r4 = r3.E0
            int r5 = r4.size()
        L_0x03cd:
            if (r0 >= r5) goto L_0x03e1
            java.lang.Object r6 = r4.get(r0)
            k27 r6 = (defpackage.k27) r6
            boolean r6 = r6.l
            if (r6 != 0) goto L_0x03df
        L_0x03d9:
            androidx.recyclerview.widget.RecyclerView r0 = r3.G0
            r0.post(r1)
            goto L_0x03e6
        L_0x03df:
            int r0 = r0 + r2
            goto L_0x03cd
        L_0x03e1:
            n27 r0 = r3.B0
            r0.getClass()
        L_0x03e6:
            return
        L_0x03e7:
            java.lang.Object r2 = r1.c
            b46 r2 = (defpackage.b46) r2
            z36 r3 = r2.a
            java.lang.Object r1 = r1.b
            z36 r1 = (defpackage.z36) r1
            r2.a = r1
            if (r3 == 0) goto L_0x03fc
            r3.h = r0
            int r0 = r3.d
            android.opengl.GLES20.glDeleteProgram(r0)
        L_0x03fc:
            z36 r0 = r2.a
            boolean r1 = r0.h
            if (r1 != 0) goto L_0x0405
            r0.a()
        L_0x0405:
            z36 r0 = r2.a
            int r0 = r0.d
            android.opengl.GLES20.glUseProgram(r0)
            z36 r0 = r2.a
            int r1 = r2.Z
            int r2 = r2.w0
            r0.b(r1, r2)
            return
        L_0x0416:
            java.lang.Object r0 = r1.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r1.c
            bi5 r1 = (bi5) r1
            tge.b(r0, r1)
            return
        L_0x0422:
            java.lang.Object r0 = r1.b
            t15 r0 = (defpackage.t15) r0
            bw1 r2 = r0.b
            java.lang.Object r1 = r1.c
            y15 r1 = (defpackage.y15) r1
            xi4 r0 = r1.b(r0)
            r2.getClass()
            defpackage.bj4.c(r2, r0)
            return
        L_0x0437:
            a24 r0 = defpackage.a24.B()
            java.lang.String r2 = defpackage.qd4.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Scheduling work "
            r3.<init>(r4)
            java.lang.Object r4 = r1.b
            ztf r4 = (defpackage.ztf) r4
            java.lang.String r5 = r4.a
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.t(r2, r3)
            java.lang.Object r0 = r1.c
            qd4 r0 = (defpackage.qd4) r0
            qb6 r0 = r0.a
            ztf[] r1 = new defpackage.ztf[]{r4}
            r0.e(r1)
            return
        L_0x0462:
            java.lang.Object r0 = r1.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x046a:
            boolean r4 = r2.hasNext()
            java.lang.Object r5 = r1.c
            w84 r5 = (defpackage.w84) r5
            if (r4 == 0) goto L_0x0500
            java.lang.Object r4 = r2.next()
            u84 r4 = (defpackage.u84) r4
            r5.getClass()
            b7c r6 = r4.a
            if (r6 != 0) goto L_0x0483
            r10 = r3
            goto L_0x0486
        L_0x0483:
            android.view.View r6 = r6.a
            r10 = r6
        L_0x0486:
            b7c r6 = r4.b
            if (r6 == 0) goto L_0x048e
            android.view.View r6 = r6.a
            r12 = r6
            goto L_0x048f
        L_0x048e:
            r12 = r3
        L_0x048f:
            java.util.ArrayList r13 = r5.r
            r14 = 0
            if (r10 == 0) goto L_0x04cd
            android.view.ViewPropertyAnimator r6 = r10.animate()
            long r7 = r5.f
            android.view.ViewPropertyAnimator r9 = r6.setDuration(r7)
            b7c r6 = r4.a
            r13.add(r6)
            int r6 = r4.e
            int r7 = r4.c
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.translationX(r6)
            int r6 = r4.f
            int r7 = r4.d
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.translationY(r6)
            android.view.ViewPropertyAnimator r15 = r9.alpha(r14)
            t84 r11 = new t84
            r16 = 0
            r6 = r11
            r7 = r5
            r8 = r4
            r3 = r11
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r15.setListener(r3)
            r3.start()
        L_0x04cd:
            if (r12 == 0) goto L_0x04fd
            android.view.ViewPropertyAnimator r9 = r12.animate()
            b7c r3 = r4.b
            r13.add(r3)
            android.view.ViewPropertyAnimator r3 = r9.translationX(r14)
            android.view.ViewPropertyAnimator r3 = r3.translationY(r14)
            long r6 = r5.f
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r6)
            t84 r13 = new t84
            r11 = 1
            r6 = r13
            r7 = r5
            r8 = r4
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r3.setListener(r13)
            r3.start()
        L_0x04fd:
            r3 = 0
            goto L_0x046a
        L_0x0500:
            r0.clear()
            java.util.ArrayList r1 = r5.n
            r1.remove(r0)
            return
        L_0x0509:
            java.lang.Object r2 = r1.c     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            oy1 r2 = (defpackage.oy1) r2     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            java.lang.Object r3 = r1.b     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            ch7 r3 = (defpackage.ch7) r3     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            java.lang.Object r3 = ct0.s(r3)     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            sn1 r2 = r2.b     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            if (r2 == 0) goto L_0x0537
            r2.b(r3)     // Catch:{ CancellationException -> 0x0530, ExecutionException -> 0x051f }
            goto L_0x0537
        L_0x051d:
            r0 = move-exception
            goto L_0x053f
        L_0x051f:
            r0 = move-exception
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x051d }
            oy1 r2 = (defpackage.oy1) r2     // Catch:{ all -> 0x051d }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x051d }
            sn1 r2 = r2.b     // Catch:{ all -> 0x051d }
            if (r2 == 0) goto L_0x0537
            r2.d(r0)     // Catch:{ all -> 0x051d }
            goto L_0x0537
        L_0x0530:
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x051d }
            oy1 r2 = (defpackage.oy1) r2     // Catch:{ all -> 0x051d }
            r2.cancel(r0)     // Catch:{ all -> 0x051d }
        L_0x0537:
            java.lang.Object r0 = r1.c
            oy1 r0 = (defpackage.oy1) r0
            r1 = 0
            r0.Z = r1
            return
        L_0x053f:
            java.lang.Object r1 = r1.c
            oy1 r1 = (defpackage.oy1) r1
            r2 = 0
            r1.Z = r2
            throw r0
        L_0x0547:
            java.lang.Object r0 = r1.c
            lu r0 = (defpackage.lu) r0
            mu r2 = r0.X
            int r3 = r2.g
            int r4 = r0.c
            if (r3 != r4) goto L_0x056d
            java.util.List r3 = r0.b
            java.lang.Runnable r0 = r0.o
            java.util.List r4 = r2.f
            r2.e = r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r2.f = r3
            yg7 r3 = r2.a
            java.lang.Object r1 = r1.b
            ug4 r1 = (defpackage.ug4) r1
            r1.a(r3)
            r2.a(r4, r0)
        L_0x056d:
            return
        L_0x056e:
            java.lang.Object r0 = r1.b
            zz3 r0 = (defpackage.zz3) r0
            java.lang.Object r1 = r1.c
            g0 r1 = (defpackage.g0) r1
            r0.b(r1)
            return
        L_0x057a:
            r2 = r3
            java.lang.Object r0 = r1.b
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            boolean r3 = r0 instanceof defpackage.rz6
            java.lang.Object r1 = r1.c
            h36 r1 = (defpackage.h36) r1
            if (r3 == 0) goto L_0x05a5
            r3 = r0
            rz6 r3 = (defpackage.rz6) r3
            k1 r3 = (defpackage.k1) r3
            r3.getClass()
            boolean r4 = r3 instanceof defpackage.d1
            if (r4 == 0) goto L_0x059e
            java.lang.Object r3 = r3.a
            boolean r4 = r3 instanceof defpackage.t0
            if (r4 == 0) goto L_0x059e
            t0 r3 = (defpackage.t0) r3
            java.lang.Throwable r3 = r3.a
            goto L_0x059f
        L_0x059e:
            r3 = r2
        L_0x059f:
            if (r3 == 0) goto L_0x05a5
            r1.e(r3)
            goto L_0x05bc
        L_0x05a5:
            java.lang.Object r0 = swb.u(r0)     // Catch:{ ExecutionException -> 0x05b3, all -> 0x05ad }
            r1.a(r0)
            goto L_0x05bc
        L_0x05ad:
            r0 = move-exception
            r2 = r0
            r1.e(r2)
            goto L_0x05bc
        L_0x05b3:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r0 = r2.getCause()
            r1.e(r0)
        L_0x05bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p36.run():void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [nu7, java.lang.Object] */
    public String toString() {
        switch (this.a) {
            case 0:
                w4g w4g = new w4g(p36.class.getSimpleName());
                ? obj = new Object();
                ((nu7) w4g.o).b = obj;
                w4g.o = obj;
                obj.a = (h36) this.c;
                return w4g.toString();
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((qyc) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p36(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ p36(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public p36(qyc qyc) {
        this.a = 20;
        this.c = qyc;
    }

    public p36(o27 o27, k27 k27, int i) {
        this.a = 9;
        this.c = o27;
        this.b = k27;
    }
}
