package defpackage;

import android.view.MotionEvent;

/* renamed from: lpc  reason: default package */
public final class lpc extends sea implements fh9 {
    public boolean b;

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        this.b = i2 <= 0 && z2;
        super.onOverScrolled(i, i2, z, z2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
            this.b = false;
        }
        return onTouchEvent;
    }
}
