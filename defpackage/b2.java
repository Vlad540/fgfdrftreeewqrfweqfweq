package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: b2  reason: default package */
public class b2 implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object o;

    public b2(j2 j2Var) {
        Iterator it;
        this.o = j2Var;
        Collection collection = j2Var.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public void a() {
        j2 j2Var = (j2) this.o;
        j2Var.b();
        if (j2Var.b != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            default:
                a();
                return this.b.hasNext();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                return ((c2) this.o).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.b.next();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                if (((Collection) this.c) != null) {
                    this.b.remove();
                    ((c2) this.o).o.X -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.c;
                if (entry != null) {
                    Collection collection = (Collection) entry.getValue();
                    this.b.remove();
                    ((d2) this.o).b.X -= collection.size();
                    collection.clear();
                    this.c = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.b.remove();
                j2 j2Var = (j2) this.o;
                y1 y1Var = j2Var.X;
                y1Var.X--;
                j2Var.c();
                return;
        }
    }

    public b2(j2 j2Var, ListIterator listIterator) {
        this.o = j2Var;
        this.c = j2Var.b;
        this.b = listIterator;
    }

    public b2(d2 d2Var, Iterator it) {
        this.o = d2Var;
        this.b = it;
    }

    public b2(c2 c2Var) {
        this.o = c2Var;
        this.b = c2Var.c.entrySet().iterator();
    }
}
