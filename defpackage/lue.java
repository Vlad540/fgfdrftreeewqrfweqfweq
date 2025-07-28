package defpackage;

/* renamed from: lue  reason: default package */
public final class lue {
    public final long a;

    public lue(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lue) && this.a == ((lue) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("UnknownContactState(contactId="), this.a, ")");
    }
}
