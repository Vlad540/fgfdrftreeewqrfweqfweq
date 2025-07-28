package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: se0  reason: default package */
public final class se0 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;

    public final Object invoke(Object obj, Object obj2) {
        return ((se0) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, l5e, se0] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.Y = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            cq2 cq2 = cq2.a;
            this.X = 1;
            if (((rj5) this.Y).a(cq2, this) == pu3) {
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
