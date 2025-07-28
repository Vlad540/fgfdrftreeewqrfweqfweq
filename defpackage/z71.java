package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: z71  reason: default package */
public final class z71 extends ConstraintLayout implements bi1 {
    public static final /* synthetic */ k77[] N0;
    public final AppCompatTextView K0;
    public final AppCompatTextView L0;
    public final yj M0 = new yj(this);

    static {
        hc9 hc9 = new hc9(z71.class, "indicatorState", "getIndicatorState()Lone/me/calls/ui/view/indicator/CallIndicatorView$Companion$CallIndicatorState;");
        m7c.a.getClass();
        N0 = new k77[]{hc9};
    }

    public z71(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new f81(context));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(o1a.P);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new re3(-2, -2));
        nge nge = nte.m;
        nge.d(nge, appCompatTextView);
        appCompatTextView.setTextColor(getTitleColor());
        this.L0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setId(o1a.Q);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(new re3(-2, -1));
        nge.d(nge, appCompatTextView2);
        appCompatTextView2.setTextColor(getTitleColor());
        this.K0 = appCompatTextView2;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        float f = (float) 24;
        float f2 = (float) 0;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        bf3 p = a06.p(this);
        int id = appCompatTextView2.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, appCompatTextView.getId(), 6);
        p.g(id).d.l0 = true;
        p.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        p.d(id2, 4, appCompatTextView2.getId(), 4);
        p.d(id2, 3, appCompatTextView2.getId(), 3);
        p.d(id2, 6, appCompatTextView2.getId(), 7);
        p.d(id2, 7, 0, 7);
        p.a(this);
    }

    private final int getTitleColor() {
        return -855638017;
    }

    public final void a(boolean z) {
        f81 background = getBackground();
        if (background != null) {
            e81 e81 = e81.b;
            background.Z.o1(background, f81.w0[0], e81);
        }
        f81 background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        this.L0.setTranslationY(0.0f);
        this.K0.setTranslationY(0.0f);
        setAlpha(1.0f);
    }

    public final void b(boolean z) {
        f81 background = getBackground();
        if (background != null) {
            e81 e81 = e81.a;
            background.Z.o1(background, f81.w0[0], e81);
        }
        f81 background2 = getBackground();
        if (background2 != null) {
            background2.stop();
        }
    }

    public final y71 getIndicatorState() {
        k77 k77 = N0[0];
        return (y71) this.M0.b;
    }

    public final void h(lg7 lg7, boolean z, long j) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        lg7.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{f2, f}));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f81 background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f81 background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void setIndicatorState(y71 y71) {
        this.M0.o1(this, N0[0], y71);
    }

    public final void setTime(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.K0.setText(charSequence);
    }

    public f81 getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof f81) {
            return (f81) background;
        }
        return null;
    }
}
