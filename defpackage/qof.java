package defpackage;

/* renamed from: qof  reason: default package */
public final class qof extends gkf {
    public final boolean a;

    public qof(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qof) && this.a == ((qof) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("ShowBackButton(isVisible="), this.a, ")");
    }
}
