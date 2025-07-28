package defpackage;

/* renamed from: xve  reason: default package */
public final class xve {
    public final long a;
    public final long b;
    public long c;

    public /* synthetic */ xve(long j, long j2) {
        this(j, j2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xve)) {
            return false;
        }
        xve xve = (xve) obj;
        return this.a == xve.a && this.b == xve.b && this.c == xve.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.a;
        StringBuilder k = hr1.k(j2, "Chunk[", " -> ");
        k.append(j + j2);
        k.append(" (position: ");
        k.append(this.c + j2);
        k.append(")]");
        return k.toString();
    }

    public xve(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
