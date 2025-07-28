package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: rkc  reason: default package */
public final class rkc extends ih0 {
    public final mz9 a;
    public final TextView b;
    public final TextView c;

    public rkc(Context context) {
        super(context, (AttributeSet) null, 0);
        float f = (float) 24;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 20) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        mz9 mz9 = new mz9(context);
        float f2 = (float) 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        mz9.setLayoutParams(layoutParams);
        this.a = mz9;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        nte.j.b(textView, yq4.b);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        nte.r.b(textView2, yq4.b);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        this.c = textView2;
        addView(mz9);
        addView(textView);
        addView(textView2);
        onThemeChanged(km4.y0.n(context).g());
    }

    public final void onThemeChanged(pda pda) {
        super.onThemeChanged(pda);
        this.b.setTextColor(pda.getText().e);
        this.c.setTextColor(pda.getText().g);
    }

    public final void setState(tw4 tw4) {
        this.a.setAvatarUrl(tw4.a);
        this.b.setText(tw4.b.c(this));
        this.c.setText(tw4.c.c(this));
    }
}
