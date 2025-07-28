package defpackage;

/* renamed from: fud  reason: default package */
public final class fud implements gud {
    public final int a;

    public fud(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fud) && this.a == ((fud) obj).a;
    }

    public final int hashCode() {
        return hr1.t(this.a);
    }

    public final String toString() {
        return "TypeChange(newType=" + c3d.r(this.a) + ")";
    }
}
