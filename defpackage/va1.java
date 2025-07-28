package defpackage;

/* renamed from: va1  reason: default package */
public final class va1 implements ya1 {
    public final mge a;

    public va1(lge lge) {
        this.a = lge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va1) && hhd.f(this.a, ((va1) obj).a);
    }

    public final mge getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("Error(text="), this.a, ")");
    }
}
