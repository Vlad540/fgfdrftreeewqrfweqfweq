package defpackage;

/* renamed from: gs8  reason: default package */
public final class gs8 extends js8 {
    public final long c;

    public gs8(long j) {
        super(j, 3);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs8) && this.c == ((gs8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChatId(chatId="), this.c, ")");
    }
}
