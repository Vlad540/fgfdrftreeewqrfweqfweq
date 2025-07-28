package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: h76  reason: default package */
public final class h76 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ h76(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                return true;
            default:
                this.b.invoke();
                return true;
        }
    }
}
