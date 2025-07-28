package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: uc4  reason: default package */
public class uc4 implements bwf, Animator.AnimatorListener {
    public final j1c a;
    public awf b = null;
    public boolean c = false;
    public boolean d = false;
    public float e = 1.0f;
    public float f = 4.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Matrix j = new Matrix();
    public final Matrix k = new Matrix();

    public uc4(j1c j1c) {
        new Matrix();
        this.a = j1c;
        j1c.c = this;
    }

    public void a(float f2, float f3) {
        float u = e07.u(this.k);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{u, ((double) u) <= 1.1d ? 2.5f : 1.0f});
        ofFloat.setDuration(250);
        ofFloat.addUpdateListener(new tc4(this, f2, f3));
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public void b() {
        RectF rectF = this.i;
        rectF.set(this.h);
        Matrix matrix = this.k;
        matrix.mapRect(rectF);
        float f2 = rectF.left;
        float width = rectF.width();
        RectF rectF2 = this.g;
        float width2 = rectF2.width() - width;
        float min = width2 > 0.0f ? width2 / 2.0f : Math.min(Math.max(width2, f2), 0.0f);
        float f3 = rectF.top;
        float height = rectF2.height() - rectF.height();
        float min2 = height > 0.0f ? height / 2.0f : Math.min(Math.max(height, f3), 0.0f);
        float f4 = rectF.left;
        if (min != f4 || min2 != rectF.top) {
            matrix.postTranslate(min - f4, min2 - rectF.top);
            this.a.m();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.d = true;
    }

    public void reset() {
        ((k18) this.a.b).b();
        this.j.reset();
        this.k.reset();
    }
}
