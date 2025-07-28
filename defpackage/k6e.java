package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k6e  reason: default package */
public final class k6e implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ n6e c;

    public /* synthetic */ k6e(ik5 ik5, n6e n6e, int i) {
        this.a = i;
        this.b = ik5;
        this.c = n6e;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new j6e(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            default:
                Object c3 = this.b.c(new j6e(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
        }
    }
}
