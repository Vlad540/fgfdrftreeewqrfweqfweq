package defpackage;

/* renamed from: si5  reason: default package */
public class si5 implements utc {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public si5(ti5 ti5, long j) {
        this.c = ti5;
        this.b = j;
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final stc e(long j) {
        switch (this.a) {
            case 0:
                ti5 ti5 = (ti5) this.c;
                swb.i((b2b) ti5.l);
                b2b b2b = (b2b) ti5.l;
                long[] jArr = (long[]) b2b.b;
                int f = mze.f(jArr, mze.k((((long) ti5.f) * j) / 1000000, 0, ti5.k - 1), false);
                long j2 = 0;
                long j3 = f == -1 ? 0 : jArr[f];
                long[] jArr2 = (long[]) b2b.c;
                if (f != -1) {
                    j2 = jArr2[f];
                }
                int i = ti5.f;
                long j4 = (j3 * 1000000) / ((long) i);
                long j5 = this.b;
                ytc ytc = new ytc(j4, j2 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new stc(ytc, ytc);
                }
                int i2 = f + 1;
                return new stc(ytc, new ytc((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
            default:
                return (stc) this.c;
        }
    }

    public final long f() {
        switch (this.a) {
            case 0:
                return ((ti5) this.c).c();
            default:
                return this.b;
        }
    }

    public si5(long j) {
        this(j, 0);
    }

    public si5(long j, long j2) {
        this.b = j;
        ytc ytc = j2 == 0 ? ytc.c : new ytc(0, j2);
        this.c = new stc(ytc, ytc);
    }
}
