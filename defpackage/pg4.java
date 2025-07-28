package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pg4  reason: default package */
public final class pg4 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ qg4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pg4(qg4 qg4, Continuation continuation) {
        super(2, continuation);
        this.Y = qg4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pg4(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.d;
            og4 og4 = og4.a;
            this.X = 1;
            if (hcd.a(og4, this) == pu3) {
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
