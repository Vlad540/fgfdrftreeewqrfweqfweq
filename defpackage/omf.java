package defpackage;

/* renamed from: omf  reason: default package */
public final class omf implements lmf {
    public final boolean a;

    public omf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omf) && this.a == ((omf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("ShowWebView(showBackButton="), this.a, ")");
    }
}
