package defpackage;

/* renamed from: yeb  reason: default package */
public final class yeb extends cfb {
    public final mge a;

    public yeb(int i, hge hge) {
        this.a = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeb)) {
            return false;
        }
        if (!hhd.f(this.a, ((yeb) obj).a)) {
            return false;
        }
        int i = zhc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(zhc.v0) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowInfoSnackbar(title=");
        sb.append(this.a);
        sb.append(", iconRes=");
        return wn6.j(sb, zhc.v0, ")");
    }
}
