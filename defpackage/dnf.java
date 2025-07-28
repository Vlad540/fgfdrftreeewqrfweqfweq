package defpackage;

/* renamed from: dnf  reason: default package */
public final class dnf {
    public static final cnf Companion = new Object();
    public final boolean a;

    public /* synthetic */ dnf(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            bm3.I(i, 1, bnf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnf) && this.a == ((dnf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("WebAppSetupBackButtonRequest(isVisible="), this.a, ")");
    }
}
