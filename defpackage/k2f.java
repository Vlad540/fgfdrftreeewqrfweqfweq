package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: k2f  reason: default package */
public final class k2f extends lbe {
    public long X;
    public boolean Y;
    public List c;
    public long o;

    public k2f(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -582276257:
                if (str.equals("forwardMarker")) {
                    c2 = 0;
                    break;
                }
                break;
            case 696739087:
                if (str.equals("hasMore")) {
                    c2 = 1;
                    break;
                }
                break;
            case 926934164:
                if (str.equals("history")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1024366077:
                if (str.equals("backwardMarker")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = jjd.J(ws8, 0);
                return;
            case 1:
                this.Y = jjd.E(ws8);
                return;
            case 2:
                this.c = jjd.T(ws8, new smc(18));
                return;
            case 3:
                this.X = jjd.J(ws8, 0);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        int p = ete.p(this.c);
        long j = this.o;
        long j2 = this.X;
        boolean z = this.Y;
        StringBuilder sb = new StringBuilder("{calls=");
        sb.append(p);
        sb.append(", forwardMarker=");
        sb.append(j);
        hr1.s(sb, ", backwardMarker=", j2, ", hasMore=");
        return hr1.j(sb, z, "}");
    }
}
