package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: x22  reason: default package */
public final class x22 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ y22 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x22(y22 y22, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = y22;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x22(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            i22 q = this.Y.q();
            if (q == null) {
                return jue;
            }
            ContextScope a = n1g.a(this.b);
            List<Object> list = this.Z;
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (Object w22 : list) {
                arrayList.add(xs7.d(a, (ju3) null, new w22(w22, (Continuation) null, this.Y, q, list), 3));
            }
            this.X = 1;
            if (lp.c(arrayList, this) == pu3) {
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
