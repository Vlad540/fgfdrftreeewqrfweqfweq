package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qs1  reason: default package */
public final class qs1 extends ps1 {
    public final ArrayList a = new ArrayList();

    public qs1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ps1 ps1 = (ps1) it.next();
            if (!(ps1 instanceof rs1)) {
                this.a.add(ps1);
            }
        }
    }

    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ps1) it.next()).a(i);
        }
    }

    public final void b(int i, ws1 ws1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ps1) it.next()).b(i, ws1);
        }
    }

    public final void c(int i, bqc bqc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ps1) it.next()).c(i, bqc);
        }
    }

    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ps1) it.next()).d(i);
        }
    }
}
