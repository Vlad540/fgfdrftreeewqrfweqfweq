package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: h7e  reason: default package */
public final class h7e extends lbe {
    public List c;
    public Map o;

    public h7e(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyMap();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("phones")) {
            this.o = new HashMap();
            int K = jjd.K(ws8);
            for (int i = 0; i < K; i++) {
                this.o.put(ws8.z0(), Long.valueOf(ws8.w0()));
            }
        } else if (!str.equals("contacts")) {
            ws8.z();
        } else {
            this.c = zy.c(ws8);
        }
    }

    public final String toString() {
        return rf0.g("{contacts=", ete.p(this.c), ", phones=", ete.R(this.o), "}");
    }
}
