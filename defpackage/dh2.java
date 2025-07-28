package defpackage;

import java.util.ArrayList;

/* renamed from: dh2  reason: default package */
public final class dh2 extends lbe {
    public ArrayList c;
    public long o = -1;

    public dh2(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = ws8.w0();
        } else if (!str.equals("members")) {
            ws8.z();
        } else {
            int D = jjd.D(ws8);
            this.c = new ArrayList();
            for (int i = 0; i < D; i++) {
                this.c.add(bh2.a(ws8));
            }
        }
    }

    public final String toString() {
        int p = ete.p(this.c);
        long j = this.o;
        return "{members=" + p + ", marker=" + j + "}";
    }
}
