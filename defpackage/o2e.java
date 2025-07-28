package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: o2e  reason: default package */
public final class o2e extends l5e implements i26 {
    public final /* synthetic */ yha X;
    public final /* synthetic */ Set Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o2e(yha yha, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.X = yha;
        this.Y = linkedHashSet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o2e(this.X, (LinkedHashSet) this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        yha yha = this.X;
        boolean z = ((n62) yha.a) == n62.b;
        Set set = this.Y;
        List<e2e> b = z ? ((h3e) yha.c).b((LinkedHashSet) set) : ((jp3) yha.o).b((LinkedHashSet) set);
        ArrayList arrayList = new ArrayList(q23.H(b, 10));
        for (e2e l3e : b) {
            arrayList.add(new l3e(l3e, !z));
        }
        return arrayList;
    }
}
