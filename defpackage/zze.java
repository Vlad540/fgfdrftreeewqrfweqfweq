package defpackage;

/* renamed from: zze  reason: default package */
public final class zze implements cuc {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public zze(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public final long a() {
        return this.d;
    }

    public final long b(long j) {
        return this.a[mze.f(this.b, j, true)];
    }

    public final boolean c() {
        return true;
    }

    public final stc e(long j) {
        long[] jArr = this.a;
        int f = mze.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        ytc ytc = new ytc(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new stc(ytc, ytc);
        }
        int i = f + 1;
        return new stc(ytc, new ytc(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
