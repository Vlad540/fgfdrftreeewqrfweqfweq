package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wec  reason: default package */
public final class wec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zec Y;
    public final /* synthetic */ u16 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wec(zec zec, lxc lxc, Continuation continuation) {
        super(2, continuation);
        this.Y = zec;
        this.Z = lxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wec(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            zec zec = this.Y;
            aec m = zec.b.m();
            k14 k14 = new k14(zec, this.Z, (Continuation) null, 2);
            this.X = 1;
            if (a24.m0(m, k14, this) == pu3) {
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
