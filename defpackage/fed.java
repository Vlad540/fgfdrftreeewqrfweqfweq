package defpackage;

/* renamed from: fed  reason: default package */
public final class fed implements zw8 {
    public final long a;

    public fed(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fed) && this.a == ((fed) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ShowEditMessage(messageId="), this.a, ")");
    }
}
