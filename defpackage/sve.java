package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sve  reason: default package */
public final class sve extends l5e implements i26 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ tve Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sve(boolean z, tve tve, Continuation continuation) {
        super(2, continuation);
        this.Y = z;
        this.Z = tve;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sve(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r13v11, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        tve tve = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ? obj3 = new Object();
            boolean z = this.Y;
            obj3.u = Boolean.valueOf(z);
            if (z) {
                obj3.o = 3;
                obj3.p = 3;
                obj3.v = 3;
            }
            pn2 pn2 = new pn2((String) null, 0, new ra3(new gze(obj3)), false);
            this.X = 1;
            obj = ((gy9) ((pk) tve.a.getValue())).K(pn2, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gze gze = ((la3) obj).o;
        if (gze != null) {
            ((kp) ((ip) tve.b.getValue())).w(gze);
            if (hhd.f(gze.u, Boolean.FALSE)) {
                i03 i03 = (i03) ((f03) tve.c.getValue());
                i03.l("app.pin_" + i03.s(), (String) null);
            }
            oa3 oa3 = (oa3) tve.f.getValue();
            oa3.getClass();
            xs7.E(oa3.b, (hu3) null, (ru3) null, new na3(oa3, (Continuation) null), 3);
            return jue.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
