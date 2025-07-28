package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: qgc  reason: default package */
public final class qgc {
    public final ca a;
    public final Proxy b;
    public final InetSocketAddress c;

    public qgc(ca caVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = caVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qgc) {
            qgc qgc = (qgc) obj;
            return hhd.f(qgc.a, this.a) && hhd.f(qgc.b, this.b) && hhd.f(qgc.c, this.c);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
