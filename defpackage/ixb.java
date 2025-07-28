package defpackage;

/* renamed from: ixb  reason: default package */
public final class ixb {
    public static final ixb c = new ixb(mge.a, (jge) null);
    public final mge a;
    public final mge b;

    public ixb(mge mge, jge jge) {
        this.a = mge;
        this.b = jge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixb)) {
            return false;
        }
        ixb ixb = (ixb) obj;
        return hhd.f(this.a, ixb.a) && hhd.f(this.b, ixb.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mge mge = this.b;
        return hashCode + (mge == null ? 0 : mge.hashCode());
    }

    public final String toString() {
        return "RaiseHandState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
