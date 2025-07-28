package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d92  reason: default package */
public final class d92 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ e92 Y;
    public final /* synthetic */ f92 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d92(e92 e92, f92 f92, Continuation continuation) {
        super(2, continuation);
        this.Y = e92;
        this.Z = f92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d92(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            r59 q = this.Y.q();
            int i2 = zp4.o;
            long P = mt0.P(2, eq4.o);
            this.X = 1;
            if (q.l(this.Z, P, this) == pu3) {
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
