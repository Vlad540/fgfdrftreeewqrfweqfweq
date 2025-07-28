package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* renamed from: h33  reason: default package */
public final class h33 extends b7c implements View.OnTouchListener {
    public static final OvershootInterpolator L0 = new OvershootInterpolator();
    public final e33 J0;
    public final GestureDetector K0;

    public h33(FrameLayout frameLayout, e33 e33, f33 f33) {
        super(frameLayout);
        this.J0 = e33;
        frameLayout.setOnTouchListener(this);
        this.K0 = new GestureDetector(frameLayout.getContext(), new g33(f33, 0, e33));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.K0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        OvershootInterpolator overshootInterpolator = L0;
        View view2 = this.a;
        if (action == 0 || motionEvent.getActionMasked() == 5) {
            view2.animate().scaleX(1.2f).scaleY(1.2f).setDuration(125).setInterpolator(overshootInterpolator);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
            view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125).setInterpolator(overshootInterpolator);
        }
        return true;
    }
}
