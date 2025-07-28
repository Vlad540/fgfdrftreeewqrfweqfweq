package defpackage;

/* renamed from: ydb  reason: default package */
public final class ydb extends t81 {
    public final long b;

    public ydb(long j) {
        super(11);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ydb) && this.b == ((ydb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Search(chatId="), this.b, ")");
    }
}
