package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: gcb  reason: default package */
public abstract class gcb extends mcb {
    public final boolean g(pg7 pg7) {
        if (equals(dcb.a)) {
            return pg7 instanceof dcb;
        }
        if (this instanceof ecb) {
            return pg7 instanceof ecb;
        }
        if (this instanceof fcb) {
            return (pg7 instanceof fcb) && ((fcb) this).a.a == ((fcb) pg7).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean t(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (equals(dcb.a)) {
            return pg7 instanceof dcb;
        }
        if (this instanceof ecb) {
            return pg7 instanceof ecb;
        }
        if (this instanceof fcb) {
            return (pg7 instanceof fcb) && hhd.f(((fcb) this).a, ((fcb) pg7).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
