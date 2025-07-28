package defpackage;

/* renamed from: xjf  reason: default package */
public final class xjf extends akf {
    public final long a;

    public xjf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjf) && this.a == ((xjf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Cancelled(requestId="), this.a, ")");
    }
}
