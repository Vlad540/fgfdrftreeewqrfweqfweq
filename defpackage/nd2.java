package defpackage;

/* renamed from: nd2  reason: default package */
public final class nd2 extends qd2 {
    public final Long b;
    public final long c;
    public final boolean d;

    public nd2(Long l, long j, boolean z) {
        this.b = l;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd2)) {
            return false;
        }
        nd2 nd2 = (nd2) obj;
        return hhd.f(this.b, nd2.b) && this.c == nd2.c && this.d == nd2.d;
    }

    public final int hashCode() {
        Long l = this.b;
        return Boolean.hashCode(this.d) + sxe.m((l == null ? 0 : l.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttach(attachId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", isForwardAttach=");
        return hr1.j(sb, this.d, ")");
    }
}
