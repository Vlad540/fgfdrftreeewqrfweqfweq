package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x02  reason: default package */
public final class x02 extends w02 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x02(int i, int i2, int i3, hu3 hu3, pj5 pj5) {
        super(pj5, (i3 & 2) != 0 ? bw4.a : hu3, (i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2);
    }

    public final p02 j(hu3 hu3, int i, int i2) {
        return new w02(this.o, hu3, i, i2);
    }

    public final pj5 k() {
        return this.o;
    }

    public final Object m(rj5 rj5, Continuation continuation) {
        Object c = this.o.c(rj5, continuation);
        return c == pu3.a ? c : jue.a;
    }
}
