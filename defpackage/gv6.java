package defpackage;

/* renamed from: gv6  reason: default package */
public final class gv6 extends kh0 {
    public final md4 X;
    public final boolean Y;
    public final long Z;
    public final long b;
    public final long c;
    public final boolean o;

    public gv6(long j, long j2, boolean z, md4 md4, boolean z2, long j3) {
        this.b = j;
        this.c = j2;
        this.o = z;
        this.X = md4;
        this.Y = z2;
        this.Z = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv6)) {
            return false;
        }
        gv6 gv6 = (gv6) obj;
        return this.b == gv6.b && this.c == gv6.c && this.o == gv6.o && this.X == gv6.X && this.Y == gv6.Y && this.Z == gv6.Z;
    }

    public final int hashCode() {
        return Long.hashCode(this.Z) + th2.f((this.X.hashCode() + th2.f(sxe.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o)) * 31, 31, this.Y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingMessageEvent(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", isInvisiblePush=");
        sb.append(this.o);
        sb.append(", itemType=");
        sb.append(this.X);
        sb.append(", isControl=");
        sb.append(this.Y);
        sb.append(", sender=");
        return wn6.k(sb, this.Z, ")");
    }
}
