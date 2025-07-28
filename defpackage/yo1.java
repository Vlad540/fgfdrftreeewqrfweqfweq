package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yo1  reason: default package */
public final class yo1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ep1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo1(ep1 ep1, Continuation continuation) {
        super(2, continuation);
        this.Y = ep1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yo1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yo1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ep1 ep1 = this.Y;
            hcd hcd = ((jp1) ep1.q.getValue()).a;
            bw bwVar = new bw(4, ep1);
            this.X = 1;
            hcd.c(new wi1(bwVar, 4), this);
            return pu3;
        } else if (i == 1) {
            wx3.H(obj);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
