package defpackage;

import java.util.Arrays;

/* renamed from: by2  reason: default package */
public final class by2 implements utc {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public by2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0;
        }
    }

    public final boolean c() {
        return true;
    }

    public final stc e(long j) {
        long[] jArr = this.e;
        int f2 = mze.f(jArr, j, true);
        long j2 = jArr[f2];
        long[] jArr2 = this.c;
        ytc ytc = new ytc(j2, jArr2[f2]);
        if (j2 >= j || f2 == this.a - 1) {
            return new stc(ytc, ytc);
        }
        int i = f2 + 1;
        return new stc(ytc, new ytc(jArr[i], jArr2[i]));
    }

    public final long f() {
        return this.f;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder(me4.e(me4.e(me4.e(me4.e(71, arrays), arrays2), arrays3), arrays4));
        sb.append("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return wn6.l(sb, arrays4, ")");
    }
}
