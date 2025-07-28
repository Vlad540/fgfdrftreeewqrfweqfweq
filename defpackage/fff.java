package defpackage;

/* renamed from: fff  reason: default package */
public final class fff extends u12 {
    public final long c;

    public fff(long j) {
        super(1, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fff) && this.c == ((fff) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("DialogUserId(sourceId="), this.c, ")");
    }
}
