package defpackage;

/* renamed from: hqa  reason: default package */
public final class hqa implements jqa {
    public final long a;

    public hqa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqa) && this.a == ((hqa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Fail(requestId="), this.a, ")");
    }
}
