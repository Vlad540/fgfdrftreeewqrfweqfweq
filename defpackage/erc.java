package defpackage;

/* renamed from: erc  reason: default package */
public final class erc implements grc {
    public final jh0 a;

    public erc(jh0 jh0) {
        this.a = jh0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erc) && hhd.f(this.a, ((erc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchError(event=" + this.a + ")";
    }
}
