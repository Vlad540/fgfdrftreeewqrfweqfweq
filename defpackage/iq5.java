package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: iq5  reason: default package */
public final class iq5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Collection Y;
    public final /* synthetic */ rq5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iq5(AbstractCollection abstractCollection, rq5 rq5, Continuation continuation) {
        super(2, continuation);
        this.Y = abstractCollection;
        this.Z = rq5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iq5((AbstractCollection) this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ContextScope a = n1g.a(this.b);
            Collection<Object> collection = this.Y;
            ArrayList arrayList = new ArrayList(q23.H(collection, 10));
            for (Object hq5 : collection) {
                arrayList.add(xs7.d(a, (ju3) null, new hq5(hq5, (Continuation) null, this.Z), 3));
            }
            this.X = 1;
            obj = lp.c(arrayList, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o23.T((Iterable) obj);
    }
}
