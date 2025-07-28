package defpackage;

/* renamed from: ifa  reason: default package */
public final class ifa extends sg9 {
    public final String b;

    public ifa(String str) {
        super(jue.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifa) && hhd.f(this.b, ((ifa) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("OpenExternalLink(url="), this.b, ")");
    }
}
