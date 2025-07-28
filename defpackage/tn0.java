package defpackage;

/* renamed from: tn0  reason: default package */
public final class tn0 implements wn0 {
    public final ik3 a;

    public tn0(ik3 ik3) {
        this.a = ik3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn0) && hhd.f(this.a, ((tn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactList(event=" + this.a + ")";
    }
}
