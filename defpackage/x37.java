package defpackage;

/* renamed from: x37  reason: default package */
public final class x37 {
    public final String a;
    public final g37 b;

    public x37(String str, qod qod) {
        this.a = str;
        this.b = qod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x37)) {
            return false;
        }
        x37 x37 = (x37) obj;
        return hhd.f(this.a, x37.a) && hhd.f(this.b, x37.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobWrapper(name=" + this.a + ", job=" + this.b + ")";
    }
}
