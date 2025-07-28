package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: y4a  reason: default package */
public final class y4a extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ c5a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y4a(c5a c5a, Continuation continuation) {
        super(2, continuation);
        this.Y = c5a;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y4a y4a = new y4a(this.Y, continuation);
        y4a.X = obj;
        return y4a;
    }

    public final Object o(Object obj) {
        tj5 tj5;
        wx3.H(obj);
        c5a c5a = this.Y;
        HashSet q0 = o23.q0((List) this.X);
        qod qod = c5a.h;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        c5a.h = null;
        ju3 limitedParallelism = c5a.b.a().limitedParallelism(1, "folders-counters");
        ArrayList arrayList = new ArrayList(q23.H(q0, 10));
        Iterator it = q0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hhd.f(str, "all.chat.folder")) {
                tj5 = new tj5(3, new z4a(str, dv3.b));
            } else {
                tj5 = new we7(new lp5(str, c5a.c, c5a.a, c5a.d, limitedParallelism).e, str, 1);
            }
            arrayList.add(tj5);
        }
        c5a.h = ez3.N(new ck5(new kf4((pj5[]) o23.s0(arrayList).toArray(new pj5[0]), 2), new tg9(2, c5a.e, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 5), c5a.g);
        return jue.a;
    }
}
