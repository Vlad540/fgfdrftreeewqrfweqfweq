package defpackage;

/* renamed from: jp9  reason: default package */
public final class jp9 {
    public final long a;
    public final long b;

    public jp9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp9)) {
            return false;
        }
        jp9 jp9 = (jp9) obj;
        return this.a == jp9.a && this.b == jp9.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationReadMarkDb(chatServerId=");
        sb.append(this.a);
        sb.append(", mark=");
        return wn6.k(sb, this.b, ")");
    }
}
