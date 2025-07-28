package defpackage;

/* renamed from: l91  reason: default package */
public final class l91 extends r91 {
    public final ize a;

    public l91(ize ize) {
        this.a = ize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l91) && this.a == ((l91) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonAction(state=" + this.a + ")";
    }
}
