package defpackage;

import java.util.Set;

/* renamed from: ove  reason: default package */
public final class ove extends kh0 {
    public final boolean X;
    public final long b;
    public final long c;
    public final Set o;

    public ove(long j, long j2) {
        this(j, j2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ove)) {
            return false;
        }
        ove ove = (ove) obj;
        return this.b == ove.b && this.c == ove.c && hhd.f(this.o, ove.o) && this.X == ove.X;
    }

    public final int hashCode() {
        int m = sxe.m(Long.hashCode(this.b) * 31, 31, this.c);
        return Boolean.hashCode(this.X) + ((this.o.hashCode() + m) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateMessageEvent(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", reactionsToAnimate=");
        sb.append(this.o);
        sb.append(", reactionsChanged=");
        return hr1.j(sb, this.X, ")");
    }

    public /* synthetic */ ove(long j, long j2, int i) {
        this(j, j2, qw4.a, false);
    }

    public ove(long j, long j2, Set set, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = set;
        this.X = z;
    }
}
