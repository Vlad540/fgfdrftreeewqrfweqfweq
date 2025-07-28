package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g7f  reason: default package */
public final class g7f extends lbe {
    public long X;
    public Map c;
    public boolean o;

    public g7f(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyMap();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("startTime")) {
            this.X = jjd.J(ws8, 0);
        } else if (!str.equals("live")) {
            String M = jjd.M(ws8);
            if (!r1g.p(M)) {
                if (this.c == null) {
                    this.c = new HashMap();
                }
                this.c.put(str, M);
            }
        } else {
            this.o = jjd.E(ws8);
        }
    }

    public final String toString() {
        int R = ete.R(this.c);
        boolean z = this.o;
        long j = this.X;
        StringBuilder sb = new StringBuilder("{urls=");
        sb.append(R);
        sb.append(", live=");
        sb.append(z);
        sb.append(", startTime=");
        return wn6.k(sb, j, "}");
    }
}
