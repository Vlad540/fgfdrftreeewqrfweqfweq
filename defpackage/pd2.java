package defpackage;

import java.util.List;

/* renamed from: pd2  reason: default package */
public final class pd2 extends qd2 {
    public final rh8 b;
    public final mge c;
    public final mge d;
    public final List e;

    public pd2(rh8 rh8, mge mge, mge mge2, List list) {
        this.b = rh8;
        this.c = mge;
        this.d = mge2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd2)) {
            return false;
        }
        pd2 pd2 = (pd2) obj;
        return hhd.f(this.b, pd2.b) && hhd.f(this.c, pd2.c) && hhd.f(this.d, pd2.d) && hhd.f(this.e, pd2.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + c3d.e(c3d.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(model=" + this.b + ", title=" + this.c + ", description=" + this.d + ", actions=" + this.e + ")";
    }
}
