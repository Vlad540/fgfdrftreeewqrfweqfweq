package defpackage;

/* renamed from: wdb  reason: default package */
public final class wdb extends t81 {
    public final String b;

    public wdb(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdb) && hhd.f(this.b, ((wdb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("OpenExternalLink(link="), this.b, ")");
    }
}
