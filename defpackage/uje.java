package defpackage;

import android.util.Pair;

/* renamed from: uje  reason: default package */
public abstract class uje implements lt0 {
    public static final nje a = new Object();

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, pje pje, sje sje, int i2, boolean z) {
        int i3 = g(i, pje, false).c;
        if (n(i3, sje, 0).E0 != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, sje, 0).D0;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == c(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uje)) {
            return false;
        }
        uje uje = (uje) obj;
        if (uje.p() != p() || uje.i() != i()) {
            return false;
        }
        sje sje = new sje();
        pje pje = new pje();
        sje sje2 = new sje();
        pje pje2 = new pje();
        for (int i = 0; i < p(); i++) {
            if (!n(i, sje, 0).equals(uje.n(i, sje2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, pje, true).equals(uje.g(i2, pje2, true))) {
                return false;
            }
        }
        return true;
    }

    public final pje f(int i, pje pje) {
        return g(i, pje, false);
    }

    public abstract pje g(int i, pje pje, boolean z);

    public pje h(Object obj, pje pje) {
        return g(b(obj), pje, true);
    }

    public final int hashCode() {
        sje sje = new sje();
        pje pje = new pje();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, sje, 0).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, pje, true).hashCode();
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(sje sje, pje pje, int i, long j) {
        Pair k = k(sje, pje, i, j, 0);
        k.getClass();
        return k;
    }

    public final Pair k(sje sje, pje pje, int i, long j, long j2) {
        swb.g(i, p());
        n(i, sje, j2);
        if (j == -9223372036854775807L) {
            j = sje.B0;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = sje.D0;
        g(i2, pje, false);
        while (i2 < sje.E0 && pje.X != j) {
            int i3 = i2 + 1;
            if (g(i3, pje, false).X > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, pje, true);
        long j3 = j - pje.X;
        long j4 = pje.o;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = pje.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object m(int i);

    public abstract sje n(int i, sje sje, long j);

    public final void o(int i, sje sje) {
        n(i, sje, 0);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
