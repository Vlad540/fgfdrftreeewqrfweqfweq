package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vi8  reason: default package */
public final class vi8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ xi8 Y;
    public final /* synthetic */ lp3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi8(xi8 xi8, lp3 lp3, Continuation continuation) {
        super(2, continuation);
        this.Y = xi8;
        this.Z = lp3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vi8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            qi8 qi8 = new qi8(o23.s0(this.Z.b));
            this.X = 1;
            if (hcd.a(qi8, this) == pu3) {
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
