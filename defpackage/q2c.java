package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: q2c  reason: default package */
public final class q2c extends FrameLayout implements mhe {
    public final TextView a;
    public final TextView b;

    public q2c(e78 e78, Context context) {
        super(context);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        float f = (float) 12;
        layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        textView.setLayoutParams(layoutParams);
        textView.setText(context.getString(jtb.chats_list_search_recent_header));
        nge.d(nte.q, textView);
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(textView).getText().h);
        this.a = textView;
        TextView textView2 = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(jtb.chats_list_search_recent_header_clear));
        nge.d(nte.m, textView2);
        textView2.setTextColor(s59.r(textView2).getText().h);
        a24.Z(textView2, 300, new q6(20, e78));
        this.b = textView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density)));
        addView(textView);
        addView(textView2);
    }

    public final void onThemeChanged(pda pda) {
        this.a.setTextColor(pda.getText().h);
        this.b.setTextColor(pda.getText().h);
    }
}
