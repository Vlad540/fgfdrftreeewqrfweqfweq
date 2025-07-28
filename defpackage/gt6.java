package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: gt6  reason: default package */
public abstract class gt6 extends ns6 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient ws6 b;

    public static int h(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static gt6 i(int i, Object... objArr) {
        if (i == 0) {
            return k8c.y0;
        }
        if (i != 1) {
            int h = h(i);
            Object[] objArr2 = new Object[h];
            int i2 = h - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int E = gp0.E(hashCode);
                    while (true) {
                        int i6 = E & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            E++;
                        }
                    }
                    i3++;
                } else {
                    throw new NullPointerException(wn6.h(i3, "at index "));
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new ejd(obj3);
            } else if (h(i5) < h / 2) {
                return i(i5, objArr);
            } else {
                int length = objArr.length;
                if (i5 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new k8c(i4, i2, i5, objArr, objArr2);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new ejd(obj4);
        }
    }

    public static gt6 j(Collection collection) {
        if ((collection instanceof gt6) && !(collection instanceof SortedSet)) {
            gt6 gt6 = (gt6) collection;
            if (!gt6.f()) {
                return gt6;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public ws6 a() {
        ws6 ws6 = this.b;
        if (ws6 != null) {
            return ws6;
        }
        ws6 k = k();
        this.b = k;
        return k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gt6) || !l() || !((gt6) obj).l() || hashCode() == obj.hashCode()) {
            return gp0.i(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return gp0.v(this);
    }

    public ws6 k() {
        Object[] array = toArray(ns6.a);
        po5 po5 = ws6.b;
        return ws6.h(array.length, array);
    }

    public boolean l() {
        return this instanceof k8c;
    }
}
