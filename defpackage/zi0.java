package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: zi0  reason: default package */
public abstract class zi0 implements f55 {
    public final toe a;
    public final int b;
    public final int[] c;
    public final vu5[] d;
    public final long[] e;
    public int f;

    public zi0(toe toe, int[] iArr) {
        int i = 0;
        swb.h(iArr.length > 0);
        toe.getClass();
        this.a = toe;
        int length = iArr.length;
        this.b = length;
        this.d = new vu5[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = toe.c[iArr[i2]];
        }
        Arrays.sort(this.d, new yz(1));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = toe.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public final toe a() {
        return this.a;
    }

    public final vu5 d(int i) {
        return this.d[i];
    }

    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zi0 zi0 = (zi0) obj;
        return this.a == zi0.a && Arrays.equals(this.c, zi0.c);
    }

    public final int f(int i) {
        return this.c[i];
    }

    public int g(long j, List list) {
        return list.size();
    }

    public void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    public final int i() {
        return this.c[b()];
    }

    public final vu5 j() {
        return this.d[b()];
    }

    public void l(float f2) {
    }

    public final int length() {
        return this.c.length;
    }

    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int q(vu5 vu5) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == vu5) {
                return i;
            }
        }
        return -1;
    }

    public final boolean r(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean s = s(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !s) {
            s = i2 != i && !s(i2, elapsedRealtime);
            i2++;
        }
        if (!s) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = mze.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final boolean s(int i, long j) {
        return this.e[i] > j;
    }
}
