package defpackage;

import java.util.Set;

/* renamed from: b41  reason: default package */
public final class b41 implements d41 {
    public final Set a;

    public b41(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b41) && hhd.f(this.a, ((b41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContacts(contactIds=" + this.a + ")";
    }
}
