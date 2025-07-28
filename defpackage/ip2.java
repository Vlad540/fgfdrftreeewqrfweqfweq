package defpackage;

/* renamed from: ip2  reason: default package */
public final class ip2 {
    public final long a;
    public final CharSequence b;

    public ip2(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip2)) {
            return false;
        }
        ip2 ip2 = (ip2) obj;
        return this.a == ip2.a && hhd.f(this.b, ip2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChatTyping(chatId=" + this.a + ", typingText=" + this.b + ")";
    }
}
