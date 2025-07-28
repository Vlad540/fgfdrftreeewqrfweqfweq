package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ip1  reason: default package */
public final class ip1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jp1 Y;
    public final /* synthetic */ jh0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip1(jp1 jp1, jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = jp1;
        this.Z = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ip1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ip1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            v31 v31 = new v31(this.Z.a);
            this.X = 1;
            if (hcd.a(v31, this) == pu3) {
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
