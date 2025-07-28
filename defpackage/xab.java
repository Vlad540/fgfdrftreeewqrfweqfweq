package defpackage;

import java.util.List;

/* renamed from: xab  reason: default package */
public final class xab extends abb {
    public final mge a;
    public final mge b;
    public final List c;

    public xab(hge hge, hge hge2, List list) {
        this.a = hge;
        this.b = hge2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xab)) {
            return false;
        }
        xab xab = (xab) obj;
        return hhd.f(this.a, xab.a) && hhd.f(this.b, xab.b) && hhd.f(this.c, xab.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mge mge = this.b;
        return this.c.hashCode() + ((hashCode + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return hr1.i(sb, this.c, ")");
    }
}
