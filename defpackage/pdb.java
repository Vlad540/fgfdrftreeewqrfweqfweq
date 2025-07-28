package defpackage;

/* renamed from: pdb  reason: default package */
public final class pdb extends t81 {
    public final long b;
    public final ch2 c;

    public pdb(long j, ch2 ch2) {
        super(11);
        this.b = j;
        this.c = ch2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdb)) {
            return false;
        }
        pdb pdb = (pdb) obj;
        return this.b == pdb.b && this.c == pdb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChatMembers(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
