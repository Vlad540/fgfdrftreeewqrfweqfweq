package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mx2  reason: default package */
public final class mx2 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ km4 c;

    public /* synthetic */ mx2(pj5 pj5, km4 km4, int i) {
        this.a = i;
        this.b = pj5;
        this.c = km4;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new lx2(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            case 1:
                Object c3 = this.b.c(new lx2(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
            default:
                Object c4 = this.b.c(new lx2(rj5, this.c, 2), continuation);
                return c4 == pu3.a ? c4 : jue.a;
        }
    }
}
