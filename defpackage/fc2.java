package defpackage;

import java.util.List;

/* renamed from: fc2  reason: default package */
public final class fc2 implements ic2 {
    public final List a;

    public fc2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc2) && hhd.f(this.a, ((fc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Remove(messageIds=" + this.a + ")";
    }
}
