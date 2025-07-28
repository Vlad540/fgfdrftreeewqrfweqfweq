package defpackage;

/* renamed from: rh1  reason: default package */
public final class rh1 extends wh1 {
    public final boolean C;

    public rh1(boolean z) {
        this.C = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh1) && this.C == ((rh1) obj).C;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.C);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("ShareScreen(isEnabled="), this.C, ")");
    }
}
