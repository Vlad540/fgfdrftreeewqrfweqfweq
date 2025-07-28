package defpackage;

/* renamed from: wda  reason: default package */
public final class wda implements bea, dea {
    public final u16 a;

    public wda(u16 u16) {
        this.a = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wda) && hhd.f(this.a, ((wda) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Close(onClick=" + this.a + ")";
    }
}
