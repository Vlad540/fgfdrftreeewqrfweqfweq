package defpackage;

/* renamed from: he3  reason: default package */
public final class he3 extends fe3 implements duc {
    public final int w0;
    public final long x0;

    public he3(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.w0 = i;
        this.x0 = j == -1 ? -1 : j;
    }

    public final long a() {
        return this.x0;
    }

    public final long b(long j) {
        return (Math.max(0, j - this.b) * 8000000) / ((long) this.X);
    }

    public final int h() {
        return this.w0;
    }
}
