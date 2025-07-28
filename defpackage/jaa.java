package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: jaa  reason: default package */
public final /* synthetic */ class jaa implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ AttributeSet c;
    public final /* synthetic */ raa o;

    public /* synthetic */ jaa(Context context, AttributeSet attributeSet, raa raa, int i) {
        this.a = i;
        this.b = context;
        this.c = attributeSet;
        this.o = raa;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, this.c);
                appCompatImageView.setId(qhc.t0);
                int X = a24.X(((float) 30) * dh4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(X, X);
                layoutParams.gravity = 8388627;
                raa raa = this.o;
                layoutParams.leftMargin = raa.c;
                appCompatImageView.setLayoutParams(layoutParams);
                int X2 = a24.X(((float) 1) * dh4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(X2, X2, X2, X2);
                appCompatImageView.setImageResource(phc.d0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView).getIcon().f));
                a24.a0(appCompatImageView, new kaa(raa, 1));
                raa.addView(appCompatImageView);
                return appCompatImageView;
            case 1:
                AppCompatEditText appCompatEditText = new AppCompatEditText(this.b, this.c);
                appCompatEditText.setId(qhc.u0);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                layoutParams2.gravity = 8388629;
                int X3 = a24.X(((float) 30) * dh4.c().getDisplayMetrics().density);
                raa raa2 = this.o;
                int i = raa2.c;
                layoutParams2.leftMargin = X3 + i + i;
                int i2 = raa2.a;
                layoutParams2.topMargin = i2;
                layoutParams2.bottomMargin = i2;
                appCompatEditText.setLayoutParams(layoutParams2);
                appCompatEditText.setClipToOutline(true);
                appCompatEditText.setOutlineProvider(new eu3((float) a24.X(((float) 10) * dh4.c().getDisplayMetrics().density)));
                appCompatEditText.setImeOptions(3);
                appCompatEditText.setText(raa2.o);
                int X4 = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
                int i3 = raa2.b;
                appCompatEditText.setPadding(i, i3, X4, i3);
                s59 s59 = km4.y0;
                appCompatEditText.setBackgroundColor(s59.r(appCompatEditText).b().a.g);
                nte.k.b(appCompatEditText, yq4.b);
                Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    s59.r(appCompatEditText);
                    js.D(textCursorDrawable, -16745729);
                }
                appCompatEditText.setHintTextColor(s59.r(appCompatEditText).getText().f);
                appCompatEditText.setTextColor(s59.r(appCompatEditText).getText().e);
                appCompatEditText.setSingleLine();
                appCompatEditText.setOnEditorActionListener(new maa(appCompatEditText));
                afa.a(appCompatEditText, new vp6(19, appCompatEditText, appCompatEditText));
                appCompatEditText.addTextChangedListener(new z2(6, raa2));
                raa2.addView(appCompatEditText);
                return appCompatEditText;
            case 2:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.b, this.c);
                appCompatImageView2.setId(qhc.w0);
                int X5 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(X5, X5);
                layoutParams3.gravity = 8388629;
                appCompatImageView2.setLayoutParams(layoutParams3);
                int X6 = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
                appCompatImageView2.setPadding(X6, X6, X6, X6);
                appCompatImageView2.setImageResource(phc.O0);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView2).getIcon().f));
                raa raa3 = this.o;
                a24.a0(appCompatImageView2, new kaa(raa3, 0));
                raa3.addView(appCompatImageView2);
                return appCompatImageView2;
            case 3:
                ImageView imageView = new ImageView(this.b, this.c);
                imageView.setId(qhc.x0);
                float f = (float) 32;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams4.gravity = 8388629;
                imageView.setLayoutParams(layoutParams4);
                int X7 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                imageView.setPadding(X7, X7, X7, X7);
                imageView.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 12.0f));
                imageView.setImageResource(phc.O0);
                raa raa4 = this.o;
                a24.a0(imageView, new kaa(raa4, 2));
                urd.B(new pf0(3, (Continuation) null, 10), imageView);
                raa4.addView(imageView);
                return imageView;
            default:
                AppCompatImageView appCompatImageView3 = new AppCompatImageView(this.b, this.c);
                appCompatImageView3.setId(qhc.v0);
                int X8 = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(X8, X8);
                layoutParams5.gravity = 8388629;
                appCompatImageView3.setLayoutParams(layoutParams5);
                raa raa5 = this.o;
                Editable text = ((AppCompatEditText) raa5.G0.getValue()).getText();
                int i4 = 0;
                if (!(!(text == null || text.length() == 0))) {
                    i4 = 8;
                }
                appCompatImageView3.setVisibility(i4);
                int X9 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                appCompatImageView3.setPadding(X9, X9, X9, X9);
                appCompatImageView3.setImageResource(phc.n0);
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView3).getIcon().i));
                a24.a0(appCompatImageView3, new kaa(raa5, 3));
                raa5.addView(appCompatImageView3);
                return appCompatImageView3;
        }
    }
}
