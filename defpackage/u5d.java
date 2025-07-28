package defpackage;

/* renamed from: u5d  reason: default package */
public final class u5d {
    public final mge a;
    public final int b;
    public final boolean c;

    public u5d(hge hge, int i, boolean z) {
        this.a = hge;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5d)) {
            return false;
        }
        u5d u5d = (u5d) obj;
        return hhd.f(this.a, u5d.a) && this.b == u5d.b && this.c == u5d.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return hr1.j(sb, this.c, ")");
    }
}
