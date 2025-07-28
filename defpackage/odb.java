package defpackage;

/* renamed from: odb  reason: default package */
public final class odb extends t81 {
    public final long b;

    public odb(long j) {
        super(11);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odb) && this.b == ((odb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChatAttaches(chatId="), this.b, ")");
    }
}
