package defpackage;

/* renamed from: xda  reason: default package */
public final class xda implements dea {
    public final u16 a;

    public xda(u16 u16) {
        this.a = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xda) && hhd.f(this.a, ((xda) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Done(onClick=" + this.a + ")";
    }
}
