package defpackage;

/* renamed from: p8d  reason: default package */
public final class p8d extends t81 {
    public final long b;

    public p8d(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8d) && this.b == ((p8d) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("EditProfile(id="), this.b, ")");
    }
}
