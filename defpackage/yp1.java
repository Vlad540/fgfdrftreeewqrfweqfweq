package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: yp1  reason: default package */
public final class yp1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yp1(String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yp1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            fr6 u = a06.u();
            this.X = 1;
            obj = hhd.t(u, ur6.d(Uri.parse(this.Y)).a(), Long.MAX_VALUE, (Object) null, this, 8);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
