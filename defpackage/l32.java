package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: l32  reason: default package */
public final class l32 extends lbe {
    public List c;
    public HashMap o;

    public l32(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("commands")) {
            this.c = jjd.T(ws8, new gf6(7));
        } else if (!str.equals("contacts")) {
            ws8.z();
        } else {
            this.o = new HashMap();
            int K = jjd.K(ws8);
            for (int i = 0; i < K; i++) {
                long w0 = ws8.w0();
                this.o.put(Long.valueOf(w0), uj3.e(ws8));
            }
        }
    }

    public final String toString() {
        return rf0.g("{commands=", ete.p(this.c), ", contacts=", ete.R(this.o), "}");
    }
}
