package defpackage;

import java.io.Serializable;

/* renamed from: ycc  reason: default package */
public final class ycc extends kga implements Serializable {
    public final kga a;

    public ycc(kga kga) {
        kga.getClass();
        this.a = kga;
    }

    public final kga b() {
        return this.a;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ycc) {
            return this.a.equals(((ycc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
