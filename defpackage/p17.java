package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p17  reason: default package */
public final class p17 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ r17 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p17(r17 r17, Continuation continuation) {
        super(2, continuation);
        this.Y = r17;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p17) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p17(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.w0;
            this.X = 1;
            if (hcd.a((Object) null, this) == pu3) {
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
