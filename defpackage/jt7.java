package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: jt7  reason: default package */
public final class jt7 extends AbstractCollection implements Collection, a77 {
    public final ht7 a;

    public jt7(ht7 ht7) {
        this.a = ht7;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ht7 ht7 = this.a;
        ht7.getClass();
        return new et7(2, ht7);
    }

    public final boolean remove(Object obj) {
        int i;
        ht7 ht7 = this.a;
        ht7.c();
        int i2 = ht7.Y;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (ht7.c[i2] >= 0 && hhd.f(ht7.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        ht7.j(i);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        this.a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.a.c();
        return super.retainAll(collection);
    }

    public final int size() {
        return this.a.x0;
    }
}
