package defpackage;

import java.util.List;

/* renamed from: ded  reason: default package */
public final class ded implements zw8 {
    public final List a;
    public final mge b;
    public final mge c;
    public final List d;

    public ded(List list, mge mge, hge hge, List list2) {
        this.a = list;
        this.b = mge;
        this.c = hge;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ded)) {
            return false;
        }
        ded ded = (ded) obj;
        return hhd.f(this.a, ded.a) && hhd.f(this.b, ded.b) && hhd.f(this.c, ded.c) && hhd.f(this.d, ded.d);
    }

    public final int hashCode() {
        int e = c3d.e(this.a.hashCode() * 31, 31, this.b);
        mge mge = this.c;
        return this.d.hashCode() + ((e + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(messageIds=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
