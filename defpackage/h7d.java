package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: h7d  reason: default package */
public final /* synthetic */ class h7d implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n7d c;

    public /* synthetic */ h7d(Context context, n7d n7d, int i) {
        this.a = i;
        this.b = context;
        this.c = n7d;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                t3a t3a = new t3a(this.b);
                t3a.setId(caa.j);
                LinearLayout linearLayout = this.c.Q0;
                re3 re3 = new re3(-2, -2);
                re3.setMarginEnd(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density));
                linearLayout.addView(t3a, re3);
                return t3a;
            case 1:
                return n7d.x(this.b, this.c);
            case 2:
                return n7d.w(this.b, this.c);
            case 3:
                return n7d.y(this.b, this.c);
            case 4:
                return n7d.A(this.b, this.c);
            case 5:
                SwitchCompat eda = new eda(this.b, (AttributeSet) null);
                eda.setChecked(false);
                eda.setShowText(false);
                this.c.Q0.addView(eda);
                return eda;
            default:
                nn nnVar = new nn(this.b, (AttributeSet) null);
                float f = (float) 28;
                nnVar.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
                nnVar.b(nnVar.isChecked(), km4.y0.r(nnVar));
                nnVar.setChecked(false);
                this.c.Q0.addView(nnVar);
                return nnVar;
        }
    }
}
