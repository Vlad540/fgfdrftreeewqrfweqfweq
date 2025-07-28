package defpackage;

/* renamed from: wa1  reason: default package */
public final class wa1 implements ya1 {
    public final mge a;

    public wa1(lge lge) {
        this.a = lge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa1) && hhd.f(this.a, ((wa1) obj).a);
    }

    public final mge getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Loading(text="), this.a, ")");
    }
}
