package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oy0  reason: default package */
public final class oy0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ py0 Y;
    public final /* synthetic */ bs Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy0(py0 py0, bs bsVar, Continuation continuation) {
        super(2, continuation);
        this.Y = py0;
        this.Z = bsVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oy0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oy0(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            km1 km1 = this.Y.b;
            this.X = 1;
            if (km1.b(this.Z, this) == pu3) {
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
