package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uz8  reason: default package */
public final class uz8 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ zz8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uz8(v11 v11, Continuation continuation, zz8 zz8) {
        super(2, continuation);
        this.Z = v11;
        this.w0 = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uz8 uz8 = new uz8(this.Z, continuation, this.w0);
        uz8.Y = obj;
        return uz8;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            h42 h42 = new h42((rj5) this.Y, (Object) this.w0, 7);
            this.X = 1;
            if (this.Z.c(h42, this) == pu3) {
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
