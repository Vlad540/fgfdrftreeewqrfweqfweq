package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: da1  reason: default package */
public final class da1 implements pj5 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ da1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                pj5[] pj5Arr = (pj5[]) this.b;
                Object g = d8.g(rj5, new ba1(pj5Arr, 0), new ca1((Continuation) null, (ou3) this.c, (List) this.o, (ga1) this.X), continuation, pj5Arr);
                return g == pu3.a ? g : jue.a;
            case 1:
                Object c2 = ((pj5) this.b).c(new t02(rj5, (Comparator) this.c, (fu2) this.o, (Long) this.X, 2), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            case 2:
                Object c3 = ((pj5) this.b).c(new t02(rj5, (ly6) this.c, (t97) this.o, (t97) this.X, 3), continuation);
                return c3 == pu3.a ? c3 : jue.a;
            case 3:
                Object c4 = ((pj5) this.b).c(new t02(rj5, (r17) this.c, (t97) this.o, (t97) this.X, 4), continuation);
                return c4 == pu3.a ? c4 : jue.a;
            default:
                Object c5 = ((pj5) this.b).c(new t02(rj5, (Comparator) this.c, (ksa) this.o, (Long) this.X, 5), continuation);
                return c5 == pu3.a ? c5 : jue.a;
        }
    }
}
