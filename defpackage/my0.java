package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: my0  reason: default package */
public final class my0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ py0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public my0(py0 py0, Continuation continuation) {
        super(2, continuation);
        this.Y = py0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((my0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new my0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            py0 py0 = this.Y;
            this.X = 1;
            if (py0.b(py0, (bs) py0.Y.get(), this) == pu3) {
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
