package defpackage;

/* renamed from: cc2  reason: default package */
public final class cc2 implements ic2 {
    public final long a;

    public cc2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc2) && this.a == ((cc2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Add(messageId="), this.a, ")");
    }
}
