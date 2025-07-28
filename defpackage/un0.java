package defpackage;

/* renamed from: un0  reason: default package */
public final class un0 implements wn0 {
    public final lp3 a;

    public un0(lp3 lp3) {
        this.a = lp3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un0) && hhd.f(this.a, ((un0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(event=" + this.a + ")";
    }
}
