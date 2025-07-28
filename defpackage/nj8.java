package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nj8  reason: default package */
public final class nj8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ uj8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nj8(Object obj, Continuation continuation, uj8 uj8) {
        super(2, continuation);
        this.Y = obj;
        this.Z = uj8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nj8(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        uj8 uj8 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((Number) this.Y).longValue();
            this.X = 1;
            obj = ((ap3) uj8.x0.getValue()).b(longValue, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tf3 tf3 = (tf3) obj;
        if (tf3 != null) {
            return ((o94) uj8.A0.getValue()).f(tf3);
        }
        return null;
    }
}
