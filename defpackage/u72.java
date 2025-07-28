package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: u72  reason: default package */
public final class u72 {
    public static final u72 c = new u72(hw4.a, qw4.a);
    public final Set a;
    public final List b;

    public u72(List list, Set set) {
        this.a = set;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u72)) {
            return false;
        }
        u72 u72 = (u72) obj;
        return hhd.f(this.a, u72.a) && hhd.f(this.b, u72.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatFolders(allFilterExclude=" + this.a + ", folders=" + this.b + ")";
    }
}
