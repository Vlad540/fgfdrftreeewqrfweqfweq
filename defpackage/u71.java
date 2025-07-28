package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u71  reason: default package */
public final class u71 extends l5e implements i26 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((u71) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [i26, l5e] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            sk9 sk9 = sk9.a;
            ? l5e = new l5e(2, (Continuation) null);
            this.X = 1;
            if (xs7.U(sk9, l5e, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
