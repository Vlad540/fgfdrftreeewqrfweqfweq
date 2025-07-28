package defpackage;

/* renamed from: x8b  reason: default package */
public final class x8b extends t81 {
    public final long b;

    public x8b(long j) {
        super(9);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8b) && this.b == ((x8b) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("InviteByLink(id="), this.b, ")");
    }
}
