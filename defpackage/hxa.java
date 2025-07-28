package defpackage;

/* renamed from: hxa  reason: default package */
public final class hxa implements q8b {
    public final mge a;

    public hxa(hge hge) {
        this.a = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxa)) {
            return false;
        }
        return hhd.f(this.a, ((hxa) obj).a);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 65536) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 65536;
    }

    public final int hashCode() {
        return Integer.hashCode(-2147418112) + (this.a.hashCode() * 31);
    }

    public final int l() {
        return -2147418112;
    }

    public final Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (!(pg7 instanceof odd)) {
            return null;
        }
        return new i9b(((odd) pg7).a);
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return "PlaceholderItem(text=" + this.a + ", viewType=-2147418112)";
    }
}
