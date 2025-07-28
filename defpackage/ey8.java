package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: ey8  reason: default package */
public final class ey8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zz8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey8(String str, zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ey8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Y;
            Uri parse = Uri.parse(str);
            zz8 zz8 = this.Z;
            bc e = ((ef7) zz8.a1.getValue()).e(parse);
            ac acVar = new ac(zz8, 28, str);
            this.X = 1;
            if (e.c(acVar, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
