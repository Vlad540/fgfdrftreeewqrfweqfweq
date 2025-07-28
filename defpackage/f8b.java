package defpackage;

/* renamed from: f8b  reason: default package */
public final class f8b implements j8b {
    public final long a;

    public f8b(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8b) && this.a == ((f8b) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChatUpdate(requestId="), this.a, ")");
    }
}
