package defpackage;

/* renamed from: mte  reason: default package */
public final class mte {
    public final uq7 a;

    public mte(uq7 uq7) {
        this.a = uq7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mte) && hhd.f(this.a, ((mte) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypingState(typing=" + this.a + ")";
    }
}
