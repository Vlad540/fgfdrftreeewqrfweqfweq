package defpackage;

/* renamed from: h80  reason: default package */
public final class h80 {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return zg7.b(((float) (j - j2)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (zg7.b(((float) (j - j3)) / ((float) this.i), 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
