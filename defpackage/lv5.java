package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: lv5  reason: default package */
public final /* synthetic */ class lv5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv5 b;

    public /* synthetic */ lv5(pv5 pv5, int i) {
        this.a = i;
        this.b = pv5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Drawable b2 = gq3.b(this.b.f, phc.K1);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                Drawable b3 = gq3.b(this.b.f, phc.L1);
                if (b3 != null) {
                    return b3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
