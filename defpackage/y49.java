package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: y49  reason: default package */
public final class y49 extends ConstraintLayout implements mhe {
    public x49 K0;
    public final ImageView L0;
    public final TextView M0;
    public final TextView N0;
    public final ImageView O0;
    public final ImageView P0;
    public final fd7 Q0;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, android.view.ViewGroup, y49] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y49(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        pz4 pz4 = w49.x0;
        int S = ju7.S(q23.H(pz4, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(S < 16 ? 16 : S);
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            Object next = u1Var.next();
            linkedHashMap.put(next, Integer.valueOf(((w49) next).a));
        }
        x49 x49 = x49.a;
        this.K0 = x49;
        ImageView imageView = new ImageView(getContext());
        w49 w49 = w49.PLAYBACK;
        imageView.setId(w49.a);
        float f = (float) 40;
        re3 re3 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f));
        re3.t = 0;
        float f2 = (float) 4;
        re3.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f2));
        re3.i = 0;
        re3.l = 0;
        imageView.setLayoutParams(re3);
        imageView.setBackground(getSelectableItemOvalBackground());
        s59 s59 = km4.y0;
        s59.r(imageView);
        imageView.setColorFilter(-16745729);
        me4.o((float) 8, dh4.c().getDisplayMetrics().density, imageView);
        imageView.setImageResource(snb.ic_play_24_filled);
        this.L0 = imageView;
        TextView textView = new TextView(getContext());
        w49 w492 = w49.TITLE;
        textView.setId(w492.a);
        re3 re32 = new re3(0, -2);
        int i = w492.a;
        textView.setId(i);
        re32.i = 0;
        int i2 = w49.a;
        re32.s = i2;
        w49 w493 = w49.SPEED;
        re32.u = w493.a;
        w49 w494 = w49.SUBTITLE;
        re32.k = w494.a;
        re32.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f2));
        float f3 = (float) 6;
        re32.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f3);
        textView.setLayoutParams(re32);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        nte.p.b(textView, yq4.b);
        textView.setTextColor(s59.r(textView).getText().e);
        this.M0 = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setId(w494.a);
        re3 re33 = new re3(0, -2);
        re33.j = i;
        re33.topMargin = a24.X(((float) 3) * dh4.c().getDisplayMetrics().density);
        re33.s = i2;
        re33.setMarginStart(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        int i3 = w493.a;
        re33.u = i3;
        re33.l = 0;
        re33.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(re33);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        nte.r.b(textView2, yq4.b);
        textView2.setTextColor(s59.r(textView2).getText().f);
        this.N0 = textView2;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(i3);
        re3 re34 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f));
        w49 w495 = w49.CLOSE;
        re34.u = w495.a;
        re34.i = 0;
        re34.l = 0;
        int X = a24.X(f3 * dh4.c().getDisplayMetrics().density);
        imageView2.setPadding(X, X, X, X);
        imageView2.setLayoutParams(re34);
        imageView2.setBackground(getSelectableItemOvalBackground());
        w(imageView2, x49);
        this.O0 = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(w495.a);
        re3 re35 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        re35.v = 0;
        re35.i = 0;
        re35.l = 0;
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        imageView3.setPadding(X2, X2, X2, X2);
        imageView3.setLayoutParams(re35);
        imageView3.setImageResource(snb.cross_16);
        imageView3.setImageTintList(ColorStateList.valueOf(s59.r(imageView3).getIcon().i));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.P0 = imageView3;
        ni0 ni0 = new ni0(getContext(), (AttributeSet) null, wlb.linearProgressIndicatorStyle, fd7.E0);
        gd7 gd7 = ni0.a;
        qn4 qn4 = new qn4(gd7);
        qn4.b = 300.0f;
        Context context2 = ni0.getContext();
        ni0.setIndeterminateDrawable(new pv6(context2, gd7, qn4, gd7.h == 0 ? new xc7(gd7) : new zc7(context2, gd7)));
        ni0.setProgressDrawable(new df4(ni0.getContext(), gd7, qn4));
        ni0.setId(w49.PROGRESS.a);
        float f4 = (float) 2;
        re3 re36 = new re3(-1, a24.X(dh4.c().getDisplayMetrics().density * f4));
        re36.l = 0;
        ni0.setLayoutParams(re36);
        ni0.setTrackCornerRadius(a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
        ni0.setTrackThickness(a24.X(f4 * dh4.c().getDisplayMetrics().density));
        ni0.setMin(0);
        ni0.setMax(1000);
        ni0.setProgress(0);
        ni0.setTrackColor(0);
        s59.r(ni0).b().a.getClass();
        ni0.setIndicatorColor(new int[]{-16745729});
        this.Q0 = ni0;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(imageView2);
        addView(imageView3);
        addView(ni0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View, y49] */
    private final Drawable getSelectableItemOvalBackground() {
        return new RippleDrawable(ColorStateList.valueOf(km4.y0.r(this).c().a.c), (Drawable) null, new ShapeDrawable(new OvalShape()));
    }

    public final ImageView getCloseButton() {
        return this.P0;
    }

    public final ImageView getPlaybackButton() {
        return this.L0;
    }

    public final x49 getPlaybackSpeed() {
        return this.K0;
    }

    public final ImageView getPlaybackSpeedButton() {
        return this.O0;
    }

    public final fd7 getProgress() {
        return this.Q0;
    }

    public final TextView getSubtitle() {
        return this.N0;
    }

    public final TextView getTitle() {
        return this.M0;
    }

    public final View getTooltipAnchor() {
        return this.O0;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View, y49] */
    public final void onThemeChanged(pda pda) {
        ImageView imageView = this.L0;
        imageView.setBackground(getSelectableItemOvalBackground());
        s59 s59 = km4.y0;
        s59.r(imageView);
        imageView.setColorFilter(-16745729);
        this.M0.setTextColor(s59.r(this).getText().e);
        this.N0.setTextColor(s59.r(this).getText().f);
        ImageView imageView2 = this.O0;
        Drawable drawable = imageView2.getDrawable();
        EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
        if (enhancedVectorDrawable != null) {
            xs7.P(enhancedVectorDrawable, "border", s59.r(imageView2).getIcon().g);
            xs7.P(enhancedVectorDrawable, "text", s59.r(imageView2).getIcon().i);
        }
        imageView2.setBackground(getSelectableItemOvalBackground());
        ImageView imageView3 = this.P0;
        imageView3.setImageTintList(ColorStateList.valueOf(s59.r(imageView3).getIcon().i));
        imageView3.setBackground(getSelectableItemOvalBackground());
        s59.r(this).b().a.getClass();
        this.Q0.setIndicatorColor(new int[]{-16745729});
    }

    public final void setIsPlaying(boolean z) {
        this.L0.setImageResource(z ? snb.ic_pause_24_filled : snb.ic_play_24_filled);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.P0;
        if (onClickListener == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            a24.Z(imageView, 1000, onClickListener);
        }
    }

    public final void setOnPlaybackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.L0;
        if (onClickListener == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            a24.Z(imageView, 200, onClickListener);
        }
    }

    public final void setOnPlaybackSpeedClick(u16 u16) {
        ImageView imageView = this.O0;
        if (u16 == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            a24.Z(imageView, 200, new xv5(u16, 17, this));
        }
    }

    public final void setPlaybackSpeed(x49 x49) {
        w(this.O0, x49);
    }

    public final void setProgress(float f) {
        fd7 fd7 = this.Q0;
        fd7.setProgress(gwf.j((int) ((f * ((float) (fd7.getMax() - fd7.getMin()))) + ((float) fd7.getMin())), fd7.getMin(), fd7.getMax()));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.N0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.M0.setText(charSequence);
    }

    public final void w(ImageView imageView, x49 x49) {
        int i;
        int ordinal = x49.ordinal();
        if (ordinal == 0) {
            i = snb.speed_1x;
        } else if (ordinal == 1) {
            i = snb.speed_1_5x;
        } else if (ordinal == 2) {
            i = snb.speed_2x;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(imageView.getContext(), i);
        s59 s59 = km4.y0;
        xs7.P(enhancedVectorDrawable, "border", s59.r(imageView).getIcon().g);
        xs7.P(enhancedVectorDrawable, "text", s59.r(imageView).getIcon().i);
        imageView.setImageDrawable(enhancedVectorDrawable);
        this.K0 = x49;
    }
}
