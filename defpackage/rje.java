package defpackage;

/* renamed from: rje  reason: default package */
public final class rje extends vje {
    public final ws6 e;
    public final ws6 f;
    public final int[] g;
    public final int[] h;

    public rje(e8c e8c, e8c e8c2, int[] iArr) {
        oyb.d(e8c.o == iArr.length);
        this.e = e8c;
        this.f = e8c2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    public final int a(boolean z) {
        if (q()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final int c(boolean z) {
        if (q()) {
            return -1;
        }
        ws6 ws6 = this.e;
        if (!z) {
            return ws6.size() - 1;
        }
        return this.g[ws6.size() - 1];
    }

    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        } else if (!z) {
            return i + 1;
        } else {
            return this.g[this.h[i] + 1];
        }
    }

    public final qje g(int i, qje qje, boolean z) {
        qje qje2 = (qje) this.f.get(i);
        qje.j(qje2.a, qje2.b, qje2.c, qje2.d, qje2.e, qje2.g, qje2.f);
        return qje;
    }

    public final int i() {
        return this.f.size();
    }

    public final int l(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        } else if (!z) {
            return i - 1;
        } else {
            return this.g[this.h[i] - 1];
        }
    }

    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    public final tje n(int i, tje tje, long j) {
        tje tje2 = tje;
        tje tje3 = (tje) this.e.get(i);
        Object obj = tje3.a;
        l68 l68 = tje3.c;
        tje tje4 = tje3;
        long j2 = tje4.m;
        int i2 = tje4.n;
        int i3 = tje4.o;
        long j3 = tje4.p;
        tje tje5 = tje4;
        tje tje6 = tje;
        tje6.b(obj, l68, tje3.d, tje3.e, tje3.f, tje3.g, tje3.h, tje3.i, tje3.j, tje3.l, j2, i2, i3, j3);
        tje tje7 = tje;
        tje7.k = tje5.k;
        return tje7;
    }

    public final int p() {
        return this.e.size();
    }
}
