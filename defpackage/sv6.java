package defpackage;

/* renamed from: sv6  reason: default package */
public final class sv6 implements cuc {
    public final long a;
    public final lq7 b;
    public final lq7 c;
    public long d;

    public sv6(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        lq7 lq7 = new lq7(0);
        this.b = lq7;
        lq7 lq72 = new lq7(0);
        this.c = lq72;
        lq7.a(0);
        lq72.a(j2);
    }

    public final long a() {
        return this.a;
    }

    public final long b(long j) {
        return this.b.b(mze.d(this.c, j));
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        lq7 lq7 = this.b;
        return j - lq7.b(lq7.b - 1) < 100000;
    }

    public final stc e(long j) {
        lq7 lq7 = this.b;
        int d2 = mze.d(lq7, j);
        long b2 = lq7.b(d2);
        lq7 lq72 = this.c;
        ytc ytc = new ytc(b2, lq72.b(d2));
        if (b2 == j || d2 == lq7.b - 1) {
            return new stc(ytc, ytc);
        }
        int i = d2 + 1;
        return new stc(ytc, new ytc(lq7.b(i), lq72.b(i)));
    }

    public final long f() {
        return this.d;
    }
}
