package defpackage;

/* renamed from: u8b  reason: default package */
public final class u8b extends t81 {
    public final long b;
    public final d8b c;

    public u8b(long j, d8b d8b) {
        super(9);
        this.b = j;
        this.c = d8b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8b)) {
            return false;
        }
        u8b u8b = (u8b) obj;
        return this.b == u8b.b && this.c == u8b.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChangeLink(id=" + this.b + ", type=" + this.c + ")";
    }
}
