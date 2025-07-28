package defpackage;

/* renamed from: fr8  reason: default package */
public final class fr8 {
    public final long a;

    public fr8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr8) && this.a == ((fr8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ControlInfo(pinnedMessageId="), this.a, ")");
    }
}
