package defpackage;

import java.util.List;

/* renamed from: hc6  reason: default package */
public final class hc6 {
    public final List a;

    public hc6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc6) && hhd.f(this.a, ((hc6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GridModeState(opponentsPages=" + this.a + ")";
    }
}
