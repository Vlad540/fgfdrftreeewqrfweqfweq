package defpackage;

/* renamed from: hz1  reason: default package */
public final class hz1 extends iz1 {
    public final mge a;

    public hz1(hge hge) {
        this.a = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz1) && hhd.f(this.a, ((hz1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("SomethingWentWrong(text="), this.a, ")");
    }
}
