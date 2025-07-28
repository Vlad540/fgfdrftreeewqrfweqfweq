package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: q14  reason: default package */
public final class q14 extends lbe {
    public ii5 c;
    public List o;

    public q14(ws8 ws8) {
        super(ws8);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("cmd")) {
            String M = jjd.M(ws8);
            ii5 ii5 = ii5.e;
            if (M != null) {
                if (M.equals("SYNC_CONTACTS")) {
                    ii5 = ii5.g;
                } else if (M.equals("SEND_LOG")) {
                    ii5 = ii5.f;
                }
            }
            this.c = ii5;
        } else if (!str.equals("args")) {
            ws8.z();
        } else {
            int D = jjd.D(ws8);
            this.o = new ArrayList(D);
            for (int i = 0; i < D; i++) {
                this.o.add(jjd.M(ws8));
            }
        }
    }

    public final String toString() {
        ii5 ii5 = this.c;
        List list = this.o;
        return "{cmd='" + ii5 + "', args=" + list + "}";
    }
}
