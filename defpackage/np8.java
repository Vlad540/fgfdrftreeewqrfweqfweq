package defpackage;

import java.util.Collection;

/* renamed from: np8  reason: default package */
public final class np8 implements qp8 {
    public final Collection a;

    public np8(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np8) && hhd.f(this.a, ((np8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByIds(messageIds=" + this.a + ")";
    }
}
