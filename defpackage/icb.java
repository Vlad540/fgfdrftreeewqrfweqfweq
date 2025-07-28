package defpackage;

/* renamed from: icb  reason: default package */
public final class icb extends mcb {
    public final long a;

    public icb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icb) && this.a == ((icb) obj).a;
    }

    public final long getItemId() {
        return (long) 4096;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final int l() {
        return 4096;
    }

    public final String toString() {
        return wn6.k(new StringBuilder("DebugProfileInfo(id="), this.a, ")");
    }
}
