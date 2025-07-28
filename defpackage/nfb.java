package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nfb  reason: default package */
public final class nfb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nfb(fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nfb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        fgb fgb = this.Y;
        if (i == 0) {
            wx3.H(obj);
            h5b h5b = fgb.T0;
            this.X = 1;
            obj = h5b.n(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        jue jue = jue.a;
        if (i22 == null) {
            return jue;
        }
        taf.o(fgb.F0, new odb(i22.a));
        return jue;
    }
}
