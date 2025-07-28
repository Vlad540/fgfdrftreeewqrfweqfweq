package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h9d  reason: default package */
public final class h9d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t9d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h9d(t9d t9d, Continuation continuation) {
        super(2, continuation);
        this.Y = t9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h9d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (t9d.q(this.Y, this) == pu3) {
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
