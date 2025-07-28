package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: in1  reason: default package */
public final class in1 extends LinearLayout {
    public final t97 a;

    public in1(Context context) {
        super(context, (AttributeSet) null);
        this.a = ez3.O(3, new b5(context, 25));
        kjd.J(this, dh4.c().getDisplayMetrics().density * 20.0f);
        setOrientation(1);
        setBackground(getAnimatedBackground());
        ImageView imageView = new ImageView(context);
        float f = (float) 48;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        setGravity(17);
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        imageView.setImageResource(n1a.x0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        nge.d(nte.c, textView);
        textView.setTextColor(-855638017);
        textView.setText(r1a.W);
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        textView.setPadding(X, X, X, X);
        addView(imageView);
        addView(textView);
    }

    private final jdd getAnimatedBackground() {
        return (jdd) this.a.getValue();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jdd background = getBackground();
        if (background != null) {
            background.onThemeChanged(qda.a);
        }
        jdd background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jdd background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jdd background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a((i3 - i) / 2);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        jdd background = getBackground();
        return background != null && background.b(drawable);
    }

    public jdd getBackground() {
        jdd background = super.getBackground();
        if (background instanceof jdd) {
            return background;
        }
        return null;
    }
}
