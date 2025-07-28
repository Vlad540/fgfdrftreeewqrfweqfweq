package defpackage;

/* renamed from: e5e  reason: default package */
public final class e5e extends kh0 {
    public final long b;

    public e5e(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5e) && this.b == ((e5e) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("SuspendBotEvent(chatId="), this.b, ")");
    }
}
