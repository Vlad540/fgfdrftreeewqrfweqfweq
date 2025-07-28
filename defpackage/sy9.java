package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: sy9  reason: default package */
public final class sy9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ o4a Y;
    public final /* synthetic */ OneMeApplication Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy9(o4a o4a, OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = o4a;
        this.Z = oneMeApplication;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sy9) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sy9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            this.Y.a(this.Z, this);
            return pu3;
        } else if (i == 1) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
