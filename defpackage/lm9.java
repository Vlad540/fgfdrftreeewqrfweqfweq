package defpackage;

import java.util.Set;

/* renamed from: lm9  reason: default package */
public final class lm9 extends lbe {
    public final boolean X;
    public final j22 c;
    public final Set o;

    public lm9(j22 j22, Set set, boolean z) {
        this.c = j22;
        this.o = set;
        this.X = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm9)) {
            return false;
        }
        lm9 lm9 = (lm9) obj;
        return hhd.f(this.c, lm9.c) && hhd.f(this.o, lm9.o) && this.X == lm9.X;
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode();
        return Boolean.hashCode(this.X) + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chat=");
        sb.append(this.c);
        sb.append(", messageIds=");
        sb.append(this.o);
        sb.append(", isTtl=");
        return hr1.j(sb, this.X, ")");
    }
}
