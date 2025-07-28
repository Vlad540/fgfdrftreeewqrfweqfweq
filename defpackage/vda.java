package defpackage;

/* renamed from: vda  reason: default package */
public final class vda implements bea {
    public final u16 a;

    public vda(u16 u16) {
        this.a = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vda) && hhd.f(this.a, ((vda) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Back(onClick=" + this.a + ")";
    }
}
