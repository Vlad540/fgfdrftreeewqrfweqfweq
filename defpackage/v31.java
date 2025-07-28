package defpackage;

/* renamed from: v31  reason: default package */
public final class v31 implements d41 {
    public final long a;

    public v31(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v31) && this.a == ((v31) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
