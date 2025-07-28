package defpackage;

/* renamed from: qcb  reason: default package */
public final class qcb implements scb {
    public final mge a;

    public qcb(mge mge) {
        this.a = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcb) && hhd.f(this.a, ((qcb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowRestoreMembersSnackbar(caption="), this.a, ")");
    }
}
