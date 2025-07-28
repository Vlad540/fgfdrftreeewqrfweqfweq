package defpackage;

/* renamed from: lx8  reason: default package */
public final class lx8 implements mx8 {
    public final long a;

    public lx8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lx8) && this.a == ((lx8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("SetRepliedMessage(messageId="), this.a, ")");
    }
}
