package defpackage;

import android.util.Pair;

/* renamed from: vje  reason: default package */
public abstract class vje {
    public static final oje a = new Object();
    public static final String b = Integer.toString(0, 36);
    public static final String c = Integer.toString(1, 36);
    public static final String d = Integer.toString(2, 36);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, oje] */
    static {
        int i = oze.a;
    }

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

    public final int d(int i, qje qje, tje tje, int i2, boolean z) {
        int i3 = g(i, qje, false).c;
        if (n(i3, tje, 0).o != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, tje, 0).n;
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

    public boolean equals(Object obj) {
        int c2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vje)) {
            return false;
        }
        vje vje = (vje) obj;
        if (vje.p() != p() || vje.i() != i()) {
            return false;
        }
        tje tje = new tje();
        qje qje = new qje();
        tje tje2 = new tje();
        qje qje2 = new qje();
        for (int i = 0; i < p(); i++) {
            if (!n(i, tje, 0).equals(vje.n(i, tje2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, qje, true).equals(vje.g(i2, qje2, true))) {
                return false;
            }
        }
        int a2 = a(true);
        if (a2 != vje.a(true) || (c2 = c(true)) != vje.c(true)) {
            return false;
        }
        while (a2 != c2) {
            int e = e(a2, 0, true);
            if (e != vje.e(a2, 0, true)) {
                return false;
            }
            a2 = e;
        }
        return true;
    }

    public final qje f(int i, qje qje) {
        return g(i, qje, false);
    }

    public abstract qje g(int i, qje qje, boolean z);

    public qje h(Object obj, qje qje) {
        return g(b(obj), qje, true);
    }

    public int hashCode() {
        tje tje = new tje();
        qje qje = new qje();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, tje, 0).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, qje, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            i2 = (i2 * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(tje tje, qje qje, int i, long j) {
        Pair k = k(tje, qje, i, j, 0);
        k.getClass();
        return k;
    }

    public final Pair k(tje tje, qje qje, int i, long j, long j2) {
        oyb.f(i, p());
        n(i, tje, j2);
        if (j == -9223372036854775807L) {
            j = tje.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = tje.n;
        g(i2, qje, false);
        while (i2 < tje.o && qje.e != j) {
            int i3 = i2 + 1;
            if (g(i3, qje, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, qje, true);
        long j3 = j - qje.e;
        long j4 = qje.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = qje.b;
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

    public abstract tje n(int i, tje tje, long j);

    public final void o(int i, tje tje) {
        n(i, tje, 0);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
