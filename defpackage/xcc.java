package defpackage;

import java.io.Serializable;

/* renamed from: xcc  reason: default package */
public final class xcc extends kga implements Serializable {
    public static final xcc a = new kga();

    public final kga b() {
        return og9.a;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
