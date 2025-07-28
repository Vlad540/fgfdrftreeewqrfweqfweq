package defpackage;

import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.Set;

/* renamed from: hne  reason: default package */
public final class hne extends FrameLayout {
    public gne a;

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                af9 af9 = (af9) this.a;
                if (af9.H0.getVisibility() == 0) {
                    ViewPropertyAnimator translationY = af9.G0.animate().translationY((float) (-af9.Q0.n));
                    tg tgVar = af9.z0;
                    translationY.setInterpolator(tgVar.a.p()).setDuration(tgVar.a.b());
                }
                af9.o(new ai0(8));
            } else if (action == 1) {
                af9 af92 = (af9) this.a;
                if (af92.H0.getVisibility() == 0) {
                    ViewPropertyAnimator translationY2 = af92.G0.animate().translationY(0.0f);
                    tg tgVar2 = af92.z0;
                    translationY2.setInterpolator(tgVar2.a.p()).setDuration(tgVar2.a.b());
                }
                af92.o(new ai0(0));
            } else if (action == 2) {
                for (be9 be9 : (Set) ((af9) this.a).a) {
                    be9.J0 = false;
                    zu7 a2 = be9.I0.a();
                    a2.a = dm7.Z;
                    be9.I0 = a2.a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setListener(gne gne) {
        this.a = gne;
    }
}
