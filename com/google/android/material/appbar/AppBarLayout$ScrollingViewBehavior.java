package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.List;
import java.util.WeakHashMap;

public class AppBarLayout$ScrollingViewBehavior extends fbf {
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public int e = 0;
    public final int f;

    public AppBarLayout$ScrollingViewBehavior() {
    }

    public static fm A(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof fm) {
                return (fm) view;
            }
        }
        return null;
    }

    public final int B(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof fm) {
            fm fmVar = (fm) view;
            int totalScrollRange = fmVar.getTotalScrollRange();
            int downNestedPreScrollRange = fmVar.getDownNestedPreScrollRange();
            kt3 kt3 = ((nt3) fmVar.getLayoutParams()).a;
            int D = kt3 instanceof AppBarLayout$BaseBehavior ? ((AppBarLayout$BaseBehavior) kt3).D() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + D > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = (((float) D) / ((float) i)) + 1.0f;
            }
        }
        int i2 = this.f;
        return xy6.j((int) (f2 * ((float) i2)), 0, i2);
    }

    public final boolean f(View view, View view2) {
        return view2 instanceof fm;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        kt3 kt3 = ((nt3) view2.getLayoutParams()).a;
        if (kt3 instanceof AppBarLayout$BaseBehavior) {
            int bottom = (((view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) kt3).j) + this.e) - B(view2);
            WeakHashMap weakHashMap = eaf.a;
            view.offsetTopAndBottom(bottom);
        }
        if (!(view2 instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) view2;
        if (!fmVar.D0) {
            return false;
        }
        fmVar.g(fmVar.h(view));
        return false;
    }

    public final void i(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof fm) {
            eaf.j(coordinatorLayout, (b4) null);
        }
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        fm A;
        nsf lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (A = A(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = eaf.a;
            if (A.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = A.getTotalScrollRange() + size;
        int measuredHeight = A.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.q(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        fm A = A(coordinatorLayout.d(view));
        if (A != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            int width = coordinatorLayout.getWidth();
            int height = coordinatorLayout.getHeight();
            Rect rect3 = this.c;
            rect3.set(0, 0, width, height);
            if (!rect3.contains(rect2)) {
                A.f(false, !z, true);
                return true;
            }
        }
        return false;
    }

    public final void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        fm A = A(coordinatorLayout.d(view));
        if (A != null) {
            nt3 nt3 = (nt3) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + nt3.leftMargin;
            int bottom = A.getBottom() + nt3.topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - nt3.rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, ((A.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - nt3.bottomMargin);
            nsf lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = eaf.a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            int i2 = nt3.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            int i3 = i2;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.d;
            Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
            int B = B(A);
            view.layout(rect2.left, rect2.top - B, rect2.right, rect2.bottom - B);
            this.e = rect2.top - A.getBottom();
            return;
        }
        View view2 = view;
        coordinatorLayout.p(view, i);
        this.e = 0;
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xvb.ScrollingViewBehavior_Layout);
        this.f = obtainStyledAttributes.getDimensionPixelSize(xvb.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        obtainStyledAttributes.recycle();
    }
}
