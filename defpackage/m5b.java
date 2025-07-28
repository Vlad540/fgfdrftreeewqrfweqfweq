package defpackage;

/* renamed from: m5b  reason: default package */
public final class m5b extends kh0 {
    public final long b;
    public final long c;

    public m5b(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5b)) {
            return false;
        }
        m5b m5b = (m5b) obj;
        return this.b == m5b.b && this.c == m5b.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAvatarUpdatedEvent(requestId=");
        sb.append(this.b);
        sb.append(", photoId=");
        return wn6.k(sb, this.c, ")");
    }
}
