package defpackage;

/* renamed from: cbb  reason: default package */
public final class cbb extends t81 {
    public final String b;

    public cbb(String str) {
        super(10);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbb) && hhd.f(this.b, ((cbb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ShareLink(link="), this.b, ")");
    }
}
