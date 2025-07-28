package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uj5  reason: default package */
public final class uj5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k26 Z;
    public final /* synthetic */ rj5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj5(k26 k26, rj5 rj5, Continuation continuation) {
        super(2, continuation);
        this.Z = k26;
        this.w0 = rj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uj5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uj5 uj5 = new uj5(this.Z, this.w0, continuation);
        uj5.Y = obj;
        return uj5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Z.invoke((ou3) this.Y, this.w0, this) == pu3) {
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
