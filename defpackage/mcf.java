package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* renamed from: mcf  reason: default package */
public abstract class mcf {
    public static final Rect a = new Rect();
    public static final int[] b = new int[2];

    public static final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final kcf b(ViewGroup viewGroup, s16 s16) {
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        lcf lcf = new lcf(s16, viewTreeObserver, viewGroup);
        viewTreeObserver.addOnGlobalLayoutListener(lcf);
        if (viewGroup.isAttachedToWindow()) {
            if (!viewGroup.isAttachedToWindow()) {
                a(lcf, viewTreeObserver, viewGroup);
            } else {
                viewGroup.addOnAttachStateChangeListener(new jcf(viewGroup, lcf, viewTreeObserver, viewGroup, 1));
            }
        } else if (!viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new jcf(viewGroup, lcf, viewTreeObserver, viewGroup, 0));
        } else if (!viewGroup.isAttachedToWindow()) {
            a(lcf, viewTreeObserver, viewGroup);
        } else {
            viewGroup.addOnAttachStateChangeListener(new jcf(viewGroup, lcf, viewTreeObserver, viewGroup, 2));
        }
        return new kcf(viewTreeObserver, viewGroup, lcf);
    }

    public static final Rect c(View view, View view2) {
        int left = view.getLeft();
        int top = view.getTop();
        ViewParent parent = view.getParent();
        while (parent != view2 && (parent instanceof View)) {
            View view3 = (View) parent;
            int scrollX = left - view3.getScrollX();
            int scrollY = top - view3.getScrollY();
            left = scrollX + view3.getLeft();
            top = scrollY + view3.getTop();
            parent = view3.getParent();
        }
        Rect rect = a;
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
        return rect;
    }

    public static final void d(Rect rect, View view) {
        int[] iArr = b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }
}
