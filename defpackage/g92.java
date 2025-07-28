package defpackage;

import java.util.List;

/* renamed from: g92  reason: default package */
public final class g92 extends kh0 {
    public final long X;
    public final int Y;
    public final md4 Z;
    public final long b;
    public final long c;
    public final long o;
    public final List w0;

    public g92(long j, long j2, long j3, long j4, int i, md4 md4, List list) {
        super(j);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = j4;
        this.Y = i;
        this.Z = md4;
        this.w0 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g92)) {
            return false;
        }
        g92 g92 = (g92) obj;
        return this.b == g92.b && this.c == g92.c && this.o == g92.o && this.X == g92.X && this.Y == g92.Y && this.Z == g92.Z && hhd.f(this.w0, g92.w0);
    }

    public final int hashCode() {
        int d = c3d.d(this.Y, sxe.m(sxe.m(sxe.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o), 31, this.X), 31);
        return this.w0.hashCode() + ((this.Z.hashCode() + d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEvent(requestId=");
        sb.append(this.b);
        sb.append(", chatId=");
        sb.append(this.c);
        sb.append(", startTime=");
        sb.append(this.o);
        sb.append(", endTime=");
        sb.append(this.X);
        sb.append(", count=");
        sb.append(this.Y);
        sb.append(", itemType=");
        sb.append(this.Z);
        sb.append(", messageIds=");
        return hr1.i(sb, this.w0, ")");
    }
}
