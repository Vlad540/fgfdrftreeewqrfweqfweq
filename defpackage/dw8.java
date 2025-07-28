package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dw8  reason: default package */
public final class dw8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ew8 Y;
    public final /* synthetic */ qp8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw8(ew8 ew8, qp8 qp8, Continuation continuation) {
        super(2, continuation);
        this.Y = ew8;
        this.Z = qp8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dw8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.c;
            this.X = 1;
            if (hcd.a(this.Z, this) == pu3) {
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
