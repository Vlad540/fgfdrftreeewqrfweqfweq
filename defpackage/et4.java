package defpackage;

/* renamed from: et4  reason: default package */
public final class et4 {
    public final double a = 0.3d;
    public volatile double b;

    public et4(double d) {
        this.b = d;
    }

    public final void a(double d) {
        double d2 = this.b;
        double d3 = this.a;
        this.b = ((1.0d - d3) * d2) + (d * d3);
    }

    public et4() {
    }
}
