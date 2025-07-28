package defpackage;

/* renamed from: fs8  reason: default package */
public final class fs8 extends js8 {
    public final long c;

    public fs8(long j) {
        super(j, 4);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs8) && this.c == ((fs8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ChannelId(channelId="), this.c, ")");
    }
}
