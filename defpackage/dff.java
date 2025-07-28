package defpackage;

/* renamed from: dff  reason: default package */
public final class dff extends u12 {
    public final long c;

    public dff(long j) {
        super(3, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dff) && this.c == ((dff) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChatId(sourceId="), this.c, ")");
    }
}
