package defpackage;

import android.view.MotionEvent;
import android.widget.SeekBar;

/* renamed from: mza  reason: default package */
public final class mza extends SeekBar {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
