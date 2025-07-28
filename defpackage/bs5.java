package defpackage;

import java.util.Map;

/* renamed from: bs5  reason: default package */
public final class bs5 {
    public final Map a;

    public bs5(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs5) && hhd.f(this.a, ((bs5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FoldersCounters(counters=" + this.a + ")";
    }
}
