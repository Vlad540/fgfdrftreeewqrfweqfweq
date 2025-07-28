package defpackage;

/* renamed from: aq3  reason: default package */
public final class aq3 implements dq3 {
    public final mge a;

    public aq3(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq3) && hhd.f(this.a, ((aq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Gallery(toolbarTitle="), this.a, ")");
    }
}
