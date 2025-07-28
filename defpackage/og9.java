package defpackage;

import java.io.Serializable;

/* renamed from: og9  reason: default package */
public final class og9 extends kga implements Serializable {
    public static final og9 a = new kga();

    public final kga b() {
        return xcc.a;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
