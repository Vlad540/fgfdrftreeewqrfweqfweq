package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: mu  reason: default package */
public final class mu {
    public static final m30 h = new m30(1);
    public final yg7 a;
    public final qe4 b;
    public final m30 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List e;
    public List f = Collections.emptyList();
    public int g;

    public mu(yg7 yg7, qe4 qe4) {
        this.a = yg7;
        this.b = qe4;
        this.c = h;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((hg7) it.next()).a.D(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list != list2) {
            List list3 = this.f;
            yg7 yg7 = this.a;
            if (list == null) {
                int size = list2.size();
                this.e = null;
                this.f = Collections.emptyList();
                yg7.e(0, size);
                a(list3, runnable);
            } else if (list2 == null) {
                this.e = list;
                this.f = Collections.unmodifiableList(list);
                yg7.d(0, list.size());
                a(list3, runnable);
            } else {
                ((Executor) this.b.b).execute(new lu(this, list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
