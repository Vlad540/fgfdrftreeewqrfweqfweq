package defpackage;

import java.util.List;

/* renamed from: bi8  reason: default package */
public final class bi8 {
    public final List a;
    public final List b;

    public bi8(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi8)) {
            return false;
        }
        bi8 bi8 = (bi8) obj;
        return hhd.f(this.a, bi8.a) && hhd.f(this.b, bi8.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemberListActionsWrapper(topActions=" + this.a + ", bottomActions=" + this.b + ")";
    }
}
