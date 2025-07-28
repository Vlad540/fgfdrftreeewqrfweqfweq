package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: uzd  reason: default package */
public final class uzd {
    public final List a;

    public uzd(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzd) && hhd.f(this.a, ((uzd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkipAnyOf(containsAnyOf=" + this.a + ")";
    }
}
