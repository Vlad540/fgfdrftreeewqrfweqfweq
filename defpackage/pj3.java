package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pj3  reason: default package */
public final class pj3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rj3 Y;
    public final /* synthetic */ lp3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj3(rj3 rj3, lp3 lp3, Continuation continuation) {
        super(2, continuation);
        this.Y = rj3;
        this.Z = lp3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pj3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            kj3 kj3 = new kj3(lp.V(this.Z.b));
            this.X = 1;
            if (hcd.a(kj3, this) == pu3) {
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
