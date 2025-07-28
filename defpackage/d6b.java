package defpackage;

import java.util.List;

/* renamed from: d6b  reason: default package */
public final class d6b extends g6b {
    public final mge b;
    public final mge c;
    public final List d;

    public d6b(hge hge, hge hge2, List list) {
        this.b = hge;
        this.c = hge2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6b)) {
            return false;
        }
        d6b d6b = (d6b) obj;
        return hhd.f(this.b, d6b.b) && hhd.f(this.c, d6b.c) && hhd.f(this.d, d6b.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        mge mge = this.c;
        return this.d.hashCode() + ((hashCode + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return hr1.i(sb, this.d, ")");
    }
}
