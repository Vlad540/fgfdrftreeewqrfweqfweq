package defpackage;

/* renamed from: gc2  reason: default package */
public final class gc2 implements ic2 {
    public final long a;

    public gc2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc2) && this.a == ((gc2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Update(messageId="), this.a, ")");
    }
}
