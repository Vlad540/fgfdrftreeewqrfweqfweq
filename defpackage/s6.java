package defpackage;

/* renamed from: s6  reason: default package */
public final class s6 extends w6 {
    public final mge a;
    public final int b;
    public final int c;

    public s6() {
        hge hge = new hge(r1a.J);
        int i = n1a.H0;
        int i2 = o1a.q;
        this.a = hge;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return hhd.f(this.a, s6Var.a) && this.b == s6Var.b && this.c == s6Var.c;
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
        StringBuilder sb = new StringBuilder("OpenProfile(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wn6.j(sb, this.c, ")");
    }
}
