package defpackage;

/* renamed from: cff  reason: default package */
public final class cff extends u12 {
    public final long c;

    public cff(long j) {
        super(4, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cff) && this.c == ((cff) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChannelId(sourceId="), this.c, ")");
    }
}
