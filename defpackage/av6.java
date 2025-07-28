package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: av6  reason: default package */
public final class av6 extends l5e implements i26 {
    public final /* synthetic */ bv6 X;
    public final /* synthetic */ n46 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av6(bv6 bv6, n46 n46, int i, Continuation continuation) {
        super(2, continuation);
        this.X = bv6;
        this.Y = n46;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new av6(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bv6 bv6 = this.X;
        ConcurrentHashMap concurrentHashMap = bv6.E0;
        n46 n46 = this.Y;
        List list = (List) concurrentHashMap.get(n46);
        jue jue = jue.a;
        if (list == null) {
            return jue;
        }
        int i = n46 instanceof m46 ? 40 : this.Z;
        if (list.size() <= i) {
            return jue;
        }
        bv6.E0.put(n46, list.subList(0, i));
        return jue;
    }
}
