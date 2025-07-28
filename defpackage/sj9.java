package defpackage;

import java.util.Set;

/* renamed from: sj9  reason: default package */
public final class sj9 extends kh0 {
    public final long X;
    public final Set Y;
    public final long b;
    public final boolean c;
    public final long o;

    public sj9(long j, boolean z, long j2, long j3, Set set) {
        this.b = j;
        this.c = z;
        this.o = j2;
        this.X = j3;
        this.Y = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj9)) {
            return false;
        }
        sj9 sj9 = (sj9) obj;
        return this.b == sj9.b && this.c == sj9.c && this.o == sj9.o && this.X == sj9.X && hhd.f(this.Y, sj9.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + sxe.m(sxe.m(th2.f(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o), 31, this.X);
    }

    public final String toString() {
        return "NewReactionEvent(chatId=" + this.b + ", isOnSubscription=" + this.c + ", messageLocalId=" + this.o + ", messageTime=" + this.X + ", reactions=" + this.Y + ")";
    }
}
