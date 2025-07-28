package defpackage;

/* renamed from: iqa  reason: default package */
public final class iqa implements jqa {
    public final long a;

    public iqa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqa) && this.a == ((iqa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Success(requestId="), this.a, ")");
    }
}
