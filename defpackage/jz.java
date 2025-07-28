package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jz  reason: default package */
public final class jz implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ jz(pj5 pj5, long j, int i) {
        this.a = i;
        this.b = pj5;
        this.c = j;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new iz(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            case 1:
                Object c3 = this.b.c(new iz(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
            case 2:
                Object c4 = this.b.c(new iz(rj5, this.c, 2), continuation);
                return c4 == pu3.a ? c4 : jue.a;
            default:
                Object c5 = this.b.c(new iz(rj5, this.c, 3), continuation);
                return c5 == pu3.a ? c5 : jue.a;
        }
    }
}
