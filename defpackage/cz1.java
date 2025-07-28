package defpackage;

import java.util.List;

/* renamed from: cz1  reason: default package */
public final class cz1 {
    public final qz1 a;
    public final List b;

    public cz1(qz1 qz1, List list) {
        this.a = qz1;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz1)) {
            return false;
        }
        cz1 cz1 = (cz1) obj;
        return hhd.f(this.a, cz1.a) && hhd.f(this.b, cz1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(screenState=" + this.a + ", items=" + this.b + ")";
    }
}
