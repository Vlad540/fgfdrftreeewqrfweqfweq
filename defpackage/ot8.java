package defpackage;

import java.util.Set;

/* renamed from: ot8  reason: default package */
public final class ot8 {
    public final Set a;
    public final Long b;
    public final boolean c;

    public ot8(Set set, Long l, boolean z) {
        this.a = set;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot8)) {
            return false;
        }
        ot8 ot8 = (ot8) obj;
        return hhd.f(this.a, ot8.a) && hhd.f(this.b, ot8.b) && this.c == ot8.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardIds(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        return hr1.j(sb, this.c, ")");
    }
}
