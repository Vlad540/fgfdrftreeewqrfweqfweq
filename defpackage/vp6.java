package defpackage;

import android.view.View;

/* renamed from: vp6  reason: default package */
public final class vp6 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vp6(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
        try {
            d();
        } catch (Error e) {
            synchronized (((ryc) this.b).a) {
                ((ryc) this.b).o = 1;
                throw e;
            }
        }
    }

    private final void c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        urd.l(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u3d a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            q07 r0 = (q07) r0
            u3d r1 = new u3d
            r1.<init>()
            aec r0 = r0.a
            ygd r2 = new ygd
            java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            r2.<init>(r3)
            r3 = 0
            android.database.Cursor r0 = r0.o(r2, r3)
        L_0x0017:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x002c
            r2 = 0
            int r2 = r0.getInt(r2)     // Catch:{ all -> 0x002a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002a }
            r1.add(r2)     // Catch:{ all -> 0x002a }
            goto L_0x0017
        L_0x002a:
            r4 = move-exception
            goto L_0x0068
        L_0x002c:
            urd.l(r0, r3)
            u3d r0 = z3d.h(r1)
            ht7 r1 = r0.a
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r4.b
            q07 r1 = (q07) r1
            yz5 r1 = r1.h
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x005d
            java.lang.Object r4 = r4.b
            q07 r4 = (q07) r4
            yz5 r4 = r4.h
            if (r4 == 0) goto L_0x0053
            r4.n()
            goto L_0x0067
        L_0x0053:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
        L_0x005d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
        L_0x0067:
            return r0
        L_0x0068:
            throw r4     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            urd.l(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp6.a():u3d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.b     // Catch:{ all -> 0x0055 }
            ryc r2 = (ryc) r2     // Catch:{ all -> 0x0055 }
            java.util.ArrayDeque r2 = r2.a     // Catch:{ all -> 0x0055 }
            monitor-enter(r2)     // Catch:{ all -> 0x0055 }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.b     // Catch:{ all -> 0x0020 }
            ryc r0 = (ryc) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.o     // Catch:{ all -> 0x0020 }
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
            goto L_0x005b
        L_0x0022:
            long r6 = r0.X     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.X = r6     // Catch:{ all -> 0x0020 }
            r0.o = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.b     // Catch:{ all -> 0x0020 }
            ryc r4 = (ryc) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.a     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004b
            java.lang.Object r10 = r10.b     // Catch:{ all -> 0x0020 }
            ryc r10 = (ryc) r10     // Catch:{ all -> 0x0020 }
            r10.o = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004a
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x004a:
            return
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0055 }
            r1 = r1 | r2
            r4.run()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x0002
        L_0x0055:
            r10 = move-exception
            goto L_0x005d
        L_0x0057:
            r4.toString()     // Catch:{ all -> 0x0055 }
            goto L_0x0002
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x0055 }
        L_0x005d:
            if (r1 == 0) goto L_0x0066
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0066:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp6.d():void");
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [android.view.View, xp6] */
    /* JADX WARNING: type inference failed for: r15v16, types: [android.view.View, o87] */
    /* JADX WARNING: type inference failed for: r15v28, types: [ry7, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024c, code lost:
        if (r11 < 0) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026f, code lost:
        if (r11 > 0) goto L_0x0273;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x03a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r15.a
            switch(r3) {
                case 0: goto L_0x03e6;
                case 1: goto L_0x0335;
                case 2: goto L_0x0316;
                case 3: goto L_0x01f9;
                case 4: goto L_0x01d5;
                case 5: goto L_0x01cc;
                case 6: goto L_0x01ab;
                case 7: goto L_0x01a3;
                case 8: goto L_0x019b;
                case 9: goto L_0x0193;
                case 10: goto L_0x017a;
                case 11: goto L_0x015e;
                case 12: goto L_0x0146;
                case 13: goto L_0x013e;
                case 14: goto L_0x0127;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00df;
                case 17: goto L_0x00d5;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00bf;
                case 20: goto L_0x00b7;
                case 21: goto L_0x006a;
                case 22: goto L_0x0062;
                case 23: goto L_0x005a;
                case 24: goto L_0x0050;
                case 25: goto L_0x0036;
                case 26: goto L_0x0032;
                case 27: goto L_0x0011;
                case 28: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r15 = r15.b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r15 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r15
            r15.M0()
            return
        L_0x0011:
            java.lang.Object r15 = r15.b
            gkd r15 = (gkd) r15
            boolean r0 = r15.w0
            if (r0 != 0) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            float r0 = r15.x0
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 + r1
            r15.x0 = r0
            r15.invalidateSelf()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 3
            long r0 = r0 + r2
            vp6 r2 = r15.Z
            r15.scheduleSelf(r2, r0)
        L_0x0031:
            return
        L_0x0032:
            r15.b()
            return
        L_0x0036:
            java.lang.Object r15 = r15.b
            androidx.appcompat.widget.SearchView$SearchAutoComplete r15 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r15
            boolean r0 = r15.y0
            if (r0 == 0) goto L_0x004f
            android.content.Context r0 = r15.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.showSoftInput(r15, r1)
            r15.y0 = r1
        L_0x004f:
            return
        L_0x0050:
            java.lang.Object r15 = r15.b
            sgc r15 = (sgc) r15
            r15.g = r2
            r15.A()
            return
        L_0x005a:
            java.lang.Object r15 = r15.b
            ur3 r15 = (ur3) r15
            r15.u()
            return
        L_0x0062:
            java.lang.Object r15 = r15.b
            vzb r15 = (defpackage.vzb) r15
            r15.g(r2)
            return
        L_0x006a:
            java.lang.Object r2 = r15.b
            l1b r2 = (l1b) r2
            monitor-enter(r2)
            java.lang.Object r3 = r15.b     // Catch:{ all -> 0x00b4 }
            l1b r3 = (l1b) r3     // Catch:{ all -> 0x00b4 }
            e13 r4 = r3.g     // Catch:{ all -> 0x00b4 }
            int r5 = r3.h     // Catch:{ all -> 0x00b4 }
            r3.g = r0     // Catch:{ all -> 0x00b4 }
            r3.i = r1     // Catch:{ all -> 0x00b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            boolean r0 = e13.n0(r4)
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r15.b     // Catch:{ all -> 0x008d }
            l1b r0 = (l1b) r0     // Catch:{ all -> 0x008d }
            l1b.m(r0, r4, r5)     // Catch:{ all -> 0x008d }
            e13.S(r4)
            goto L_0x0092
        L_0x008d:
            r15 = move-exception
            e13.S(r4)
            throw r15
        L_0x0092:
            java.lang.Object r15 = r15.b
            l1b r15 = (l1b) r15
            monitor-enter(r15)
            r15.j = r1     // Catch:{ all -> 0x00b1 }
            boolean r0 = r15.q()     // Catch:{ all -> 0x00b1 }
            monitor-exit(r15)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00b0
            rh9 r0 = r15.k
            java.lang.Object r0 = r0.d
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            vp6 r1 = new vp6
            r2 = 21
            r1.<init>(r2, r15)
            r0.execute(r1)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00b1 }
            throw r0
        L_0x00b4:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            throw r15
        L_0x00b7:
            java.lang.Object r15 = r15.b
            b7e r15 = (defpackage.b7e) r15
            r15.d()
            return
        L_0x00bf:
            java.lang.Object r15 = r15.b
            androidx.appcompat.widget.AppCompatEditText r15 = (androidx.appcompat.widget.AppCompatEditText) r15
            int r0 = r15.length()
            r15.setSelection(r0)
            return
        L_0x00cb:
            k77[] r0 = one.me.sdk.uikit.common.button.OneMeButton.F0
            java.lang.Object r15 = r15.b
            one.me.sdk.uikit.common.button.OneMeButton r15 = (one.me.sdk.uikit.common.button.OneMeButton) r15
            r15.j()
            return
        L_0x00d5:
            java.lang.Object r15 = r15.b
            aw9 r15 = (aw9) r15
            xi4 r15 = r15.c
            r15.f()
            return
        L_0x00df:
            java.lang.Object r15 = r15.b
            ft9 r15 = (ft9) r15
            bw9 r0 = r15.a     // Catch:{ all -> 0x00ee }
            r0.b()     // Catch:{ all -> 0x00ee }
            omc r15 = r15.o
            r15.f()
            return
        L_0x00ee:
            r0 = move-exception
            omc r15 = r15.o
            r15.f()
            throw r0
        L_0x00f5:
            java.lang.Object r15 = r15.b
            cx8 r15 = (defpackage.cx8) r15
            s16 r0 = r15.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0126
            xv8 r0 = defpackage.xv8.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<xr7> r1 = defpackage.xr7.class
            java.lang.Object r0 = r0.c(r1)
            xr7 r0 = (defpackage.xr7) r0
            pma r1 = new pma
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.a(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.a
            r0.q0(r15)
        L_0x0126:
            return
        L_0x0127:
            k77[] r0 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.d1
            java.lang.Object r15 = r15.b
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r15 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r15
            android.view.ViewGroup r0 = r15.A0()
            android.view.ViewGroup r15 = r15.A0()
            int r15 = r15.getHeight()
            float r15 = (float) r15
            r0.setTranslationY(r15)
            return
        L_0x013e:
            java.lang.Object r15 = r15.b
            ub8 r15 = (ub8) r15
            r15.j()
            return
        L_0x0146:
            java.lang.Object r15 = r15.b
            rq0 r15 = (defpackage.rq0) r15
            java.lang.Object r15 = r15.c
            androidx.mediarouter.app.d r15 = (androidx.mediarouter.app.d) r15
            xb8 r1 = r15.a1
            if (r1 == 0) goto L_0x015d
            r15.a1 = r0
            boolean r0 = r15.q1
            if (r0 == 0) goto L_0x015d
            boolean r0 = r15.r1
            r15.q(r0)
        L_0x015d:
            return
        L_0x015e:
            java.lang.Object r15 = r15.b
            androidx.mediarouter.app.d r15 = (androidx.mediarouter.app.d) r15
            r15.j(r2)
            androidx.mediarouter.app.OverlayListView r0 = r15.S0
            r0.requestLayout()
            androidx.mediarouter.app.OverlayListView r0 = r15.S0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            tn r1 = new tn
            r2 = 3
            r1.<init>(r2, r15)
            r0.addOnGlobalLayoutListener(r1)
            return
        L_0x017a:
            java.lang.Object r15 = r15.b
            l18 r15 = (l18) r15
            wd8 r0 = r15.g
            yr r0 = r0.X
            u18 r15 = r15.e
            r15.getClass()
            v18 r15 = (v18) r15
            android.os.Messenger r15 = r15.a
            android.os.IBinder r15 = r15.getBinder()
            r0.remove(r15)
            return
        L_0x0193:
            java.lang.Object r15 = r15.b
            ry7 r15 = (defpackage.ry7) r15
            r15.requestLayout()
            return
        L_0x019b:
            java.lang.Object r15 = r15.b
            ij7 r15 = (ij7) r15
            r15.a()
            return
        L_0x01a3:
            java.lang.Object r15 = r15.b
            hj7 r15 = (hj7) r15
            r15.a()
            return
        L_0x01ab:
            java.lang.Object r0 = r15.b
            yh7 r0 = (yh7) r0
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.lang.Object r0 = r15.b     // Catch:{ all -> 0x01c9 }
            yh7 r0 = (yh7) r0     // Catch:{ all -> 0x01c9 }
            java.lang.Object r0 = r0.f     // Catch:{ all -> 0x01c9 }
            java.lang.Object r2 = r15.b     // Catch:{ all -> 0x01c9 }
            yh7 r2 = (yh7) r2     // Catch:{ all -> 0x01c9 }
            java.lang.Object r3 = yh7.k     // Catch:{ all -> 0x01c9 }
            r2.f = r3     // Catch:{ all -> 0x01c9 }
            monitor-exit(r1)     // Catch:{ all -> 0x01c9 }
            java.lang.Object r15 = r15.b
            yh7 r15 = (yh7) r15
            r15.k(r0)
            return
        L_0x01c9:
            r15 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c9 }
            throw r15
        L_0x01cc:
            java.lang.Object r15 = r15.b
            og7 r15 = (og7) r15
            r15.b = r0
            r15.a = r0
            return
        L_0x01d5:
            int r0 = defpackage.qhc.A0
            java.lang.Object r15 = r15.b
            o87 r15 = (defpackage.o87) r15
            android.view.View r0 = r15.findViewById(r0)
            android.graphics.drawable.GradientDrawable r1 = r15.getIndicatorDrawable()
            int r0 = r0.getMeasuredWidth()
            int r2 = r15.getMeasuredHeight()
            int r3 = r15.getPaddingTop()
            int r2 = r2 - r3
            int r15 = r15.getPaddingBottom()
            int r2 = r2 - r15
            r1.setSize(r0, r2)
            return
        L_0x01f9:
            java.lang.Object r0 = r15.b
            o27 r0 = (o27) r0
            b7c r2 = r0.c
            if (r2 == 0) goto L_0x0315
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.Q0
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0210
            r4 = 0
            goto L_0x0212
        L_0x0210:
            long r4 = r2 - r4
        L_0x0212:
            androidx.recyclerview.widget.RecyclerView r8 = r0.G0
            androidx.recyclerview.widget.a r8 = r8.getLayoutManager()
            android.graphics.Rect r9 = r0.P0
            if (r9 != 0) goto L_0x0223
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.P0 = r9
        L_0x0223:
            b7c r9 = r0.c
            android.view.View r9 = r9.a
            android.graphics.Rect r10 = r0.P0
            r8.d(r10, r9)
            boolean r9 = r8.e()
            r10 = 0
            if (r9 == 0) goto L_0x0272
            float r9 = r0.y0
            float r11 = r0.w0
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.P0
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.G0
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.w0
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x024f
            if (r11 >= 0) goto L_0x024f
            goto L_0x0273
        L_0x024f:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0272
            b7c r11 = r0.c
            android.view.View r11 = r11.a
            int r11 = r11.getWidth()
            int r11 = r11 + r9
            android.graphics.Rect r9 = r0.P0
            int r9 = r9.right
            int r11 = r11 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.G0
            int r9 = r9.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.G0
            int r12 = r12.getPaddingRight()
            int r9 = r9 - r12
            int r11 = r11 - r9
            if (r11 <= 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r11 = r1
        L_0x0273:
            boolean r8 = r8.f()
            if (r8 == 0) goto L_0x02b9
            float r8 = r0.z0
            float r9 = r0.x0
            float r8 = r8 + r9
            int r8 = (int) r8
            android.graphics.Rect r9 = r0.P0
            int r9 = r9.top
            int r9 = r8 - r9
            androidx.recyclerview.widget.RecyclerView r12 = r0.G0
            int r12 = r12.getPaddingTop()
            int r9 = r9 - r12
            float r12 = r0.x0
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0296
            if (r9 >= 0) goto L_0x0296
        L_0x0294:
            r1 = r9
            goto L_0x02b9
        L_0x0296:
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x02b9
            b7c r9 = r0.c
            android.view.View r9 = r9.a
            int r9 = r9.getHeight()
            int r9 = r9 + r8
            android.graphics.Rect r8 = r0.P0
            int r8 = r8.bottom
            int r9 = r9 + r8
            androidx.recyclerview.widget.RecyclerView r8 = r0.G0
            int r8 = r8.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.G0
            int r10 = r10.getPaddingBottom()
            int r8 = r8 - r10
            int r9 = r9 - r8
            if (r9 <= 0) goto L_0x02b9
            goto L_0x0294
        L_0x02b9:
            if (r11 == 0) goto L_0x02d1
            androidx.recyclerview.widget.RecyclerView r9 = r0.G0
            b7c r8 = r0.c
            android.view.View r8 = r8.a
            int r10 = r8.getWidth()
            androidx.recyclerview.widget.RecyclerView r8 = r0.G0
            r8.getWidth()
            n27 r8 = r0.B0
            r12 = r4
            int r11 = r8.f(r9, r10, r11, r12)
        L_0x02d1:
            r14 = r11
            if (r1 == 0) goto L_0x02eb
            androidx.recyclerview.widget.RecyclerView r9 = r0.G0
            b7c r8 = r0.c
            android.view.View r8 = r8.a
            int r10 = r8.getHeight()
            androidx.recyclerview.widget.RecyclerView r8 = r0.G0
            r8.getHeight()
            n27 r8 = r0.B0
            r11 = r1
            r12 = r4
            int r1 = r8.f(r9, r10, r11, r12)
        L_0x02eb:
            if (r14 != 0) goto L_0x02f3
            if (r1 == 0) goto L_0x02f0
            goto L_0x02f3
        L_0x02f0:
            r0.Q0 = r6
            goto L_0x0315
        L_0x02f3:
            long r4 = r0.Q0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x02fb
            r0.Q0 = r2
        L_0x02fb:
            androidx.recyclerview.widget.RecyclerView r2 = r0.G0
            r2.scrollBy(r14, r1)
            b7c r1 = r0.c
            if (r1 == 0) goto L_0x0307
            r0.q(r1)
        L_0x0307:
            androidx.recyclerview.widget.RecyclerView r1 = r0.G0
            vp6 r2 = r0.H0
            r1.removeCallbacks(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r0.G0
            java.util.WeakHashMap r1 = eaf.a
            r0.postOnAnimation(r15)
        L_0x0315:
            return
        L_0x0316:
            java.lang.Object r15 = r15.b
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r15 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r15
            android.view.View r0 = r15.getView()
            if (r0 == 0) goto L_0x0334
            k77[] r0 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.F0
            y7a r15 = r15.n0()
            android.widget.EditText r0 = r15.A0
            r0.requestFocus()
            hg9 r1 = new hg9
            r2 = 4
            r1.<init>(r15, r2, r0)
            r0.post(r1)
        L_0x0334:
            return
        L_0x0335:
            java.lang.Object r0 = r15.b
            q07 r0 = (q07) r0
            aec r0 = r0.a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.lang.Object r3 = r15.b     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            q07 r3 = (q07) r3     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            boolean r3 = r3.b()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            if (r3 != 0) goto L_0x035a
        L_0x034e:
            r0.unlock()
            java.lang.Object r15 = r15.b
            q07 r15 = (q07) r15
            r15.getClass()
            goto L_0x03da
        L_0x035a:
            java.lang.Object r3 = r15.b     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            q07 r3 = (q07) r3     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            boolean r1 = r3.compareAndSet(r2, r1)     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            if (r1 != 0) goto L_0x0367
            goto L_0x034e
        L_0x0367:
            java.lang.Object r1 = r15.b     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            q07 r1 = (q07) r1     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            aec r1 = r1.a     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            boolean r1 = r1.k()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            if (r1 == 0) goto L_0x0374
            goto L_0x034e
        L_0x0374:
            java.lang.Object r1 = r15.b     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            q07 r1 = (q07) r1     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            aec r1 = r1.a     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            d4e r1 = r1.h()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            sz5 r1 = r1.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            r1.n()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            u3d r3 = r15.a()     // Catch:{ all -> 0x039c }
            r1.r0()     // Catch:{ all -> 0x039c }
            r1.S()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
        L_0x038f:
            r0.unlock()
            java.lang.Object r0 = r15.b
            q07 r0 = (q07) r0
            r0.getClass()
            goto L_0x03a7
        L_0x039a:
            r1 = move-exception
            goto L_0x03db
        L_0x039c:
            r3 = move-exception
            r1.S()     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
            throw r3     // Catch:{ IllegalStateException -> 0x03a4, SQLiteException -> 0x03a1 }
        L_0x03a1:
            qw4 r3 = qw4.a     // Catch:{ all -> 0x039a }
            goto L_0x038f
        L_0x03a4:
            qw4 r3 = qw4.a     // Catch:{ all -> 0x039a }
            goto L_0x038f
        L_0x03a7:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x03da
            java.lang.Object r15 = r15.b
            q07 r15 = (q07) r15
            ijc r0 = r15.k
            monitor-enter(r0)
            ijc r15 = r15.k     // Catch:{ all -> 0x03d4 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x03d4 }
        L_0x03bb:
            r1 = r15
            ejc r1 = (ejc) r1     // Catch:{ all -> 0x03d4 }
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x03d4 }
            if (r2 == 0) goto L_0x03d6
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x03d4 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x03d4 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x03d4 }
            o07 r1 = (o07) r1     // Catch:{ all -> 0x03d4 }
            r1.a(r3)     // Catch:{ all -> 0x03d4 }
            goto L_0x03bb
        L_0x03d4:
            r15 = move-exception
            goto L_0x03d8
        L_0x03d6:
            monitor-exit(r0)
            goto L_0x03da
        L_0x03d8:
            monitor-exit(r0)
            throw r15
        L_0x03da:
            return
        L_0x03db:
            r0.unlock()
            java.lang.Object r15 = r15.b
            q07 r15 = (q07) r15
            r15.getClass()
            throw r1
        L_0x03e6:
            java.lang.Object r15 = r15.b
            xp6 r15 = (defpackage.xp6) r15
            r15.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp6.run():void");
    }

    public /* synthetic */ vp6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
