package defpackage;

/* renamed from: llc  reason: default package */
public abstract class llc {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new jc9(0);
    }

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final jc9 b(wia... wiaArr) {
        jc9 jc9 = new jc9(wiaArr.length);
        for (wia wia : wiaArr) {
            jc9.k(wia.a, wia.b);
        }
        return jc9;
    }

    public static final int c(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int d(int i) {
        if (i > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int e(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
