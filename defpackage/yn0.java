package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yn0  reason: default package */
public final class yn0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ao0 Y;
    public final /* synthetic */ ik3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn0(ao0 ao0, ik3 ik3, Continuation continuation) {
        super(2, continuation);
        this.Y = ao0;
        this.Z = ik3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yn0(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
            tn0 tn0 = new tn0(this.Z);
            this.X = 1;
            if (hcd.a(tn0, this) == pu3) {
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
