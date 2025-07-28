package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: qc3  reason: default package */
public final class qc3 extends us0 {
    public final int B0;

    public qc3(int i, int i2, u16 u16) {
        super(i, u16);
        this.B0 = i2;
        if (i2 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + m7c.a(us0.class).b() + " instead").toString());
        } else if (i < 1) {
            throw new IllegalArgumentException(rf0.f(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
    }

    public final Object K(Object obj, boolean z) {
        n12 n12;
        u16 u16;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        jue jue = jue.a;
        if (this.B0 == 3) {
            Object n = super.n(obj);
            if ((!(n instanceof l12)) || (n instanceof k12)) {
                return n;
            }
            if (!z || (u16 = this.b) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(u16, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
                return jue;
            }
            throw callUndeliveredElementCatchingException$default;
        }
        Object obj2 = obj;
        Symbol symbol = ws0.d;
        n12 n122 = (n12) us0.w0.get(this);
        while (true) {
            long andIncrement = us0.o.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean w = w(andIncrement, false);
            int i = ws0.b;
            long j2 = (long) i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (n122.id != j3) {
                n12 a = us0.a(this, j3, n122);
                if (a != null) {
                    n12 = a;
                } else if (w) {
                    return new k12(t());
                }
            } else {
                n12 = n122;
            }
            long j4 = j2;
            int i3 = i;
            int d = us0.d(this, n12, i2, obj, j, symbol, w);
            if (d == 0) {
                n12.cleanPrev();
                return jue;
            } else if (d == 1) {
                return jue;
            } else {
                if (d != 2) {
                    if (d == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (d != 4) {
                        if (d == 5) {
                            n12.cleanPrev();
                        }
                        n122 = n12;
                    } else {
                        if (j < us0.X.get(this)) {
                            n12.cleanPrev();
                        }
                        return new k12(t());
                    }
                } else if (w) {
                    n12.onSlotCleaned();
                    return new k12(t());
                } else {
                    fef fef = symbol instanceof fef ? (fef) symbol : null;
                    if (fef != null) {
                        fef.a(n12, i2 + i3);
                    }
                    m((n12.id * j4) + ((long) i2));
                    return jue;
                }
            }
        }
    }

    public final Object n(Object obj) {
        return K(obj, false);
    }

    public final Object o(Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object K = K(obj, true);
        if (!(K instanceof k12)) {
            return jue.a;
        }
        m12.a(K);
        u16 u16 = this.b;
        if (u16 == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(u16, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            throw t();
        }
        jjd.d(callUndeliveredElementCatchingException$default, t());
        throw callUndeliveredElementCatchingException$default;
    }

    public final boolean y() {
        return this.B0 == 2;
    }
}
