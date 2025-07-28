package defpackage;

/* renamed from: xtf  reason: default package */
public final class xtf {
    public String a;
    public ctf b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtf)) {
            return false;
        }
        xtf xtf = (xtf) obj;
        return hhd.f(this.a, xtf.a) && this.b == xtf.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
