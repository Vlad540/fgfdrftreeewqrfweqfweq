package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: edb  reason: default package */
public final class edb implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ jdb c;

    public /* synthetic */ edb(pj5 pj5, jdb jdb, int i) {
        this.a = i;
        this.b = pj5;
        this.c = jdb;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new ddb(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            default:
                Object c3 = this.b.c(new ddb(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
        }
    }
}
