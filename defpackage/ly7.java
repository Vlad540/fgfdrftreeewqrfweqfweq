package defpackage;

/* renamed from: ly7  reason: default package */
public final class ly7 {
    public final double a = 90.0d;
    public final double b = 0.02d;
    public final double c = 700.0d;
    public final double d = 0.02d;
    public final long e = 30000;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly7)) {
            return false;
        }
        ly7 ly7 = (ly7) obj;
        return Double.compare(this.a, ly7.a) == 0 && Double.compare(this.b, ly7.b) == 0 && Double.compare(this.c, ly7.c) == 0 && Double.compare(this.d, ly7.d) == 0 && this.e == ly7.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + at7.a(at7.a(at7.a(Double.hashCode(this.a) * 31, this.b), this.c), this.d);
    }

    public final String toString() {
        return "GoodNetworkCondition(rttLowBound=" + this.a + ", lostPacketsLimitForRttLowBound=" + this.b + ", rttHighBound=" + this.c + ", lostPacketsLimitForRttHighBound=" + this.d + ", recoveryTimeoutMs=" + this.e + ")";
    }
}
