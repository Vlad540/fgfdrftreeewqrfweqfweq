package defpackage;

/* renamed from: bed  reason: default package */
public final class bed extends jk3 {
    public final mge a;
    public final u16 b;

    public bed(hge hge, u16 u16) {
        this.a = hge;
        this.b = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bed)) {
            return false;
        }
        bed bed = (bed) obj;
        return hhd.f(this.a, bed.a) && hhd.f(this.b, bed.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", dismissListener=" + this.b + ")";
    }
}
