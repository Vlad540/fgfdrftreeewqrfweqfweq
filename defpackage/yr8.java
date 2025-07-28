package defpackage;

import java.util.List;

/* renamed from: yr8  reason: default package */
public final class yr8 {
    public final List a;
    public final int b;
    public final yyb c;

    public yr8(List list, int i, yyb yyb) {
        this.a = list;
        this.b = i;
        this.c = yyb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr8)) {
            return false;
        }
        yr8 yr8 = (yr8) obj;
        return hhd.f(this.a, yr8.a) && this.b == yr8.b && hhd.f(this.c, yr8.c);
    }

    public final int hashCode() {
        int d = c3d.d(this.b, this.a.hashCode() * 31, 31);
        yyb yyb = this.c;
        return d + (yyb == null ? 0 : yyb.hashCode());
    }

    public final String toString() {
        return "MessageReactionsData(reactions=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
