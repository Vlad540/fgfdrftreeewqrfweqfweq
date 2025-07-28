package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: lg7  reason: default package */
public final class lg7 extends r2 implements RandomAccess, Serializable {
    public static final lg7 o;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        lg7 lg7 = new lg7(0);
        lg7.c = true;
        o = lg7;
    }

    public lg7(int i) {
        if (i >= 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public final Object a(int i) {
        e();
        int i2 = this.b;
        if (i >= 0 && i < i2) {
            return g(i);
        }
        throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
    }

    public final boolean add(Object obj) {
        e();
        int i = this.b;
        this.modCount++;
        f(i, 1);
        this.a[i] = obj;
        return true;
    }

    public final boolean addAll(Collection collection) {
        e();
        int size = collection.size();
        c(this.b, collection, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i2) {
        this.modCount++;
        f(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    public final void clear() {
        e();
        h(0, this.b);
    }

    public final void d(int i, Object obj) {
        this.modCount++;
        f(i, 1);
        this.a[i] = obj;
    }

    public final void e() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            return iu7.b(this.a, 0, this.b, (List) obj);
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 >= 0) {
            Object[] objArr = this.a;
            if (i3 > objArr.length) {
                int length = objArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                this.a = Arrays.copyOf(objArr, i4);
            }
            Object[] objArr2 = this.a;
            cs.Q(i + i2, i, this.b, objArr2, objArr2);
            this.b += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final Object g(int i) {
        this.modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        cs.Q(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2 - 1] = null;
        this.b = i2 - 1;
        return obj;
    }

    public final Object get(int i) {
        int i2 = this.b;
        if (i >= 0 && i < i2) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
    }

    public final int getSize() {
        return this.b;
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        Object[] objArr = this.a;
        cs.Q(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        iu7.W(i3 - i2, i3, objArr2);
        this.b -= i2;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final int i(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.a[i5]) == z) {
                Object[] objArr = this.a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.a;
        cs.Q(i + i4, i2 + i, this.b, objArr2, objArr2);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        iu7.W(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            this.modCount++;
        }
        this.b -= i6;
        return i6;
    }

    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (hhd.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (hhd.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean remove(Object obj) {
        e();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            a(indexOf);
        }
        return indexOf >= 0;
    }

    public final boolean removeAll(Collection collection) {
        e();
        return i(0, this.b, collection, false) > 0;
    }

    public final boolean retainAll(Collection collection) {
        e();
        return i(0, this.b, collection, true) > 0;
    }

    public final Object set(int i, Object obj) {
        e();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        ete.m(i, i2, this.b);
        return new kg7(this.a, i, i2 - i, (kg7) null, this);
    }

    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.b;
        if (length < i) {
            return Arrays.copyOfRange(this.a, 0, i, objArr.getClass());
        }
        cs.Q(0, 0, i, this.a, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public final String toString() {
        return iu7.c(this.a, 0, this.b, this);
    }

    public final ListIterator listIterator(int i) {
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            return new jg7(this, i);
        }
        throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
    }

    public final boolean addAll(int i, Collection collection) {
        e();
        int i2 = this.b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        }
        int size = collection.size();
        c(i, collection, size);
        return size > 0;
    }

    public final void add(int i, Object obj) {
        e();
        int i2 = this.b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        }
        this.modCount++;
        f(i, 1);
        this.a[i] = obj;
    }

    public final Object[] toArray() {
        Object[] objArr = this.a;
        int i = this.b;
        pfa.j(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }
}
