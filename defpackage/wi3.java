package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wi3  reason: default package */
public final class wi3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi3(hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wi3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hj3 hj3 = this.Y;
            ((zy9) hj3.t.getValue()).g(true);
            zr7 c = hj3.q().c();
            vi3 vi3 = new vi3(hj3, (Continuation) null);
            this.X = 1;
            if (xs7.U(c, vi3, this) == pu3) {
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
