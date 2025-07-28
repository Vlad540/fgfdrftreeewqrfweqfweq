package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rb5  reason: default package */
public final class rb5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ i26 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rb5(ub5 ub5, Continuation continuation) {
        super(2, continuation);
        this.Z = ub5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rb5 rb5 = new rb5(this.Z, continuation);
        rb5.Y = obj;
        return rb5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = this.Z.invoke((ou3) this.Y, this);
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
