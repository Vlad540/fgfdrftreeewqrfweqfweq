package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wi8  reason: default package */
public final class wi8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ xi8 Y;
    public final /* synthetic */ si8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi8(xi8 xi8, si8 si8, Continuation continuation) {
        super(2, continuation);
        this.Y = xi8;
        this.Z = si8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wi8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
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
