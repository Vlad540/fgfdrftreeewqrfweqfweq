package defpackage;

import java.util.List;

/* renamed from: ced  reason: default package */
public final class ced extends jk3 {
    public final long a;
    public final mge b;
    public final mge c;
    public final List d;

    public ced(long j, mge mge, hge hge, List list) {
        this.a = j;
        this.b = mge;
        this.c = hge;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ced)) {
            return false;
        }
        ced ced = (ced) obj;
        return this.a == ced.a && hhd.f(this.b, ced.b) && hhd.f(this.c, ced.c) && hhd.f(this.d, ced.d);
    }

    public final int hashCode() {
        int e = c3d.e(Long.hashCode(this.a) * 31, 31, this.b);
        mge mge = this.c;
        return this.d.hashCode() + ((e + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(contactServerId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
