package defpackage;

import java.util.List;

/* renamed from: hq2  reason: default package */
public final class hq2 {
    public static final hq2 c = new hq2(hw4.a, true);
    public final List a;
    public final boolean b;

    public hq2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq2)) {
            return false;
        }
        hq2 hq2 = (hq2) obj;
        return hhd.f(this.a, hq2.a) && this.b == hq2.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatsList(chats=" + this.a + ", hasMore=" + this.b + ")";
    }
}
