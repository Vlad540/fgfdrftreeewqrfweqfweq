package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: n93  reason: default package */
public final class n93 extends kga implements Serializable {
    public final Comparator[] a;

    public n93(lu0 lu0, lu0 lu02) {
        this.a = new Comparator[]{lu0, lu02};
    }

    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n93) {
            return Arrays.equals(this.a, ((n93) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
