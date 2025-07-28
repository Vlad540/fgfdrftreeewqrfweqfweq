package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: u6e  reason: default package */
public final class u6e extends iu7 {
    public int r;
    public int s = -1;
    public final /* synthetic */ SwipeDismissBehavior t;

    public u6e(SwipeDismissBehavior swipeDismissBehavior) {
        this.t = swipeDismissBehavior;
    }

    public final int B(View view) {
        return view.getWidth();
    }

    public final void J(View view, int i) {
        this.s = i;
        this.r = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.t;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    public final void K(int i) {
        this.t.getClass();
    }

    public final void L(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.t;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.f;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.g;
        float abs = (float) Math.abs(i - this.r);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.r) >= java.lang.Math.round(((float) r9.getWidth()) * r3.e)) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.s = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.t
            r4 = 0
            if (r1 == 0) goto L_0x0039
            java.util.WeakHashMap r5 = defpackage.eaf.a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L_0x001a
            r5 = r2
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L_0x0021
            goto L_0x0052
        L_0x0021:
            if (r6 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0066
            goto L_0x0052
        L_0x002a:
            if (r1 <= 0) goto L_0x0066
            goto L_0x0052
        L_0x002d:
            if (r6 != r2) goto L_0x0066
            if (r5 == 0) goto L_0x0034
            if (r1 <= 0) goto L_0x0066
            goto L_0x0052
        L_0x0034:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0066
            goto L_0x0052
        L_0x0039:
            int r1 = r9.getLeft()
            int r5 = r8.r
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L_0x0066
        L_0x0052:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0061
            int r10 = r9.getLeft()
            int r0 = r8.r
            if (r10 >= r0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            int r0 = r0 + r11
            goto L_0x0069
        L_0x0061:
            int r8 = r8.r
            int r0 = r8 - r11
            goto L_0x0069
        L_0x0066:
            int r0 = r8.r
            r2 = r4
        L_0x0069:
            iaf r8 = r3.a
            int r10 = r9.getTop()
            boolean r8 = r8.n(r0, r10)
            if (r8 == 0) goto L_0x007f
            q36 r8 = new q36
            r8.<init>((com.google.android.material.behavior.SwipeDismissBehavior) r3, (android.view.View) r9, (boolean) r2)
            java.util.WeakHashMap r10 = defpackage.eaf.a
            r9.postOnAnimation(r8)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6e.M(android.view.View, float, float):void");
    }

    public final boolean c0(View view, int i) {
        int i2 = this.s;
        return (i2 == -1 || i2 == i) && this.t.x(view);
    }

    public final int g(View view, int i) {
        int i2;
        int i3;
        int width;
        WeakHashMap weakHashMap = eaf.a;
        boolean z = view.getLayoutDirection() == 1;
        int i4 = this.t.d;
        if (i4 != 0) {
            if (i4 != 1) {
                i3 = this.r - view.getWidth();
                i2 = this.r + view.getWidth();
            } else if (z) {
                i3 = this.r;
                width = view.getWidth();
            } else {
                i3 = this.r - view.getWidth();
                i2 = this.r;
            }
            return Math.min(Math.max(i3, i), i2);
        } else if (z) {
            i3 = this.r - view.getWidth();
            i2 = this.r;
            return Math.min(Math.max(i3, i), i2);
        } else {
            i3 = this.r;
            width = view.getWidth();
        }
        i2 = width + i3;
        return Math.min(Math.max(i3, i), i2);
    }

    public final int h(View view, int i) {
        return view.getTop();
    }
}
