package defpackage;

/* renamed from: ia2  reason: default package */
public final class ia2 {
    public final long a;
    public final yb9 b;

    public ia2(long j, yb9 yb9) {
        this.a = j;
        this.b = yb9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia2)) {
            return false;
        }
        ia2 ia2 = (ia2) obj;
        return this.a == ia2.a && hhd.f(this.b, ia2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TypingCacheKey(chatId=" + this.a + ", notifs=" + this.b + ")";
    }
}
