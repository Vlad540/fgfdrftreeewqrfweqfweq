package defpackage;

/* renamed from: nlf  reason: default package */
public final class nlf implements wlf {
    public final String a;

    public nlf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlf) && hhd.f(this.a, ((nlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("OpenLinkExternal(url="), this.a, ")");
    }
}
