package defpackage;

/* renamed from: is8  reason: default package */
public final class is8 extends js8 {
    public final long c;

    public is8(long j) {
        super(j, 1);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is8) && this.c == ((is8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("DialogUserId(contactId="), this.c, ")");
    }
}
