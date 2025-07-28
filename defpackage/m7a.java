package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: m7a  reason: default package */
public final class m7a extends ConstraintLayout implements mhe {
    public final int K0 = getContext().getResources().getDimensionPixelSize(k9a.e);
    public final int L0 = getContext().getResources().getDimensionPixelSize(k9a.d);
    public final int M0 = getContext().getResources().getDimensionPixelSize(k9a.b);
    public final t97 N0;
    public final t97 O0;
    public final t97 P0;
    public final t97 Q0;
    public final LayerDrawable R0;
    public final t97 S0;
    public final View T0;
    public final ho6 U0;
    public final GradientDrawable V0;
    public final t97 W0;
    public final t97 X0;
    public l7a Y0;

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.constraintlayout.widget.ConstraintLayout, m7a, android.view.View, android.view.ViewGroup] */
    public m7a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N0 = ez3.O(3, new k7a(context, this, 0));
        this.O0 = ez3.O(3, new k7a(context, this, 1));
        this.P0 = ez3.O(3, new t2a(context, 1));
        this.Q0 = ez3.O(3, new k7a(context, this, 2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setColors(new int[]{452984831, 16777215}, new float[]{0.0f, 1.0f});
        gradientDrawable.setGradientType(0);
        this.R0 = new LayerDrawable(new Drawable[]{gradientDrawable, gq3.b(getContext(), phc.H)});
        this.S0 = ez3.O(3, new k7a(context, this, 3));
        View view = new View(context);
        view.setId(View.generateViewId());
        re3 re3 = new re3(1, 1);
        re3.i = 0;
        re3.v = 0;
        re3.l = 0;
        re3.t = 0;
        view.setLayoutParams(re3);
        this.T0 = view;
        ho6 ho6 = new ho6(context, new qq9(11));
        ho6.setId(View.generateViewId());
        float f = (float) 128;
        re3 re32 = new re3(0, a24.X(dh4.c().getDisplayMetrics().density * f));
        re32.i = 0;
        re32.l = 0;
        ho6.setLayoutParams(re32);
        ho6.setInitialRadius$common_release(dh4.c().getDisplayMetrics().density * 49.0f);
        this.U0 = ho6;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.V0 = gradientDrawable2;
        this.W0 = ez3.O(3, new t2a(context, 2));
        this.X0 = ez3.O(3, new k7a(this, context));
        this.Y0 = l7a.a;
        setClipToOutline(true);
        setOutlineProvider(new eu3((float) getContext().getResources().getDimensionPixelSize(k9a.a)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = a24.X(dh4.c().getDisplayMetrics().density * f);
            setMaxHeight(a24.X(f * dh4.c().getDisplayMetrics().density));
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, a24.X(dh4.c().getDisplayMetrics().density * f));
            setMaxHeight(a24.X(f * dh4.c().getDisplayMetrics().density));
        }
        setLayoutParams(layoutParams);
        setBackground(gradientDrawable2);
        jjd.f(this, view, (Integer) null);
        jjd.f(this, ho6, (Integer) null);
        onThemeChanged(km4.y0.n(context).g());
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.X0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.W0.getValue();
    }

    public static ImageView w(m7a m7a, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(qhc.X);
        imageView.setImageDrawable(m7a.getCloseBadgeDrawable());
        float f = (float) 24;
        re3 re3 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        re3.i = 0;
        re3.v = 0;
        int i = m7a.L0;
        re3.setMarginEnd(i);
        re3.topMargin = i;
        imageView.setLayoutParams(re3);
        return imageView;
    }

    public final void A() {
        ho6 ho6 = this.U0;
        re3 layoutParams = ho6.getLayoutParams();
        if (layoutParams != null) {
            re3 re3 = layoutParams;
            if (this.S0.a()) {
                re3.t = this.T0.getId();
                re3.setMarginStart(-a24.X(((float) 54) * dh4.c().getDisplayMetrics().density));
            }
            ho6.setLayoutParams(re3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void onDraw(Canvas canvas) {
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            int ordinal = this.Y0.ordinal();
            if (ordinal == 0) {
                t97 t97 = this.N0;
                Layout layout = ((TextView) t97.getValue()).getLayout();
                if (layout != null) {
                    int X = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                    chevronDrawable.setBounds(0, 0, X, X);
                    int lineCount = layout.getLineCount() - 1;
                    float lineRight = layout.getLineRight(lineCount);
                    int lineTop = layout.getLineTop(lineCount);
                    float x = ((TextView) t97.getValue()).getX();
                    float y = ((TextView) t97.getValue()).getY();
                    float lineBottom = ((float) ((layout.getLineBottom(lineCount) - lineTop) - X)) / 2.0f;
                    int save = canvas.save();
                    canvas.translate(Math.min(lineRight + x, x + ((float) ((TextView) t97.getValue()).getWidth())), lineBottom + y + ((float) lineTop));
                    try {
                        chevronDrawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
            } else if (ordinal == 1) {
                t97 t972 = this.O0;
                Layout layout2 = ((TextView) t972.getValue()).getLayout();
                if (layout2 != null) {
                    int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                    chevronDrawable.setBounds(0, 0, X2, X2);
                    int lineCount2 = layout2.getLineCount() - 1;
                    float lineRight2 = layout2.getLineRight(lineCount2);
                    int lineTop2 = layout2.getLineTop(lineCount2);
                    float x2 = ((TextView) t972.getValue()).getX();
                    float y2 = ((TextView) t972.getValue()).getY();
                    float lineBottom2 = ((float) ((layout2.getLineBottom(lineCount2) - lineTop2) - X2)) / 2.0f;
                    int save2 = canvas.save();
                    canvas.translate(Math.min(lineRight2 + x2, x2 + ((float) ((TextView) t972.getValue()).getWidth())), lineBottom2 + y2 + ((float) lineTop2));
                    try {
                        chevronDrawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onThemeChanged(pda pda) {
        t97 t97 = this.N0;
        if (t97.a()) {
            pda.getText();
            ((TextView) t97.getValue()).setTextColor(-1);
        }
        t97 t972 = this.O0;
        if (t972.a()) {
            pda.getText();
            ((TextView) t972.getValue()).setTextColor(r1g.G(-1, 0.7f));
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        xs7.P(closeBadgeDrawable, "cross", pda.getIcon().h);
        xs7.P(closeBadgeDrawable, "circle_background", pda.b().a.c);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(pda.getIcon().f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m7a, android.view.View] */
    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m7a, android.view.View] */
    public final void setChevronAppearance(l7a l7a) {
        this.Y0 = l7a;
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.Q0.getValue()).setOnClickListener(onClickListener);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [m7a, android.view.ViewGroup] */
    public final void setCloseButtonVisibility(boolean z) {
        t97 t97 = this.Q0;
        if (z || t97.a()) {
            ImageView imageView = (ImageView) t97.getValue();
            imageView.setVisibility(z ? 0 : 8);
            jjd.f(this, imageView, (Integer) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m7a, android.view.View] */
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m7a.super.setLayoutParams(layoutParams);
        A();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [m7a, android.view.ViewGroup] */
    public final void setSubtitle(String str) {
        t97 t97 = this.O0;
        if (str != null && !h0e.c0(str)) {
            TextView textView = (TextView) t97.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            jjd.f(this, textView, (Integer) null);
            y();
        } else if (t97.a()) {
            TextView textView2 = (TextView) t97.getValue();
            textView2.setVisibility(8);
            textView2.setText((CharSequence) null);
            y();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [m7a, android.view.ViewGroup] */
    public final void setTitle(String str) {
        t97 t97 = this.N0;
        if (str != null && !h0e.c0(str)) {
            TextView textView = (TextView) t97.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            jjd.f(this, textView, (Integer) null);
            y();
        } else if (t97.a()) {
            TextView textView2 = (TextView) t97.getValue();
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            y();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [m7a, android.view.ViewGroup] */
    public final void x(Drawable drawable, int i, int i2) {
        t97 t97 = this.S0;
        t97 t972 = this.P0;
        ho6 ho6 = this.U0;
        if (drawable != null) {
            FrameLayout frameLayout = (FrameLayout) t97.getValue();
            frameLayout.setVisibility(0);
            ImageView imageView = (ImageView) t972.getValue();
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
            ho6.setIcon$common_release(drawable);
            jjd.f(this, frameLayout, (Integer) null);
            jjd.f(this, imageView, (Integer) null);
            y();
        } else if (t972.a()) {
            ((FrameLayout) t97.getValue()).setVisibility(8);
            ImageView imageView2 = (ImageView) t972.getValue();
            imageView2.setVisibility(8);
            imageView2.setImageDrawable((Drawable) null);
            ho6.setIcon$common_release((Drawable) null);
            y();
        }
    }

    public final void y() {
        int i;
        int i2;
        int i3;
        t97 t97 = this.N0;
        boolean a = t97.a();
        t97 t972 = this.O0;
        t97 t973 = this.S0;
        int i4 = -1;
        if (a) {
            View view = (View) t97.getValue();
            re3 layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                re3 re3 = layoutParams;
                if (ek8.L(t973)) {
                    i2 = ((FrameLayout) t973.getValue()).getId();
                } else {
                    re3.v = 0;
                    i2 = -1;
                }
                re3.u = i2;
                if (ek8.L(t972)) {
                    re3.topMargin = a24.X(((float) 26) * dh4.c().getDisplayMetrics().density);
                    i3 = ((TextView) t972.getValue()).getId();
                } else {
                    re3.topMargin = 0;
                    re3.l = 0;
                    i3 = -1;
                }
                re3.k = i3;
                view.setLayoutParams(re3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (t972.a()) {
            View view2 = (View) t972.getValue();
            re3 layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                re3 re32 = layoutParams2;
                if (ek8.L(t97)) {
                    re32.topMargin = this.K0;
                    re32.bottomMargin = a24.X(((float) 26) * dh4.c().getDisplayMetrics().density);
                    i = ((TextView) t97.getValue()).getId();
                } else {
                    re32.topMargin = 0;
                    re32.bottomMargin = 0;
                    re32.i = 0;
                    i = -1;
                }
                re32.j = i;
                if (ek8.L(t973)) {
                    i4 = ((FrameLayout) t973.getValue()).getId();
                } else {
                    re32.v = 0;
                }
                re32.u = i4;
                view2.setLayoutParams(re32);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        A();
    }
}
