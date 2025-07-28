package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: j04  reason: default package */
public final class j04 extends myd implements mhe {
    public final GradientDrawable X;
    public final TextView o;

    public j04(FrameLayout frameLayout, yq4 yq4) {
        super(frameLayout);
        this.o = (TextView) frameLayout.getChildAt(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = dh4.c().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        gradientDrawable.setCornerRadii(fArr);
        s59 s59 = km4.y0;
        gradientDrawable.setColors(s59.r(this.o).a().o().a.j);
        this.X = gradientDrawable;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = this.o;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int X2 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        layoutParams.topMargin = X2;
        layoutParams.bottomMargin = X2;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        jp2.f.b(textView, yq4);
        float f2 = (float) 12;
        float f3 = (float) 2;
        textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        textView.setBackground(textView.getBackground());
        onThemeChanged(s59.r(textView));
    }

    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        TextView textView = this.o;
        textView.setTextColor(s59.r(textView).a().o().b.a);
        int[] iArr = pda.a().o().a.j;
        GradientDrawable gradientDrawable = this.X;
        gradientDrawable.setColors(iArr);
        textView.setBackground(gradientDrawable);
    }
}
