package defpackage;

/* renamed from: u6  reason: default package */
public final class u6 extends w6 {
    public final mge a;
    public final int b;
    public final int c;

    public u6() {
        hge hge = new hge(r1a.S);
        int i = n1a.p0;
        int i2 = o1a.y;
        this.a = hge;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return hhd.f(this.a, u6Var.a) && this.b == u6Var.b && this.c == u6Var.c;
    }

    public final int getIcon() {
        return this.b;
    }

    public final int getId() {
        return this.c;
    }

    public final mge getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareScreenUnavailable(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wn6.j(sb, this.c, ")");
    }
}
