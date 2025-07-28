package defpackage;

/* renamed from: kyb  reason: default package */
public final class kyb extends nyb {
    public final long a;
    public final long b;

    public kyb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyb)) {
            return false;
        }
        kyb kyb = (kyb) obj;
        return this.a == kyb.a && this.b == kyb.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedDownload(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return wn6.k(sb, this.b, ")");
    }
}
