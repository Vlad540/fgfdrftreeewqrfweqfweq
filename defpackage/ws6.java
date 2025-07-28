package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ws6  reason: default package */
public abstract class ws6 extends ns6 implements List, RandomAccess {
    public static final po5 b = new po5((ws6) e8c.X, 0);

    public static e8c h(int i, Object[] objArr) {
        return i == 0 ? e8c.X : new e8c(i, objArr);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ms6, ts6] */
    public static ts6 i() {
        return new ms6(4);
    }

    public static ws6 j(Collection collection) {
        if (collection instanceof ns6) {
            ws6 a = ((ns6) collection).a();
            if (!a.f()) {
                return a;
            }
            Object[] array = a.toArray(ns6.a);
            return h(array.length, array);
        }
        Object[] array2 = collection.toArray();
        e07.n(array2.length, array2);
        return h(array2.length, array2);
    }

    public static e8c k(Object[] objArr) {
        if (objArr.length == 0) {
            return e8c.X;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        e07.n(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static e8c m() {
        return e8c.X;
    }

    public static e8c n(Object obj) {
        Object[] objArr = {obj};
        e07.n(1, objArr);
        return h(1, objArr);
    }

    public static e8c o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        e07.n(2, objArr);
        return h(2, objArr);
    }

    public static e8c p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        e07.n(5, objArr);
        return h(5, objArr);
    }

    public static e8c r(Comparator comparator, AbstractCollection abstractCollection) {
        comparator.getClass();
        if (!(abstractCollection instanceof Collection)) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        e07.n(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    public final ws6 a() {
        return this;
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (am7.j(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object j : this) {
                    if (it.hasNext()) {
                        if (!am7.j(j, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public final rue g() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public final po5 listIterator(int i) {
        a06.n(i, size());
        return isEmpty() ? b : new po5(this, i);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ws6 q() {
        return size() <= 1 ? this : new us6(this);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public ws6 subList(int i, int i2) {
        a06.o(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? e8c.X : new vs6(this, i, i3);
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
