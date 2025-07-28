package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: qy2  reason: default package */
public final class qy2 extends ibe {
    public static final int[] A0 = {0, 1350, 2700, 4050};
    public static final int[] B0 = {667, 2017, 3367, 4717};
    public static final int[] C0 = {1000, 2350, 3700, 5050};
    public static final py1 D0;
    public static final py1 E0;
    public ObjectAnimator X;
    public final p85 Y;
    public final uy2 Z;
    public ObjectAnimator o;
    public int w0 = 0;
    public float x0;
    public float y0;
    public ne z0 = null;

    static {
        Class<Float> cls = Float.class;
        D0 = new py1(5, cls, "animationFraction");
        E0 = new py1(6, cls, "completeEndFraction");
    }

    public qy2(uy2 uy2) {
        super(1);
        this.Z = uy2;
        this.Y = new p85();
    }

    public final void S() {
        this.w0 = 0;
        ((pn4) ((ArrayList) this.c).get(0)).c = this.Z.c[0];
        this.y0 = 0.0f;
    }

    public final void a0(mi0 mi0) {
        this.z0 = mi0;
    }

    public final void c0() {
        ObjectAnimator objectAnimator = this.X;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((pv6) this.b).isVisible()) {
                this.X.start();
            } else {
                x();
            }
        }
    }

    public final void e0() {
        if (this.o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, D0, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(5400);
            this.o.setInterpolator((TimeInterpolator) null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new py2(this, 0));
        }
        if (this.X == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, E0, new float[]{0.0f, 1.0f});
            this.X = ofFloat2;
            ofFloat2.setDuration(333);
            this.X.setInterpolator(this.Y);
            this.X.addListener(new py2(this, 1));
        }
        this.w0 = 0;
        ((pn4) ((ArrayList) this.c).get(0)).c = this.Z.c[0];
        this.y0 = 0.0f;
        this.o.start();
    }

    public final void f0() {
        this.z0 = null;
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
