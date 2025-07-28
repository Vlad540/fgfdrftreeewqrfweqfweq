package defpackage;

/* renamed from: iw0  reason: default package */
public final class iw0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;
    public final double n;
    public final double o;
    public final double p;
    public final boolean q;
    public final double r;
    public final double s;
    public final double t;
    public final boolean u;
    public final double v;
    public final double w;
    public final double x;
    public final double y;
    public final double z;

    public iw0(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z2, double d18, double d19, double d20, boolean z3, double d21, double d22, double d23, double d24, double d25) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
        this.g = d8;
        this.h = d9;
        this.i = d10;
        this.j = d11;
        this.k = d12;
        this.l = d13;
        this.m = d14;
        this.n = d15;
        this.o = d16;
        this.p = d17;
        this.q = z2;
        this.r = d18;
        this.s = d19;
        this.t = d20;
        this.u = z3;
        this.v = d21;
        this.w = d22;
        this.x = d23;
        this.y = d24;
        this.z = d25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0 = (iw0) obj;
        return Double.compare(this.a, iw0.a) == 0 && Double.compare(this.b, iw0.b) == 0 && Double.compare(this.c, iw0.c) == 0 && Double.compare(this.d, iw0.d) == 0 && Double.compare(this.e, iw0.e) == 0 && Double.compare(this.f, iw0.f) == 0 && Double.compare(this.g, iw0.g) == 0 && Double.compare(this.h, iw0.h) == 0 && Double.compare(this.i, iw0.i) == 0 && Double.compare(this.j, iw0.j) == 0 && Double.compare(this.k, iw0.k) == 0 && Double.compare(this.l, iw0.l) == 0 && Double.compare(this.m, iw0.m) == 0 && Double.compare(this.n, iw0.n) == 0 && Double.compare(this.o, iw0.o) == 0 && Double.compare(this.p, iw0.p) == 0 && this.q == iw0.q && Double.compare(this.r, iw0.r) == 0 && Double.compare(this.s, iw0.s) == 0 && Double.compare(this.t, iw0.t) == 0 && this.u == iw0.u && Double.compare(this.v, iw0.v) == 0 && Double.compare(this.w, iw0.w) == 0 && Double.compare(this.x, iw0.x) == 0 && Double.compare(this.y, iw0.y) == 0 && Double.compare(this.z, iw0.z) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.z) + at7.a(at7.a(at7.a(at7.a(th2.f(at7.a(at7.a(at7.a(th2.f(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(at7.a(Double.hashCode(this.a) * 31, this.b), this.c), this.d), this.e), this.f), this.g), this.h), this.i), this.j), this.k), this.l), this.m), this.n), this.o), this.p), 31, this.q), this.r), this.s), this.t), 31, this.u), this.v), this.w), this.x), this.y);
    }

    public final String toString() {
        return "CalcNetworkStatusConfig(redline=" + this.a + ", redlineMargin=" + this.b + ", ratingWeightUp=" + this.c + ", ratingWeightDown=" + this.d + ", goodRtt=" + this.e + ", rttWeightUp=" + this.f + ", rttWeightDown=" + this.g + ", rttStep=" + this.h + ", rttStepWeight=" + this.i + ", fastLossWeight=" + this.j + ", slowLossWeight=" + this.k + ", fastLossValue=" + this.l + ", slowLossValue=" + this.m + ", criticalRtt=" + this.n + ", criticalFastLoss=" + this.o + ", criticalSlowLoss=" + this.p + ", newNetworkRatingModelEnabled=" + this.q + ", goodLoss=" + this.r + ", lossStep=" + this.s + ", lossStepWeight=" + this.t + ", bitrateRatingEnabled=" + this.u + ", bitrateRatingInfluenceFactor=" + this.v + ", estimatedBitrateWeightUp=" + this.w + ", estimatedBitrateWeightDown=" + this.x + ", reportedBitrateWeightUp=" + this.y + ", reportedBitrateWeightDown=" + this.z + ")";
    }
}
