package defpackage;

/* renamed from: v7d  reason: default package */
public final class v7d extends h05 {
    public final String a;
    public final mge b;

    public v7d(String str, hge hge) {
        this.a = str;
        this.b = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7d)) {
            return false;
        }
        v7d v7d = (v7d) obj;
        return hhd.f(this.a, v7d.a) && hhd.f(this.b, v7d.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopyToClipboard(textToCopy=" + this.a + ", snackbarTitle=" + this.b + ")";
    }
}
