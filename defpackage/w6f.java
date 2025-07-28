package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: w6f  reason: default package */
public final class w6f implements View.OnTouchListener {
    public static final w6f b = new w6f(0);
    public final /* synthetic */ int a;

    public /* synthetic */ w6f(int i) {
        this.a = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
