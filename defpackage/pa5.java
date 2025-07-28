package defpackage;

/* renamed from: pa5  reason: default package */
public final class pa5 {
    public final long a;
    public final long b;

    public pa5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa5)) {
            return false;
        }
        pa5 pa5 = (pa5) obj;
        return this.a == pa5.a && this.b == pa5.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsRemovedEntry(chatId=");
        sb.append(this.a);
        sb.append(", messageId=");
        return wn6.k(sb, this.b, ")");
    }
}
