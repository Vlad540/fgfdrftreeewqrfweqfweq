package defpackage;

/* renamed from: s73  reason: default package */
public final class s73 {
    public final Object a;
    public final u16 b;

    public s73(Object obj, u16 u16) {
        this.a = obj;
        this.b = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s73)) {
            return false;
        }
        s73 s73 = (s73) obj;
        return hhd.f(this.a, s73.a) && hhd.f(this.b, s73.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
