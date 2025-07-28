package defpackage;

import java.util.Set;

/* renamed from: sv5  reason: default package */
public final class sv5 implements uv5 {
    public final Set a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv5) && hhd.f(this.a, ((sv5) obj).a);
    }

    public final int hashCode() {
        Set set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "MultiselectEnabled(selectedIds=" + this.a + ")";
    }
}
