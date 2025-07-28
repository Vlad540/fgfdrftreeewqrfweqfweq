package defpackage;

import java.util.Collection;

/* renamed from: pp8  reason: default package */
public final class pp8 implements qp8 {
    public final Collection a;

    public pp8(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pp8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        return hhd.f(this.a, ((pp8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(messageIds=" + this.a + ")";
    }
}
