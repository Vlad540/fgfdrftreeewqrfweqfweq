package defpackage;

/* renamed from: bbb  reason: default package */
public final class bbb extends t81 {
    public final String b;

    public bbb(String str) {
        super(10);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbb) && hhd.f(this.b, ((bbb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("SendLink(link="), this.b, ")");
    }
}
