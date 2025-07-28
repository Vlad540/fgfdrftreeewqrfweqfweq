package defpackage;

/* renamed from: a7b  reason: default package */
public final class a7b extends sg9 {
    public final long b;

    public a7b(long j) {
        super(jue.a);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7b) && this.b == ((a7b) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("BackToChat(chatId="), this.b, ")");
    }
}
