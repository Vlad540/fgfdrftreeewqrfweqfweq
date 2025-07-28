package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uy9  reason: default package */
public final class uy9 extends l5e implements i26 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((uy9) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ik5 g = ((v72) nqc.a.getAccessor().c(v72.class)).g();
            this.X = 1;
            if (ez3.c0(g, this) == pu3) {
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
