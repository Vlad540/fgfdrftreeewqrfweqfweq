package defpackage;

/* renamed from: hce  reason: default package */
public final class hce {
    public final dm7 a;
    public final long b;
    public final long c;

    public hce(dm7 dm7, long j, long j2) {
        this.a = dm7;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hce)) {
            return false;
        }
        hce hce = (hce) obj;
        return hhd.f(this.a, hce.a) && this.b == hce.b && this.c == hce.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + sxe.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LocationResult(locationData=" + this.a + ", livePeriod=" + this.b + ", zoom=" + this.c + ")";
    }
}
