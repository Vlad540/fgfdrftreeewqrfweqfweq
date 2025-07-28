package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: db9  reason: default package */
public final class db9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nb9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db9(nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.Y = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new db9(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long j = nb9.J;
            this.X = 1;
            if (ek8.r(j, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = nb9.K;
        this.Y.k(false);
        return jue.a;
    }
}
