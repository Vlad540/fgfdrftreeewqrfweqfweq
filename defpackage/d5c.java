package defpackage;

/* renamed from: d5c  reason: default package */
public final class d5c {
    public final long a;
    public final mge b;
    public final u0a c;

    public d5c(long j, hge hge, u0a u0a) {
        this.a = j;
        this.b = hge;
        this.c = u0a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5c)) {
            return false;
        }
        d5c d5c = (d5c) obj;
        return this.a == d5c.a && hhd.f(this.b, d5c.b) && this.c == d5c.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + c3d.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ButtonState(id=" + this.a + ", textSource=" + this.b + ", mode=" + this.c + ")";
    }
}
