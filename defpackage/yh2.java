package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yh2  reason: default package */
public final class yh2 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ di2 c;

    public /* synthetic */ yh2(pj5 pj5, di2 di2, int i) {
        this.a = i;
        this.b = pj5;
        this.c = di2;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new xh2(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            default:
                Object c3 = this.b.c(new xh2(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
        }
    }
}
