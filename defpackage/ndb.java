package defpackage;

/* renamed from: ndb  reason: default package */
public final class ndb extends t81 {
    public final int b;

    public ndb(int i) {
        super(11);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndb) && this.b == ((ndb) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("CallByNumber(contactId="), this.b, ")");
    }
}
