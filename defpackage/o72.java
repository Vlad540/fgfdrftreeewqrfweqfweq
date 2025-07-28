package defpackage;

/* renamed from: o72  reason: default package */
public final class o72 {
    public final long a;
    public final long b;
    public final o62 c;
    public final long d;
    public final long e;
    public final long f;

    public o72(long j, long j2, o62 o62, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = o62;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o72)) {
            return false;
        }
        o72 o72 = (o72) obj;
        return this.a == o72.a && this.b == o72.b && hhd.f(this.c, o72.c) && this.d == o72.d && this.e == o72.e && this.f == o72.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + sxe.m(sxe.m((this.c.hashCode() + sxe.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", chatData=");
        sb.append(this.c);
        sb.append(", favouriteIndex=");
        sb.append(this.d);
        sb.append(", sortTime=");
        sb.append(this.e);
        sb.append(", cid=");
        return wn6.k(sb, this.f, ")");
    }
}
