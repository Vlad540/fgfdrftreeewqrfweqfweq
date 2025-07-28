package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: p4a  reason: default package */
public class p4a extends ConstraintLayout implements mhe {
    public static final /* synthetic */ k77[] P0;
    public final ImageView K0;
    public final TextView L0;
    public final TextView M0;
    public final OneMeButton N0;
    public final yj O0 = new yj(20, this);

    static {
        k77 hc9 = new hc9(p4a.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;");
        m7c.a.getClass();
        P0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, java.lang.Object, p4a, android.view.ViewGroup] */
    public p4a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView imageView = new ImageView(context);
        imageView.setId(wqb.oneme_empty_view_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setElevation(dh4.c().getDisplayMetrics().density * 8.0f);
        s59 s59 = km4.y0;
        imageView.setImageTintList(ColorStateList.valueOf(s59.r(imageView).getIcon().b));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, oyb.a(s59.n(context).g()));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.K0 = imageView;
        TextView textView = new TextView(context);
        textView.setId(wqb.oneme_empty_view_title);
        nte.c.b(textView, yq4.b);
        this.L0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(wqb.oneme_empty_view_subtitle);
        textView2.setMaxLines(4);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        nte.m.b(textView2, yq4.b);
        textView2.setVisibility(8);
        this.M0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(wqb.oneme_empty_view_main_action);
        oneMeButton.setVisibility(8);
        oneMeButton.setAppearance(s0a.o);
        this.N0 = oneMeButton;
        float f = (float) 80;
        addView(imageView, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        addView(textView, -2, -2);
        addView(textView2, 0, -2);
        addView(oneMeButton, -2, -2);
        onThemeChanged(s59.n(context).g());
        urd.B(new z9((Object) context, (Continuation) null, 26, false), this);
        setBackground(new jdd(context));
        float f2 = (float) 32;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f2);
        bf3 p = a06.p(this);
        int id = imageView.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        p.d(id, 4, 0, 4);
        p.g(id).d.x = 0.4f;
        int id2 = textView.getId();
        p.d(id2, 3, imageView.getId(), 4);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id2, 4));
        p.d(id2, 6, 0, 6);
        new hw9(p, 6, id2, 4).e(X);
        p.d(id2, 7, 0, 7);
        new hw9(p, 7, id2, 4).e(X);
        int id3 = textView2.getId();
        p.d(id3, 3, textView.getId(), 4);
        hr1.q((float) 8, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 6, 0, 6);
        new hw9(p, 6, id3, 4).e(X);
        p.d(id3, 7, 0, 7);
        new hw9(p, 7, id3, 4).e(X);
        int id4 = oneMeButton.getId();
        p.d(id4, 3, textView2.getId(), 4);
        hr1.q((float) 24, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 6, 0, 6);
        new hw9(p, 6, id4, 4).e(X);
        p.d(id4, 7, 0, 7);
        new hw9(p, 7, id4, 4).e(X);
        p.a(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, p4a] */
    /* access modifiers changed from: private */
    public final pda getCurrentTheme() {
        pda customTheme = getCustomTheme();
        return customTheme == null ? km4.y0.r(this) : customTheme;
    }

    public final pda getCustomTheme() {
        k77 k77 = P0[0];
        return (pda) this.O0.b;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, p4a] */
    public final void onAttachedToWindow() {
        p4a.super.onAttachedToWindow();
        onThemeChanged(getCurrentTheme());
        jdd background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, p4a] */
    public final void onDetachedFromWindow() {
        p4a.super.onDetachedFromWindow();
        jdd background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        p4a.super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int top = this.K0.getTop();
            jdd background = getBackground();
            if (background != null) {
                background.a(top);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, p4a] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        jdd background = getBackground();
        if (background != null) {
            background.setPadding(0, 0, 0, getPaddingBottom());
        }
    }

    public final void onThemeChanged(pda pda) {
        jdd background = getBackground();
        if (background != null) {
            background.onThemeChanged(getCurrentTheme());
        }
        ColorStateList valueOf = ColorStateList.valueOf(getCurrentTheme().getIcon().b);
        ImageView imageView = this.K0;
        imageView.setImageTintList(valueOf);
        ((GradientDrawable) imageView.getBackground()).setColors(oyb.a(getCurrentTheme()));
        this.L0.setTextColor(getCurrentTheme().getText().e);
        this.M0.setTextColor(getCurrentTheme().getText().f);
        this.N0.setCustomTheme(getCustomTheme());
    }

    public final void setCustomTheme(pda pda) {
        this.O0.o1(this, P0[0], pda);
    }

    public final void setIcon(int i) {
        this.K0.setImageResource(i);
    }

    public final void setSubtitle(mge mge) {
        TextView textView = this.M0;
        textView.setText(mge.a(textView.getContext()));
        CharSequence text = textView.getText();
        int i = 0;
        if (!(!(text == null || text.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setTitle(mge mge) {
        TextView textView = this.L0;
        textView.setText(mge.a(textView.getContext()));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, p4a] */
    public void setVisibility(int i) {
        p4a.super.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, p4a] */
    public final boolean verifyDrawable(Drawable drawable) {
        if (p4a.super.verifyDrawable(drawable)) {
            return true;
        }
        jdd background = getBackground();
        return background != null && background.b(drawable);
    }

    public final void x(String str, View.OnClickListener onClickListener) {
        OneMeButton oneMeButton = this.N0;
        oneMeButton.setVisibility(0);
        oneMeButton.setText((CharSequence) str);
        a24.a0(oneMeButton, onClickListener);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, p4a] */
    public jdd getBackground() {
        Drawable background = p4a.super.getBackground();
        if (background instanceof jdd) {
            return (jdd) background;
        }
        return null;
    }
}
