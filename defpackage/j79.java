package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j79  reason: default package */
public final class j79 {
    public final List a;

    public j79(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j79) && hhd.f(this.a, ((j79) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieThumbnail(qualities=" + this.a + ")";
    }
}
