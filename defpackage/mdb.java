package defpackage;

/* renamed from: mdb  reason: default package */
public final class mdb extends t81 {
    public final long b;

    public mdb(long j) {
        super(11);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdb) && this.b == ((mdb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("AddToFolder(chatId="), this.b, ")");
    }
}
