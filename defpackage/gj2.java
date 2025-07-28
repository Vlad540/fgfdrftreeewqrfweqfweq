package defpackage;

import android.widget.TextView;

/* renamed from: gj2  reason: default package */
public final class gj2 extends myd implements mhe {
    public final TextView o;

    public gj2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new n6c(-1, -2));
        float f = (float) 16;
        float f2 = (float) 7;
        textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        nte.n.b(textView, yq4.b);
        onThemeChanged(km4.y0.r(textView));
    }

    public final void onThemeChanged(pda pda) {
        cfe text = pda.getText();
        TextView textView = this.o;
        textView.setTextColor(text.h);
        textView.setBackgroundColor(pda.b().h);
    }
}
