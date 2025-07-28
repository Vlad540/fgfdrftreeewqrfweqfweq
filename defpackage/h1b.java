package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: h1b  reason: default package */
public final class h1b implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public h1b(View view, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int X = a24.X(this.a);
        int X2 = a24.X(this.b);
        View view2 = this.c;
        View rootView = view2.getRootView();
        Rect rect = i1b.a;
        rootView.getWindowVisibleDisplayFrame(rect);
        if (Build.VERSION.SDK_INT >= 30) {
            rect.bottom -= rootView.getRootWindowInsets().getInsets(8).bottom;
        }
        float f = (float) 8;
        int p = me4.p(f, dh4.c().getDisplayMetrics().density, rect.bottom - X2);
        int p2 = me4.p(f, dh4.c().getDisplayMetrics().density, rect.top + X2);
        int measuredHeight = view2.getMeasuredHeight();
        if (p > measuredHeight) {
            X2 = me4.c(f, dh4.c().getDisplayMetrics().density, X2);
        } else if (p2 > measuredHeight) {
            X2 = me4.p(f, dh4.c().getDisplayMetrics().density, X2 - measuredHeight);
        }
        int measuredWidth = view2.getMeasuredWidth();
        if (X + measuredWidth >= rootView.getWidth()) {
            X = (rootView.getWidth() - measuredWidth) - 8;
        }
        view2.setX((float) X);
        view2.setY((float) X2);
    }
}
