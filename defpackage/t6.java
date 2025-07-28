package defpackage;

/* renamed from: t6  reason: default package */
public final class t6 extends w6 {
    public final mge a;
    public final int b;
    public final int c;

    public t6() {
        hge hge = new hge(r1a.O);
        int i = n1a.p0;
        int i2 = o1a.w;
        this.a = hge;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return hhd.f(this.a, t6Var.a) && this.b == t6Var.b && this.c == t6Var.c;
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
        StringBuilder sb = new StringBuilder("ShareScreen(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wn6.j(sb, this.c, ")");
    }
}
