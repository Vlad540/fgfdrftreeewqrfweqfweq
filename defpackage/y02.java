package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y02  reason: default package */
public final class y02 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b12 Y;
    public final /* synthetic */ rj5 Z;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y02(b12 b12, rj5 rj5, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = b12;
        this.Z = rj5;
        this.w0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y02) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y02(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k26 k26 = this.Y.X;
            this.X = 1;
            if (k26.invoke(this.Z, this.w0, this) == pu3) {
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
