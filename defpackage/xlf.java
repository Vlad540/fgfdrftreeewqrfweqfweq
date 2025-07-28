package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xlf  reason: default package */
public final class xlf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kmf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xlf(kmf kmf, Continuation continuation) {
        super(2, continuation);
        this.Y = kmf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xlf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            kmf kmf = this.Y;
            grd grd = kmf.I0;
            Boolean bool = Boolean.FALSE;
            grd.m((Object) null, bool);
            kmf.J0.m((Object) null, bool);
            kmf.E0 = null;
            for (q57 d : (List) kmf.G0.o) {
                d.d((jff) null);
            }
            Object U = xs7.U(((pae) kmf.y0.getValue()).b(), new zlf(kmf, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
