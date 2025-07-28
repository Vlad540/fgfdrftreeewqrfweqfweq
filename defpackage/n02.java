package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n02  reason: default package */
public final class n02 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ rj5 Z;
    public final /* synthetic */ p02 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n02(rj5 rj5, p02 p02, Continuation continuation) {
        super(2, continuation);
        this.Z = rj5;
        this.w0 = p02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n02) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n02 n02 = new n02(this.Z, this.w0, continuation);
        n02.Y = obj;
        return n02;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            n1c l = this.w0.l((ou3) this.Y);
            this.X = 1;
            Object w = a24.w(this.Z, l, true, this);
            if (w != pu3) {
                w = jue;
            }
            if (w == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
