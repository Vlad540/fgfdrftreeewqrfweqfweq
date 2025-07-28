package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final oa2 i;

    /* JADX WARNING: type inference failed for: r0v0, types: [oa2, java.lang.Object] */
    public BaseTransientBottomBar$Behavior() {
        ? obj = new Object();
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.i = obj;
    }

    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e3.b == null) {
                    e3.b = new e3(27);
                }
                synchronized (e3.b.a) {
                }
            }
        } else if (coordinatorLayout.h(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e3.b == null) {
                e3.b = new e3(27);
            }
            synchronized (e3.b.a) {
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    public final boolean x(View view) {
        this.i.getClass();
        return view instanceof cj0;
    }
}
