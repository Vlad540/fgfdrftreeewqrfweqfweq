package ru.ok.messages.video.widgets.doubleTap;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Set;

public class DoubleTapVideoViewWrapper extends FrameLayout {
    public wj4 a;

    public DoubleTapVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        zg4 b = zg4.b();
        rj4 rj4 = new rj4(getContext(), 1);
        rj4.setId(yqb.double_tap_video_view_wrapper__arrows_view_left);
        rj4.setVisibility(8);
        int i = b.E;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i * 2);
        layoutParams.gravity = 8388627;
        super.addView(rj4, layoutParams);
        rj4 rj42 = new rj4(getContext(), 2);
        rj42.setId(yqb.double_tap_video_view_wrapper__arrows_view_right);
        rj42.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dh4.b((int) 100.0f), dh4.b((int) 200.0f));
        layoutParams2.gravity = 8388629;
        super.addView(rj42, layoutParams2);
    }

    public final void addView(View view) {
        super.addView(view, getChildCount() - 2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() <= 1;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oe9 oe9 = (oe9) this.a;
        id9 id9 = (id9) o23.W((Set) oe9.a);
        if (id9 != null) {
            Rect rect = id9.Z;
            ((View) oe9.c).getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                yj4 yj4 = id9.c;
                yj4.b.onTouchEvent(motionEvent);
                if (yj4.c > 0) {
                    return true;
                }
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                id9.X.onTouchEvent(motionEvent);
            } else {
                yj4 yj42 = id9.o;
                yj42.b.onTouchEvent(motionEvent);
                if (yj42.c > 0) {
                    return true;
                }
            }
        }
        getChildAt(0).dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setTouchEventListener(wj4 wj4) {
        this.a = wj4;
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, getChildCount() - 2, layoutParams);
    }
}
