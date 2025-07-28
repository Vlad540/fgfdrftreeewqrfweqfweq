package defpackage;

import java.util.List;

/* renamed from: d53  reason: default package */
public final class d53 implements i53 {
    public final List a;
    public final boolean b;
    public final Long c;

    public d53(Long l, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = l;
    }

    public static d53 a(d53 d53, List list, int i) {
        boolean z = (i & 2) != 0 ? d53.b : false;
        Long l = d53.c;
        d53.getClass();
        return new d53(l, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d53)) {
            return false;
        }
        d53 d53 = (d53) obj;
        return hhd.f(this.a, d53.a) && this.b == d53.b && hhd.f(this.c, d53.c);
    }

    public final int hashCode() {
        int f = th2.f(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return f + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Result(items=" + this.a + ", hasMore=" + this.b + ", marker=" + this.c + ")";
    }
}
