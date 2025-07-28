package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: eb7  reason: default package */
public final class eb7 extends myd implements mhe {
    public final TextView o;

    public eb7(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.o = appCompatTextView;
        n6c n6c = new n6c(-1, a24.X(((float) 28) * dh4.c().getDisplayMetrics().density));
        n6c.topMargin = (int) (dh4.c().getDisplayMetrics().density * 20.5f);
        appCompatTextView.setLayoutParams(n6c);
        appCompatTextView.setGravity(16);
        float f = (float) 12;
        appCompatTextView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        onThemeChanged(km4.y0.r(appCompatTextView));
    }

    public final void onThemeChanged(pda pda) {
        nge nge = nte.n;
        TextView textView = this.o;
        nge.b(textView, yq4.b);
        textView.setTextColor(pda.getText().h);
        textView.setBackgroundColor(pda.b().i);
    }
}
