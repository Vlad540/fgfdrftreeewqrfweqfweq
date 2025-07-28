package defpackage;

/* renamed from: fkf  reason: default package */
public final class fkf extends gkf {
    public final String a;

    public fkf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkf) && hhd.f(this.a, ((fkf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("OpenLinkExternal(url="), this.a, ")");
    }
}
