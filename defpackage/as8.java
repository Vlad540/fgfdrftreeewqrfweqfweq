package defpackage;

import java.util.List;

/* renamed from: as8  reason: default package */
public final class as8 {
    public final List a;
    public final yr8 b;
    public final ur8 c;
    public final long d;

    public as8(List list, yr8 yr8, ur8 ur8, long j) {
        this.a = list;
        this.b = yr8;
        this.c = ur8;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as8)) {
            return false;
        }
        as8 as8 = (as8) obj;
        return hhd.f(this.a, as8.a) && hhd.f(this.b, as8.b) && hhd.f(this.c, as8.c) && this.d == as8.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        yr8 yr8 = this.b;
        int hashCode2 = (hashCode + (yr8 == null ? 0 : yr8.hashCode())) * 31;
        ur8 ur8 = this.c;
        if (ur8 != null) {
            i = ur8.hashCode();
        }
        return Long.hashCode(this.d) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        return "MessageReactionsDetailedData(reactionEntries=" + this.a + ", reactionsInfo=" + this.b + ", yourReactionEntry=" + this.c + ", markerForNextQuery=" + this.d + ")";
    }
}
