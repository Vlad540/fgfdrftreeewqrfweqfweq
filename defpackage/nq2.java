package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: nq2  reason: default package */
public final class nq2 extends lbe {
    public List c;
    public long o;

    public nq2(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = ws8.w0();
        } else if (!str.equals("chats")) {
            ws8.z();
        } else {
            this.c = zy.b(ws8);
        }
    }

    public final String toString() {
        long j = this.o;
        int p = ete.p(this.c);
        return "marker=" + j + ", chats=" + p;
    }
}
