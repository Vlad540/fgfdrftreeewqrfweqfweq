package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kr  reason: default package */
public final class kr implements Collection, z67 {
    public final Object[] a;
    public final boolean b;

    public kr(Object[] objArr, boolean z) {
        this.a = objArr;
        this.b = z;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return cs.N(this.a, obj);
    }

    public final boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object N : collection) {
            if (!cs.N(this.a, N)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    public final Iterator iterator() {
        return new u1(2, this.a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.a.length;
    }

    public final Object[] toArray(Object[] objArr) {
        return n06.E(this, objArr);
    }

    public final Object[] toArray() {
        Object[] objArr = this.a;
        Class<Object[]> cls = Object[].class;
        return (!this.b || !objArr.getClass().equals(cls)) ? Arrays.copyOf(objArr, objArr.length, cls) : objArr;
    }
}
