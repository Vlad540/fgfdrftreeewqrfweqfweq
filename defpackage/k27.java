package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: k27  reason: default package */
public final class k27 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final b7c e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ b7c o;
    public final /* synthetic */ o27 p;

    public k27(o27 o27, b7c b7c, int i2, float f2, float f3, float f4, float f5, int i3, b7c b7c2) {
        this.p = o27;
        this.n = i3;
        this.o = b7c2;
        this.f = i2;
        this.e = b7c;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g = ofFloat;
        ofFloat.addUpdateListener(new ti0(5, this));
        ofFloat.setTarget(b7c.a);
        ofFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.v(true);
        }
        this.l = true;
    }

    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.k) {
            int i2 = this.n;
            b7c b7c = this.o;
            o27 o27 = this.p;
            if (i2 <= 0) {
                o27.B0.a(o27.G0, b7c);
            } else {
                o27.a.add(b7c.a);
                this.h = true;
                if (i2 > 0) {
                    o27.G0.post(new p36(o27, this, i2));
                }
            }
            View view = o27.L0;
            View view2 = b7c.a;
            if (view == view2) {
                o27.r(view2);
            }
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
