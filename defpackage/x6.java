package defpackage;

/* renamed from: x6  reason: default package */
public final class x6 extends z6 {
    public final mge b;
    public final int c;
    public final int d;

    public x6() {
        hge hge = new hge(r1a.H);
        int i = n1a.A;
        int i2 = o1a.p;
        this.b = hge;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return hhd.f(this.b, x6Var.b) && this.c == x6Var.c && this.d == x6Var.d;
    }

    public final int getIcon() {
        return this.c;
    }

    public final int getId() {
        return this.d;
    }

    public final mge getName() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + c3d.d(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridMode(name=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", id=");
        return wn6.j(sb, this.d, ")");
    }
}
