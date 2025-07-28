package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bkf  reason: default package */
public final class bkf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ckf Y;
    public final /* synthetic */ akf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bkf(ckf ckf, akf akf, Continuation continuation) {
        super(2, continuation);
        this.Y = ckf;
        this.Z = akf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bkf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
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
