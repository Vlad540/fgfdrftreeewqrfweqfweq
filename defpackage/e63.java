package defpackage;

import java.util.Comparator;

/* renamed from: e63  reason: default package */
public final class e63 extends g63 {
    public static g63 g(int i) {
        return i < 0 ? g63.b : i > 0 ? g63.c : g63.a;
    }

    public final g63 a(int i, int i2) {
        return g(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    public final g63 b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        return g(i < 0 ? -1 : i > 0 ? 1 : 0);
    }

    public final g63 c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    public final g63 d(boolean z, boolean z2) {
        return g(z == z2 ? 0 : z ? 1 : -1);
    }

    public final g63 e(boolean z, boolean z2) {
        return g(z2 == z ? 0 : z2 ? 1 : -1);
    }

    public final int f() {
        return 0;
    }
}
