package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gsa  reason: default package */
public final class gsa implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ ksa c;

    public /* synthetic */ gsa(pj5 pj5, ksa ksa, int i) {
        this.a = i;
        this.b = pj5;
        this.c = ksa;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new fsa(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            case 1:
                Object c3 = this.b.c(new fsa(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
            default:
                Object c4 = this.b.c(new fsa(rj5, this.c, 2), continuation);
                return c4 == pu3.a ? c4 : jue.a;
        }
    }
}
