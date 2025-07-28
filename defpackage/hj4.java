package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: hj4  reason: default package */
public final class hj4 extends q1 {
    public final HashSet X = new HashSet();
    public final Iterator c;
    public final u16 o;

    public hj4(Iterator it, t13 t13) {
        this.c = it;
        this.o = t13;
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.a = 2;
                return;
            }
        } while (!this.X.add(this.o.invoke(next)));
        this.b = next;
        this.a = 1;
    }
}
