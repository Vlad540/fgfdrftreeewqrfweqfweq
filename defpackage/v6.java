package defpackage;

/* renamed from: v6  reason: default package */
public final class v6 extends w6 {
    public final mge a;
    public final int b;
    public final int c;

    public v6() {
        hge hge = new hge(r1a.I);
        int i = zhc.P;
        int i2 = o1a.F;
        this.a = hge;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return hhd.f(this.a, v6Var.a) && this.b == v6Var.b && this.c == v6Var.c;
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
        StringBuilder sb = new StringBuilder("WriteToChat(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wn6.j(sb, this.c, ")");
    }
}
