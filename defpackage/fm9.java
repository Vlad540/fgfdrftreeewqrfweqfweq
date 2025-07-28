package defpackage;

import java.util.Set;

/* renamed from: fm9  reason: default package */
public final class fm9 extends lbe {
    public final int X;
    public final ym8 Y;
    public final Set Z;
    public final long c;
    public final long o;

    public fm9(long j, long j2, int i, ym8 ym8, Set set) {
        this.c = j;
        this.o = j2;
        this.X = i;
        this.Y = ym8;
        this.Z = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm9)) {
            return false;
        }
        fm9 fm9 = (fm9) obj;
        return this.c == fm9.c && this.o == fm9.o && this.X == fm9.X && hhd.f(this.Y, fm9.Y) && hhd.f(this.Z, fm9.Z);
    }

    public final int hashCode() {
        int h = us8.h(this.X, sxe.m(Long.hashCode(this.c) * 31, 31, this.o), 31);
        ym8 ym8 = this.Y;
        return this.Z.hashCode() + ((h + (ym8 == null ? 0 : ym8.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", userId=");
        sb.append(this.o);
        sb.append(", updateType=");
        int i = this.X;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "FIRE_SUCCESS" : "DELETED" : "EDITED" : "CREATED");
        sb.append(", message=");
        sb.append(this.Y);
        sb.append(", messageIds=");
        sb.append(this.Z);
        sb.append(")");
        return sb.toString();
    }
}
