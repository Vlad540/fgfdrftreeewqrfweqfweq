package defpackage;

/* renamed from: tv3  reason: default package */
public final class tv3 implements vv3 {
    public final long a;

    public tv3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv3) && this.a == ((tv3) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Fail(requestId="), this.a, ")");
    }
}
