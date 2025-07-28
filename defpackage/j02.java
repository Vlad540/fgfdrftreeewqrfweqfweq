package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: j02  reason: default package */
public final class j02 extends p02 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(j02.class, "consumed$volatile");
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;
    public final n1c o;

    public /* synthetic */ j02(n1c n1c, boolean z) {
        this(n1c, z, bw4.a, -3, 1);
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        jue jue = jue.a;
        pu3 pu3 = pu3.a;
        if (this.b == -3) {
            boolean z = this.X;
            if (!z || Y.getAndSet(this, 1) == 0) {
                Object w = a24.w(rj5, this.o, z, continuation);
                return w == pu3 ? w : jue;
            }
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object c = super.c(rj5, continuation);
        return c == pu3 ? c : jue;
    }

    public final String e() {
        return "channel=" + this.o;
    }

    public final Object h(d5b d5b, Continuation continuation) {
        Object w = a24.w(new ayc(d5b), this.o, this.X, continuation);
        return w == pu3.a ? w : jue.a;
    }

    public final p02 j(hu3 hu3, int i, int i2) {
        return new j02(this.o, this.X, hu3, i, i2);
    }

    public final pj5 k() {
        return new j02(this.o, this.X);
    }

    public final n1c l(ou3 ou3) {
        if (!this.X || Y.getAndSet(this, 1) == 0) {
            return this.b == -3 ? this.o : super.l(ou3);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public j02(n1c n1c, boolean z, hu3 hu3, int i, int i2) {
        super(hu3, i, i2);
        this.o = n1c;
        this.X = z;
        this.consumed$volatile = 0;
    }
}
