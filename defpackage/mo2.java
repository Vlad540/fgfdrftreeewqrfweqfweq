package defpackage;

/* renamed from: mo2  reason: default package */
public final class mo2 extends t81 {
    public final long b;

    public mo2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo2) && this.b == ((mo2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OpenChangeChannelTypeAndUpdateBackstack(chatId="), this.b, ")");
    }
}
