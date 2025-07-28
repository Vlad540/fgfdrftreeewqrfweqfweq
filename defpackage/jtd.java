package defpackage;

/* renamed from: jtd  reason: default package */
public final class jtd {
    public final boolean a;

    public jtd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtd) && this.a == ((jtd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
