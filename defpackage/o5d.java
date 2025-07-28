package defpackage;

/* renamed from: o5d  reason: default package */
public final class o5d implements r5d {
    public final long a;

    public o5d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5d) && this.a == ((o5d) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
