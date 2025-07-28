package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: tl2  reason: default package */
public final class tl2 extends FrameLayout {
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getId() != j2a.b) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        int measuredHeight = findViewById(j2a.o).getMeasuredHeight();
        int measuredHeight2 = findViewById(j2a.l).getMeasuredHeight();
        int i5 = Build.VERSION.SDK_INT;
        int stableInsetBottom = i5 >= 30 ? hia.f(getRootWindowInsets(), hia.z()).bottom : getRootWindowInsets().getStableInsetBottom();
        super.measureChildWithMargins(view, i, i2, makeMeasureSpec, Math.max(i4, measuredHeight + measuredHeight2 + (i5 >= 30 ? hia.f(getRootWindowInsets(), hia.z()).top : getRootWindowInsets().getStableInsetTop()) + stableInsetBottom));
    }
}
