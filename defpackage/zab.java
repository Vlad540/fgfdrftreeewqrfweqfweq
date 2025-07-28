package defpackage;

/* renamed from: zab  reason: default package */
public final class zab extends abb {
    public final mge a;
    public final int b;

    public zab(int i, hge hge) {
        this.a = hge;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zab)) {
            return false;
        }
        zab zab = (zab) obj;
        return hhd.f(this.a, zab.a) && this.b == zab.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
