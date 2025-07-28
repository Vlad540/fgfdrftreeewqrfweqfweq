package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k41  reason: default package */
public final class k41 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ po1 Z;
    public final /* synthetic */ r41 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k41(po1 po1, r41 r41, Continuation continuation) {
        super(2, continuation);
        this.Z = po1;
        this.w0 = r41;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k41) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k41 k41 = new k41(this.Z, this.w0, continuation);
        k41.Y = obj;
        return k41;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            d5b d5b = (d5b) this.Y;
            j41 j41 = new j41(d5b);
            zw3 zw3 = (zw3) this.Z.b().getValue();
            if (zw3.f && !(zw3.j instanceof y55)) {
                ((a5b) d5b).n(q31.c);
            }
            r41 r41 = this.w0;
            r41.b.d(j41);
            x2 x2Var = new x2((Object) r41, 6, (Object) j41);
            this.X = 1;
            if (at7.d(d5b, x2Var, this) == pu3) {
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
