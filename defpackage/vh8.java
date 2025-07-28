package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: vh8  reason: default package */
public class vh8 extends vb9 {
    public final ijc l = new ijc();

    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            ejc ejc = (ejc) it;
            if (ejc.hasNext()) {
                ((uh8) ((Map.Entry) ejc.next()).getValue()).b();
            } else {
                return;
            }
        }
    }

    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            ejc ejc = (ejc) it;
            if (ejc.hasNext()) {
                uh8 uh8 = (uh8) ((Map.Entry) ejc.next()).getValue();
                uh8.a.j(uh8);
            } else {
                return;
            }
        }
    }

    public void l(yh7 yh7, cw9 cw9) {
        if (yh7 != null) {
            uh8 uh8 = new uh8(yh7, cw9);
            uh8 uh82 = (uh8) this.l.b(yh7, uh8);
            if (uh82 != null && uh82.b != cw9) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (uh82 == null && this.c > 0) {
                uh8.b();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}
