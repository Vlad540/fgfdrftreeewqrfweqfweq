package defpackage;

/* renamed from: a0f  reason: default package */
public final class a0f implements duc {
    public final int X;
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long o;

    public a0f(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.o = j2;
        this.X = i;
    }

    public final long a() {
        return this.o;
    }

    public final long b(long j) {
        return this.a[oze.f(this.b, j, true)];
    }

    public final boolean c() {
        return true;
    }

    public final ttc e(long j) {
        long[] jArr = this.a;
        int f = oze.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        ztc ztc = new ztc(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new ttc(ztc, ztc);
        }
        int i = f + 1;
        return new ttc(ztc, new ztc(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return this.X;
    }
}
