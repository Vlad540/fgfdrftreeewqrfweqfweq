package defpackage;

import android.widget.TextView;

/* renamed from: ew2  reason: default package */
public final class ew2 extends myd implements mhe {
    public final TextView o;

    public ew2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new n6c(-1, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density)));
        textView.setGravity(16);
        float f = (float) 12;
        textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        onThemeChanged(km4.y0.r(textView));
    }

    public final void onThemeChanged(pda pda) {
        nge nge = nte.q;
        TextView textView = this.o;
        nge.d(nge, textView);
        textView.setTextColor(pda.getText().h);
        textView.setBackgroundColor(pda.b().i);
    }
}
