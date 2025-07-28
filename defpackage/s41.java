package defpackage;

import android.view.View;

/* renamed from: s41  reason: default package */
public final /* synthetic */ class s41 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [rr3, one.me.chatscreen.ChatScreen, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v12, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            r1 = this;
            java.lang.Object r0 = r1.b
            int r1 = r1.a
            switch(r1) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00e2;
                case 2: goto L_0x0041;
                case 3: goto L_0x001c;
                default: goto L_0x0007;
            }
        L_0x0007:
            k3b r0 = (defpackage.k3b) r0
            r0.getClass()
            int r5 = r5 - r3
            int r9 = r9 - r7
            if (r5 != r9) goto L_0x0014
            int r6 = r6 - r4
            int r10 = r10 - r8
            if (r6 == r10) goto L_0x001b
        L_0x0014:
            r0.b()
            r1 = 1
            r0.a(r1)
        L_0x001b:
            return
        L_0x001c:
            k77[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            r0.getClass()
            k77[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            r2 = 7
            r1 = r1[r2]
            nl0 r1 = r0.C0
            java.lang.Object r1 = r1.getValue()
            az1 r1 = (defpackage.az1) r1
            int r6 = r6 - r4
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            r1.setPadding(r2, r3, r4, r6)
            return
        L_0x0041:
            k77[] r1 = one.me.chatscreen.ChatScreen.n1
            one.me.chatscreen.ChatScreen r0 = (one.me.chatscreen.ChatScreen) r0
            android.view.View r1 = r0.getView()
            if (r1 != 0) goto L_0x004d
            goto L_0x00e1
        L_0x004d:
            int r1 = r2.getMeasuredHeight()
            int r3 = r2.getPaddingBottom()
            int r1 = r1 - r3
            android.view.ViewGroup r3 = r0.H0()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r5 = 0
            if (r4 == 0) goto L_0x0066
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0067
        L_0x0066:
            r3 = r5
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            int r3 = r3.bottomMargin
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r1 == r3) goto L_0x0091
            android.view.ViewGroup r3 = r0.H0()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r4 = 48
            float r4 = (float) r4
            android.content.res.Resources r6 = dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = defpackage.a24.X(r4)
            int r4 = java.lang.Math.max(r1, r4)
            r3.bottomMargin = r4
        L_0x0091:
            az1 r3 = r0.K0()
            int r3 = r3.getPaddingBottom()
            if (r1 == r3) goto L_0x00ae
            az1 r3 = r0.K0()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x00aa
            r5 = r3
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x00aa:
            if (r5 == 0) goto L_0x00ae
            r5.bottomMargin = r1
        L_0x00ae:
            int r1 = r2.getMeasuredHeight()
            k77[] r3 = one.me.chatscreen.ChatScreen.n1
            r4 = 14
            r5 = r3[r4]
            n0c r6 = r0.Y0
            java.lang.Object r5 = r6.T0(r0, r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            int r5 = r5.getPaddingBottom()
            if (r1 == r5) goto L_0x00e1
            r1 = r3[r4]
            java.lang.Object r1 = r6.T0(r0, r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r2 = r2.getMeasuredHeight()
            int r3 = r1.getPaddingLeft()
            int r4 = r1.getPaddingTop()
            int r5 = r1.getPaddingRight()
            r1.setPadding(r3, r4, r5, r2)
        L_0x00e1:
            return
        L_0x00e2:
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.getClass()
            if (r3 != r7) goto L_0x00ef
            if (r4 != r8) goto L_0x00ef
            if (r5 != r9) goto L_0x00ef
            if (r6 == r10) goto L_0x00f9
        L_0x00ef:
            ds1 r1 = new ds1
            r3 = 8
            r1.<init>(r3, r0)
            r2.post(r1)
        L_0x00f9:
            return
        L_0x00fa:
            one.me.calls.ui.ui.call.panels.CallEventsWidget r0 = (one.me.calls.ui.ui.call.panels.CallEventsWidget) r0
            java.util.ArrayList r1 = r0.c
            java.util.Iterator r1 = r1.iterator()
        L_0x0102:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r1.next()
            kg1 r2 = (defpackage.kg1) r2
            one.me.calls.ui.ui.call.CallScreen r2 = r2.a
            dwa r2 = r2.B0
            r2.c()
            goto L_0x0102
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s41.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
