package defpackage;

/* renamed from: s81  reason: default package */
public final class s81 extends t81 {
    public final mge b;

    public s81(hge hge) {
        super(0);
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s81) && hhd.f(this.b, ((s81) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowSnackbar(message="), this.b, ")");
    }
}
