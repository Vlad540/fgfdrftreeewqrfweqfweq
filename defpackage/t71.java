package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: t71  reason: default package */
public final class t71 extends l5e implements i26 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((t71) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ek8.q(300, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tt6 i2 = o2a.a.i();
        if (i2 != null) {
            i2.f(Collections.singleton(new st6(qt6.PARTICIPATED_IN_CALL, 1)), mnc.P0);
        }
        return jue.a;
    }
}
