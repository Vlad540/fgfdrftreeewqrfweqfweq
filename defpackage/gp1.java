package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gp1  reason: default package */
public final class gp1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jp1 Y;
    public final /* synthetic */ lp3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gp1(jp1 jp1, lp3 lp3, Continuation continuation) {
        super(2, continuation);
        this.Y = jp1;
        this.Z = lp3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gp1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            b41 b41 = new b41(o23.w0(this.Z.b));
            this.X = 1;
            if (hcd.a(b41, this) == pu3) {
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
