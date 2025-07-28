package defpackage;

/* renamed from: y6  reason: default package */
public final class y6 extends z6 {
    public final mge b;
    public final int c;
    public final int d;

    public y6() {
        hge hge = new hge(r1a.G);
        int i = n1a.z;
        int i2 = o1a.z;
        this.b = hge;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return hhd.f(this.b, y6Var.b) && this.c == y6Var.c && this.d == y6Var.d;
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
        StringBuilder sb = new StringBuilder("SpeakerMode(name=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", id=");
        return wn6.j(sb, this.d, ")");
    }
}
