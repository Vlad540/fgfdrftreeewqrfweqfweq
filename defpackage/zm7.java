package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zm7  reason: default package */
public final class zm7 extends l5e implements i26 {
    public tt0 X;
    public int Y;
    public final /* synthetic */ an7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm7(an7 an7, Continuation continuation) {
        super(2, continuation);
        this.Z = an7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zm7(this.Z, continuation);
    }

    public final Object o(Object obj) {
        tt0 tt0;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        an7 an7 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            String str = an7.Z;
            StringBuilder sb = new StringBuilder("onSuccess: tasksIds=");
            List list = an7.X;
            sb.append(list);
            udd.q(str, sb.toString());
            in7 o = an7.o();
            this.Y = 1;
            zec b = o.b();
            jue U = xs7.U(b.a.b(), new sec(b, list, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            tt0 = this.X;
            wx3.H(obj);
            ((Number) obj).longValue();
            tt0.c(new wt(7));
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (an7.Y) {
            tt0 l = an7.l();
            in7 o2 = an7.o();
            this.X = l;
            this.Y = 2;
            zec b2 = o2.b();
            Object U2 = xs7.U(b2.a.b(), new rec(b2, (Continuation) null), this);
            if (U2 == pu3) {
                return pu3;
            }
            tt0 tt02 = l;
            obj = U2;
            tt0 = tt02;
            ((Number) obj).longValue();
            tt0.c(new wt(7));
        }
        return jue;
    }
}
