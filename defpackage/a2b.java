package defpackage;

/* renamed from: a2b  reason: default package */
public final class a2b {
    public final String a;
    public final Long b;

    public a2b(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2b)) {
            return false;
        }
        a2b a2b = (a2b) obj;
        return hhd.f(this.a, a2b.a) && hhd.f(this.b, a2b.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
