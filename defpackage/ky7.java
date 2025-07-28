package defpackage;

import org.apache.http.HttpStatus;

/* renamed from: ky7  reason: default package */
public final class ky7 {
    public final double a = 120.0d;
    public final double b = 0.04d;
    public final double c = 0.04d;
    public final double d = 1000.0d;
    public final double e = 700.0d;
    public final int f = 500;
    public final int g = HttpStatus.SC_MULTIPLE_CHOICES;
    public final boolean h = true;
    public final boolean i = false;
    public final boolean j = false;
    public final boolean k = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky7)) {
            return false;
        }
        ky7 ky7 = (ky7) obj;
        return Double.compare(this.a, ky7.a) == 0 && Double.compare(this.b, ky7.b) == 0 && Double.compare(this.c, ky7.c) == 0 && Double.compare(this.d, ky7.d) == 0 && Double.compare(this.e, ky7.e) == 0 && this.f == ky7.f && this.g == ky7.g && this.h == ky7.h && this.i == ky7.i && this.j == ky7.j && this.k == ky7.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + th2.f(th2.f(th2.f(am7.a(this.g, am7.a(this.f, at7.a(at7.a(at7.a(at7.a(Double.hashCode(this.a) * 31, this.b), this.c), this.d), this.e))), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadNetworkCondition(rttThreshold=");
        sb.append(this.a);
        sb.append(", lostPacketsLimitForRttBelowLowBound=");
        sb.append(this.b);
        sb.append(", lostPacketsLimitForRttAboveLowBound=");
        sb.append(this.c);
        sb.append(", rttEnterLevel2Mode=");
        sb.append(this.d);
        sb.append(", rttLeaveLevel2Mode=");
        sb.append(this.e);
        sb.append(", videoBitrateLevel1K=");
        sb.append(this.f);
        sb.append(", videoBitrateLevel2K=");
        sb.append(this.g);
        sb.append(", preferHardwareVPXEncoder=");
        sb.append(this.h);
        sb.append(", limitFrameSize=");
        sb.append(this.i);
        sb.append(", limitBitrate=");
        sb.append(this.j);
        sb.append(", setTemporalLayers=");
        return hr1.j(sb, this.k, ")");
    }
}
