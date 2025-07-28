package defpackage;

/* renamed from: sdb  reason: default package */
public final class sdb extends t81 {
    public final String b;

    public sdb(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdb) && hhd.f(this.b, ((sdb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ExternalCallback(params="), this.b, ")");
    }
}
