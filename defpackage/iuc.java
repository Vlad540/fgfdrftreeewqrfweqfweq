package defpackage;

/* renamed from: iuc  reason: default package */
public final class iuc {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public iuc(akd akd, int i, int i2) {
        this.a = oze.S(akd.a);
        this.b = oze.S(akd.b);
        int i3 = akd.c;
        this.c = i3;
        int i4 = i3;
        while (true) {
            if (i4 <= 0) {
                break;
            }
            boolean z = true;
            if ((i4 & 1) == 1) {
                z = (i4 >> 1) != 0 ? false : z;
                oyb.j("Invalid speed divisor: " + i3, z);
            } else {
                i2++;
                i4 >>= 1;
            }
        }
        this.d = Math.min(i2, i);
    }
}
