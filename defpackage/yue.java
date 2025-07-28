package defpackage;

/* renamed from: yue  reason: default package */
public final class yue implements zue {
    public final long a;

    public yue(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yue) && this.a == ((yue) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("MarkAsUnreadEvent(mark="), this.a, ")");
    }
}
