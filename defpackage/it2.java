package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: it2  reason: default package */
public final class it2 extends l5e implements i26 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((it2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            int i2 = zp4.o;
            long P = mt0.P(2, eq4.SECONDS);
            this.X = 1;
            if (ek8.r(P, this) == pu3) {
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
