package defpackage;

/* renamed from: vn0  reason: default package */
public final class vn0 implements wn0 {
    public final long a;

    public vn0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn0) && this.a == ((vn0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
