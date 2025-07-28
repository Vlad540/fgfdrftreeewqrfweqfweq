package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: a17  reason: default package */
public final class a17 extends myd implements mhe {
    public final TextView o;

    public a17(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.o = appCompatTextView;
        appCompatTextView.setLayoutParams(new n6c(-1, -2));
        float f = (float) 12;
        appCompatTextView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        onThemeChanged(km4.y0.r(appCompatTextView));
    }

    public final void onThemeChanged(pda pda) {
        nge nge = nte.n;
        TextView textView = this.o;
        nge.d(nge, textView);
        textView.setTextColor(pda.getText().h);
        textView.setBackgroundColor(pda.b().i);
    }
}
