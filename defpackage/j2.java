package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: j2  reason: default package */
public abstract class j2 extends AbstractCollection {
    public final /* synthetic */ y1 X;
    public final Object a;
    public Collection b;
    public final j2 c;
    public final Collection o;

    public j2(y1 y1Var, Object obj, Collection collection, j2 j2Var) {
        this.X = y1Var;
        this.a = obj;
        this.b = collection;
        this.c = j2Var;
        this.o = j2Var == null ? null : j2Var.b;
    }

    public final void a() {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.a();
        } else {
            this.X.o.put(this.a, this.b);
        }
    }

    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.X.X++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            this.X.X += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.b();
            if (j2Var.b != this.o) {
                throw new ConcurrentModificationException();
            }
        } else if (this.b.isEmpty() && (collection = (Collection) this.X.o.get(this.a)) != null) {
            this.b = collection;
        }
    }

    public final void c() {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.c();
        } else if (this.b.isEmpty()) {
            this.X.o.remove(this.a);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.b.clear();
            this.X.X -= size;
            c();
        }
    }

    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    public final Iterator iterator() {
        b();
        return new b2(this);
    }

    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            y1 y1Var = this.X;
            y1Var.X--;
            c();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.X.X += this.b.size() - size;
            c();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.X.X += this.b.size() - size;
            c();
        }
        return retainAll;
    }

    public final int size() {
        b();
        return this.b.size();
    }

    public final String toString() {
        b();
        return this.b.toString();
    }
}
