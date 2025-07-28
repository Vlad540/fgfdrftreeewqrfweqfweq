package defpackage;

/* renamed from: cea  reason: default package */
public final class cea implements dea {
    public final u16 a;

    public cea(u16 u16) {
        this.a = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cea) && hhd.f(this.a, ((cea) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "More(onClick=" + this.a + ")";
    }
}
