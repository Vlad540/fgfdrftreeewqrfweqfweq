package defpackage;

/* renamed from: xa1  reason: default package */
public final class xa1 implements ya1 {
    public final mge a;

    public xa1(lge lge) {
        this.a = lge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa1) && hhd.f(this.a, ((xa1) obj).a);
    }

    public final mge getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Success(text="), this.a, ")");
    }
}
