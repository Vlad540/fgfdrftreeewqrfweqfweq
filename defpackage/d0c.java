package defpackage;

/* renamed from: d0c  reason: default package */
public final class d0c {
    public final ryb a;
    public final long b;
    public final long c;
    public final yr8 d;

    public d0c(ryb ryb, long j, long j2, yr8 yr8) {
        this.a = ryb;
        this.b = j;
        this.c = j2;
        this.d = yr8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0c)) {
            return false;
        }
        d0c d0c = (d0c) obj;
        return hhd.f(this.a, d0c.a) && this.b == d0c.b && this.c == d0c.c && hhd.f(this.d, d0c.d);
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        yr8 yr8 = this.d;
        return m + (yr8 == null ? 0 : yr8.hashCode());
    }

    public final String toString() {
        return "SelfReactionData(selfReaction=" + this.a + ", msgLocalId=" + this.b + ", msgServerId=" + this.c + ", reactions=" + this.d + ")";
    }
}
