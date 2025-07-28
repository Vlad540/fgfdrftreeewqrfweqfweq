package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h92  reason: default package */
public final class h92 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i92 Y;
    public final /* synthetic */ g92 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h92(i92 i92, g92 g92, Continuation continuation) {
        super(2, continuation);
        this.Y = i92;
        this.Z = g92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h92(this.Y, this.Z, continuation);
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
