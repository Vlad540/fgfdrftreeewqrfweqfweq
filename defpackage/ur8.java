package defpackage;

/* renamed from: ur8  reason: default package */
public final class ur8 {
    public final long a;
    public final ryb b;

    public ur8(long j, ryb ryb) {
        this.a = j;
        this.b = ryb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur8)) {
            return false;
        }
        ur8 ur8 = (ur8) obj;
        return this.a == ur8.a && hhd.f(this.b, ur8.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntryData(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
