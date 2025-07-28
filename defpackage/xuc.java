package defpackage;

/* renamed from: xuc  reason: default package */
public final class xuc implements yv0 {
    public int X;
    public final sl4 a;
    public final long b;
    public final int c;
    public long o;

    public xuc(sl4 sl4, long j, int i, long j2, int i2) {
        this.a = sl4;
        this.b = j;
        this.c = i;
        this.o = j2;
        this.X = i2;
    }

    public final void a(long j, long j2, long j3) {
        long j4 = this.o + j3;
        this.o = j4;
        ((ll4) this.a).b(b(), this.b, j4);
    }

    public final float b() {
        float f;
        float f2;
        long j = this.b;
        if (j == -1 || j == 0) {
            int i = this.c;
            if (i == 0) {
                return -1.0f;
            }
            f = ((float) this.X) * 100.0f;
            f2 = (float) i;
        } else {
            f = ((float) this.o) * 100.0f;
            f2 = (float) j;
        }
        return f / f2;
    }
}
