package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lr  reason: default package */
public final class lr extends r2 {
    public static final Object[] o = new Object[0];
    public int a;
    public Object[] b = o;
    public int c;

    public final Object a(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        } else if (i == p23.A(this)) {
            return k();
        } else {
            if (i == 0) {
                return j();
            }
            i();
            int h = h(this.a + i);
            Object[] objArr = this.b;
            Object obj = objArr[h];
            if (i < (this.c >> 1)) {
                int i3 = this.a;
                if (h >= i3) {
                    cs.Q(i3 + 1, i3, h, objArr, objArr);
                } else {
                    cs.Q(1, 0, h, objArr, objArr);
                    Object[] objArr2 = this.b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i4 = this.a;
                    cs.Q(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.b;
                int i5 = this.a;
                objArr3[i5] = null;
                this.a = e(i5);
            } else {
                int h2 = h(p23.A(this) + this.a);
                if (h <= h2) {
                    Object[] objArr4 = this.b;
                    cs.Q(h, h + 1, h2 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.b;
                    cs.Q(h, h + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    cs.Q(0, 1, h2 + 1, objArr6, objArr6);
                }
                this.b[h2] = null;
            }
            this.c--;
            return obj;
        }
    }

    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        } else if (i == i2) {
            b(obj);
        } else if (i == 0) {
            i();
            d(this.c + 1);
            int i3 = this.a;
            if (i3 == 0) {
                i3 = this.b.length;
            }
            int i4 = i3 - 1;
            this.a = i4;
            this.b[i4] = obj;
            this.c++;
        } else {
            i();
            d(this.c + 1);
            int h = h(this.a + i);
            int i5 = this.c;
            if (i < ((i5 + 1) >> 1)) {
                int length = h == 0 ? this.b.length - 1 : h - 1;
                int i6 = this.a;
                int length2 = i6 == 0 ? this.b.length - 1 : i6 - 1;
                if (length >= i6) {
                    Object[] objArr = this.b;
                    objArr[length2] = objArr[i6];
                    cs.Q(i6, i6 + 1, length + 1, objArr, objArr);
                } else {
                    Object[] objArr2 = this.b;
                    cs.Q(i6 - 1, i6, objArr2.length, objArr2, objArr2);
                    Object[] objArr3 = this.b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    cs.Q(0, 1, length + 1, objArr3, objArr3);
                }
                this.b[length] = obj;
                this.a = length2;
            } else {
                int h2 = h(i5 + this.a);
                if (h < h2) {
                    Object[] objArr4 = this.b;
                    cs.Q(h + 1, h, h2, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.b;
                    cs.Q(1, 0, h2, objArr5, objArr5);
                    Object[] objArr6 = this.b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    cs.Q(h + 1, h, objArr6.length - 1, objArr6, objArr6);
                }
                this.b[h] = obj;
            }
            this.c++;
        }
    }

    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i == this.c) {
                return addAll(collection);
            }
            i();
            d(collection.size() + this.c);
            int h = h(this.c + this.a);
            int h2 = h(this.a + i);
            int size = collection.size();
            if (i < ((this.c + 1) >> 1)) {
                int i3 = this.a;
                int i4 = i3 - size;
                if (h2 < i3) {
                    Object[] objArr = this.b;
                    cs.Q(i4, i3, objArr.length, objArr, objArr);
                    if (size >= h2) {
                        Object[] objArr2 = this.b;
                        cs.Q(objArr2.length - size, 0, h2, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.b;
                        cs.Q(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.b;
                        cs.Q(0, size, h2, objArr4, objArr4);
                    }
                } else if (i4 >= 0) {
                    Object[] objArr5 = this.b;
                    cs.Q(i4, i3, h2, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.b;
                    i4 += objArr6.length;
                    int i5 = h2 - i3;
                    int length = objArr6.length - i4;
                    if (length >= i5) {
                        cs.Q(i4, i3, h2, objArr6, objArr6);
                    } else {
                        cs.Q(i4, i3, i3 + length, objArr6, objArr6);
                        Object[] objArr7 = this.b;
                        cs.Q(0, this.a + length, h2, objArr7, objArr7);
                    }
                }
                this.a = i4;
                c(f(h2 - size), collection);
            } else {
                int i6 = h2 + size;
                if (h2 < h) {
                    int i7 = size + h;
                    Object[] objArr8 = this.b;
                    if (i7 <= objArr8.length) {
                        cs.Q(i6, h2, h, objArr8, objArr8);
                    } else if (i6 >= objArr8.length) {
                        cs.Q(i6 - objArr8.length, h2, h, objArr8, objArr8);
                    } else {
                        int length2 = h - (i7 - objArr8.length);
                        cs.Q(0, length2, h, objArr8, objArr8);
                        Object[] objArr9 = this.b;
                        cs.Q(i6, h2, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.b;
                    cs.Q(size, 0, h, objArr10, objArr10);
                    Object[] objArr11 = this.b;
                    if (i6 >= objArr11.length) {
                        cs.Q(i6 - objArr11.length, h2, objArr11.length, objArr11, objArr11);
                    } else {
                        cs.Q(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.b;
                        cs.Q(i6, h2, objArr12.length - size, objArr12, objArr12);
                    }
                }
                c(h2, collection);
            }
            return true;
        }
    }

    public final void b(Object obj) {
        i();
        d(getSize() + 1);
        this.b[h(getSize() + this.a)] = obj;
        this.c = getSize() + 1;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + getSize();
    }

    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.a, h(getSize() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i > objArr.length) {
                if (objArr == o) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.b = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i2];
                cs.Q(0, this.a, objArr.length, objArr, objArr2);
                Object[] objArr3 = this.b;
                int length2 = objArr3.length;
                int i3 = this.a;
                cs.Q(length2 - i3, 0, i3, objArr3, objArr2);
                this.a = 0;
                this.b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int e(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.b, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.b, 0, i2, (Object) null);
    }

    public final Object get(int i) {
        int size = getSize();
        if (i >= 0 && i < size) {
            return this.b[h(this.a + i)];
        }
        throw new IndexOutOfBoundsException(me4.g("index: ", i, size, ", size: "));
    }

    public final int getSize() {
        return this.c;
    }

    public final int h(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        this.modCount++;
    }

    public final int indexOf(Object obj) {
        int i;
        int h = h(getSize() + this.a);
        int i2 = this.a;
        if (i2 < h) {
            while (i2 < h) {
                if (hhd.f(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < h) {
            return -1;
        } else {
            int length = this.b.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < h) {
                        if (hhd.f(obj, this.b[i3])) {
                            i2 = i3 + this.b.length;
                            i = this.a;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (hhd.f(obj, this.b[i2])) {
                    i = this.a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final Object j() {
        if (!isEmpty()) {
            i();
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = e(i);
            this.c = getSize() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object k() {
        if (!isEmpty()) {
            i();
            int h = h(p23.A(this) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[h];
            objArr[h] = null;
            this.c = getSize() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        int h = h(getSize() + this.a);
        int i3 = this.a;
        if (i3 < h) {
            i = h - 1;
            if (i3 <= i) {
                while (!hhd.f(obj, this.b[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.a;
            }
            return -1;
        }
        if (i3 > h) {
            int i4 = h - 1;
            while (true) {
                if (-1 >= i4) {
                    int length = this.b.length - 1;
                    int i5 = this.a;
                    if (i5 <= length) {
                        while (!hhd.f(obj, this.b[i])) {
                            if (i != i5) {
                                length = i - 1;
                            }
                        }
                        i2 = this.a;
                    }
                } else if (hhd.f(obj, this.b[i4])) {
                    i = i4 + this.b.length;
                    i2 = this.a;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        a(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto L_0x000e
            goto L_0x008f
        L_0x000e:
            int r0 = r11.a
            int r2 = r11.getSize()
            int r2 = r2 + r0
            int r0 = r11.h(r2)
            int r2 = r11.a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x003f
            r5 = r2
        L_0x0020:
            if (r2 >= r0) goto L_0x0039
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0035
            java.lang.Object[] r7 = r11.b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0036
        L_0x0035:
            r1 = r4
        L_0x0036:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0039:
            java.lang.Object[] r12 = r11.b
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0081
        L_0x003f:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0044:
            if (r2 >= r5) goto L_0x005f
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x005b
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005c
        L_0x005b:
            r7 = r4
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0044
        L_0x005f:
            int r2 = r11.h(r6)
            r5 = r2
        L_0x0064:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.e(r5)
            goto L_0x007d
        L_0x007c:
            r7 = r4
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0064
        L_0x0080:
            r1 = r7
        L_0x0081:
            if (r1 == 0) goto L_0x008f
            r11.i()
            int r12 = r11.a
            int r5 = r5 - r12
            int r12 = r11.f(r5)
            r11.c = r12
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.removeAll(java.util.Collection):boolean");
    }

    public final void removeRange(int i, int i2) {
        ete.m(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.c) {
                clear();
            } else if (i3 == 1) {
                a(i);
            } else {
                i();
                if (i < this.c - i2) {
                    int h = h((i - 1) + this.a);
                    int h2 = h((i2 - 1) + this.a);
                    while (i > 0) {
                        int i4 = h + 1;
                        int min = Math.min(i, Math.min(i4, h2 + 1));
                        Object[] objArr = this.b;
                        int i5 = h2 - min;
                        int i6 = h - min;
                        cs.Q(i5 + 1, i6 + 1, i4, objArr, objArr);
                        h = f(i6);
                        h2 = f(i5);
                        i -= min;
                    }
                    int h3 = h(this.a + i3);
                    g(this.a, h3);
                    this.a = h3;
                } else {
                    int h4 = h(this.a + i2);
                    int h5 = h(this.a + i);
                    int i7 = this.c;
                    while (true) {
                        i7 -= i2;
                        if (i7 <= 0) {
                            break;
                        }
                        Object[] objArr2 = this.b;
                        i2 = Math.min(i7, Math.min(objArr2.length - h4, objArr2.length - h5));
                        Object[] objArr3 = this.b;
                        int i8 = h4 + i2;
                        cs.Q(h5, h4, i8, objArr3, objArr3);
                        h4 = h(i8);
                        h5 = h(h5 + i2);
                    }
                    int h6 = h(this.c + this.a);
                    g(f(h6 - i3), h6);
                }
                this.c -= i3;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008c
            java.lang.Object[] r0 = r11.b
            int r0 = r0.length
            if (r0 != 0) goto L_0x000e
            goto L_0x008c
        L_0x000e:
            int r0 = r11.a
            int r2 = r11.getSize()
            int r2 = r2 + r0
            int r0 = r11.h(r2)
            int r2 = r11.a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x003e
            r5 = r2
        L_0x0020:
            if (r2 >= r0) goto L_0x0038
            java.lang.Object[] r6 = r11.b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0034
            java.lang.Object[] r7 = r11.b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0035
        L_0x0034:
            r1 = r4
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0038:
            java.lang.Object[] r12 = r11.b
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x007e
        L_0x003e:
            java.lang.Object[] r5 = r11.b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0043:
            if (r2 >= r5) goto L_0x005d
            java.lang.Object[] r8 = r11.b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0059
            java.lang.Object[] r8 = r11.b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005a
        L_0x0059:
            r7 = r4
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x005d:
            int r2 = r11.h(r6)
            r5 = r2
        L_0x0062:
            if (r1 >= r0) goto L_0x007d
            java.lang.Object[] r2 = r11.b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x0079
            java.lang.Object[] r2 = r11.b
            r2[r5] = r6
            int r5 = r11.e(r5)
            goto L_0x007a
        L_0x0079:
            r7 = r4
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0062
        L_0x007d:
            r1 = r7
        L_0x007e:
            if (r1 == 0) goto L_0x008c
            r11.i()
            int r12 = r11.a
            int r5 = r5 - r12
            int r12 = r11.f(r5)
            r11.c = r12
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i, Object obj) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, size, ", size: "));
        }
        int h = h(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int h = h(this.c + this.a);
        int i2 = this.a;
        if (i2 < h) {
            cs.R(i2, h, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            cs.Q(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            cs.Q(objArr3.length - this.a, 0, h, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final boolean add(Object obj) {
        b(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + getSize());
        c(h(getSize() + this.a), collection);
        return true;
    }
}
