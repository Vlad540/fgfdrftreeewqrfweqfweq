package defpackage;

/* renamed from: i65  reason: default package */
public final class i65 extends sg9 {
    public final mge b;

    public i65(hge hge) {
        super(jue.a);
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i65) && hhd.f(this.b, ((i65) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowSnackbar(text="), this.b, ")");
    }
}
