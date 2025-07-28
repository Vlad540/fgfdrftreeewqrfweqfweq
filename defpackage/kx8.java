package defpackage;

/* renamed from: kx8  reason: default package */
public final class kx8 implements mx8 {
    public final long a;

    public kx8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kx8) && this.a == ((kx8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("SetEditedMessage(messageId="), this.a, ")");
    }
}
