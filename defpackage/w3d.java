package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: w3d  reason: default package */
public class w3d extends AbstractCollection implements Set {
    public final Collection a;
    public final u1b b;

    public w3d(Set set, u1b u1b) {
        this.a = set;
        this.b = u1b;
    }

    public final boolean add(Object obj) {
        if (this.b.apply(obj)) {
            return this.a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    public final boolean addAll(Collection collection) {
        for (Object apply : collection) {
            if (!this.b.apply(apply)) {
                throw new IllegalArgumentException();
            }
        }
        return this.a.addAll(collection);
    }

    public final void clear() {
        Collection collection = this.a;
        boolean z = collection instanceof RandomAccess;
        u1b u1b = this.b;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            u1b.getClass();
            while (it.hasNext()) {
                if (u1b.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        u1b.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!u1b.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (UnsupportedOperationException unused) {
                        gwf.N(list, u1b, i, i2);
                        return;
                    } catch (IllegalArgumentException unused2) {
                        gwf.N(list, u1b, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public final boolean contains(Object obj) {
        boolean z;
        Collection collection = this.a;
        collection.getClass();
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.b.apply(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return gp0.i(this, obj);
    }

    public final int hashCode() {
        return gp0.v(this);
    }

    public final boolean isEmpty() {
        Iterator it = this.a.iterator();
        u1b u1b = this.b;
        a06.m(u1b, "predicate");
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (u1b.apply(it.next())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            z = true;
        }
        return true ^ z;
    }

    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        u1b u1b = this.b;
        u1b.getClass();
        return new u27(it, u1b);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object apply : this.a) {
            if (this.b.apply(apply)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            p1 p1Var = (p1) it;
            if (!p1Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(p1Var.next());
        }
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            p1 p1Var = (p1) it;
            if (!p1Var.hasNext()) {
                return arrayList.toArray(objArr);
            }
            arrayList.add(p1Var.next());
        }
    }
}
