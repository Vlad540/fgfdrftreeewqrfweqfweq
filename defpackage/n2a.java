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

/* renamed from: n2a  reason: default package */
public final class n2a extends ConstraintLayout implements mhe {
    public static final int Z0 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
    public static final int a1 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
    public static final int b1 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
    public static final int c1 = a24.X(((float) 56) * dh4.c().getDisplayMetrics().density);
    public static final int d1 = 52;
    public final int K0 = getContext().getResources().getDimensionPixelSize(k9a.c);
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
    public m2a Y0;

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, n2a, android.view.ViewGroup] */
    public n2a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ez3.O(3, new cc3(context, 27));
        this.N0 = ez3.O(3, new l2a(context, this, 0));
        this.O0 = ez3.O(3, new l2a(context, this, 1));
        this.P0 = ez3.O(3, new cc3(context, 28));
        this.Q0 = ez3.O(3, new l2a(context, this, 2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setColors(new int[]{452984831, 16777215}, new float[]{0.0f, 1.0f});
        gradientDrawable.setGradientType(0);
        this.R0 = new LayerDrawable(new Drawable[]{gradientDrawable, gq3.b(getContext(), phc.H)});
        this.S0 = ez3.O(3, new l2a(context, this, 3));
        View view = new View(context);
        view.setId(View.generateViewId());
        re3 re3 = new re3(1, 1);
        re3.i = 0;
        re3.v = 0;
        re3.l = 0;
        re3.t = 0;
        view.setLayoutParams(re3);
        this.T0 = view;
        ho6 ho6 = new ho6(context, new qq9(5));
        ho6.setId(View.generateViewId());
        re3 re32 = new re3(0, a24.X(((float) 100) * dh4.c().getDisplayMetrics().density));
        re32.i = 0;
        re32.l = 0;
        ho6.setLayoutParams(re32);
        ho6.setInitialRadius$common_release(dh4.c().getDisplayMetrics().density * 42.0f);
        this.U0 = ho6;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.V0 = gradientDrawable2;
        this.W0 = ez3.O(3, new cc3(context, 29));
        this.X0 = ez3.O(3, new l2a(this, context));
        this.Y0 = m2a.a;
        setClipToOutline(true);
        setOutlineProvider(new eu3((float) getContext().getResources().getDimensionPixelSize(k9a.a)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            float f = (float) 82;
            layoutParams.height = a24.X(dh4.c().getDisplayMetrics().density * f);
            setMaxHeight(a24.X(f * dh4.c().getDisplayMetrics().density));
        } else {
            float f2 = (float) 82;
            layoutParams = new ViewGroup.LayoutParams(-1, a24.X(dh4.c().getDisplayMetrics().density * f2));
            setMaxHeight(a24.X(f2 * dh4.c().getDisplayMetrics().density));
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

    public static ImageView w(n2a n2a, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(qhc.l);
        imageView.setImageDrawable(n2a.getCloseBadgeDrawable());
        float f = (float) 24;
        re3 re3 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        re3.i = 0;
        re3.v = 0;
        int i = n2a.L0;
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
                re3.setMarginStart(-a24.X(((float) ((d1 / 2) + 24)) * dh4.c().getDisplayMetrics().density));
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
                    int i = Z0;
                    chevronDrawable.setBounds(0, 0, i, i);
                    int lineCount = layout.getLineCount() - 1;
                    float lineRight = layout.getLineRight(lineCount);
                    int lineTop = layout.getLineTop(lineCount);
                    float x = ((TextView) t97.getValue()).getX();
                    float y = ((TextView) t97.getValue()).getY();
                    float lineBottom = ((float) ((layout.getLineBottom(lineCount) - lineTop) - i)) / 2.0f;
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
                    int i2 = a1;
                    chevronDrawable.setBounds(0, 0, i2, i2);
                    int lineCount2 = layout2.getLineCount() - 1;
                    float lineRight2 = layout2.getLineRight(lineCount2);
                    int lineTop2 = layout2.getLineTop(lineCount2);
                    float x2 = ((TextView) t972.getValue()).getX();
                    float y2 = ((TextView) t972.getValue()).getY();
                    float lineBottom2 = ((float) ((layout2.getLineBottom(lineCount2) - lineTop2) - i2)) / 2.0f;
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

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, n2a] */
    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, n2a] */
    public final void setChevronAppearance(m2a m2a) {
        this.Y0 = m2a;
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.Q0.getValue()).setOnClickListener(onClickListener);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [n2a, android.view.ViewGroup] */
    public final void setCloseButtonVisibility(boolean z) {
        t97 t97 = this.Q0;
        if (z || t97.a()) {
            ImageView imageView = (ImageView) t97.getValue();
            imageView.setVisibility(z ? 0 : 8);
            jjd.f(this, imageView, (Integer) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, n2a] */
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n2a.super.setLayoutParams(layoutParams);
        A();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [n2a, android.view.ViewGroup] */
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

    /* JADX WARNING: type inference failed for: r3v0, types: [n2a, android.view.ViewGroup] */
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

    /* JADX WARNING: type inference failed for: r7v0, types: [n2a, android.view.ViewGroup] */
    public final void x(Drawable drawable, int i, int i2) {
        t97 t97 = this.S0;
        t97 t972 = this.P0;
        ho6 ho6 = this.U0;
        if (drawable != null) {
            FrameLayout frameLayout = (FrameLayout) t97.getValue();
            frameLayout.setVisibility(0);
            ImageView imageView = (ImageView) t972.getValue();
            int i3 = b1;
            int i4 = c1;
            if (i > i4) {
                i = i4;
            } else if (i < i3) {
                i = i3;
            }
            if (i2 > i4) {
                i2 = i4;
            } else if (i2 < i3) {
                i2 = i3;
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i2;
                imageView.setLayoutParams(layoutParams);
                imageView.setVisibility(0);
                imageView.setImageDrawable(drawable);
                ho6.setIcon$common_release(drawable);
                jjd.f(this, frameLayout, (Integer) null);
                jjd.f(this, imageView, (Integer) null);
                y();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
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
        int i4 = this.M0;
        int i5 = -1;
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
                    re3.topMargin = i4;
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
                    re32.bottomMargin = i4;
                    i = ((TextView) t97.getValue()).getId();
                } else {
                    re32.topMargin = 0;
                    re32.bottomMargin = 0;
                    re32.i = 0;
                    i = -1;
                }
                re32.j = i;
                if (ek8.L(t973)) {
                    i5 = ((FrameLayout) t973.getValue()).getId();
                } else {
                    re32.v = 0;
                }
                re32.u = i5;
                view2.setLayoutParams(re32);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        A();
    }
}
