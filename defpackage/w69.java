package defpackage;

/* renamed from: w69  reason: default package */
public final class w69 {
    public final long a;

    public w69(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w69) && this.a == ((w69) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("MovieId(id="), this.a, ")");
    }
}
