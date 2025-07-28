package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fae  reason: default package */
public final class fae extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l5e l5e = new l5e(2, continuation);
        l5e.Y = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Object value = wce.d0.a.getValue();
            this.X = 1;
            if (((rj5) this.Y).a(value, this) == pu3) {
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
