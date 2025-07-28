package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;

/* renamed from: wz2  reason: default package */
public final class wz2 extends hy4 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final d5 j = new d5(20, this);
    public final tz2 k = new tz2(0, this);
    public AnimatorSet l;
    public ValueAnimator m;

    public wz2(gy4 gy4) {
        super(gy4);
        this.e = ct0.H(wlb.motionDurationShort3, 100, gy4.getContext());
        this.f = ct0.H(wlb.motionDurationShort3, 150, gy4.getContext());
        this.g = ct0.I(gy4.getContext(), wlb.motionEasingLinearInterpolator, og.a);
        this.h = ct0.I(gy4.getContext(), wlb.motionEasingEmphasizedInterpolator, og.d);
    }

    public final void a() {
        if (this.b.H0 == null) {
            t(u());
        }
    }

    public final int c() {
        return wsb.clear_text_end_icon_content_description;
    }

    public final int d() {
        return bob.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final View.OnClickListener f() {
        return this.j;
    }

    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    public final void p(boolean z) {
        if (this.b.H0 != null) {
            t(z);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new uz2(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new uz2(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.l.addListener(new vz2(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new uz2(this, 0));
        this.m = ofFloat3;
        ofFloat3.addListener(new vz2(this, 1));
    }

    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new ds1(11, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
