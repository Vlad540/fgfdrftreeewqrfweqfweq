package defpackage;

/* renamed from: l43  reason: default package */
public final class l43 implements m43 {
    public final long a;

    public l43(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l43) && this.a == ((l43) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Remove(chatId="), this.a, ")");
    }
}
