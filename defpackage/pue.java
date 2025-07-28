package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: pue  reason: default package */
public final class pue extends LinearLayout {
    public final ey9 a;
    public final ey9 b;

    public pue(Context context) {
        super(context);
        ey9 ey9 = new ey9(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 8;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f2));
        layoutParams.weight = 1.0f;
        ey9.setLayoutParams(layoutParams);
        ey9.setAppearance(dy9.a);
        ey9.setText(b8a.f);
        this.a = ey9;
        ey9 ey92 = new ey9(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        ey92.setLayoutParams(layoutParams2);
        ey92.setAppearance(dy9.b);
        ey92.setText(b8a.g);
        this.b = ey92;
        setOrientation(0);
        addView(ey9);
        addView(ey92);
    }

    public final void setOnAddContactClickListener(View.OnClickListener onClickListener) {
        a24.a0(this.a, onClickListener);
    }

    public final void setOnBlockContactClickListener(View.OnClickListener onClickListener) {
        a24.a0(this.b, onClickListener);
    }
}
