package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v22  reason: default package */
public final class v22 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ y22 w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v22(t0c t0c, Continuation continuation, y22 y22, long j) {
        super(2, continuation);
        this.Z = t0c;
        this.w0 = y22;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v22 v22 = new v22(this.Z, continuation, this.w0, this.x0);
        v22.Y = obj;
        return v22;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            u22 u22 = new u22((rj5) this.Y, this.w0, this.x0);
            this.X = 1;
            if (this.Z.c(u22, this) == pu3) {
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
