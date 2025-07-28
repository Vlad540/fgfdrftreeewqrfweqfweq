package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: hyd  reason: default package */
public final class hyd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ lyd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hyd(lyd lyd, Continuation continuation) {
        super(2, continuation);
        this.Y = lyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hyd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            v2c v2c = (v2c) this.Y.o.getValue();
            f73 k = new yt9(v2c.b().a(Collections.singletonList(r2c.STICKER)), new mb1(20, v2c)).k((qmc) v2c.c.getValue());
            this.X = 1;
            if (e07.c(k, this) == pu3) {
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
