package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.coroutines.Continuation;

/* renamed from: o53  reason: default package */
public final class o53 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ kh3 Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o53(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kh3 kh3 = (kh3) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                o53 o53 = new o53(3, continuation, 0);
                o53.Y = kh3;
                o53.Z = pda;
                jue jue = jue.a;
                o53.o(jue);
                return jue;
            default:
                o53 o532 = new o53(3, continuation, 1);
                o532.Y = kh3;
                o532.Z = pda;
                jue jue2 = jue.a;
                o532.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                kh3 kh3 = this.Y;
                nd0 b = this.Z.b();
                kh3.setBackground(new RippleDrawable(ColorStateList.valueOf(b.i), (Drawable) null, new ColorDrawable(-65536)));
                return jue.a;
            default:
                wx3.H(obj);
                kh3 kh32 = this.Y;
                nd0 b2 = this.Z.b();
                kh32.setBackground(new RippleDrawable(ColorStateList.valueOf(b2.i), (Drawable) null, new ColorDrawable(-65536)));
                return jue.a;
        }
    }
}
