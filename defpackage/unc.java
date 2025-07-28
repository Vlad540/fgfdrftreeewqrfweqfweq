package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* renamed from: unc  reason: default package */
public final class unc implements aq6 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ vnc c;

    public unc(vnc vnc) {
        this.c = vnc;
    }

    public final void a(long j, cs1 cs1) {
        vnc vnc = this.c;
        this.a = vnc.getBrightness();
        vnc.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(cs1);
        pzb pzb = new pzb(7, cs1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(vnc.getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new c00(15, (Object) vnc));
        ofFloat.addListener(new mf(7, pzb));
        ofFloat.start();
        this.b = ofFloat;
    }

    public final void clear() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        vnc vnc = this.c;
        vnc.setAlpha(0.0f);
        vnc.setBrightness(this.a);
    }
}
