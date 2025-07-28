package defpackage;

/* renamed from: w5d  reason: default package */
public final class w5d extends t81 {
    public final mge b;

    public w5d(hge hge) {
        super(12);
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5d) && hhd.f(this.b, ((w5d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowError(message="), this.b, ")");
    }
}
