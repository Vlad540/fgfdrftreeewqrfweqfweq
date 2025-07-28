package defpackage;

/* renamed from: rcb  reason: default package */
public final class rcb implements scb {
    public final mge a;

    public rcb(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcb) && hhd.f(this.a, ((rcb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowSuccessRestoredMembersSnackbar(caption="), this.a, ")");
    }
}
