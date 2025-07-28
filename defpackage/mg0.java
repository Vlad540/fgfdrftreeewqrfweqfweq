package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mg0  reason: default package */
public final class mg0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ng0 Y;
    public final /* synthetic */ jh0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mg0(ng0 ng0, jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = ng0;
        this.Z = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mg0(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            jh0 jh0 = this.Z;
            lg0 lg0 = new lg0(jh0.a, jh0.b);
            this.X = 1;
            if (hcd.a(lg0, this) == pu3) {
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
