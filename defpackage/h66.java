package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h66  reason: default package */
public final class h66 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ o46 Y;
    public final /* synthetic */ m66 Z;
    public final /* synthetic */ o46 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h66(o46 o46, m66 m66, o46 o462, Continuation continuation) {
        super(2, continuation);
        this.Y = o46;
        this.Z = m66;
        this.w0 = o462;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h66(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        m66 m66 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            o46 o46 = this.Y;
            if (o46 != null) {
                gl7 gl7 = m66.X;
                int i2 = m66.C0.b;
                this.X = 1;
                bv6 bv6 = (bv6) gl7;
                Object U = xs7.U(bv6.c.b().plus(bv6.b), new av6(bv6, o46.a, i2, (Continuation) null), this);
                if (U != pu3) {
                    U = jue;
                }
                if (U == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m66.L0 = taf.n(m66, m66.s().e().plus(m66.o), (ru3) null, new t56(m66, this.w0, (Continuation) null), 2);
        return jue;
    }
}
