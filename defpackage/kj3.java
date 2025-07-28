package defpackage;

/* renamed from: kj3  reason: default package */
public final class kj3 implements lj3 {
    public final zb9 a;

    public kj3(zb9 zb9) {
        this.a = zb9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj3) && hhd.f(this.a, ((kj3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(contactIds=" + this.a + ")";
    }
}
