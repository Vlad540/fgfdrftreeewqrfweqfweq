package defpackage;

/* renamed from: no2  reason: default package */
public final class no2 extends t81 {
    public final long b;

    public no2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof no2) && this.b == ((no2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OpenChatAndUpdateBackstack(chatId="), this.b, ")");
    }
}
