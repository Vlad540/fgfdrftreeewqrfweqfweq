package defpackage;

/* renamed from: bz5  reason: default package */
public final class bz5 {
    public final z23 a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public bz5(z23 z23, int i, int i2, float f, long j) {
        boolean z = false;
        boolean z2 = i > 0;
        oyb.c("width must be positive, but is: " + i, z2);
        z = i2 > 0 ? true : z;
        oyb.c("height must be positive, but is: " + i2, z);
        this.a = z23;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = j;
    }
}
