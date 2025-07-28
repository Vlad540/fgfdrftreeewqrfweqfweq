package defpackage;

/* renamed from: yq7  reason: default package */
public final class yq7 {
    public long a;
    public long b;
    public long c;
    public long d;

    public final double a(long j, long j2) {
        double d2;
        this.c = gwf.h(j - this.a, 0);
        long h = gwf.h(j2 - this.b, 0);
        this.d = h;
        if (h == 0 && this.c == 0) {
            d2 = 0.0d;
        } else {
            long j3 = this.c;
            d2 = ((double) j3) / ((double) (h + j3));
        }
        this.a = j;
        this.b = j2;
        return d2;
    }
}
