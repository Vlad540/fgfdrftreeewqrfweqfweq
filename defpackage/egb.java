package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: egb  reason: default package */
public final class egb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public egb(fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new egb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        fgb fgb = this.Y;
        if (i == 0) {
            wx3.H(obj);
            h5b h5b = fgb.T0;
            this.X = 1;
            h5b.D(this);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(fgb.E0, new bfb(new hge(l8a.F0), new Integer(phc.n)));
        return jue2;
    }
}
