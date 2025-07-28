package defpackage;

/* renamed from: ft4  reason: default package */
public final class ft4 {
    public final double a;
    public final double b;
    public final double c;
    public double d;

    public ft4(double d2, double d3, double d4) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d4;
    }

    public final void a(double d2) {
        double d3 = this.d;
        if (!Double.isNaN(d3)) {
            double d4 = d2 > d3 ? this.a : this.b;
            d2 = (d2 * d4) + ((1.0d - d4) * d3);
        }
        this.d = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft4(double d2, double d3, int i) {
        this(d2, (i & 2) != 0 ? d2 : d3, (i & 4) != 0 ? Double.NaN : 0.0d);
    }
}
