package defpackage;

import java.util.List;

/* renamed from: nwd  reason: default package */
public final class nwd {
    public final List a;
    public final boolean b;

    public nwd(int i, boolean z, List list) {
        list = (i & 1) != 0 ? null : list;
        z = (i & 2) != 0 ? false : z;
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwd)) {
            return false;
        }
        nwd nwd = (nwd) obj;
        return hhd.f(this.a, nwd.a) && this.b == nwd.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(sets=" + this.a + ", loading=" + this.b + ")";
    }
}
