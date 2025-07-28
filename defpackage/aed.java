package defpackage;

/* renamed from: aed  reason: default package */
public final class aed extends oq2 {
    public final mge a;
    public final u16 b;

    public aed(hge hge, u16 u16) {
        this.a = hge;
        this.b = u16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aed)) {
            return false;
        }
        aed aed = (aed) obj;
        return hhd.f(this.a, aed.a) && hhd.f(this.b, aed.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancelableSnackbar(text=" + this.a + ", cancelAction=" + this.b + ")";
    }
}
