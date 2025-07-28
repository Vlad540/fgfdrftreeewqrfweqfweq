package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sk5  reason: default package */
public final class sk5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ pj5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk5(long j, pj5 pj5, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.w0 = pj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((d5b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sk5 sk5 = new sk5(this.Z, this.w0, continuation);
        sk5.Y = obj;
        return sk5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            pj5 pj5 = this.w0;
            rk5 rk5 = new rk5(this.Z, pj5, (d5b) this.Y, (Continuation) null);
            this.X = 1;
            if (n1g.f(rk5, this) == pu3) {
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
