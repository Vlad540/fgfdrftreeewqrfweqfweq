package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n43  reason: default package */
public final class n43 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ r43 Y;
    public final /* synthetic */ m43 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n43(r43 r43, m43 m43, Continuation continuation) {
        super(2, continuation);
        this.Y = r43;
        this.Z = m43;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n43(this.Y, this.Z, continuation);
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
