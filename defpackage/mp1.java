package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mp1  reason: default package */
public final class mp1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ op1 Y;
    public final /* synthetic */ m21 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp1(op1 op1, m21 m21, Continuation continuation) {
        super(2, continuation);
        this.Y = op1;
        this.Z = m21;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mp1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            g61 g61 = new g61(this.Z);
            this.X = 1;
            if (hcd.a(g61, this) == pu3) {
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
