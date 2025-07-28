package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ym7  reason: default package */
public final class ym7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ an7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym7(an7 an7, Continuation continuation) {
        super(2, continuation);
        this.Y = an7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ym7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            an7 an7 = this.Y;
            String str = an7.Z;
            StringBuilder sb = new StringBuilder("onFail: tasksIds=");
            List list = an7.X;
            sb.append(list);
            udd.q(str, sb.toString());
            in7 o = an7.o();
            this.X = 1;
            zec b = o.b();
            Object U = xs7.U(b.a.b(), new yec(b, list, 1, (Continuation) null), this);
            if (U != obj2) {
                U = obj3;
            }
            if (U != obj2) {
                U = obj3;
            }
            if (U == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
