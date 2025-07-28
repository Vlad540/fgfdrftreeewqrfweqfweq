package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xc7  reason: default package */
public final class xc7 extends ibe {
    public static final py1 y0 = new py1(8, Float.class, "animationFraction");
    public final p85 X;
    public final gd7 Y;
    public int Z = 1;
    public ObjectAnimator o;
    public boolean w0;
    public float x0;

    public xc7(gd7 gd7) {
        super(3);
        this.Y = gd7;
        this.X = new p85();
    }

    public final void S() {
        h0();
    }

    public final void a0(mi0 mi0) {
    }

    public final void c0() {
    }

    public final void e0() {
        if (this.o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, y0, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(333);
            this.o.setInterpolator((TimeInterpolator) null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new l6(7, (Object) this));
        }
        h0();
        this.o.start();
    }

    public final void f0() {
    }

    public final void h0() {
        this.w0 = true;
        this.Z = 1;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            pn4 pn4 = (pn4) it.next();
            gd7 gd7 = this.Y;
            pn4.c = gd7.c[0];
            pn4.d = gd7.g / 2;
        }
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
