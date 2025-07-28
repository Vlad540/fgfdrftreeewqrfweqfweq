package defpackage;

/* renamed from: r58  reason: default package */
public final class r58 {
    public long a;
    public long b = Long.MIN_VALUE;
    public boolean c;
    public boolean d;
    public boolean e;

    public t58 a() {
        return new t58(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [s58, u58] */
    public u58 b() {
        return new s58(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [t58, v58] */
    public v58 c() {
        return new t58(this);
    }

    public void d(long j) {
        oyb.d(j == Long.MIN_VALUE || j >= 0);
        this.b = j;
    }

    public void e(long j) {
        f(oze.S(j));
    }

    public void f(long j) {
        oyb.d(j >= 0);
        this.a = j;
    }

    public void g(boolean z) {
        this.e = z;
    }
}
