package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xe2  reason: default package */
public final class xe2 extends l5e implements i26 {
    public Object X;
    public List Y;
    public int Z;
    public final /* synthetic */ gf2 w0;
    public final /* synthetic */ vc2 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xe2(gf2 gf2, vc2 vc2, Continuation continuation) {
        super(2, continuation);
        this.w0 = gf2;
        this.x0 = vc2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xe2(this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        mc9 mc9;
        gf2 gf2;
        List list;
        pu3 pu3 = pu3.a;
        int i = this.Z;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = gf2.V0;
            gf2 gf22 = this.w0;
            i22 v = gf22.v();
            xm8 xm8 = v != null ? v.c : null;
            Long valueOf = xm8 != null ? Long.valueOf(xm8.k()) : null;
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                vc2 vc2 = this.x0;
                udd.p(vc2.a, "getHistoryItems: %d", new Object[]{Long.valueOf(longValue)});
                list = vc2.b.f(longValue);
                this.X = gf22;
                this.Y = list;
                this.Z = 1;
                if (gf2.t(gf22, list, this) == pu3) {
                    return pu3;
                }
                gf2 = gf22;
            }
            return jue.a;
        } else if (i == 1) {
            list = this.Y;
            gf2 = (gf2) this.X;
            wx3.H(obj);
        } else if (i == 2) {
            mc9 = (mc9) this.X;
            wx3.H(obj);
            mc9.setValue(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mc9 mc92 = gf2.S0;
        this.X = mc92;
        this.Y = null;
        this.Z = 2;
        Object A = gf2.A(list, (Long) null, this);
        if (A == pu3) {
            return pu3;
        }
        mc9 mc93 = mc92;
        obj = A;
        mc9 = mc93;
        mc9.setValue(obj);
        return jue.a;
    }
}
