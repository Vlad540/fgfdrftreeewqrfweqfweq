package defpackage;

import java.util.List;

/* renamed from: ag2  reason: default package */
public final class ag2 {
    public static final ag2 c = new ag2((List) null, 3, 0);
    public final List a;
    public final int b;

    public ag2(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag2)) {
            return false;
        }
        ag2 ag2 = (ag2) obj;
        return hhd.f(this.a, ag2.a) && this.b == ag2.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaState(items=" + this.a + ", initialPosition=" + this.b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag2(List list, int i, int i2) {
        this(-1, (i & 1) != 0 ? hw4.a : list);
    }
}
