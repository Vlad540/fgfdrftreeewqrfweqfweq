package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class ChatMediaRowLayout extends FrameLayout {
    public final zg4 a = zg4.b();

    public ChatMediaRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onMeasure(int i, int i2) {
        WindowInsets rootWindowInsets;
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getRootView().getMeasuredWidth();
        View rootView = getRootView();
        Rect rect = null;
        if (!(rootView == null || (rootWindowInsets = rootView.getRootWindowInsets()) == null)) {
            rect = new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
        }
        if (rect != null) {
            measuredWidth -= rect.left + rect.right;
        }
        this.a.getClass();
        int b = (measuredWidth - (dh4.b((int) 1.0f) * 2)) / 3;
        if (b < size) {
            i = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
        }
        super.onMeasure(i, i);
    }

    public void setListener(ae2 ae2) {
    }
}
