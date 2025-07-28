package defpackage;

/* renamed from: s21  reason: default package */
public final class s21 implements u21 {
    public final bn1 a;

    public s21(bn1 bn1) {
        this.a = bn1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s21) && hhd.f(this.a, ((s21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
