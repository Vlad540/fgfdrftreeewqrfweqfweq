package defpackage;

import java.util.List;

/* renamed from: as4  reason: default package */
public final class as4 {
    public final x7b a;
    public final List b;

    public as4(x7b x7b, List list) {
        this.a = x7b;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as4)) {
            return false;
        }
        as4 as4 = (as4) obj;
        return hhd.f(this.a, as4.a) && hhd.f(this.b, as4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(appBarState=" + this.a + ", items=" + this.b + ")";
    }
}
