package defpackage;

/* renamed from: ru  reason: default package */
public final class ru extends uu {
    public final long a;

    public ru(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru) && this.a == ((ru) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("LoadingAround(time="), this.a, ")");
    }
}
