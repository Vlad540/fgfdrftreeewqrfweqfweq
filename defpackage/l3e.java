package defpackage;

/* renamed from: l3e  reason: default package */
public final class l3e {
    public final e2e a;
    public final boolean b;

    public l3e(e2e e2e, boolean z) {
        this.a = e2e;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3e)) {
            return false;
        }
        l3e l3e = (l3e) obj;
        return hhd.f(this.a, l3e.a) && this.b == l3e.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(suggest=" + this.a + ", fromContacts=" + this.b + ")";
    }
}
