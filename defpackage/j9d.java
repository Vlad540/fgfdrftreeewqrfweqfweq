package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: j9d  reason: default package */
public final class j9d extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t9d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j9d(t9d t9d, Continuation continuation) {
        super(2, continuation);
        this.Z = t9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ma3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j9d j9d = new j9d(this.Z, continuation);
        j9d.Y = obj;
        return j9d;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            if (hhd.f((ma3) this.Y, ma3.a)) {
                this.X = 1;
                if (t9d.q(this.Z, this) == pu3) {
                    return pu3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
