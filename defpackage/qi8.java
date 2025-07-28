package defpackage;

import java.util.List;

/* renamed from: qi8  reason: default package */
public final class qi8 implements si8 {
    public final List a;

    public qi8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi8) && hhd.f(this.a, ((qi8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(ids=" + this.a + ")";
    }
}
