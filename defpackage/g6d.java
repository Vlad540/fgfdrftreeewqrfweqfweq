package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g6d  reason: default package */
public final class g6d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ k6d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g6d(k6d k6d, Continuation continuation) {
        super(2, continuation);
        this.Y = k6d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g6d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        k6d k6d = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            Object U = xs7.U(((pae) k6d.w0.getValue()).b(), new h6d(k6d, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k77[] k77Arr = k6d.D0;
        k6d.q(0);
        return jue;
    }
}
