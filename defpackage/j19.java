package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j19  reason: default package */
public final class j19 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ k19 Y;
    public final /* synthetic */ i19 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j19(k19 k19, i19 i19, Continuation continuation) {
        super(2, continuation);
        this.Y = k19;
        this.Z = i19;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j19(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            this.X = 1;
            if (hcd.a(this.Z, this) == pu3) {
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
