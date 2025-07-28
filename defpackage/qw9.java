package defpackage;

import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: qw9  reason: default package */
public final class qw9 implements Cloneable, ex0 {
    public static final List S0 = nze.k(vhb.HTTP_2, vhb.HTTP_1_1);
    public static final List T0 = nze.k(pd3.e, pd3.f);
    public final Proxy A0;
    public final ProxySelector B0;
    public final y76 C0;
    public final SocketFactory D0;
    public final SSLSocketFactory E0;
    public final X509TrustManager F0;
    public final List G0;
    public final List H0;
    public final HostnameVerifier I0;
    public final iy1 J0;
    public final n06 K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final long Q0;
    public final ea6 R0;
    public final k2e X;
    public final boolean Y;
    public final y76 Z;
    public final stf a;
    public final gvf b;
    public final List c;
    public final List o;
    public final boolean w0;
    public final boolean x0;
    public final oa2 y0;
    public final lu7 z0;

    public qw9(pw9 pw9) {
        ProxySelector proxySelector;
        this.a = pw9.a;
        this.b = pw9.b;
        this.c = nze.w(pw9.c);
        this.o = nze.w(pw9.d);
        this.X = pw9.e;
        this.Y = pw9.f;
        this.Z = pw9.g;
        this.w0 = pw9.h;
        this.x0 = pw9.i;
        this.y0 = pw9.j;
        this.z0 = pw9.k;
        Proxy proxy = pw9.l;
        this.A0 = proxy;
        if (proxy != null) {
            proxySelector = vr9.a;
        } else {
            proxySelector = pw9.m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = vr9.a;
            }
        }
        this.B0 = proxySelector;
        this.C0 = pw9.n;
        this.D0 = pw9.o;
        List list = pw9.r;
        this.G0 = list;
        this.H0 = pw9.s;
        this.I0 = pw9.t;
        this.L0 = pw9.w;
        this.M0 = pw9.x;
        this.N0 = pw9.y;
        this.O0 = pw9.z;
        this.P0 = pw9.A;
        this.Q0 = pw9.B;
        ea6 ea6 = pw9.C;
        this.R0 = ea6 == null ? new ea6(25) : ea6;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((pd3) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = pw9.p;
                    if (sSLSocketFactory != null) {
                        this.E0 = sSLSocketFactory;
                        n06 n06 = pw9.v;
                        this.K0 = n06;
                        this.F0 = pw9.q;
                        iy1 iy1 = pw9.u;
                        this.J0 = !hhd.f(iy1.b, n06) ? new iy1(iy1.a, n06) : iy1;
                    } else {
                        kxa kxa = kxa.a;
                        X509TrustManager m = kxa.a.m();
                        this.F0 = m;
                        this.E0 = kxa.a.l(m);
                        n06 b2 = kxa.a.b(m);
                        this.K0 = b2;
                        iy1 iy12 = pw9.u;
                        this.J0 = !hhd.f(iy12.b, b2) ? new iy1(iy12.a, b2) : iy12;
                    }
                }
            }
        }
        this.E0 = null;
        this.K0 = null;
        this.F0 = null;
        this.J0 = iy1.c;
        List list2 = this.c;
        if (list2 != null) {
            boolean z = true;
            if (!list2.contains((Object) null)) {
                List list3 = this.o;
                if (list3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                } else if (!list3.contains((Object) null)) {
                    List<pd3> list4 = this.G0;
                    boolean z2 = list4 instanceof Collection;
                    X509TrustManager x509TrustManager = this.F0;
                    n06 n062 = this.K0;
                    SSLSocketFactory sSLSocketFactory2 = this.E0;
                    if (!z2 || !list4.isEmpty()) {
                        for (pd3 pd3 : list4) {
                            if (pd3.a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null".toString());
                                } else if (n062 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                                } else if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null".toString());
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    if (!(sSLSocketFactory2 != null ? false : z)) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (n062 != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (!hhd.f(this.J0, iy1.c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                }
            } else {
                throw new IllegalStateException(("Null interceptor: " + list2).toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
    }

    public final pw9 a() {
        pw9 pw9 = new pw9();
        pw9.a = this.a;
        pw9.b = this.b;
        u23.K(this.c, pw9.c);
        u23.K(this.o, pw9.d);
        pw9.e = this.X;
        pw9.f = this.Y;
        pw9.g = this.Z;
        pw9.h = this.w0;
        pw9.i = this.x0;
        pw9.j = this.y0;
        pw9.k = this.z0;
        pw9.l = this.A0;
        pw9.m = this.B0;
        pw9.n = this.C0;
        pw9.o = this.D0;
        pw9.p = this.E0;
        pw9.q = this.F0;
        pw9.r = this.G0;
        pw9.s = this.H0;
        pw9.t = this.I0;
        pw9.u = this.J0;
        pw9.v = this.K0;
        pw9.w = this.L0;
        pw9.x = this.M0;
        pw9.y = this.N0;
        pw9.z = this.O0;
        pw9.A = this.P0;
        pw9.B = this.Q0;
        pw9.C = this.R0;
        return pw9;
    }

    public final y0c b(lac lac) {
        return new y0c(this, lac, false);
    }

    public final k1c c(lac lac, ple ple) {
        k1c k1c = new k1c(kee.h, lac, ple, new Random(), (long) this.P0, this.Q0);
        if (lac.d.a("Sec-WebSocket-Extensions") != null) {
            k1c.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
        } else {
            pw9 a2 = a();
            byte[] bArr = nze.a;
            a2.e = new k2e();
            ArrayList arrayList = new ArrayList(k1c.x);
            vhb vhb = vhb.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(vhb) && !arrayList.contains(vhb.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
            } else if (arrayList.contains(vhb) && arrayList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
            } else if (!(!arrayList.contains(vhb.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
            } else if (!arrayList.contains((Object) null)) {
                arrayList.remove(vhb.SPDY_3);
                if (!arrayList.equals(a2.s)) {
                    a2.C = null;
                }
                a2.s = Collections.unmodifiableList(arrayList);
                qw9 qw9 = new qw9(a2);
                s86 a3 = lac.a();
                ((xe6) a3.c).n("Upgrade", "websocket");
                ((xe6) a3.c).n("Connection", "Upgrade");
                ((xe6) a3.c).n("Sec-WebSocket-Key", k1c.a);
                ((xe6) a3.c).n("Sec-WebSocket-Version", "13");
                ((xe6) a3.c).n("Sec-WebSocket-Extensions", "permessage-deflate");
                lac j = a3.j();
                y0c y0c = new y0c(qw9, j, true);
                k1c.b = y0c;
                y0c.e(new j1c(k1c, 0, j));
            } else {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
        }
        return k1c;
    }

    public final Object clone() {
        return super.clone();
    }

    public qw9() {
        this(new pw9());
    }
}
