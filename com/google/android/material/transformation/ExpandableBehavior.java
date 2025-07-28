package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
public abstract class ExpandableBehavior extends kt3 {
    public ExpandableBehavior() {
    }

    public abstract boolean f(View view, View view2);

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        hr1.r(view2);
        throw null;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = eaf.a;
        if (!view.isLaidOut()) {
            List d = coordinatorLayout.d(view);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view, (View) d.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
