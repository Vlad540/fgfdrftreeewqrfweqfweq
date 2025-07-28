package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: sp0  reason: default package */
public final class sp0 extends ConstraintLayout implements mhe {
    public final TextView K0;
    public final AppCompatImageView L0;
    public final t3a M0;
    public int N0 = 2;
    public final rp0 O0;
    public k26 P0;

    public sp0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        textView.setId(qhc.e);
        textView.setVisibility(0);
        textView.setLayoutParams(new re3(-2, -2));
        nge.d(nte.v, textView);
        this.K0 = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(qhc.d);
        float f = (float) 28;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        appCompatImageView.setVisibility(0);
        this.L0 = appCompatImageView;
        t3a t3a = new t3a(context);
        t3a.setId(qhc.b);
        t3a.setLayoutParams(new re3(-2, -2));
        t3a.setAppearance(o3a.o);
        t3a.setHasBackgroundStroke(true);
        t3a.setVisibility(8);
        this.M0 = t3a;
        f4a f4a = new f4a(context);
        f4a.setId(qhc.c);
        float f2 = (float) 6;
        re3 re3 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f2));
        re3.setMarginStart(a24.X(((float) 7) * dh4.c().getDisplayMetrics().density));
        f4a.setLayoutParams(re3);
        f4a.setAppearance(e4a.c);
        f4a.setVisibility(8);
        rp0 rp0 = new rp0(0, this);
        this.O0 = rp0;
        this.P0 = rp0;
        setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        addView(appCompatImageView);
        addView(t3a);
        addView(f4a);
        addView(textView);
        bf3 p = a06.p(this);
        int id = appCompatImageView.getId();
        p.d(id, 3, 0, 3);
        new hw9(p, 3, id, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        int id2 = textView.getId();
        p.d(id2, 6, 0, 6);
        p.d(id2, 7, 0, 7);
        p.d(id2, 3, appCompatImageView.getId(), 4);
        float f3 = (float) 2;
        new hw9(p, 3, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f3));
        int id3 = t3a.getId();
        p.d(id3, 6, appCompatImageView.getId(), 6);
        new hw9(p, 6, id3, 4).e(a24.X(((float) 14) * dh4.c().getDisplayMetrics().density));
        p.d(id3, 4, appCompatImageView.getId(), 4);
        new hw9(p, 4, id3, 4).e(a24.X(((float) 9) * dh4.c().getDisplayMetrics().density));
        int id4 = f4a.getId();
        p.d(id4, 3, appCompatImageView.getId(), 3);
        p.d(id4, 7, appCompatImageView.getId(), 7);
        new hw9(p, 7, id4, 4).e(-a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }

    public final void onThemeChanged(pda pda) {
        w();
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        t3a t3a = this.M0;
        t3a.setVisibility(i2);
        t3a.g(i, true);
        if (i > 0) {
            w();
        }
    }

    public final void setIcon(int i) {
        this.L0.setImageDrawable(am7.n(getContext(), i));
        this.P0 = this.O0;
        w();
    }

    public void setSelected(boolean z) {
        this.N0 = z ? 1 : 2;
        w();
        if (z) {
            Drawable drawable = this.L0.getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        super.setSelected(z);
    }

    public final void setText(int i) {
        this.K0.setText(i);
    }

    public final void w() {
        int i;
        TextView textView = this.K0;
        int i2 = this.N0;
        s59 s59 = km4.y0;
        pda r = s59.r(this);
        int t = hr1.t(i2);
        boolean z = true;
        if (t == 0) {
            i = -16745729;
        } else if (t == 1) {
            i = r.getText().f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setTextColor(i);
        k26 k26 = this.P0;
        AppCompatImageView appCompatImageView = this.L0;
        if (this.N0 != 1) {
            z = false;
        }
        k26.invoke(appCompatImageView, Boolean.valueOf(z), s59.r(this));
        this.M0.f(s59.r(this));
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.K0.setText(charSequence);
    }
}
