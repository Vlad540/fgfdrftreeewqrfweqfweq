package defpackage;

/* renamed from: q42  reason: default package */
public final class q42 extends kh0 {
    public final long b;

    public q42(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q42) && this.b == ((q42) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChatClearEvent(chatId="), this.b, ")");
    }
}
