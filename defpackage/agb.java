package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: agb  reason: default package */
public final class agb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fgb Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agb(fgb fgb, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
        this.Z = j;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new agb(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            h5b h5b = this.Y.T0;
            this.X = 1;
            if (h5b.v(this.Z, this.w0, this) == pu3) {
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
