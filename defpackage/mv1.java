package defpackage;

/* renamed from: mv1  reason: default package */
public final class mv1 implements q8b {
    public final mge a;

    public mv1(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv1) && hhd.f(this.a, ((mv1) obj).a);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 256) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 256;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 256;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return me4.k(new StringBuilder("CancelDeleteProfileItem(text="), this.a, ")");
    }
}
