package defpackage;

/* renamed from: q8d  reason: default package */
public final class q8d extends t81 {
    public final long b;

    public q8d(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8d) && this.b == ((q8d) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ProfileAvatars(id="), this.b, ")");
    }
}
