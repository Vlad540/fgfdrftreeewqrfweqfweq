package defpackage;

import java.io.Serializable;

/* renamed from: bh2  reason: default package */
public final class bh2 implements Serializable {
    public final uj3 a;
    public final m2b b;
    public final long c;

    public bh2(uj3 uj3, m2b m2b, long j) {
        this.a = uj3;
        this.b = m2b;
        this.c = j;
    }

    public static bh2 a(ws8 ws8) {
        int K = jjd.K(ws8);
        uj3 uj3 = null;
        if (K == 0) {
            return null;
        }
        m2b m2b = null;
        long j = 0;
        for (int i = 0; i < K; i++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -1276666629:
                    if (z0.equals("presence")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -867755645:
                    if (z0.equals("readMark")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 951526432:
                    if (z0.equals("contact")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    m2b = m2b.a(ws8);
                    break;
                case 1:
                    j = jjd.J(ws8, 0);
                    break;
                case 2:
                    uj3 = uj3.e(ws8);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        return new bh2(uj3, m2b, j);
    }
}
