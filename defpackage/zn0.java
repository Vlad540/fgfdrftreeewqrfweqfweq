package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zn0  reason: default package */
public final class zn0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ao0 Y;
    public final /* synthetic */ jh0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn0(ao0 ao0, jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = ao0;
        this.Z = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zn0(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
            vn0 vn0 = new vn0(this.Z.a);
            this.X = 1;
            if (hcd.a(vn0, this) == pu3) {
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
