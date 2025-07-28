package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: n32  reason: default package */
public final /* synthetic */ class n32 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p32 b;

    public /* synthetic */ n32(p32 p32, int i) {
        this.a = i;
        this.b = p32;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = phc.p;
                p32 p32 = this.b;
                Drawable b2 = gq3.b(p32.getContext(), i);
                js.D(b2, km4.y0.r(p32).getIcon().g);
                return b2;
            case 1:
                int i2 = phc.k;
                p32 p322 = this.b;
                Drawable b3 = gq3.b(p322.getContext(), i2);
                km4.y0.r(p322);
                js.D(b3, -16745729);
                return b3;
            case 2:
                int i3 = phc.i;
                p32 p323 = this.b;
                Drawable b4 = gq3.b(p323.getContext(), i3);
                km4.y0.r(p323);
                js.D(b4, -16745729);
                return b4;
            default:
                return new RippleDrawable(ColorStateList.valueOf(km4.y0.r(this.b).c().a.f), (Drawable) null, new ColorDrawable(-1));
        }
    }
}
