package defpackage;

/* renamed from: xue  reason: default package */
public final class xue implements zue {
    public final long a;

    public xue(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xue) && this.a == ((xue) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("InitialEvent(mark="), this.a, ")");
    }
}
