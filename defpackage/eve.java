package defpackage;

/* renamed from: eve  reason: default package */
public final class eve {
    public final long a;
    public final jj7 b;
    public final int c;

    public eve(long j, jj7 jj7, int i) {
        this.a = j;
        this.b = jj7;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eve)) {
            return false;
        }
        eve eve = (eve) obj;
        return this.a == eve.a && hhd.f(this.b, eve.b) && this.c == eve.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        jj7 jj7 = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (jj7 == null ? 0 : jj7.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdateAttachesEntity(id=" + this.a + ", attaches=" + this.b + ", mediaType=" + this.c + ")";
    }
}
