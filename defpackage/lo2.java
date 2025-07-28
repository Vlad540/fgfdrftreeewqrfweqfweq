package defpackage;

/* renamed from: lo2  reason: default package */
public final class lo2 extends t81 {
    public final long b;

    public lo2(long j) {
        super(1);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo2) && this.b == ((lo2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OpenAddSubscribersAndUpdateBackstack(chatId="), this.b, ")");
    }
}
