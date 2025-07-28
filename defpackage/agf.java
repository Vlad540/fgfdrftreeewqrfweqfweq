package defpackage;

import java.util.List;

/* renamed from: agf  reason: default package */
public final class agf implements cgf {
    public final mge a;
    public final mge b;
    public final List c;

    public agf(int i, hge hge, mge mge, List list) {
        this.a = hge;
        this.b = mge;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agf)) {
            return false;
        }
        agf agf = (agf) obj;
        agf.getClass();
        int i = phc.a;
        return hhd.f(this.a, agf.a) && hhd.f(this.b, agf.b) && hhd.f(this.c, agf.c);
    }

    public final int hashCode() {
        int e = c3d.e(Integer.hashCode(phc.B) * 31, 31, this.a);
        mge mge = this.b;
        return this.c.hashCode() + ((e + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestBiometryAccess(icon=");
        sb.append(phc.B);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return hr1.i(sb, this.c, ")");
    }
}
