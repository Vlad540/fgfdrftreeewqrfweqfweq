package defpackage;

/* renamed from: dv6  reason: default package */
public final class dv6 implements q8b {
    public final mge a;

    public dv6(fge fge) {
        this.a = fge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv6) && hhd.f(this.a, ((dv6) obj).a);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 64) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 64;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 64;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return me4.k(new StringBuilder("InactiveTimeDeleteProfileItem(text="), this.a, ")");
    }
}
