package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: o49  reason: default package */
public final class o49 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ q49 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o49(q49 q49, Continuation continuation) {
        super(2, continuation);
        this.Y = q49;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((o49) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o49 o49 = new o49(this.Y, continuation);
        o49.X = obj;
        return o49;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        s5a s5a = this.Y.a;
        fn6 fn6 = udd.e;
        if (fn6 != null) {
            s5a.getClass();
            if (fn6.c()) {
                fn6.d(tn7.X, "OneMeInitialDataStorage", wn6.h(list.size(), "updateMiniChats by count: "), (Throwable) null);
            }
        }
        ((AtomicReference) ((h49) s5a.b.getValue()).c).set(list);
        ((h49) s5a.b.getValue()).G();
        return jue.a;
    }
}
