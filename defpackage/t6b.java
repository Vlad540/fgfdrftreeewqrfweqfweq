package defpackage;

import java.util.List;

/* renamed from: t6b  reason: default package */
public final class t6b implements v6b {
    public final mge a;
    public final mge b;
    public final List c;

    public t6b(mge mge, mge mge2, List list) {
        this.a = mge;
        this.b = mge2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6b)) {
            return false;
        }
        t6b t6b = (t6b) obj;
        return hhd.f(this.a, t6b.a) && hhd.f(this.b, t6b.b) && hhd.f(this.c, t6b.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mge mge = this.b;
        return this.c.hashCode() + ((hashCode + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return hr1.i(sb, this.c, ")");
    }
}
