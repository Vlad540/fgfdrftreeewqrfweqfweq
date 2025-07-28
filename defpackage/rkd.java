package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rkd  reason: default package */
public final class rkd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z = 100;
    public final /* synthetic */ u16 w0;
    public final /* synthetic */ hx6 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rkd(int i, okd okd, hx6 hx6, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.w0 = okd;
        this.x0 = hx6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rkd(this.Y, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ek8.q(((long) this.Y) * this.Z, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.w0.invoke(this.x0);
        return jue.a;
    }
}
