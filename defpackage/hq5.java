package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hq5  reason: default package */
public final class hq5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ rq5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq5(Object obj, Continuation continuation, rq5 rq5) {
        super(2, continuation);
        this.Y = obj;
        this.Z = rq5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hq5(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((Number) this.Y).longValue();
            k77[] k77Arr = rq5.H0;
            this.X = 1;
            obj = ((bv2) this.Z.Z.getValue()).k(longValue, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 != null) {
            return new Long(i22.a);
        }
        return null;
    }
}
