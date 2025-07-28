package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: c63  reason: default package */
public final class c63 extends kga implements Serializable {
    public final Comparator a;

    public c63(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c63) {
            return this.a.equals(((c63) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
