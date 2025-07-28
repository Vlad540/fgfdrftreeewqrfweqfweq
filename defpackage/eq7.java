package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eq7  reason: default package */
public final class eq7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kq7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eq7(kq7 kq7, Continuation continuation) {
        super(2, continuation);
        this.Y = kq7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eq7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eq7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            up7 up7 = new up7(this.Y, 2);
            this.X = 1;
            if (udd.M(up7, this) == pu3) {
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
