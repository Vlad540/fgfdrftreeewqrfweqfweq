package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: shd  reason: default package */
public final /* synthetic */ class shd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ shd(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ih8(this.b);
            case 1:
                return new qo0(this.b);
            case 2:
                return new ih8(this.b);
            case 3:
                return new qo0(this.b);
            case 4:
                c2f c2f = new c2f(this.b);
                c2f.setBackgroundEnabled(true);
                c2f.setDrawableEnabled(false);
                return c2f;
            case 5:
                return new qo0(this.b);
            case 6:
                c2f c2f2 = new c2f(this.b);
                c2f2.setBackgroundEnabled(true);
                c2f2.setDrawableEnabled(false);
                return c2f2;
            case 7:
                TextView textView = new TextView(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginStart(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                nte.A.b(textView, yq4.b);
                urd.B(new y9(3, (Continuation) null, 24), textView);
                textView.setGravity(17);
                return textView;
            default:
                return new yp6(this.b);
        }
    }
}
