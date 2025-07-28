package defpackage;

/* renamed from: rm8  reason: default package */
public final class rm8 implements xjc {
    public final xjc a;
    public final long b;

    public rm8(xjc xjc, long j) {
        this.a = xjc;
        this.b = j;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return this.a.d();
    }

    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    public final int h(otf otf, m24 m24, int i) {
        int h = this.a.h(otf, m24, i);
        if (h == -4) {
            m24.Y = Math.max(0, m24.Y + this.b);
        }
        return h;
    }
}
