package defpackage;

/* renamed from: qv6  reason: default package */
public final class qv6 implements utc {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public qv6(long j, long[] jArr, long[] jArr2) {
        swb.e(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    public final boolean c() {
        return this.d;
    }

    public final stc e(long j) {
        if (!this.d) {
            ytc ytc = ytc.c;
            return new stc(ytc, ytc);
        }
        long[] jArr = this.b;
        int f = mze.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.a;
        ytc ytc2 = new ytc(j2, jArr2[f]);
        if (j2 == j || f == jArr.length - 1) {
            return new stc(ytc2, ytc2);
        }
        int i = f + 1;
        return new stc(ytc2, new ytc(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.c;
    }
}
