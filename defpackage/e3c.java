package defpackage;

/* renamed from: e3c  reason: default package */
public final class e3c implements g3c {
    public final mge a;

    public e3c(hge hge) {
        this.a = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3c) && hhd.f(this.a, ((e3c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowSnackbar(textSource="), this.a, ")");
    }
}
