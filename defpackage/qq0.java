package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* renamed from: qq0  reason: default package */
public final class qq0 implements kz6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(xbc xbc, int i) {
        String a2 = xbc.a(xbc, "Retry-After");
        if (a2 == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(a2).matches()) {
            return Integer.valueOf(a2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final xbc a(e1c e1c) {
        f1c f1c;
        boolean z;
        int i;
        List list;
        iy1 iy1;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        e1c e1c2 = e1c;
        switch (this.a) {
            case 0:
                lac lac = (lac) e1c2.i;
                s86 a2 = lac.a();
                d8 d8Var = lac.e;
                if (d8Var != null) {
                    lg8 i2 = d8Var.i();
                    if (i2 != null) {
                        a2.l("Content-Type", i2.a);
                    }
                    long h = d8Var.h();
                    if (h != -1) {
                        a2.l("Content-Length", String.valueOf(h));
                        a2.n("Transfer-Encoding");
                    } else {
                        a2.l("Transfer-Encoding", "chunked");
                        a2.n("Content-Length");
                    }
                }
                ye6 ye6 = lac.d;
                String a3 = ye6.a("Host");
                boolean z2 = false;
                sm6 sm6 = lac.b;
                if (a3 == null) {
                    a2.l("Host", nze.v(sm6, false));
                }
                if (ye6.a("Connection") == null) {
                    a2.l("Connection", "Keep-Alive");
                }
                if (ye6.a("Accept-Encoding") == null && ye6.a("Range") == null) {
                    a2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                oa2 oa2 = (oa2) this.b;
                oa2.getClass();
                if (ye6.a("User-Agent") == null) {
                    a2.l("User-Agent", "okhttp/4.9.2");
                }
                xbc d = e1c2.d(a2.j());
                ye6 ye62 = d.Y;
                im6.b(oa2, sm6, ye62);
                wbc n = d.n();
                n.a = lac;
                if (z2) {
                    String a4 = ye62.a("Content-Encoding");
                    String str = null;
                    if (a4 == null) {
                        a4 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a4) && im6.a(d) && (f1c = d.Z) != null) {
                        dd6 dd6 = new dd6(f1c.S());
                        xe6 c = ye62.c();
                        c.m("Content-Encoding");
                        c.m("Content-Length");
                        n.f = c.h().c();
                        String a5 = ye62.a("Content-Type");
                        if (a5 != null) {
                            str = a5;
                        }
                        n.g = new f1c(str, -1, new v0c(dd6));
                    }
                }
                return n.a();
            case 1:
                lac lac2 = (lac) e1c2.i;
                Class<Object> cls = Object.class;
                String str2 = cls.cast(lac2.f.get(cls)) instanceof String ? (String) cls.cast(lac2.f.get(cls)) : "NO_TAG";
                long nanoTime = System.nanoTime();
                Locale locale = Locale.US;
                pd pdVar = (pd) e1c2.h;
                c1c c1c = pdVar != null ? (c1c) pdVar.b : null;
                String str3 = (String) this.b;
                udd.p(str3, "Sending request: url = " + lac2.b + ", tag = " + str2 + ", connection = " + c1c + ", headers = {" + lac2.d.toString().replace("\n", ", ") + "}", new Object[0]);
                try {
                    xbc d2 = e1c2.d(lac2);
                    long convert = TimeUnit.MILLISECONDS.convert(Math.abs(System.nanoTime() - nanoTime), TimeUnit.NANOSECONDS);
                    sm6 sm62 = d2.a.b;
                    int i3 = d2.o;
                    if (!(i3 == 307 || i3 == 308)) {
                        switch (i3) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                z = false;
                                break;
                        }
                    }
                    z = true;
                    String str4 = "Received response: url = " + sm62 + ", tag = " + str2 + ", code = " + i3 + ", isRedirect=" + z + ". Takes " + convert + "ms, headers = {" + d2.Y.toString().replace("\n", ", ") + "}";
                    if (d2.m()) {
                        udd.p(str3, str4, new Object[0]);
                    } else {
                        udd.s(str3, str4, (Throwable) null);
                    }
                    return d2;
                } catch (ClassCastException unused) {
                    throw new IOException("ClassCastException");
                }
            default:
                y0c y0c = (y0c) e1c2.f;
                boolean z3 = true;
                List list2 = hw4.a;
                xbc xbc = null;
                int i4 = 0;
                lac lac3 = (lac) e1c2.i;
                boolean z4 = true;
                while (y0c.x0 == null) {
                    synchronized (y0c) {
                        try {
                            if (!(y0c.z0 ^ z3)) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                            } else if (!(y0c.y0 ^ z3)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z4) {
                        d1c d1c = y0c.a;
                        sm6 sm63 = lac3.b;
                        boolean z5 = sm63.a;
                        qw9 qw9 = y0c.E0;
                        if (z5) {
                            SSLSocketFactory sSLSocketFactory2 = qw9.E0;
                            if (sSLSocketFactory2 != null) {
                                HostnameVerifier hostnameVerifier2 = qw9.I0;
                                iy1 = qw9.J0;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            iy1 = null;
                        }
                        list = list2;
                        i = i4;
                        y0c.Y = new n15(d1c, new ca(sm63.e, sm63.f, qw9.z0, qw9.D0, sSLSocketFactory, hostnameVerifier, iy1, qw9.C0, qw9.A0, qw9.H0, qw9.G0, qw9.B0), y0c);
                    } else {
                        list = list2;
                        i = i4;
                    }
                    try {
                        if (!y0c.B0) {
                            xbc d3 = e1c2.d(lac3);
                            if (xbc != null) {
                                wbc n2 = d3.n();
                                wbc n3 = xbc.n();
                                n3.g = null;
                                xbc a6 = n3.a();
                                if (a6.Z == null) {
                                    n2.j = a6;
                                    d3 = n2.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                            }
                            xbc = d3;
                            pd pdVar2 = y0c.x0;
                            lac3 = b(xbc, pdVar2);
                            if (lac3 == null) {
                                if (pdVar2 != null && pdVar2.a) {
                                    if (!y0c.w0) {
                                        y0c.w0 = true;
                                        y0c.c.j();
                                    } else {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                }
                                y0c.g(false);
                                return xbc;
                            }
                            f1c f1c2 = xbc.Z;
                            if (f1c2 != null) {
                                nze.c(f1c2);
                            }
                            i4 = i + 1;
                            if (i4 <= 20) {
                                y0c.g(true);
                                list2 = list;
                                z4 = true;
                                z3 = true;
                            } else {
                                throw new ProtocolException("Too many follow-up requests: " + i4);
                            }
                        } else {
                            throw new IOException("Canceled");
                        }
                    } catch (RouteException e) {
                        List list3 = list;
                        RouteException routeException = e;
                        if (c(routeException.a, y0c, lac3, false)) {
                            list2 = o23.j0(list3, routeException.b);
                            y0c.g(true);
                            z3 = true;
                            z4 = false;
                            i4 = i;
                        } else {
                            IOException iOException = routeException.b;
                            nze.z(iOException, list3);
                            throw iOException;
                        }
                    } catch (IOException e2) {
                        IOException iOException2 = e2;
                        if (c(iOException2, y0c, lac3, !(iOException2 instanceof ConnectionShutdownException))) {
                            list2 = o23.j0(list, iOException2);
                            y0c.g(true);
                            z3 = true;
                            i4 = i;
                            z4 = false;
                        } else {
                            nze.z(iOException2, list);
                            throw iOException2;
                        }
                    } catch (Throwable th2) {
                        y0c.g(true);
                        throw th2;
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = (defpackage.c1c) r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.lac b(defpackage.xbc r10, pd r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 == 0) goto L_0x000c
            java.lang.Object r1 = r11.b
            c1c r1 = (defpackage.c1c) r1
            if (r1 == 0) goto L_0x000c
            qgc r1 = r1.q
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            int r2 = r10.o
            lac r3 = r10.a
            java.lang.String r3 = r3.c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00bc
            if (r2 == r5) goto L_0x00bc
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00b2
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0083
            r11 = 503(0x1f7, float:7.05E-43)
            if (r2 == r11) goto L_0x006d
            r11 = 407(0x197, float:5.7E-43)
            if (r2 == r11) goto L_0x0051
            r11 = 408(0x198, float:5.72E-43)
            if (r2 == r11) goto L_0x0035
            switch(r2) {
                case 300: goto L_0x00bc;
                case 301: goto L_0x00bc;
                case 302: goto L_0x00bc;
                case 303: goto L_0x00bc;
                default: goto L_0x0034;
            }
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.Object r9 = r9.b
            qw9 r9 = (defpackage.qw9) r9
            boolean r9 = r9.Y
            if (r9 != 0) goto L_0x003e
            return r0
        L_0x003e:
            xbc r9 = r10.y0
            if (r9 == 0) goto L_0x0047
            int r9 = r9.o
            if (r9 != r11) goto L_0x0047
            return r0
        L_0x0047:
            int r9 = d(r10, r4)
            if (r9 <= 0) goto L_0x004e
            return r0
        L_0x004e:
            lac r9 = r10.a
            return r9
        L_0x0051:
            java.net.Proxy r10 = r1.b
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L_0x0065
            java.lang.Object r9 = r9.b
            qw9 r9 = (defpackage.qw9) r9
            y76 r9 = r9.C0
            r9.getClass()
            return r0
        L_0x0065:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r9.<init>(r10)
            throw r9
        L_0x006d:
            xbc r9 = r10.y0
            if (r9 == 0) goto L_0x0076
            int r9 = r9.o
            if (r9 != r11) goto L_0x0076
            return r0
        L_0x0076:
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r9 = d(r10, r9)
            if (r9 != 0) goto L_0x0082
            lac r9 = r10.a
            return r9
        L_0x0082:
            return r0
        L_0x0083:
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r9 = r11.X
            n15 r9 = (defpackage.n15) r9
            ca r9 = r9.h
            sm6 r9 = r9.a
            java.lang.String r9 = r9.e
            java.lang.Object r1 = r11.b
            c1c r1 = (defpackage.c1c) r1
            qgc r1 = r1.q
            ca r1 = r1.a
            sm6 r1 = r1.a
            java.lang.String r1 = r1.e
            boolean r9 = defpackage.hhd.f(r9, r1)
            r9 = r9 ^ r7
            if (r9 != 0) goto L_0x00a3
            goto L_0x00b1
        L_0x00a3:
            java.lang.Object r9 = r11.b
            c1c r9 = (defpackage.c1c) r9
            monitor-enter(r9)
            r9.j = r7     // Catch:{ all -> 0x00ae }
            monitor-exit(r9)
            lac r9 = r10.a
            return r9
        L_0x00ae:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ae }
            throw r10
        L_0x00b1:
            return r0
        L_0x00b2:
            java.lang.Object r9 = r9.b
            qw9 r9 = (defpackage.qw9) r9
            y76 r9 = r9.Z
            r9.getClass()
            return r0
        L_0x00bc:
            java.lang.Object r9 = r9.b
            qw9 r9 = (defpackage.qw9) r9
            boolean r11 = r9.w0
            if (r11 != 0) goto L_0x00c6
            goto L_0x0155
        L_0x00c6:
            java.lang.String r11 = "Location"
            ye6 r1 = r10.Y
            java.lang.String r11 = r1.a(r11)
            if (r11 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r11 = r0
        L_0x00d2:
            if (r11 == 0) goto L_0x0155
            lac r1 = r10.a
            sm6 r2 = r1.b
            r2.getClass()
            u93 r8 = new u93     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r8.j(r2, r11)     // Catch:{ IllegalArgumentException -> 0x00e4 }
            goto L_0x00e5
        L_0x00e4:
            r8 = r0
        L_0x00e5:
            if (r8 == 0) goto L_0x00ec
            sm6 r11 = r8.b()
            goto L_0x00ed
        L_0x00ec:
            r11 = r0
        L_0x00ed:
            if (r11 == 0) goto L_0x0155
            sm6 r2 = r1.b
            java.lang.String r2 = r2.b
            java.lang.String r8 = r11.b
            boolean r2 = defpackage.hhd.f(r8, r2)
            if (r2 != 0) goto L_0x0100
            boolean r9 = r9.x0
            if (r9 != 0) goto L_0x0100
            goto L_0x0155
        L_0x0100:
            s86 r9 = r1.a()
            boolean r2 = defpackage.ez3.S(r3)
            if (r2 == 0) goto L_0x0142
            java.lang.String r2 = "PROPFIND"
            boolean r8 = r3.equals(r2)
            int r10 = r10.o
            if (r8 != 0) goto L_0x0118
            if (r10 == r5) goto L_0x0118
            if (r10 != r6) goto L_0x0119
        L_0x0118:
            r4 = r7
        L_0x0119:
            boolean r2 = r3.equals(r2)
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x012a
            if (r10 == r5) goto L_0x012a
            if (r10 == r6) goto L_0x012a
            java.lang.String r10 = "GET"
            r9.m(r10, r0)
            goto L_0x0131
        L_0x012a:
            if (r4 == 0) goto L_0x012e
            d8 r0 = r1.e
        L_0x012e:
            r9.m(r3, r0)
        L_0x0131:
            if (r4 != 0) goto L_0x0142
            java.lang.String r10 = "Transfer-Encoding"
            r9.n(r10)
            java.lang.String r10 = "Content-Length"
            r9.n(r10)
            java.lang.String r10 = "Content-Type"
            r9.n(r10)
        L_0x0142:
            sm6 r10 = r1.b
            boolean r10 = defpackage.nze.a(r10, r11)
            if (r10 != 0) goto L_0x014f
            java.lang.String r10 = "Authorization"
            r9.n(r10)
        L_0x014f:
            r9.a = r11
            lac r0 = r9.j()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.b(xbc, pd):lac");
    }

    public boolean c(IOException iOException, y0c y0c, lac lac, boolean z) {
        boolean z2;
        ga0 ga0;
        c1c c1c;
        if (!((qw9) this.b).Y) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        n15 n15 = y0c.Y;
        int i = n15.c;
        if (i == 0 && n15.d == 0 && n15.e == 0) {
            z2 = false;
        } else {
            if (n15.f == null) {
                qgc qgc = null;
                if (i <= 1 && n15.d <= 1 && n15.e <= 0 && (c1c = n15.i.Z) != null) {
                    synchronized (c1c) {
                        if (c1c.k == 0) {
                            if (nze.a(c1c.q.a.a, n15.h.a)) {
                                qgc = c1c.q;
                            }
                        }
                    }
                }
                if (qgc != null) {
                    n15.f = qgc;
                } else {
                    cc4 cc4 = n15.a;
                    if ((cc4 == null || !cc4.e()) && (ga0 = n15.b) != null) {
                        z2 = ga0.c();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }
}
