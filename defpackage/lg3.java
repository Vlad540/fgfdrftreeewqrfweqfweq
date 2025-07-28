package defpackage;

/* renamed from: lg3  reason: default package */
public final class lg3 implements ng3 {
    public final long a;

    public lg3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg3) && this.a == ((lg3) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Id(id="), this.a, ")");
    }
}
