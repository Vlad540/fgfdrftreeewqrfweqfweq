package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l16  reason: default package */
public final class l16 {
    public final ConcurrentHashMap a;

    public /* synthetic */ l16(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l16)) {
            return false;
        }
        return hhd.f(this.a, ((l16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FtsCache(titles=" + this.a + ")";
    }
}
