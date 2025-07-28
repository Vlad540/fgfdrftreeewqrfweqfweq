package defpackage;

/* renamed from: rdb  reason: default package */
public final class rdb extends t81 {
    public final long b;
    public final r6b c;

    public rdb(long j, r6b r6b) {
        super(11);
        this.b = j;
        this.c = r6b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdb)) {
            return false;
        }
        rdb rdb = (rdb) obj;
        return this.b == rdb.b && this.c == rdb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EditProfile(id=" + this.b + ", type=" + this.c + ")";
    }
}
