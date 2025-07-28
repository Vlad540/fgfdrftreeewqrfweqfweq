package defpackage;

import java.util.List;

/* renamed from: d9b  reason: default package */
public final class d9b extends t81 {
    public final mge b;
    public final mge c;
    public final List d;

    public d9b(mge mge, mge mge2, List list) {
        super(9);
        this.b = mge;
        this.c = mge2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9b)) {
            return false;
        }
        d9b d9b = (d9b) obj;
        return hhd.f(this.b, d9b.b) && hhd.f(this.c, d9b.c) && hhd.f(this.d, d9b.d);
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
