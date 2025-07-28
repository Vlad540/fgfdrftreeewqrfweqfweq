package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.Animation;

/* renamed from: pe9  reason: default package */
public final class pe9 extends gt0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ pe9(int i2, Object obj) {
        this.h = i2;
        this.i = obj;
    }

    public final void D() {
        switch (this.h) {
            case 0:
                qe9 qe9 = (qe9) this.i;
                qe9.Y.setAnimation((Animation) null);
                qe9.Y.setVisibility(8);
                qe9.o(new ai0(23));
                return;
            default:
                jwa jwa = (jwa) this.i;
                mj5 mj5 = jwa.H0;
                if (mj5 != null) {
                    try {
                        ValueAnimator valueAnimator = mj5.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ek8.F(jwa.H0.getContext()).removeView(jwa.H0);
                    } catch (Exception unused) {
                    }
                }
                jwa.H0 = null;
                return;
        }
    }
}
