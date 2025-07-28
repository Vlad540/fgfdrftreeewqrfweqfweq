package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: es6  reason: default package */
public final class es6 extends n1 implements ot6, uze, Iterable {
    public static final es6 b = new es6(new uze[0]);
    public final uze[] a;

    public es6(uze[] uzeArr) {
        this.a = uzeArr;
    }

    public final String a() {
        uze[] uzeArr = this.a;
        if (uzeArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(uzeArr[0].a());
        for (int i = 1; i < uzeArr.length; i++) {
            sb.append(",");
            sb.append(uzeArr[i].a());
        }
        sb.append("]");
        return sb.toString();
    }

    public final es6 c() {
        return this;
    }

    public final int e() {
        return 7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        uze uze = (uze) obj;
        boolean z = uze instanceof es6;
        uze[] uzeArr = this.a;
        if (z) {
            return Arrays.equals(uzeArr, ((es6) uze).a);
        }
        int e = ((n1) uze).e();
        if (e == 0) {
            throw null;
        } else if (e != 7) {
            return false;
        } else {
            es6 c = uze.c();
            if (uzeArr.length != c.a.length) {
                return false;
            }
            Iterator it = c.iterator();
            for (uze equals : uzeArr) {
                ds6 ds6 = (ds6) it;
                if (!ds6.hasNext() || !equals.equals(ds6.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            uze[] uzeArr = this.a;
            if (i2 >= uzeArr.length) {
                return i;
            }
            i = (i * 31) + uzeArr[i2].hashCode();
            i2++;
        }
    }

    public final Iterator iterator() {
        return new ds6(this.a, 0);
    }

    public final es6 r() {
        return this;
    }

    public final String toString() {
        uze[] uzeArr = this.a;
        if (uzeArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        uze uze = uzeArr[0];
        if (sxe.g(((n1) uze).e())) {
            sb.append(uze.a());
        } else {
            sb.append(uze.toString());
        }
        for (int i = 1; i < uzeArr.length; i++) {
            sb.append(",");
            uze uze2 = uzeArr[i];
            if (sxe.g(((n1) uze2).e())) {
                sb.append(uze2.a());
            } else {
                sb.append(uze2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
