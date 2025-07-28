package defpackage;

/* renamed from: vfa  reason: default package */
public final class vfa extends t81 {
    public final mge b;
    public final int c;
    public final mge d = null;

    public vfa(int i, hge hge) {
        super(8);
        this.b = hge;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfa)) {
            return false;
        }
        vfa vfa = (vfa) obj;
        return hhd.f(this.b, vfa.b) && this.c == vfa.c && hhd.f(this.d, vfa.d);
    }

    public final int hashCode() {
        int d2 = c3d.d(this.c, this.b.hashCode() * 31, 31);
        mge mge = this.d;
        return d2 + (mge == null ? 0 : mge.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=" + this.d + ")";
    }
}
