package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: az1  reason: default package */
public class az1 extends FrameLayout implements vr3 {
    public int a;

    public final void a(rr3 rr3, rr3 rr32, boolean z) {
        this.a++;
    }

    public final void b(rr3 rr3, rr3 rr32, boolean z) {
        this.a--;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a > 0 || super.onInterceptTouchEvent(motionEvent);
    }
}
