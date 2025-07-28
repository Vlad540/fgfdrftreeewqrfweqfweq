package defpackage;

/* renamed from: h61  reason: default package */
public final class h61 implements i61 {
    public final long a;

    public h61(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h61) && this.a == ((h61) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
