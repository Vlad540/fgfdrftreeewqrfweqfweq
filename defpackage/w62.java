package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: w62  reason: default package */
public final class w62 extends ih0 {
    public final mz9 a;
    public final TextView b;
    public final TextView c;
    public final v62 o;

    public w62(Context context) {
        super(context, (AttributeSet) null, 0);
        mz9 mz9 = new mz9(context);
        float f = (float) 71;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        mz9.setLayoutParams(layoutParams);
        this.a = mz9;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        nte.j.b(textView, yq4.b);
        urd.B(new y9(3, (Continuation) null, 3), textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        nte.r.b(textView2, yq4.b);
        urd.B(new y9(3, (Continuation) null, 2), textView2);
        this.c = textView2;
        v62 v62 = new v62(context);
        v62.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.o = v62;
        addView(mz9);
        addView(textView);
        addView(textView2);
        addView(v62);
        setGravity(1);
        setMinimumWidth(a24.X(((float) 296) * dh4.c().getDisplayMetrics().density));
        float f2 = (float) 24;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(((float) 20) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
    }

    public final void onThemeChanged(pda pda) {
        super.onThemeChanged(pda);
        km4.d(km4.y0.n(getContext()), this);
    }

    public final void setDescriptions(List<? extends mge> list) {
        v62 v62 = this.o;
        v62.getClass();
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (mge c2 : list) {
            arrayList.add(c2.c(v62));
        }
        v62.x0 = arrayList;
        v62.requestLayout();
        v62.invalidate();
        this.c.setGravity(list.isEmpty() ? 17 : 8388611);
    }

    public final void setSubtitle(mge mge) {
        this.c.setText(mge.c(this));
    }

    public final void setTitle(mge mge) {
        TextView textView = this.b;
        textView.setText(mge.a(textView.getContext()));
    }
}
