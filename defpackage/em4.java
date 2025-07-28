package defpackage;

import java.util.Map;

/* renamed from: em4  reason: default package */
public final class em4 {
    public final Map a;
    public final Map b;

    public em4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em4)) {
            return false;
        }
        em4 em4 = (em4) obj;
        return hhd.f(this.a, em4.a) && hhd.f(this.b, em4.b);
    }

    public final int hashCode() {
        int i = 0;
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftUpdates(discarded=" + this.a + ", saved=" + this.b + ")";
    }
}
