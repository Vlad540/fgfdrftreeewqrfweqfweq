package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lq5  reason: default package */
public final class lq5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rq5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lq5(rq5 rq5, Continuation continuation) {
        super(2, continuation);
        this.Y = rq5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lq5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        rq5 rq5 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            b92 b92 = rq5.X;
            this.X = 1;
            if (b92.c(rq5.b, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(rq5.B0, new rp5(false));
        return jue.a;
    }
}
