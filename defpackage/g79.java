package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g79  reason: default package */
public final class g79 {
    public final List a;

    public g79(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g79) && hhd.f(this.a, ((g79) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieStateUpdates(updates=" + this.a + ")";
    }
}
