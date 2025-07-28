package defpackage;

/* renamed from: med  reason: default package */
public final class med extends oq2 {
    public final mge a;

    public med(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof med) && hhd.f(this.a, ((med) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowSnackbar(text="), this.a, ")");
    }
}
