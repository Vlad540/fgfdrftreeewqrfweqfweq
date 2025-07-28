package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e5f  reason: default package */
public final class e5f implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;

    public /* synthetic */ e5f(pj5 pj5, int i) {
        this.a = i;
        this.b = pj5;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c = this.b.c(new j4d(rj5, 5), continuation);
                return c == pu3.a ? c : jue.a;
            default:
                Object c2 = this.b.c(new j4d(rj5, 6), continuation);
                return c2 == pu3.a ? c2 : jue.a;
        }
    }
}
