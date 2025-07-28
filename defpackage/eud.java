package defpackage;

/* renamed from: eud  reason: default package */
public final class eud implements gud {
    public final boolean a;

    public eud(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eud) && this.a == ((eud) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
