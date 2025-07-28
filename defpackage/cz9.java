package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: cz9  reason: default package */
public final /* synthetic */ class cz9 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz9 b;

    public /* synthetic */ cz9(mz9 mz9, int i) {
        this.a = i;
        this.b = mz9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                GradientDrawable gradientDrawable = new GradientDrawable();
                int X = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
                s59 s59 = km4.y0;
                mz9 mz9 = this.b;
                gradientDrawable.setStroke(X, s59.r(mz9).b().i);
                s59.r(mz9);
                gradientDrawable.setColor(-16745729);
                gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 32.0f);
                return gradientDrawable;
            case 1:
                int i = mnb.call_fill_16;
                s59 s592 = km4.y0;
                mz9 mz92 = this.b;
                s592.r(mz92);
                Drawable b2 = gq3.b(mz92.getContext(), i);
                js.D(b2, -1);
                return b2;
            default:
                return mz9.a(this.b);
        }
    }
}
