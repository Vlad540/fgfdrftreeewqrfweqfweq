package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: vr  reason: default package */
public final class vr implements Set {
    public final /* synthetic */ yr a;

    public vr(yr yrVar) {
        this.a = yrVar;
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
        return this.a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.j(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        yr yrVar = this.a;
        int i = 0;
        for (int i2 = yrVar.c - 1; i2 >= 0; i2--) {
            Object f = yrVar.f(i2);
            i += f == null ? 0 : f.hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new ur(this.a, 0);
    }

    public final boolean remove(Object obj) {
        yr yrVar = this.a;
        int d = yrVar.d(obj);
        if (d < 0) {
            return false;
        }
        yrVar.g(d);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return this.a.k(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.a.l(collection);
    }

    public final int size() {
        return this.a.c;
    }

    public final Object[] toArray() {
        yr yrVar = this.a;
        int i = yrVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = yrVar.f(i2);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        yr yrVar = this.a;
        int i = yrVar.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = yrVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
