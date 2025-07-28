package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: il1  reason: default package */
public final /* synthetic */ class il1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ jl1 c;

    public /* synthetic */ il1(Context context, jl1 jl1, int i) {
        this.a = i;
        this.b = context;
        this.c = jl1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                hl1 hl1 = new hl1(this.b, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a24.X(((float) 68) * dh4.c().getDisplayMetrics().density));
                jl1 jl1 = this.c;
                jl1.setLayoutParams(layoutParams);
                float f = (float) 12;
                jl1.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(((float) 6) * dh4.c().getDisplayMetrics().density));
                jl1.removeAllViews();
                jl1.addView(hl1);
                return hl1;
            default:
                el1 el1 = new el1(this.b, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, a24.X(((float) 54) * dh4.c().getDisplayMetrics().density));
                jl1 jl12 = this.c;
                jl12.setLayoutParams(layoutParams2);
                float f2 = (float) 12;
                float f3 = (float) 6;
                jl12.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density));
                jl12.removeAllViews();
                jl12.addView(el1);
                return el1;
        }
    }
}
