package defpackage;

/* renamed from: vdb  reason: default package */
public final class vdb extends t81 {
    public final long b;
    public final r6b c;

    public vdb(long j, r6b r6b) {
        super(11);
        this.b = j;
        this.c = r6b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdb)) {
            return false;
        }
        vdb vdb = (vdb) obj;
        return this.b == vdb.b && this.c == vdb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenChat(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
