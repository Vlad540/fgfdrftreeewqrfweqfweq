package defpackage;

/* renamed from: ge4  reason: default package */
public final class ge4 implements q8b {
    public final mge a;

    public ge4(hge hge) {
        this.a = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge4) && hhd.f(this.a, ((ge4) obj).a);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 128) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 128;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 128;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return me4.k(new StringBuilder("DeleteProfileItem(text="), this.a, ")");
    }
}
