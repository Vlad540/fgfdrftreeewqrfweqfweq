package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sm2  reason: default package */
public final class sm2 extends l5e implements i26 {
    public acc X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ nn2 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sm2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.w0 = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sm2 sm2 = new sm2(this.w0, continuation);
        sm2.Z = obj;
        return sm2;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        ybc ybc;
        CharSequence charSequence;
        ou3 ou32;
        Object obj2;
        acc acc;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        nn2 nn2 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            ou32 = (ou3) this.Z;
            acc = nn2.Y;
            this.Z = ou32;
            this.X = acc;
            this.Y = 1;
            obj2 = nn2.y(this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            acc = this.X;
            wx3.H(obj);
            obj2 = obj;
            ou32 = (ou3) this.Z;
        } else if (i == 2) {
            ou3 = (ou3) this.Z;
            wx3.H(obj);
            ybc = (ybc) obj;
            jue jue = jue.a;
            if (!(ybc == null || (charSequence = ybc.a) == null || h0e.c0(charSequence))) {
                udd.p(ou3.getClass().getName(), "send restored draft on UI", new Object[0]);
                taf.o(nn2.c1, new bm2(charSequence, ybc.c, ybc.b));
            }
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj2).longValue();
        this.Z = ou32;
        this.X = null;
        this.Y = 2;
        Object U = xs7.U(((pae) acc.c.getValue()).b(), new zbc(acc, longValue, (Continuation) null), this);
        if (U == pu3) {
            return pu3;
        }
        ou3 ou33 = ou32;
        obj = U;
        ou3 = ou33;
        ybc = (ybc) obj;
        jue jue2 = jue.a;
        udd.p(ou3.getClass().getName(), "send restored draft on UI", new Object[0]);
        taf.o(nn2.c1, new bm2(charSequence, ybc.c, ybc.b));
        return jue2;
    }
}
