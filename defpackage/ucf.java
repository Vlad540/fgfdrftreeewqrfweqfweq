package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ucf  reason: default package */
public final class ucf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ k96 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public ucf(k96 k96, View view, View view2) {
        this.a = k96;
        this.b = view;
        this.c = view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r1.getClass().equals((java.lang.Class) r0.o) != false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r7 = this;
            k96 r0 = r7.a
            java.lang.Object r1 = r0.Y
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r2 = 1
            int r3 = r0.a
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x002c
            int r6 = r1.getId()
            if (r6 != r3) goto L_0x0026
            boolean r6 = r1.isAttachedToWindow()
            if (r6 == 0) goto L_0x0026
            int r6 = r1.getVisibility()
            if (r6 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r4
        L_0x0027:
            if (r1 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r6 = r5
            goto L_0x0035
        L_0x002c:
            java.lang.Object r1 = r0.Y
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            r1.clear()
            r6 = r2
            r1 = r4
        L_0x0035:
            if (r1 != 0) goto L_0x005b
            android.view.View r1 = r7.b
            if (r1 == 0) goto L_0x0041
            android.view.View r1 = r1.findViewById(r3)
            if (r1 != 0) goto L_0x004b
        L_0x0041:
            android.view.View r7 = r7.c
            android.view.View r7 = r7.getRootView()
            android.view.View r1 = r7.findViewById(r3)
        L_0x004b:
            if (r1 == 0) goto L_0x005c
            java.lang.Class r7 = r1.getClass()
            java.lang.Object r3 = r0.o
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x005c
        L_0x005b:
            r4 = r1
        L_0x005c:
            java.lang.Object r7 = r0.c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r4 == 0) goto L_0x0099
            if (r6 == 0) goto L_0x007c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.Y = r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x007c
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x007c
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x007c:
            r0.b = r2
            java.lang.Object r0 = r0.X
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            defpackage.mcf.d(r0, r4)
            java.util.Iterator r7 = r7.iterator()
        L_0x0089:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r7.next()
            rcf r1 = (defpackage.rcf) r1
            r1.c(r0, r4)
            goto L_0x0089
        L_0x0099:
            boolean r1 = r0.b
            if (r1 == 0) goto L_0x00b3
            r0.b = r5
            java.util.Iterator r7 = r7.iterator()
        L_0x00a3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r7.next()
            rcf r0 = (defpackage.rcf) r0
            r0.a()
            goto L_0x00a3
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucf.onPreDraw():boolean");
    }
}
