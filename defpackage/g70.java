package defpackage;

/* renamed from: g70  reason: default package */
public final class g70 extends lbe {
    public final long X;
    public final long Y;
    public final int Z;
    public final String c;
    public final int o;

    public g70(String str, int i, long j, long j2, int i2) {
        this.c = str;
        this.o = i;
        this.X = j;
        this.Y = j2;
        this.Z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g70)) {
            return false;
        }
        g70 g70 = (g70) obj;
        return hhd.f(this.c, g70.c) && this.o == g70.o && this.X == g70.X && this.Y == g70.Y && this.Z == g70.Z;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + sxe.m(sxe.m(c3d.d(this.o, this.c.hashCode() * 31, 31), 31, this.X), 31, this.Y);
    }

    public final String toString() {
        StringBuilder m = hr1.m("Response(verifyToken='", r1g.v(this.c), "', altActionDuration=");
        m.append(this.X);
        m.append(", codeLength=");
        m.append(this.o);
        m.append(", requestMaxDuration=");
        m.append(this.Y);
        m.append(", requestCountLeft=");
        return wn6.j(m, this.Z, ")");
    }
}
