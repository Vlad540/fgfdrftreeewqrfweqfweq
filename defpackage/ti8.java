package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ti8  reason: default package */
public final class ti8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yi8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ti8(yi8 yi8, Continuation continuation) {
        super(2, continuation);
        this.Y = yi8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ti8) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ti8(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            wh8 wh8 = wh8.a;
            this.X = 1;
            if (hcd.a(wh8, this) == pu3) {
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
