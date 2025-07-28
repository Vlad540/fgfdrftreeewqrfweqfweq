package defpackage;

/* renamed from: fb5  reason: default package */
public final class fb5 {
    public final long a;
    public final long b;

    public fb5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5 = (fb5) obj;
        return this.a == fb5.a && this.b == fb5.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmNotificationHistoryDb(chatServerId=");
        sb.append(this.a);
        sb.append(", lastNotifyMessageId=");
        return wn6.k(sb, this.b, ")");
    }
}
