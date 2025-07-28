package defpackage;

/* renamed from: y3  reason: default package */
public final class y3 {
    public final int a;
    public final int b;

    public y3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        y3Var.getClass();
        return this.a == y3Var.a && this.b == y3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + c3d.d(this.a, Integer.hashCode(-16745729) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccentColors(themed=-16745729, red=");
        sb.append(this.a);
        sb.append(", secondary=");
        return wn6.j(sb, this.b, ")");
    }
}
