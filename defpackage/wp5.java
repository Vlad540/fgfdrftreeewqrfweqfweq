package defpackage;

/* renamed from: wp5  reason: default package */
public final class wp5 implements pg7 {
    public final mge a;
    public final boolean b;
    public final int c;

    public /* synthetic */ wp5(lge lge, boolean z) {
        this(lge, z, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp5)) {
            return false;
        }
        wp5 wp5 = (wp5) obj;
        return hhd.f(this.a, wp5.a) && this.b == wp5.b && this.c == wp5.c;
    }

    public final long getItemId() {
        return Long.MAX_VALUE;
    }

    public final int hashCode() {
        mge mge = this.a;
        return Integer.hashCode(this.c) + th2.f((mge == null ? 0 : mge.hashCode()) * 31, 31, this.b);
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditNameInputItem(defaultValue=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", nameLengthLimit=");
        return wn6.j(sb, this.c, ")");
    }

    public wp5(mge mge, boolean z, int i) {
        this.a = mge;
        this.b = z;
        this.c = i;
    }
}
