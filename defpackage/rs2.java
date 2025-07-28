package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rs2  reason: default package */
public final class rs2 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ bt2 c;

    public /* synthetic */ rs2(pj5 pj5, bt2 bt2, int i) {
        this.a = i;
        this.b = pj5;
        this.c = bt2;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new qs2(rj5, this.c, 0), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            default:
                Object c3 = this.b.c(new qs2(rj5, this.c, 1), continuation);
                return c3 == pu3.a ? c3 : jue.a;
        }
    }
}
