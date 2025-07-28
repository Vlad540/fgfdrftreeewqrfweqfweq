package defpackage;

/* renamed from: tdb  reason: default package */
public final class tdb extends t81 {
    public final long b;

    public tdb(long j) {
        super(11);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdb) && this.b == ((tdb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("InviteByLink(chatId="), this.b, ")");
    }
}
