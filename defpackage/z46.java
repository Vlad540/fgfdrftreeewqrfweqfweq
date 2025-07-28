package defpackage;

import java.util.List;

/* renamed from: z46  reason: default package */
public final class z46 implements e56 {
    public final List a;

    public z46(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z46) && hhd.f(this.a, ((z46) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectionChanged(items=" + this.a + ")";
    }
}
