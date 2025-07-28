package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m49  reason: default package */
public final class m49 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ q49 c;

    public /* synthetic */ m49(pj5 pj5, q49 q49, int i) {
        this.a = i;
        this.b = pj5;
        this.c = q49;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new l49(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            default:
                Object c3 = this.b.c(new l49(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
        }
    }
}
