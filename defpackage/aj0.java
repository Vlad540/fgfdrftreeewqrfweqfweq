package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: aj0  reason: default package */
public abstract class aj0 implements g55 {
    public final uoe a;
    public final int b;
    public final int[] c;
    public final xu5[] d;
    public final long[] e;
    public int f;

    public aj0(uoe uoe, int[] iArr) {
        int i = 0;
        oyb.k(iArr.length > 0);
        uoe.getClass();
        this.a = uoe;
        int length = iArr.length;
        this.b = length;
        this.d = new xu5[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = uoe.d[iArr[i2]];
        }
        Arrays.sort(this.d, new yz(2));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = uoe.d(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public final uoe a() {
        return this.a;
    }

    public final xu5 d(int i) {
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
        aj0 aj0 = (aj0) obj;
        return this.a.equals(aj0.a) && Arrays.equals(this.c, aj0.c);
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

    public final xu5 j() {
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

    public final boolean q(int i, long j) {
        return this.e[i] > j;
    }

    public final int s(xu5 xu5) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == xu5) {
                return i;
            }
        }
        return -1;
    }

    public final boolean u(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean q = q(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !q) {
            q = i2 != i && !q(i2, elapsedRealtime);
            i2++;
        }
        if (!q) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = oze.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }
}
