package defpackage;

/* renamed from: oef  reason: default package */
public final class oef implements hhc {
    public final g79 a;

    public oef(g79 g79) {
        this.a = g79;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oef) && hhd.f(this.a, ((oef) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WatchTogetherUpdateNotification(updates=" + this.a + ")";
    }
}
