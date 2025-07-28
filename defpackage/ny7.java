package defpackage;

/* renamed from: ny7  reason: default package */
public final class ny7 {
    public final double a;
    public final double b;

    public ny7(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny7)) {
            return false;
        }
        ny7 ny7 = (ny7) obj;
        return Double.compare(this.a, ny7.a) == 0 && Double.compare(this.b, ny7.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NetworkState(roundTripTime=" + this.a + ", lostPacketsFraction=" + this.b + ")";
    }
}
