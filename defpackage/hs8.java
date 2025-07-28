package defpackage;

/* renamed from: hs8  reason: default package */
public final class hs8 extends js8 {
    public final long c;

    public hs8(long j) {
        super(j, 2);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs8) && this.c == ((hs8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("DialogBotId(botId="), this.c, ")");
    }
}
