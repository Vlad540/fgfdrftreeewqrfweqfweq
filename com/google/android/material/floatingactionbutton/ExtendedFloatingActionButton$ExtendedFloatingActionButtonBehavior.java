package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends kt3 {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public final /* bridge */ /* synthetic */ boolean e(View view) {
        wn6.o(view);
        throw null;
    }

    public final void g(nt3 nt3) {
        if (nt3.h == 0) {
            nt3.h = 80;
        }
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        wn6.o(view);
        throw null;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        wn6.o(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xvb.ExtendedFloatingActionButton_Behavior_Layout);
        obtainStyledAttributes.getBoolean(xvb.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
        obtainStyledAttributes.getBoolean(xvb.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
        obtainStyledAttributes.recycle();
    }
}
