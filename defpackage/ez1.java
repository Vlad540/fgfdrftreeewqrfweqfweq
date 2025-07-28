package defpackage;

/* renamed from: ez1  reason: default package */
public final class ez1 extends iz1 {
    public final mge a;

    public ez1(lge lge) {
        this.a = lge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez1) && hhd.f(this.a, ((ez1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ErrorWithLocalizedMessage(text="), this.a, ")");
    }
}
