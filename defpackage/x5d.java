package defpackage;

/* renamed from: x5d  reason: default package */
public final class x5d extends t81 {
    public final mge b;

    public x5d(hge hge) {
        super(12);
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5d) && hhd.f(this.b, ((x5d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowSuccess(message="), this.b, ")");
    }
}
