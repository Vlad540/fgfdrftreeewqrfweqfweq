package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: td5  reason: default package */
public final /* synthetic */ class td5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ud5 b;

    public /* synthetic */ td5(ud5 ud5, int i) {
        this.a = i;
        this.b = ud5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = phc.u0;
                ud5 ud5 = this.b;
                Drawable b2 = gq3.b(ud5.getContext(), i);
                b2.setCallback(ud5);
                return b2;
            case 1:
                int i2 = phc.m0;
                ud5 ud52 = this.b;
                Drawable b3 = gq3.b(ud52.getContext(), i2);
                b3.setCallback(ud52);
                return b3;
            default:
                d00 d00 = new d00();
                ud5 ud53 = this.b;
                d00.a = (Drawable) ud53.x0.getValue();
                d00.invalidateSelf();
                d00.b(ud53.b);
                d00.e = true;
                d00.invalidateSelf();
                d00.c = a24.X(((float) 36) * dh4.c().getDisplayMetrics().density);
                d00.b = true;
                d00.invalidateSelf();
                d00.setCallback(ud53);
                return d00;
        }
    }
}
