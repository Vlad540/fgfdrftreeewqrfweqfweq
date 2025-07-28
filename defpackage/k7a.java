package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: k7a  reason: default package */
public final /* synthetic */ class k7a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ m7a c;

    public /* synthetic */ k7a(m7a m7a, Context context) {
        this.a = 4;
        this.c = m7a;
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [m7a, android.view.View] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                textView.setId(qhc.b0);
                int i = 0;
                re3 re3 = new re3(0, -2);
                re3.t = 0;
                re3.i = 0;
                m7a m7a = this.c;
                t97 t97 = m7a.P0;
                re3.u = t97.a() ? ((ImageView) t97.getValue()).getId() : 0;
                t97 t972 = m7a.O0;
                if (t972.a()) {
                    i = ((TextView) t972.getValue()).getId();
                }
                re3.k = i;
                int i2 = m7a.M0;
                re3.setMarginStart(i2);
                re3.topMargin = a24.X(((float) 26) * dh4.c().getDisplayMetrics().density);
                re3.setMarginEnd(i2);
                textView.setLayoutParams(re3);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                km4.y0.r(textView);
                textView.setTextColor(-1);
                nte.y.b(textView, yq4.b);
                return textView;
            case 1:
                TextView textView2 = new TextView(this.b);
                textView2.setId(qhc.a0);
                re3 re32 = new re3(0, -2);
                re32.t = 0;
                m7a m7a2 = this.c;
                t97 t973 = m7a2.N0;
                re32.j = t973.a() ? ((TextView) t973.getValue()).getId() : 0;
                t97 t974 = m7a2.P0;
                re32.u = t974.a() ? ((ImageView) t974.getValue()).getId() : 0;
                re32.l = 0;
                int i3 = m7a2.M0;
                re32.setMarginStart(i3);
                re32.topMargin = m7a2.K0;
                re32.setMarginEnd(i3);
                re32.bottomMargin = a24.X(((float) 26) * dh4.c().getDisplayMetrics().density);
                textView2.setLayoutParams(re32);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                km4.y0.r(textView2);
                textView2.setTextColor(r1g.G(-1, 0.7f));
                nte.o.b(textView2, yq4.b);
                return textView2;
            case 2:
                return m7a.w(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(qhc.Z);
                float f = (float) 60;
                re3 re33 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                re33.i = 0;
                re33.v = 0;
                re33.l = 0;
                re33.setMarginEnd(a24.X(((float) 24) * dh4.c().getDisplayMetrics().density));
                frameLayout.setLayoutParams(re33);
                frameLayout.setBackground(this.c.R0);
                return frameLayout;
            default:
                Drawable b2 = gq3.b(this.c.getContext(), l9a.r);
                b2.setTint(rf0.d(km4.y0, this.b).f);
                return b2;
        }
    }

    public /* synthetic */ k7a(Context context, m7a m7a, int i) {
        this.a = i;
        this.b = context;
        this.c = m7a;
    }
}
