package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bs  reason: default package */
public final class bs implements Collection, Set, a77 {
    public int[] a;
    public Object[] b;
    public int c;

    public bs(int i) {
        this.a = e07.a;
        this.b = e07.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public final void a(bs bsVar) {
        int i = bsVar.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(bsVar.b[i2]);
            }
        } else if (i > 0) {
            System.arraycopy(bsVar.a, 0, this.a, 0, i);
            cs.R(0, i, 6, bsVar.b, this.b);
            if (this.c == 0) {
                this.c = i;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.c;
        if (obj == null) {
            i2 = kjd.z(this, (Object) null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = kjd.z(this, obj, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i5];
            this.a = iArr2;
            this.b = new Object[i5];
            if (i3 == this.c) {
                if (!(iArr2.length == 0)) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    cs.R(0, objArr.length, 6, objArr, this.b);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.a;
            int i6 = i4 + 1;
            cs.P(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.b;
            cs.Q(i6, i4, i3, objArr2, objArr2);
        }
        int i7 = this.c;
        if (i3 == i7) {
            int[] iArr4 = this.a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.b[i4] = obj;
                this.c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        b(collection.size() + this.c);
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[i];
            this.a = iArr2;
            this.b = new Object[i];
            if (i2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                cs.R(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c(bs bsVar) {
        int i = bsVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            remove(bsVar.b[i2]);
        }
    }

    public final void clear() {
        if (this.c != 0) {
            this.a = e07.a;
            this.b = e07.c;
            this.c = 0;
        }
        if (this.c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return (obj == null ? kjd.z(this, (Object) null, 0) : kjd.z(this, obj, obj.hashCode())) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Object d(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.a;
            int i4 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i5 = i + 1;
                    cs.P(i, i5, i2, iArr, iArr);
                    Object[] objArr2 = this.b;
                    cs.Q(i, i5, i2, objArr2, objArr2);
                }
                this.b[i3] = null;
            } else {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                int[] iArr2 = new int[i4];
                this.a = iArr2;
                this.b = new Object[i4];
                if (i > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    cs.R(0, i, 6, objArr, this.b);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    cs.P(i, i6, i2, iArr, this.a);
                    cs.Q(i, i6, i2, objArr, this.b);
                }
            }
            if (i2 == this.c) {
                this.c = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.c == ((Set) obj).size()) {
            try {
                int i = this.c;
                int i2 = 0;
                while (i2 < i) {
                    if (((Set) obj).contains(this.b[i2])) {
                        i2++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Iterator iterator() {
        return new ur(this);
    }

    public final boolean remove(Object obj) {
        int z = obj == null ? kjd.z(this, (Object) null, 0) : kjd.z(this, obj, obj.hashCode());
        if (z < 0) {
            return false;
        }
        d(z);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!o23.R(collection, this.b[i])) {
                d(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.c;
    }

    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i = this.c;
        pfa.j(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        cs.Q(0, 0, this.c, this.b, objArr);
        return objArr;
    }

    public /* synthetic */ bs(Object obj) {
        this(0);
    }

    public bs(bs bsVar) {
        this(0);
        if (bsVar != null) {
            a(bsVar);
        }
    }

    public bs(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
