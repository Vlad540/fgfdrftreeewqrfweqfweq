package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: th7  reason: default package */
public final class th7 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final e26 b;

    public th7(e26 e26, List list) {
        list.getClass();
        this.a = list;
        this.b = e26;
    }

    public final Object get(int i) {
        return this.b.apply(this.a.get(i));
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new sh7(this, this.a.listIterator(i), 0);
    }

    public final Object remove(int i) {
        return this.b.apply(this.a.remove(i));
    }

    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    public final int size() {
        return this.a.size();
    }
}
