package defpackage;

/* renamed from: gx1  reason: default package */
public final class gx1 {
    public final boolean a;

    public gx1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx1) && this.a == ((gx1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
