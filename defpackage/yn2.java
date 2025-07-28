package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yn2  reason: default package */
public final class yn2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fo2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn2(fo2 fo2, Continuation continuation) {
        super(2, continuation);
        this.Y = fo2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yn2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Y.d(this) == pu3) {
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
