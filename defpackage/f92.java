package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: f92  reason: default package */
public final class f92 extends lbe {
    public final Set X;
    public final List c;
    public final j22 o;

    public f92(List list, j22 j22, LinkedHashSet linkedHashSet) {
        this.c = list;
        this.o = j22;
        this.X = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f92)) {
            return false;
        }
        f92 f92 = (f92) obj;
        return hhd.f(this.c, f92.c) && hhd.f(this.o, f92.o) && hhd.f(this.X, f92.X);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        j22 j22 = this.o;
        return this.X.hashCode() + ((hashCode + (j22 == null ? 0 : j22.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistory.Response(messages=");
        sb.append(o23.c0(this.c, ",", "[", "]", new hd1(7), 24));
        sb.append(", chat=");
        sb.append(this.o);
        if (this.c.isEmpty()) {
            sb.append(", messageIds=");
            sb.append(this.X);
        }
        sb.append(")");
        return sb.toString();
    }
}
