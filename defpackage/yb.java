package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yb  reason: default package */
public final class yb extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cc Z;
    public final /* synthetic */ t97 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yb(cc ccVar, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Z = ccVar;
        this.w0 = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((String) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yb ybVar = new yb(this.Z, this.w0, continuation);
        ybVar.Y = obj;
        return ybVar;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            String str = (String) this.Y;
            cc ccVar = this.Z;
            if (str == null || str.length() == 0) {
                hcd hcd = ccVar.Y;
                hw4 hw4 = hw4.a;
                this.X = 1;
                if (hcd.a(hw4, this) == pu3) {
                    return pu3;
                }
            } else {
                ju3 a = ((pae) this.w0.getValue()).a();
                ru3 ru3 = ru3.b;
                xb xbVar = new xb(ccVar, str, (Continuation) null);
                k77[] k77Arr = cc.x0;
                qod D = xs7.D(ccVar.a, a, ru3, xbVar);
                ccVar.X.o1(ccVar, cc.x0[0], D);
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
