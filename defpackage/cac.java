package defpackage;

/* renamed from: cac  reason: default package */
public final class cac {
    public final double a;
    public final int b;
    public final int c;

    public cac(int i, int i2, double d) {
        this.a = d;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cac)) {
            return false;
        }
        cac cac = (cac) obj;
        return Double.compare(this.a, cac.a) == 0 && this.b == cac.b && this.c == cac.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + am7.a(this.b, Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReportNetworkStatusConfig(networkStatusReportThreshold=" + this.a + ", networkStatusReportIntervalMs=" + this.b + ", networkStatusReportForceIntervalMs=" + this.c + ")";
    }
}
