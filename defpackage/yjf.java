package defpackage;

/* renamed from: yjf  reason: default package */
public final class yjf extends akf {
    public final long a;

    public yjf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjf) && this.a == ((yjf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Completed(requestId="), this.a, ")");
    }
}
