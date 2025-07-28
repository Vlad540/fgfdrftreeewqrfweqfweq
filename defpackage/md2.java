package defpackage;

/* renamed from: md2  reason: default package */
public final class md2 extends qd2 {
    public final long b;
    public final long c;

    public md2(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2 = (md2) obj;
        return this.b == md2.b && this.c == md2.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMessage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return wn6.k(sb, this.c, ")");
    }
}
