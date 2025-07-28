package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zc7  reason: default package */
public final class zc7 extends ibe {
    public static final int[] A0 = {533, 567, 850, 750};
    public static final int[] B0 = {1267, 1000, 333, 0};
    public static final py1 C0 = new py1(9, Float.class, "animationFraction");
    public ObjectAnimator X;
    public final Interpolator[] Y;
    public final gd7 Z;
    public ObjectAnimator o;
    public int w0 = 0;
    public boolean x0;
    public float y0;
    public ne z0 = null;

    public zc7(Context context, gd7 gd7) {
        super(2);
        this.Z = gd7;
        this.Y = new Interpolator[]{AnimationUtils.loadInterpolator(context, glb.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, glb.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, glb.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, glb.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void S() {
        h0();
    }

    public final void a0(mi0 mi0) {
        this.z0 = mi0;
    }

    public final void c0() {
        ObjectAnimator objectAnimator = this.X;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            x();
            if (((pv6) this.b).isVisible()) {
                this.X.setFloatValues(new float[]{this.y0, 1.0f});
                this.X.setDuration((long) ((1.0f - this.y0) * 1800.0f));
                this.X.start();
            }
        }
    }

    public final void e0() {
        ObjectAnimator objectAnimator = this.o;
        py1 py1 = C0;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, py1, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(1800);
            this.o.setInterpolator((TimeInterpolator) null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new yc7(this, 0));
        }
        if (this.X == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, py1, new float[]{1.0f});
            this.X = ofFloat2;
            ofFloat2.setDuration(1800);
            this.X.setInterpolator((TimeInterpolator) null);
            this.X.addListener(new yc7(this, 1));
        }
        h0();
        this.o.start();
    }

    public final void f0() {
        this.z0 = null;
    }

    public final void h0() {
        this.w0 = 0;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((pn4) it.next()).c = this.Z.c[0];
        }
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
