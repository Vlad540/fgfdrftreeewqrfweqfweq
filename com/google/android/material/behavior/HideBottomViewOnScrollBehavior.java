package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends kt3 {
    public static final int i = wlb.motionDurationLong2;
    public static final int j = wlb.motionDurationMedium4;
    public static final int k = wlb.motionEasingEmphasizedInterpolator;
    public final LinkedHashSet a = new LinkedHashSet();
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f = 0;
    public int g = 2;
    public ViewPropertyAnimator h;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = ct0.H(i, 225, view.getContext());
        this.c = ct0.H(j, 175, view.getContext());
        Context context = view.getContext();
        o85 o85 = og.d;
        int i3 = k;
        this.d = ct0.I(context, i3, o85);
        this.e = ct0.I(view.getContext(), i3, og.c);
        return false;
    }

    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        LinkedHashSet linkedHashSet = this.a;
        if (i3 > 0) {
            if (this.g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    int i7 = this.f;
                    this.h = view.animate().translationY((float) i7).setInterpolator(this.e).setDuration((long) this.c).setListener(new l6(6, (Object) this));
                    return;
                }
                hr1.r(it.next());
                throw null;
            }
        } else if (i3 < 0 && this.g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.h = view.animate().translationY((float) 0).setInterpolator(this.d).setDuration((long) this.b).setListener(new l6(6, (Object) this));
                return;
            }
            hr1.r(it2.next());
            throw null;
        }
    }

    public boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
