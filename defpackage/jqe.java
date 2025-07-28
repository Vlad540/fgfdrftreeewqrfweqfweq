package defpackage;

import java.util.Iterator;

/* renamed from: jqe  reason: default package */
public abstract class jqe implements Iterator {
    public final Iterator a;

    public jqe(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return a(this.a.next());
    }

    public final void remove() {
        this.a.remove();
    }
}
