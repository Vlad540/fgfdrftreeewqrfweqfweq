package defpackage;

/* renamed from: b6b  reason: default package */
public final class b6b extends g6b {
    public final long b;

    public b6b(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6b) && this.b == ((b6b) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OpenAddSubscribersAndUpdateBackstack(id="), this.b, ")");
    }
}
