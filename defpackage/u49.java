package defpackage;

/* renamed from: u49  reason: default package */
public final class u49 implements v49 {
    public final mge a;
    public final mge b;
    public final xxa c;
    public final boolean d;

    public u49(lge lge, lge lge2, xxa xxa, boolean z) {
        this.a = lge;
        this.b = lge2;
        this.c = xxa;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u49)) {
            return false;
        }
        u49 u49 = (u49) obj;
        return hhd.f(this.a, u49.a) && hhd.f(this.b, u49.b) && this.c == u49.c && this.d == u49.d;
    }

    public final int hashCode() {
        int e = c3d.e(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        return hr1.j(sb, this.d, ")");
    }
}
