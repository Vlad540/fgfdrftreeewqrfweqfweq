package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: tm3  reason: default package */
public final class tm3 extends lbe {
    public Map c;
    public long o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("presence")) {
            this.c = new HashMap();
            int K = jjd.K(ws8);
            for (int i = 0; i < K; i++) {
                this.c.put(Long.valueOf(ws8.w0()), m2b.a(ws8));
            }
        } else if (!str.equals("time")) {
            ws8.z();
        } else {
            this.o = ws8.w0();
        }
    }

    public final String toString() {
        int R = ete.R(this.c);
        long j = this.o;
        return "{presence=" + R + ", time=" + j + "}";
    }
}
