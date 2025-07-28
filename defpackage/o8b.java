package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o8b  reason: default package */
public final class o8b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ p8b Y;
    public final /* synthetic */ op2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o8b(p8b p8b, op2 op2, Continuation continuation) {
        super(2, continuation);
        this.Y = p8b;
        this.Z = op2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o8b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            f8b f8b = new f8b(this.Z.a);
            this.X = 1;
            if (hcd.a(f8b, this) == pu3) {
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
