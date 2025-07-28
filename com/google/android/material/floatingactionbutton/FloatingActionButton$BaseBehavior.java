package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class FloatingActionButton$BaseBehavior<T> extends kt3 {
    public FloatingActionButton$BaseBehavior() {
    }

    public final boolean e(View view) {
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

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xvb.FloatingActionButton_Behavior_Layout);
        obtainStyledAttributes.getBoolean(xvb.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        obtainStyledAttributes.recycle();
    }
}
