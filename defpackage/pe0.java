package defpackage;

/* renamed from: pe0  reason: default package */
public final class pe0 {
    public static final pe0 e = new pe0((iw0) null, (cac) null, new oe0(false, false), new ne0(false, false));
    public final iw0 a;
    public final cac b;
    public final oe0 c;
    public final ne0 d;

    public pe0(iw0 iw0, cac cac, oe0 oe0, ne0 ne0) {
        this.a = iw0;
        this.b = cac;
        this.c = oe0;
        this.d = ne0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe0)) {
            return false;
        }
        pe0 pe0 = (pe0) obj;
        return hhd.f(this.a, pe0.a) && hhd.f(this.b, pe0.b) && hhd.f(this.c, pe0.c) && hhd.f(this.d, pe0.d);
    }

    public final int hashCode() {
        int i = 0;
        iw0 iw0 = this.a;
        int hashCode = (iw0 == null ? 0 : iw0.hashCode()) * 31;
        cac cac = this.b;
        if (cac != null) {
            i = cac.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=" + this.a + ", reportNetworkStatusConfig=" + this.b + ", signalingConfig=" + this.c + ", debugLoggingConfig=" + this.d + ")";
    }
}
