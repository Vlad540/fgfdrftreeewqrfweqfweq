package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: c99  reason: default package */
public final class c99 extends lbe {
    public int X;
    public List c;
    public long o;

    public c99(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1081306054:
                if (str.equals("marker")) {
                    c2 = 0;
                    break;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    c2 = 1;
                    break;
                }
                break;
            case 110549828:
                if (str.equals("total")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = jjd.J(ws8, 0);
                return;
            case 1:
                this.c = zy.f(ws8);
                return;
            case 2:
                this.X = jjd.I(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        int p = ete.p(this.c);
        long j = this.o;
        int i = this.X;
        return "{result=" + p + ", marker=" + j + ", total=" + i + "}";
    }
}
