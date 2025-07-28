package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lf0  reason: default package */
public final class lf0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ qf0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lf0(qf0 qf0, Continuation continuation) {
        super(2, continuation);
        this.Y = qf0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lf0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lf0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
            df0 df0 = df0.a;
            this.X = 1;
            if (hcd.a(df0, this) == pu3) {
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
