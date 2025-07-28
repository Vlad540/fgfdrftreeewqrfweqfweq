package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lq1  reason: default package */
public final class lq1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ mq1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lq1(mq1 mq1, Continuation continuation) {
        super(2, continuation);
        this.Y = mq1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lq1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lq1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Y.a(this) == pu3) {
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
