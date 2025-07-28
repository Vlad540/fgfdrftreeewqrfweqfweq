package defpackage;

/* renamed from: ij8  reason: default package */
public final class ij8 implements kj8 {
    public final long a;

    public ij8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij8) && this.a == ((ij8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OnOwnerClicked(id="), this.a, ")");
    }
}
