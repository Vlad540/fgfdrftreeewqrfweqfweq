package defpackage;

/* renamed from: y8b  reason: default package */
public final class y8b extends t81 {
    public final long b;

    public y8b(long j) {
        super(9);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8b) && this.b == ((y8b) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OpenChat(chatId="), this.b, ")");
    }
}
