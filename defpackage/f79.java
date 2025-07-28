package defpackage;

/* renamed from: f79  reason: default package */
public final class f79 {
    public final xm1 a;
    public final float b;
    public final boolean c;
    public final Long d;
    public final boolean e;

    public f79(xm1 xm1, float f, boolean z, Long l, boolean z2) {
        this.a = xm1;
        this.b = f;
        this.c = z;
        this.d = l;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f79)) {
            return false;
        }
        f79 f79 = (f79) obj;
        return hhd.f(this.a, f79.a) && Float.compare(this.b, f79.b) == 0 && this.c == f79.c && hhd.f(this.d, f79.d) && this.e == f79.e;
    }

    public final int hashCode() {
        int f = th2.f(th2.e(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((f + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieStateUpdate(trackKey=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return hr1.j(sb, this.e, ")");
    }
}
