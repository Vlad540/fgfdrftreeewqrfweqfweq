package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vi  reason: default package */
public final class vi extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;
    public final /* synthetic */ zb9 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi(gj gjVar, zb9 zb9, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
        this.w0 = zb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vi viVar = new vi(this.Z, this.w0, continuation);
        viVar.Y = obj;
        return viVar;
    }

    public final Object o(Object obj) {
        kcc kcc;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            gj gjVar = this.Z;
            zb9 zb9 = this.w0;
            pk pkVar = gjVar.a;
            dt dtVar = new dt(8, lp.T(zb9));
            this.X = 1;
            obj = ((gy9) pkVar).K(dtVar, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                kcc = new kcc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kcc = (ht) obj;
        if (kcc instanceof kcc) {
            return null;
        }
        return kcc;
    }
}
