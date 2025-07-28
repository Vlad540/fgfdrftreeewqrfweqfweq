package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: uwc  reason: default package */
public final class uwc extends ig7 {
    public final i08 X;
    public i26 Y = new vg0(25);

    public uwc(i08 i08) {
        super((urd) w04.n);
        this.X = i08;
    }

    public final void D(List list, List list2) {
        this.Y.invoke(list, list2);
    }

    public final void r(b7c b7c, int i) {
        twc twc = (twc) b7c;
        qwc qwc = (qwc) C(i);
        twc.M0 = qwc;
        Uri uri = twc.N0;
        Uri uri2 = qwc.o;
        boolean f = hhd.f(uri, uri2);
        Uri uri3 = qwc.w0;
        if (!f || !hhd.f(twc.O0, uri3)) {
            twc.N0 = uri2;
            twc.O0 = uri3;
            ur6 d = ur6.d(uri2);
            d.i = true;
            OneMeDraweeView oneMeDraweeView = twc.K0;
            if (uri3 != null) {
                d.l = new qha(oneMeDraweeView.getContext(), uri3);
            }
            tr6 a = d.a();
            int i2 = OneMeDraweeView.F0;
            oneMeDraweeView.o(a, (tr6) null);
        }
        twc.L0.setVisibility(qwc.a.A0 == 4 ? 0 : 8);
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = twc.P0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Drawable b = gq3.b(context, i2a.g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 10.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density), 8388613);
        float f2 = (float) 4;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        layoutParams.setMargins(X2, X2, X2, X2);
        appCompatImageView.setLayoutParams(layoutParams);
        int X3 = a24.X(dh4.c().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(X3, X3, X3, X3);
        appCompatImageView.setImageDrawable(b);
        appCompatImageView.setBackground(gradientDrawable);
        Drawable b2 = gq3.b(context, i2a.l);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
        int X4 = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        layoutParams2.setMargins(X4, X4, X4, X4);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setImageDrawable(b2);
        FrameLayout frameLayout = new FrameLayout(context);
        float f3 = (float) 64;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        float f4 = (float) 2;
        layoutParams3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f4), layoutParams3.topMargin, a24.X(f4 * dh4.c().getDisplayMetrics().density), layoutParams3.bottomMargin);
        frameLayout.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(dh4.c().getDisplayMetrics().density * 12.0f);
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(oneMeDraweeView);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(appCompatImageView2);
        urd.B(new od1(b, b2, gradientDrawable, (Continuation) null, 7), frameLayout);
        return new twc(this.X, oneMeDraweeView, appCompatImageView, appCompatImageView2, frameLayout);
    }
}
