package defpackage;

/* renamed from: yga  reason: default package */
public final class yga extends kh0 {
    public final String X;
    public final long Y;
    public final md4 Z;
    public final long b;
    public final long c;
    public final long o;

    public yga(long j, long j2, long j3, String str, long j4, md4 md4) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = str;
        this.Y = j4;
        this.Z = md4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yga)) {
            return false;
        }
        yga yga = (yga) obj;
        return this.b == yga.b && this.c == yga.c && this.o == yga.o && hhd.f(this.X, yga.X) && this.Y == yga.Y && this.Z == yga.Z;
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
        String str = this.X;
        return this.Z.hashCode() + sxe.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.Y);
    }

    public final String toString() {
        return "OutgoingMessageEvent(chatId=" + this.b + ", cid=" + this.c + ", messageId=" + this.o + ", tag=" + this.X + ", sender=" + this.Y + ", itemType=" + this.Z + ")";
    }
}
