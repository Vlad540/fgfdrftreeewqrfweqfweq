package defpackage;

import java.util.Objects;

/* renamed from: yia  reason: default package */
public final class yia {
    public final Object a;
    public final Object b;

    public yia(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yia)) {
            return false;
        }
        yia yia = (yia) obj;
        return Objects.equals(yia.a, this.a) && Objects.equals(yia.b, this.b);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
