package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jl3  reason: default package */
public final class jl3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kl3 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jl3(kl3 kl3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = kl3;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jl3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jl3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((g5e) this.Y.z0.getValue()).a(this.Z, this) == pu3) {
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
