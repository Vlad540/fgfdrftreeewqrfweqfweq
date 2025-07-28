package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: g11  reason: default package */
public final class g11 extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int o = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
    public final int w0 = a24.X(((float) 72) * dh4.c().getDisplayMetrics().density);
    public final int x0 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
    public final TextView y0;
    public final h11 z0;

    public g11(Context context) {
        super(context, (AttributeSet) null);
        int X = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        this.a = X;
        int X2 = a24.X(((float) 28) * dh4.c().getDisplayMetrics().density);
        this.b = X2;
        int X3 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        this.c = X3;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setText(d8.u(context, ftb.call_change_mode_text_hint));
        textView.setGravity(17);
        textView.setTextColor(1895825407);
        nge.d(nte.p, textView);
        this.y0 = textView;
        h11 h11 = new h11(context);
        h11.setLayoutParams(new LinearLayout.LayoutParams(X, X2));
        h11.setPadding(X3, X3, X3, X3);
        this.z0 = h11;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        addView(textView);
        addView(h11);
    }
}
