package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: kq5  reason: default package */
public final class kq5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Set Y;
    public final /* synthetic */ rq5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq5(rq5 rq5, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = set;
        this.Z = rq5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kq5(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Set<Number> set;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            if (this.Y.isEmpty() && (!((Collection) this.Z.C0.get()).isEmpty())) {
                rq5 rq5 = this.Z;
                ep5 ep5 = rq5.E0;
                if (!(ep5 == null || (set = ep5.z0) == null)) {
                    for (Number longValue : set) {
                        rq5.s(longValue.longValue());
                    }
                }
                rq5.C0.updateAndGet(new pb2(2));
            } else if (!this.Y.isEmpty()) {
                rq5 rq52 = this.Z;
                Set set2 = this.Y;
                this.X = 1;
                if (rq5.q(rq52, set2, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rq5 rq53 = this.Z;
        this.X = 2;
        if (rq5.r(rq53, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
