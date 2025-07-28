package defpackage;

/* renamed from: ied  reason: default package */
public final class ied implements zw8 {
    public final long a;

    public ied(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ied) && this.a == ((ied) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ShowReply(messageId="), this.a, ")");
    }
}
