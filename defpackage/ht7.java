package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ht7  reason: default package */
public final class ht7 implements Map, Serializable, d77 {
    public static final ht7 C0;
    public it7 A0;
    public boolean B0;
    public int X;
    public int Y;
    public int Z;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] o;
    public int w0;
    public int x0;
    public it7 y0;
    public jt7 z0;

    static {
        ht7 ht7 = new ht7(0);
        ht7.B0 = true;
        C0 = ht7;
    }

    public ht7() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int h = h(obj);
            int i = this.X * 2;
            int length = this.o.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.o;
                int i3 = iArr[h];
                if (i3 <= 0) {
                    int i4 = this.Y;
                    Object[] objArr = this.a;
                    if (i4 >= objArr.length) {
                        f(1);
                    } else {
                        int i5 = i4 + 1;
                        this.Y = i5;
                        objArr[i4] = obj;
                        this.c[i4] = h;
                        iArr[h] = i5;
                        this.x0++;
                        this.w0++;
                        if (i2 > this.X) {
                            this.X = i2;
                        }
                        return i4;
                    }
                } else if (hhd.f(this.a[i3 - 1], obj)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        i(this.o.length * 2);
                        break;
                    }
                    h = h == 0 ? this.o.length - 1 : h - 1;
                }
            }
        }
    }

    public final ht7 b() {
        c();
        this.B0 = true;
        return this.x0 > 0 ? this : C0;
    }

    public final void c() {
        if (this.B0) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        int i = this.Y - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.o[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        iu7.W(0, this.Y, this.a);
        Object[] objArr = this.b;
        if (objArr != null) {
            iu7.W(0, this.Y, objArr);
        }
        this.x0 = 0;
        this.Y = 0;
        this.w0++;
    }

    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.Y;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.c[i2] >= 0 && hhd.f(this.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.Y;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.o[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        iu7.W(i3, i, this.a);
        if (objArr != null) {
            iu7.W(i3, this.Y, objArr);
        }
        this.Y = i3;
    }

    public final boolean e(Collection collection) {
        boolean z;
        for (Object next : collection) {
            if (next != null) {
                try {
                    Map.Entry entry = (Map.Entry) next;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        z = false;
                        continue;
                    } else {
                        z = hhd.f(this.b[g], entry.getValue());
                        continue;
                    }
                    if (!z) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final Set entrySet() {
        it7 it7 = this.A0;
        if (it7 != null) {
            return it7;
        }
        it7 it72 = new it7(0, this);
        this.A0 = it72;
        return it72;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.x0 != map.size() || !e(map.entrySet())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.Y;
        int i3 = length - i2;
        int i4 = i2 - this.x0;
        int i5 = 1;
        if (i3 >= i || i3 + i4 < i || i4 < objArr.length / 4) {
            int i6 = i2 + i;
            if (i6 < 0) {
                throw new OutOfMemoryError();
            } else if (i6 > objArr.length) {
                int length2 = objArr.length;
                int i7 = length2 + (length2 >> 1);
                if (i7 - i6 < 0) {
                    i7 = i6;
                }
                if (i7 - 2147483639 > 0) {
                    i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                this.a = Arrays.copyOf(objArr, i7);
                Object[] objArr2 = this.b;
                this.b = objArr2 != null ? Arrays.copyOf(objArr2, i7) : null;
                this.c = Arrays.copyOf(this.c, i7);
                if (i7 >= 1) {
                    i5 = i7;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.o.length) {
                    i(highestOneBit);
                }
            }
        } else {
            d(true);
        }
    }

    public final int g(Object obj) {
        int h = h(obj);
        int i = this.X;
        while (true) {
            int i2 = this.o[h];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (hhd.f(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            h = h == 0 ? this.o.length - 1 : h - 1;
        }
    }

    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        return this.b[g];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * -1640531527) >>> this.Z;
    }

    public final int hashCode() {
        et7 et7 = new et7(0, this);
        int i = 0;
        while (et7.hasNext()) {
            int i2 = et7.a;
            ht7 ht7 = (ht7) et7.o;
            if (i2 < ht7.Y) {
                et7.a = i2 + 1;
                et7.b = i2;
                Object obj = ht7.a[i2];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object obj2 = ht7.b[et7.b];
                int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
                et7.f();
                i += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r6) {
        /*
            r5 = this;
            int r0 = r5.w0
            int r0 = r0 + 1
            r5.w0 = r0
            int r0 = r5.Y
            int r1 = r5.x0
            r2 = 0
            if (r0 <= r1) goto L_0x0010
            r5.d(r2)
        L_0x0010:
            int[] r0 = new int[r6]
            r5.o = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.Z = r6
        L_0x001c:
            int r6 = r5.Y
            if (r2 >= r6) goto L_0x0050
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.h(r0)
            int r1 = r5.X
        L_0x002c:
            int[] r3 = r5.o
            r4 = r3[r0]
            if (r4 != 0) goto L_0x003a
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L_0x001c
        L_0x003a:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0048
            int r4 = r0 + -1
            if (r0 != 0) goto L_0x0046
            int r0 = r3.length
            int r0 = r0 + -1
            goto L_0x002c
        L_0x0046:
            r0 = r4
            goto L_0x002c
        L_0x0048:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht7.i(int):void");
    }

    public final boolean isEmpty() {
        return this.x0 == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.a
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.b
            if (r0 == 0) goto L_0x000b
            r0[r12] = r1
        L_0x000b:
            int[] r0 = r11.c
            r0 = r0[r12]
            int r1 = r11.X
            int r1 = r1 * 2
            int[] r2 = r11.o
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x001b
            r1 = r2
        L_0x001b:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L_0x001f:
            int r5 = r0 + -1
            if (r0 != 0) goto L_0x0029
            int[] r0 = r11.o
            int r0 = r0.length
            int r0 = r0 + -1
            goto L_0x002a
        L_0x0029:
            r0 = r5
        L_0x002a:
            int r4 = r4 + 1
            int r5 = r11.X
            r6 = -1
            if (r4 <= r5) goto L_0x0036
            int[] r0 = r11.o
            r0[r1] = r2
            goto L_0x0067
        L_0x0036:
            int[] r5 = r11.o
            r7 = r5[r0]
            if (r7 != 0) goto L_0x003f
            r5[r1] = r2
            goto L_0x0067
        L_0x003f:
            if (r7 >= 0) goto L_0x0046
            r5[r1] = r6
        L_0x0043:
            r1 = r0
            r4 = r2
            goto L_0x0060
        L_0x0046:
            java.lang.Object[] r5 = r11.a
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.h(r5)
            int r5 = r5 - r0
            int[] r9 = r11.o
            int r10 = r9.length
            int r10 = r10 + -1
            r5 = r5 & r10
            if (r5 < r4) goto L_0x0060
            r9[r1] = r7
            int[] r4 = r11.c
            r4[r8] = r1
            goto L_0x0043
        L_0x0060:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x001f
            int[] r0 = r11.o
            r0[r1] = r6
        L_0x0067:
            int[] r0 = r11.c
            r0[r12] = r6
            int r12 = r11.x0
            int r12 = r12 + r6
            r11.x0 = r12
            int r12 = r11.w0
            int r12 = r12 + 1
            r11.w0 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht7.j(int):void");
    }

    public final Set keySet() {
        it7 it7 = this.y0;
        if (it7 != null) {
            return it7;
        }
        it7 it72 = new it7(1, this);
        this.y0 = it72;
        return it72;
    }

    public final Object put(Object obj, Object obj2) {
        c();
        int a2 = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        if (a2 < 0) {
            int i = (-a2) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a2] = obj2;
        return null;
    }

    public final void putAll(Map map) {
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a2 = a(entry.getKey());
                Object[] objArr = this.b;
                if (objArr == null) {
                    int length = this.a.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.b = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.".toString());
                    }
                }
                if (a2 >= 0) {
                    objArr[a2] = entry.getValue();
                } else {
                    int i = (-a2) - 1;
                    if (!hhd.f(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object obj2 = this.b[g];
        j(g);
        return obj2;
    }

    public final int size() {
        return this.x0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.x0 * 3) + 2);
        sb.append("{");
        et7 et7 = new et7(0, this);
        int i = 0;
        while (et7.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = et7.a;
            ht7 ht7 = (ht7) et7.o;
            if (i2 < ht7.Y) {
                et7.a = i2 + 1;
                et7.b = i2;
                Object obj = ht7.a[i2];
                if (obj == ht7) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object obj2 = ht7.b[et7.b];
                if (obj2 == ht7) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                et7.f();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final Collection values() {
        jt7 jt7 = this.z0;
        if (jt7 != null) {
            return jt7;
        }
        jt7 jt72 = new jt7(this);
        this.z0 = jt72;
        return jt72;
    }

    public ht7(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.a = objArr;
            this.b = null;
            this.c = iArr;
            this.o = new int[highestOneBit];
            this.X = 2;
            this.Y = 0;
            this.Z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
