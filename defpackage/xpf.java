package defpackage;

import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: xpf  reason: default package */
public final class xpf extends WebView {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
