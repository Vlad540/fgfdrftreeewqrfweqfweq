package defpackage;

/* renamed from: k8d  reason: default package */
public final class k8d {
    public final mge a;
    public final int b;
    public final boolean c = false;

    public k8d(int i, hge hge) {
        this.a = hge;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8d)) {
            return false;
        }
        k8d k8d = (k8d) obj;
        return hhd.f(this.a, k8d.a) && this.b == k8d.b && this.c == k8d.c;
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
