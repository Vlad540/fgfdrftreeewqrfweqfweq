package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: w02  reason: default package */
public abstract class w02 extends p02 {
    public final pj5 o;

    public w02(pj5 pj5, hu3 hu3, int i, int i2) {
        super(hu3, i, i2);
        this.o = pj5;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        Object c;
        jue jue = jue.a;
        pu3 pu3 = pu3.a;
        if (this.b == -3) {
            hu3 context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            vg0 vg0 = new vg0(10);
            hu3 hu3 = this.a;
            hu3 plus = !((Boolean) hu3.fold(bool, vg0)).booleanValue() ? context.plus(hu3) : xie.p(context, hu3, false);
            if (hhd.f(plus, context)) {
                c = m(rj5, continuation);
                if (c != pu3) {
                    return jue;
                }
            } else {
                cqc cqc = cqc.c;
                if (hhd.f(plus.get(cqc), context.get(cqc))) {
                    hu3 context2 = continuation.getContext();
                    if (!(rj5 instanceof ayc) && !(rj5 instanceof bl9)) {
                        rj5 = new a40(rj5, context2);
                    }
                    c = am7.E(plus, rj5, ThreadContextKt.threadContextElements(plus), new v02(this, (Continuation) null), continuation);
                    if (c != pu3) {
                        return jue;
                    }
                }
            }
            return c;
        }
        c = super.c(rj5, continuation);
        if (c != pu3) {
            return jue;
        }
        return c;
    }

    public final Object h(d5b d5b, Continuation continuation) {
        Object m = m(new ayc(d5b), continuation);
        return m == pu3.a ? m : jue.a;
    }

    public abstract Object m(rj5 rj5, Continuation continuation);

    public final String toString() {
        return this.o + " -> " + super.toString();
    }
}
