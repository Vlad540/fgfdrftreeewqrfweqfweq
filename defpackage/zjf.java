package defpackage;

/* renamed from: zjf  reason: default package */
public final class zjf extends akf {
    public final long a;

    public zjf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjf) && this.a == ((zjf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
