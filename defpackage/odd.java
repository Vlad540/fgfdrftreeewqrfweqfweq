package defpackage;

/* renamed from: odd  reason: default package */
public final class odd implements q8b {
    public final n06 a;

    public odd(n06 n06) {
        this.a = n06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odd)) {
            return false;
        }
        return hhd.f(this.a, ((odd) obj).a);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 16) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 16;
    }

    public final int hashCode() {
        n06 n06 = this.a;
        return Integer.hashCode(-2147483632) + ((n06 == null ? 0 : n06.hashCode()) * 31);
    }

    public final int l() {
        return -2147483632;
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
        return "ShortLinkInputItem(state=" + this.a + ", viewType=-2147483632)";
    }
}
