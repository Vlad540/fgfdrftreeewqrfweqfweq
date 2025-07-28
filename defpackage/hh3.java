package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: hh3  reason: default package */
public final /* synthetic */ class hh3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kh3 c;

    public /* synthetic */ hh3(Context context, kh3 kh3, int i) {
        this.a = i;
        this.b = context;
        this.c = kh3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, (AttributeSet) null);
                appCompatTextView.setId(qhc.D);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setSingleLine();
                appCompatTextView.setTextColor(km4.y0.r(appCompatTextView).getText().f);
                nge.d(nte.l, appCompatTextView);
                this.c.addView(appCompatTextView, new re3(0, a24.X(((float) 20) * dh4.c().getDisplayMetrics().density)));
                return appCompatTextView;
            case 1:
                TextView textView = new TextView(this.b);
                textView.setId(qhc.x);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(km4.y0.r(textView).getText().f);
                nge.d(nte.p, textView);
                this.c.addView(textView, new re3(0, a24.X(((float) 20) * dh4.c().getDisplayMetrics().density)));
                return textView;
            case 2:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(qhc.C);
                km4.y0.r(imageView);
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                float f = (float) 40;
                this.c.addView(imageView, new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
                return imageView;
            case 3:
                OneMeButton oneMeButton = new OneMeButton(this.b, (AttributeSet) null);
                oneMeButton.setId(qhc.A);
                oneMeButton.setSize(v0a.b);
                oneMeButton.setMode(u0a.o);
                oneMeButton.setAppearance(s0a.a);
                this.c.addView(oneMeButton, new re3(-2, -2));
                return oneMeButton;
            case 4:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView.setId(qhc.L);
                appCompatImageView.setImageResource(snb.videocam_outline_24);
                kh3 kh3 = this.c;
                pda customTheme = kh3.getCustomTheme();
                if (customTheme == null) {
                    customTheme = km4.y0.r(appCompatImageView);
                }
                appCompatImageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(X, X, X, X);
                int i = customTheme.c().a.b;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                float f2 = (float) 40;
                kh3.addView(appCompatImageView, new re3(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
                return appCompatImageView;
            case 5:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView2.setId(qhc.y);
                appCompatImageView2.setImageResource(snb.ic_audio_call_type_24);
                kh3 kh32 = this.c;
                pda customTheme2 = kh32.getCustomTheme();
                if (customTheme2 == null) {
                    customTheme2 = km4.y0.r(appCompatImageView2);
                }
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().f));
                int X2 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                appCompatImageView2.setPadding(X2, X2, X2, X2);
                int i2 = customTheme2.c().a.b;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                float f3 = (float) 40;
                kh32.addView(appCompatImageView2, new re3(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density)));
                return appCompatImageView2;
            default:
                return kh3.w(this.b, this.c);
        }
    }
}
