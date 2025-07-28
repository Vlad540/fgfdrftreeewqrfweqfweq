package defpackage;

/* renamed from: akb  reason: default package */
public final class akb {
    public final l68 a;
    public final long b;
    public final long c;

    public akb(l68 l68, long j, long j2) {
        this.a = l68;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akb = (akb) obj;
        return this.b == akb.b && this.a.equals(akb.a) && this.c == akb.c;
    }

    public final int hashCode() {
        long j = this.b;
        int hashCode = this.a.hashCode();
        long j2 = this.c;
        return ((hashCode + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
