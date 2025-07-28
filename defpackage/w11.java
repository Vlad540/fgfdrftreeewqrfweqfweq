package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w11  reason: default package */
public final class w11 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ x11 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w11(long j, x11 x11, Continuation continuation) {
        super(2, continuation);
        this.Y = x11;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w11) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w11(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        long j = this.Z;
        x11 x11 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = x11.p;
            this.X = 1;
            obj = ((bv2) x11.b.getValue()).u(j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 == null) {
            return jue;
        }
        k77[] k77Arr2 = x11.p;
        long j2 = i22.a;
        qod a = x11.a(ez3.Q(((bv2) x11.b.getValue()).m(j2), new v11(new jz(((rj3) x11.h.getValue()).a(), j, 1), x11, i22, 0)), j2);
        x11.n.o1(x11, x11.p[1], a);
        if (((di3) x11.g.getValue()).m(j)) {
            int i2 = zp4.o;
            long P = mt0.P(30, eq4.SECONDS);
            this.X = 2;
            if (((r59) x11.i.getValue()).s(this.Z, P, this) == pu3) {
                return pu3;
            }
        }
        return jue;
    }
}
