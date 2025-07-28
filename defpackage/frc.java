package defpackage;

/* renamed from: frc  reason: default package */
public final class frc implements grc {
    public final li2 a;

    public frc(li2 li2) {
        this.a = li2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frc) && hhd.f(this.a, ((frc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResult(result=" + this.a + ")";
    }
}
