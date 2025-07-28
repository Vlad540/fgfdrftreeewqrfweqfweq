package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: rw5  reason: default package */
public final class rw5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw5 b;

    public /* synthetic */ rw5(sw5 sw5, int i) {
        this.a = i;
        this.b = sw5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.o.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                sw5 sw5 = this.b;
                sw5.a();
                View view = sw5.o;
                if (view.isEnabled() && !view.isLongClickable() && sw5.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    sw5.Z = true;
                    return;
                }
                return;
        }
    }
}
