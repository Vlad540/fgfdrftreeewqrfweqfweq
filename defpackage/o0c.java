package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: o0c  reason: default package */
public final class o0c extends myd implements mhe {
    public final TextView o;

    public o0c(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.getChildAt(0);
        this.o = textView;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int X = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        layoutParams.topMargin = X;
        layoutParams.bottomMargin = X;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        nte.n.b(textView, yq4.b);
        int X2 = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        int X3 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        textView.setPadding(X3, X2, X3, X2);
        onThemeChanged(km4.y0.r(textView));
    }

    public final void onThemeChanged(pda pda) {
        this.o.setTextColor(pda.getText().h);
        this.a.setBackgroundColor(pda.b().f);
    }
}
