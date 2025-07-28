package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: np0  reason: default package */
public final class np0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ qp0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public np0(qp0 qp0, Continuation continuation) {
        super(2, continuation);
        this.Y = qp0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((up2) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new np0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = qp0.a(this.Y, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
