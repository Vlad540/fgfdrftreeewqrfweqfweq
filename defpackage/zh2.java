package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: zh2  reason: default package */
public final class zh2 extends l5e implements i26 {
    public final /* synthetic */ di2 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zh2(di2 di2, long j, Continuation continuation) {
        super(2, continuation);
        this.X = di2;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zh2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        String d;
        wx3.H(obj);
        di2 di2 = this.X;
        long j = this.Y;
        tf3 tf3 = (tf3) ((ap3) di2.X.getValue()).c(j).a.getValue();
        jue jue = jue.a;
        if (!(tf3 == null || (d = tf3.d()) == null)) {
            int t = hr1.t(di2.A0);
            l05 l05 = di2.B0;
            if (t == 0) {
                taf.o(l05, pfa.k(Collections.singletonList(new Long(j)), new jge(l8a.i2, cs.g0(new Object[]{d})), (mge) null));
            } else if (t == 1) {
                taf.o(l05, pfa.l(Collections.singletonList(new Long(j)), new jge(l8a.j2, cs.g0(new Object[]{d})), (mge) null));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue;
    }
}
