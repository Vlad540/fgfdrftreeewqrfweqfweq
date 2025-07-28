package defpackage;

/* renamed from: eff  reason: default package */
public final class eff extends u12 {
    public final long c;

    public eff(long j) {
        super(2, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eff) && this.c == ((eff) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("DialogBotId(sourceId="), this.c, ")");
    }
}
