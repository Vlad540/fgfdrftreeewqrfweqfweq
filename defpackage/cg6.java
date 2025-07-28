package defpackage;

import java.util.List;

/* renamed from: cg6  reason: default package */
public final class cg6 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;

    public cg6(long j, long j2, long j3, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg6)) {
            return false;
        }
        cg6 cg6 = (cg6) obj;
        return this.a == cg6.a && this.b == cg6.b && this.c == cg6.c && hhd.f(this.d, cg6.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightMessage(ts=");
        sb.append(this.a);
        sb.append(", localId=");
        sb.append(this.b);
        sb.append(", serverId=");
        sb.append(this.c);
        sb.append(", highlight=");
        return hr1.i(sb, this.d, ")");
    }
}
