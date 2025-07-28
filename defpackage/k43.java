package defpackage;

/* renamed from: k43  reason: default package */
public final class k43 implements m43 {
    public final long a;

    public k43(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k43) && this.a == ((k43) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Add(chatId="), this.a, ")");
    }
}
