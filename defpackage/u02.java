package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u02  reason: default package */
public final class u02 extends p02 {
    public final int X;
    public final pj5 o;

    public u02(int i, int i2, int i3, hu3 hu3, pj5 pj5) {
        super(hu3, i2, i3);
        this.o = pj5;
        this.X = i;
    }

    public final String e() {
        return "concurrency=" + this.X;
    }

    public final Object h(d5b d5b, Continuation continuation) {
        int i = hxc.a;
        Object c = this.o.c(new t02((g37) continuation.getContext().get(xhd.c), new gxc(this.X, 0), d5b, new ayc(d5b), 0), continuation);
        return c == pu3.a ? c : jue.a;
    }

    public final p02 j(hu3 hu3, int i, int i2) {
        return new u02(this.X, i, i2, hu3, this.o);
    }

    public final n1c l(ou3 ou3) {
        o02 o02 = new o02(this, (Continuation) null);
        ru3 ru3 = ru3.a;
        a5b a5b = new a5b(xie.x(ou3, this.a), xs7.a(this.b, 1, 4));
        a5b.start(ru3, a5b, o02);
        return a5b;
    }
}
