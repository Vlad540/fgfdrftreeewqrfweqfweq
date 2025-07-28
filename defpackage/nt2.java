package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nt2  reason: default package */
public final class nt2 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ fu2 c;

    public /* synthetic */ nt2(pj5 pj5, fu2 fu2, int i) {
        this.a = i;
        this.b = pj5;
        this.c = fu2;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new mt2(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            case 1:
                Object c3 = this.b.c(new mt2(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
            case 2:
                Object c4 = this.b.c(new mt2(rj5, this.c, 2), continuation);
                return c4 == pu3.a ? c4 : jue.a;
            case 3:
                Object c5 = this.b.c(new mt2(rj5, this.c, 3), continuation);
                return c5 == pu3.a ? c5 : jue.a;
            default:
                Object c6 = this.b.c(new mt2(rj5, this.c, 4), continuation);
                return c6 == pu3.a ? c6 : jue.a;
        }
    }
}
