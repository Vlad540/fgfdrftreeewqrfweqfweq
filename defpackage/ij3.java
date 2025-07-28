package defpackage;

/* renamed from: ij3  reason: default package */
public final class ij3 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final ni3 e;

    public ij3(long j, long j2, int i, int i2, ni3 ni3) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = ni3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij3)) {
            return false;
        }
        ij3 ij3 = (ij3) obj;
        return this.a == ij3.a && this.b == ij3.b && this.c == ij3.c && this.d == ij3.d && hhd.f(this.e, ij3.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + c3d.d(this.d, c3d.d(this.c, sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "ContactEntity(id=" + this.a + ", serverId=" + this.b + ", presence=" + this.c + ", presenceType=" + this.d + ", contactData=" + this.e + ")";
    }
}
