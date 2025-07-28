package defpackage;

/* renamed from: udb  reason: default package */
public final class udb extends t81 {
    public final long b;
    public final r6b c;
    public final boolean d;
    public final String e;

    public udb(long j, r6b r6b, boolean z, String str) {
        super(11);
        this.b = j;
        this.c = r6b;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udb)) {
            return false;
        }
        udb udb = (udb) obj;
        return this.b == udb.b && this.c == udb.c && this.d == udb.d && hhd.f(this.e, udb.e);
    }

    public final int hashCode() {
        int f = th2.f((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        String str = this.e;
        return f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OpenCall(id=" + this.b + ", type=" + this.c + ", isVideo=" + this.d + ", joinLink=" + this.e + ")";
    }
}
