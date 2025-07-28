package defpackage;

/* renamed from: lyb  reason: default package */
public final class lyb extends nyb {
    public final long a;
    public final long b;

    public lyb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyb)) {
            return false;
        }
        lyb lyb = (lyb) obj;
        return this.a == lyb.a && this.b == lyb.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return wn6.k(sb, this.b, ")");
    }
}
