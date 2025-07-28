package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: soc  reason: default package */
public final /* synthetic */ class soc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zoc c;

    public /* synthetic */ soc(Context context, zoc zoc, int i) {
        this.a = i;
        this.b = context;
        this.c = zoc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                qoc qoc = new qoc(this.b);
                qoc.setImageDrawable(gq3.b(qoc.getContext(), l9a.u));
                a24.a0(qoc, new roc(this.c, 0));
                ViewGroup.LayoutParams layoutParams = qoc.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                    qoc.setLayoutParams(marginLayoutParams);
                    return qoc;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 1:
                qoc qoc2 = new qoc(this.b);
                qoc2.setImageDrawable(gq3.b(qoc2.getContext(), l9a.q));
                a24.a0(qoc2, new roc(this.c, 1));
                ViewGroup.LayoutParams layoutParams2 = qoc2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                    qoc2.setLayoutParams(marginLayoutParams2);
                    return qoc2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                qoc qoc3 = new qoc(this.b);
                qoc3.setImageDrawable(gq3.b(qoc3.getContext(), l9a.p));
                a24.a0(qoc3, new roc(this.c, 2));
                ViewGroup.LayoutParams layoutParams3 = qoc3.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                    qoc3.setLayoutParams(marginLayoutParams3);
                    return qoc3;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
