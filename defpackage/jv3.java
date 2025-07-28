package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: jv3  reason: default package */
public final class jv3 extends LinearLayout implements mhe {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public jv3(Context context) {
        super(context, (AttributeSet) null);
        ImageView imageView = new ImageView(context);
        float f = (float) 40;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.a = imageView;
        TextView textView = new TextView(context);
        nte.i.b(textView, yq4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), 0);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        this.b = textView;
        TextView textView2 = new TextView(context);
        nte.l.b(textView2, yq4.b);
        this.c = textView2;
        setMinimumHeight(a24.X(((float) 56) * dh4.c().getDisplayMetrics().density));
        setOrientation(0);
        setGravity(16);
        setOutlineProvider(new eu3(16.0f));
        setClipToOutline(true);
        addView(imageView);
        addView(textView);
        addView(textView2);
        onThemeChanged(km4.y0.r(this));
    }

    public final void onThemeChanged(pda pda) {
        this.b.setTextColor(pda.getText().e);
        this.c.setTextColor(pda.getText().f);
    }

    public final void setCountryInfo(v3a v3a) {
        Integer num = v3a.o;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = this.a;
            imageView.setImageResource(intValue);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, 0, a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), 0);
                imageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.b.setText(getContext().getString(v3a.c));
        TextView textView = this.c;
        textView.setText("+" + v3a.b);
    }
}
