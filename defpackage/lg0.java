package defpackage;

/* renamed from: lg0  reason: default package */
public final class lg0 {
    public final long a;
    public final uae b;

    public lg0(long j, uae uae) {
        this.a = j;
        this.b = uae;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg0)) {
            return false;
        }
        lg0 lg0 = (lg0) obj;
        return this.a == lg0.a && hhd.f(this.b, lg0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BaseError(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
