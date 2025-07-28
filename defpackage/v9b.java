package defpackage;

/* renamed from: v9b  reason: default package */
public final class v9b {
    public final mge a;
    public final int b;
    public final iba c;

    public v9b(hge hge, int i, zx1 zx1) {
        this.a = hge;
        this.b = i;
        this.c = zx1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9b)) {
            return false;
        }
        v9b v9b = (v9b) obj;
        return hhd.f(this.a, v9b.a) && this.b == v9b.b && hhd.f(this.c, v9b.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", bottomMargin=" + this.b + ", cancelAction=" + this.c + ")";
    }
}
