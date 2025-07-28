package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hp1  reason: default package */
public final class hp1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jp1 Y;
    public final /* synthetic */ qd7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp1(jp1 jp1, qd7 qd7, Continuation continuation) {
        super(2, continuation);
        this.Y = jp1;
        this.Z = qd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hp1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hp1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            w31 w31 = new w31(this.Z);
            this.X = 1;
            if (hcd.a(w31, this) == pu3) {
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
