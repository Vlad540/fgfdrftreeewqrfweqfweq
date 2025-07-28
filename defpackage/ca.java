package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: ca  reason: default package */
public final class ca {
    public final sm6 a;
    public final List b;
    public final List c;
    public final lu7 d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final iy1 h;
    public final y76 i;
    public final Proxy j;
    public final ProxySelector k;

    public ca(String str, int i2, lu7 lu7, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, iy1 iy1, y76 y76, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        this.d = lu7;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = iy1;
        this.i = y76;
        this.j = proxy;
        this.k = proxySelector;
        u93 u93 = new u93();
        u93.m(sSLSocketFactory != null ? "https" : "http");
        u93.h(str);
        u93.k(i2);
        this.a = u93.b();
        this.b = nze.w(list);
        this.c = nze.w(list2);
    }

    public final boolean a(ca caVar) {
        return hhd.f(this.d, caVar.d) && hhd.f(this.i, caVar.i) && hhd.f(this.b, caVar.b) && hhd.f(this.c, caVar.c) && hhd.f(this.k, caVar.k) && hhd.f(this.j, caVar.j) && hhd.f(this.f, caVar.f) && hhd.f(this.g, caVar.g) && hhd.f(this.h, caVar.h) && this.a.f == caVar.a.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ca) {
            ca caVar = (ca) obj;
            return hhd.f(this.a, caVar.a) && a(caVar);
        }
    }

    public final int hashCode() {
        int d2 = me4.d(527, 31, this.a.i);
        int hashCode = this.i.hashCode();
        int f2 = c3d.f(this.c, c3d.f(this.b, (hashCode + ((this.d.hashCode() + d2) * 31)) * 31, 31), 31);
        int hashCode2 = Objects.hashCode(this.j);
        int hashCode3 = Objects.hashCode(this.f);
        int hashCode4 = Objects.hashCode(this.g);
        return Objects.hashCode(this.h) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((this.k.hashCode() + f2) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        sm6 sm6 = this.a;
        sb.append(sm6.e);
        sb.append(':');
        sb.append(sm6.f);
        sb.append(", ");
        Proxy proxy = this.j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.k;
        }
        return wn6.l(sb, str, "}");
    }
}
