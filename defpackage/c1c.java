package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c1c  reason: default package */
public final class c1c extends yk6 {
    public Socket b;
    public Socket c;
    public be6 d;
    public vhb e;
    public gl6 f;
    public v0c g;
    public u0c h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n = 1;
    public final ArrayList o = new ArrayList();
    public long p = Long.MAX_VALUE;
    public final qgc q;

    public c1c(qgc qgc) {
        this.q = qgc;
    }

    public static void d(qw9 qw9, qgc qgc, IOException iOException) {
        if (qgc.b.type() != Proxy.Type.DIRECT) {
            ca caVar = qgc.a;
            caVar.k.connectFailed(caVar.a.h(), qgc.b.address(), iOException);
        }
        ea6 ea6 = qw9.R0;
        synchronized (ea6) {
            ((LinkedHashSet) ea6.b).add(qgc);
        }
    }

    public final synchronized void a(y5d y5d) {
        this.n = (y5d.a & 16) != 0 ? y5d.b[4] : Integer.MAX_VALUE;
    }

    public final void b(nl6 nl6) {
        nl6.c(8, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r6, int r7, int r8, int r9, boolean r10, defpackage.y0c r11, defpackage.j06 r12) {
        /*
            r5 = this;
            vhb r11 = r5.e
            if (r11 != 0) goto L_0x0116
            qgc r11 = r5.q
            ca r11 = r11.a
            java.util.List r0 = r11.c
            qd3 r1 = new qd3
            r1.<init>(r0)
            javax.net.ssl.SSLSocketFactory r2 = r11.f
            if (r2 != 0) goto L_0x004e
            pd3 r11 = defpackage.pd3.f
            boolean r11 = r0.contains(r11)
            if (r11 == 0) goto L_0x0041
            qgc r11 = r5.q
            ca r11 = r11.a
            sm6 r11 = r11.a
            java.lang.String r11 = r11.e
            kxa r0 = defpackage.kxa.a
            kxa r0 = defpackage.kxa.a
            boolean r0 = r0.h(r11)
            if (r0 == 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r6 = new java.net.UnknownServiceException
            java.lang.String r7 = "CLEARTEXT communication to "
            java.lang.String r8 = " not permitted by network security policy"
            java.lang.String r7 = wn6.i(r7, r11, r8)
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x0041:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r6 = new java.net.UnknownServiceException
            java.lang.String r7 = "CLEARTEXT communication not enabled for client"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x004e:
            java.util.List r11 = r11.b
            vhb r0 = defpackage.vhb.H2_PRIOR_KNOWLEDGE
            boolean r11 = r11.contains(r0)
            if (r11 != 0) goto L_0x0109
        L_0x0058:
            r11 = 0
            r0 = r11
        L_0x005a:
            r2 = 1
            qgc r3 = r5.q     // Catch:{ IOException -> 0x007a }
            ca r4 = r3.a     // Catch:{ IOException -> 0x007a }
            javax.net.ssl.SSLSocketFactory r4 = r4.f     // Catch:{ IOException -> 0x007a }
            if (r4 == 0) goto L_0x006f
            java.net.Proxy r3 = r3.b     // Catch:{ IOException -> 0x007a }
            java.net.Proxy$Type r3 = r3.type()     // Catch:{ IOException -> 0x007a }
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x007a }
            if (r3 != r4) goto L_0x006f
            r3 = r2
            goto L_0x0070
        L_0x006f:
            r3 = 0
        L_0x0070:
            if (r3 == 0) goto L_0x007c
            r5.f(r6, r7, r8, r12)     // Catch:{ IOException -> 0x007a }
            java.net.Socket r3 = r5.b     // Catch:{ IOException -> 0x007a }
            if (r3 != 0) goto L_0x007f
            goto L_0x0086
        L_0x007a:
            r3 = move-exception
            goto L_0x00b1
        L_0x007c:
            r5.e(r6, r7, r12)     // Catch:{ IOException -> 0x007a }
        L_0x007f:
            r5.g(r1, r9, r12)     // Catch:{ IOException -> 0x007a }
            qgc r3 = r5.q     // Catch:{ IOException -> 0x007a }
            java.net.InetSocketAddress r6 = r3.c     // Catch:{ IOException -> 0x007a }
        L_0x0086:
            qgc r6 = r5.q
            ca r7 = r6.a
            javax.net.ssl.SSLSocketFactory r7 = r7.f
            if (r7 == 0) goto L_0x00aa
            java.net.Proxy r6 = r6.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.HTTP
            if (r6 != r7) goto L_0x00aa
            java.net.Socket r6 = r5.b
            if (r6 == 0) goto L_0x009d
            goto L_0x00aa
        L_0x009d:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Too many tunnel connections attempted: 21"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x00aa:
            long r6 = java.lang.System.nanoTime()
            r5.p = r6
            return
        L_0x00b1:
            java.net.Socket r4 = r5.c
            if (r4 == 0) goto L_0x00b8
            defpackage.nze.d(r4)
        L_0x00b8:
            java.net.Socket r4 = r5.b
            if (r4 == 0) goto L_0x00bf
            defpackage.nze.d(r4)
        L_0x00bf:
            r5.c = r11
            r5.b = r11
            r5.g = r11
            r5.h = r11
            r5.d = r11
            r5.e = r11
            r5.f = r11
            r5.n = r2
            qgc r4 = r5.q
            java.net.InetSocketAddress r4 = r4.c
            if (r0 != 0) goto L_0x00db
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            r0.<init>(r3)
            goto L_0x00e2
        L_0x00db:
            java.io.IOException r4 = r0.b
            defpackage.jjd.d(r4, r3)
            r0.a = r3
        L_0x00e2:
            if (r10 == 0) goto L_0x0108
            r1.c = r2
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x0108
            boolean r2 = r3 instanceof java.net.ProtocolException
            if (r2 != 0) goto L_0x0108
            boolean r2 = r3 instanceof java.io.InterruptedIOException
            if (r2 != 0) goto L_0x0108
            boolean r2 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r2 == 0) goto L_0x00fe
            java.lang.Throwable r2 = r3.getCause()
            boolean r2 = r2 instanceof java.security.cert.CertificateException
            if (r2 != 0) goto L_0x0108
        L_0x00fe:
            boolean r2 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 != 0) goto L_0x0108
            boolean r2 = r3 instanceof javax.net.ssl.SSLException
            if (r2 == 0) goto L_0x0108
            goto L_0x005a
        L_0x0108:
            throw r0
        L_0x0109:
            okhttp3.internal.connection.RouteException r5 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r6 = new java.net.UnknownServiceException
            java.lang.String r7 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r6.<init>(r7)
            r5.<init>(r6)
            throw r5
        L_0x0116:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "already connected"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1c.c(int, int, int, int, boolean, y0c, j06):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r5 = defpackage.z0c.$EnumSwitchMapping$0[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r8, int r9, defpackage.j06 r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            qgc r3 = r7.q
            java.net.Proxy r4 = r3.b
            ca r3 = r3.a
            java.net.Proxy$Type r5 = r4.type()
            if (r5 != 0) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            int[] r6 = defpackage.z0c.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r2) goto L_0x0022
            if (r5 == r1) goto L_0x0022
        L_0x001c:
            java.net.Socket r3 = new java.net.Socket
            r3.<init>(r4)
            goto L_0x0028
        L_0x0022:
            javax.net.SocketFactory r3 = r3.e
            java.net.Socket r3 = r3.createSocket()
        L_0x0028:
            r7.b = r3
            qgc r4 = r7.q
            java.net.InetSocketAddress r4 = r4.c
            r10.getClass()
            r3.setSoTimeout(r9)
            kxa r9 = defpackage.kxa.a     // Catch:{ ConnectException -> 0x008a }
            kxa r9 = defpackage.kxa.a     // Catch:{ ConnectException -> 0x008a }
            qgc r10 = r7.q     // Catch:{ ConnectException -> 0x008a }
            java.net.InetSocketAddress r10 = r10.c     // Catch:{ ConnectException -> 0x008a }
            r9.e(r3, r10, r8)     // Catch:{ ConnectException -> 0x008a }
            java.util.logging.Logger r8 = defpackage.tw9.a     // Catch:{ NullPointerException -> 0x0076 }
            ml6 r8 = new ml6     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r1, r3)     // Catch:{ NullPointerException -> 0x0076 }
            zw r9 = new zw     // Catch:{ NullPointerException -> 0x0076 }
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ NullPointerException -> 0x0076 }
            r9.<init>(r10, r2, r8)     // Catch:{ NullPointerException -> 0x0076 }
            zw r10 = new zw     // Catch:{ NullPointerException -> 0x0076 }
            r10.<init>(r8, r0, r9)     // Catch:{ NullPointerException -> 0x0076 }
            v0c r8 = new v0c     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r10)     // Catch:{ NullPointerException -> 0x0076 }
            r7.g = r8     // Catch:{ NullPointerException -> 0x0076 }
            ml6 r8 = new ml6     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r1, r3)     // Catch:{ NullPointerException -> 0x0076 }
            yw r9 = new yw     // Catch:{ NullPointerException -> 0x0076 }
            java.io.OutputStream r10 = r3.getOutputStream()     // Catch:{ NullPointerException -> 0x0076 }
            r9.<init>(r10, r2, r8)     // Catch:{ NullPointerException -> 0x0076 }
            yw r10 = new yw     // Catch:{ NullPointerException -> 0x0076 }
            r10.<init>(r8, r0, r9)     // Catch:{ NullPointerException -> 0x0076 }
            u0c r8 = new u0c     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r10)     // Catch:{ NullPointerException -> 0x0076 }
            r7.h = r8     // Catch:{ NullPointerException -> 0x0076 }
            goto L_0x0083
        L_0x0076:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = "throw with null exception"
            boolean r8 = defpackage.hhd.f(r8, r9)
            if (r8 != 0) goto L_0x0084
        L_0x0083:
            return
        L_0x0084:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L_0x008a:
            r8 = move-exception
            java.net.ConnectException r9 = new java.net.ConnectException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to connect to "
            r10.<init>(r0)
            qgc r7 = r7.q
            java.net.InetSocketAddress r7 = r7.c
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.<init>(r7)
            r9.initCause(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1c.e(int, int, j06):void");
    }

    public final void f(int i2, int i3, int i4, j06 j06) {
        s86 s86 = new s86();
        qgc qgc = this.q;
        s86.a = qgc.a.a;
        s86.m("CONNECT", (d8) null);
        ca caVar = qgc.a;
        ((xe6) s86.c).n("Host", nze.v(caVar.a, true));
        ((xe6) s86.c).n("Proxy-Connection", "Keep-Alive");
        ((xe6) s86.c).n("User-Agent", "okhttp/4.9.2");
        lac j2 = s86.j();
        wbc wbc = new wbc();
        wbc.a = j2;
        wbc.b = vhb.HTTP_1_1;
        wbc.c = 407;
        wbc.d = "Preemptive Authenticate";
        wbc.g = nze.c;
        wbc.k = -1;
        wbc.l = -1;
        wbc.f.n("Proxy-Authenticate", "OkHttp-Preemptive");
        wbc.a();
        caVar.i.getClass();
        e(i2, i3, j06);
        v0c v0c = this.g;
        u0c u0c = this.h;
        b9 b9Var = new b9((qw9) null, this, v0c, u0c);
        xje p2 = v0c.c.p();
        long j3 = (long) i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        p2.g(j3, timeUnit);
        u0c.c.p().g((long) i4, timeUnit);
        b9Var.S(j2.d, "CONNECT " + nze.v(j2.b, true) + " HTTP/1.1");
        b9Var.b();
        wbc e2 = b9Var.e(false);
        e2.a = j2;
        xbc a = e2.a();
        long j4 = nze.j(a);
        if (j4 != -1) {
            tk6 G = b9Var.G(j4);
            nze.t(G, Integer.MAX_VALUE, timeUnit);
            G.close();
        }
        int i5 = a.o;
        if (i5 != 200) {
            if (i5 == 407) {
                caVar.i.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(wn6.h(i5, "Unexpected response code for CONNECT: "));
        } else if (!v0c.a.B() || !u0c.a.B()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.qd3 r17, int r18, defpackage.j06 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 2
            r3 = 1
            r4 = 0
            qgc r5 = r0.q
            ca r5 = r5.a
            javax.net.ssl.SSLSocketFactory r6 = r5.f
            vhb r7 = defpackage.vhb.HTTP_1_1
            if (r6 != 0) goto L_0x002c
            java.util.List r2 = r5.b
            vhb r3 = defpackage.vhb.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0025
            java.net.Socket r2 = r0.b
            r0.c = r2
            r0.e = r3
            r0.l(r1)
            return
        L_0x0025:
            java.net.Socket r1 = r0.b
            r0.c = r1
            r0.e = r7
            return
        L_0x002c:
            r19.getClass()
            java.lang.String r5 = "Hostname "
            java.lang.String r6 = "\n              |Hostname "
            qgc r8 = r0.q
            ca r8 = r8.a
            javax.net.ssl.SSLSocketFactory r9 = r8.f
            java.net.Socket r11 = r0.b     // Catch:{ all -> 0x01b0 }
            sm6 r12 = r8.a     // Catch:{ all -> 0x01b0 }
            java.lang.String r13 = r12.e     // Catch:{ all -> 0x01b0 }
            int r12 = r12.f     // Catch:{ all -> 0x01b0 }
            java.net.Socket r9 = r9.createSocket(r11, r13, r12, r3)     // Catch:{ all -> 0x01b0 }
            if (r9 == 0) goto L_0x01b4
            javax.net.ssl.SSLSocket r9 = (javax.net.ssl.SSLSocket) r9     // Catch:{ all -> 0x01b0 }
            r11 = r17
            pd3 r11 = r11.a(r9)     // Catch:{ all -> 0x0061 }
            boolean r12 = r11.b     // Catch:{ all -> 0x0061 }
            if (r12 == 0) goto L_0x0065
            kxa r12 = defpackage.kxa.a     // Catch:{ all -> 0x0061 }
            kxa r12 = defpackage.kxa.a     // Catch:{ all -> 0x0061 }
            sm6 r13 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r13 = r13.e     // Catch:{ all -> 0x0061 }
            java.util.List r14 = r8.b     // Catch:{ all -> 0x0061 }
            r12.d(r9, r13, r14)     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r10 = r9
            goto L_0x01bf
        L_0x0065:
            r9.startHandshake()     // Catch:{ all -> 0x0061 }
            javax.net.ssl.SSLSession r12 = r9.getSession()     // Catch:{ all -> 0x0061 }
            be6 r13 = defpackage.d8.o(r12)     // Catch:{ all -> 0x0061 }
            javax.net.ssl.HostnameVerifier r14 = r8.g     // Catch:{ all -> 0x0061 }
            sm6 r15 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r15 = r15.e     // Catch:{ all -> 0x0061 }
            boolean r12 = r14.verify(r15, r12)     // Catch:{ all -> 0x0061 }
            if (r12 != 0) goto L_0x0124
            java.util.List r0 = r13.a()     // Catch:{ all -> 0x0061 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0109
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0095
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0095:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ all -> 0x0061 }
            javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r3.<init>(r6)     // Catch:{ all -> 0x0061 }
            sm6 r4 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.e     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = " not verified:\n              |    certificate: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            iy1 r4 = defpackage.iy1.c     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = "sha256/"
            r4.<init>(r5)     // Catch:{ all -> 0x0061 }
            java.security.PublicKey r5 = r0.getPublicKey()     // Catch:{ all -> 0x0061 }
            byte[] r5 = r5.getEncoded()     // Catch:{ all -> 0x0061 }
            uu0 r5 = s59.s(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "SHA-256"
            uu0 r5 = r5.b(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0061 }
            r4.append(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "\n              |    DN: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.security.Principal r4 = r0.getSubjectDN()     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "\n              |    subjectAltNames: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            r4 = 7
            java.util.List r4 = defpackage.ow9.a(r0, r4)     // Catch:{ all -> 0x0061 }
            java.util.List r0 = defpackage.ow9.a(r0, r2)     // Catch:{ all -> 0x0061 }
            java.util.ArrayList r0 = defpackage.o23.i0(r4, r0)     // Catch:{ all -> 0x0061 }
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "\n              "
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = defpackage.i0e.E(r0)     // Catch:{ all -> 0x0061 }
            r1.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0109:
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r1.<init>(r5)     // Catch:{ all -> 0x0061 }
            sm6 r2 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0061 }
            r1.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = " not verified (no certificates)"
            r1.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0061 }
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0124:
            iy1 r5 = r8.h     // Catch:{ all -> 0x0061 }
            be6 r6 = new be6     // Catch:{ all -> 0x0061 }
            jle r12 = r13.b     // Catch:{ all -> 0x0061 }
            ky2 r14 = r13.c     // Catch:{ all -> 0x0061 }
            java.util.List r15 = r13.d     // Catch:{ all -> 0x0061 }
            a1c r10 = new a1c     // Catch:{ all -> 0x0061 }
            r10.<init>(r5, r13, r8, r4)     // Catch:{ all -> 0x0061 }
            r6.<init>(r12, r14, r15, r10)     // Catch:{ all -> 0x0061 }
            r0.d = r6     // Catch:{ all -> 0x0061 }
            sm6 r6 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x0061 }
            java.util.Set r5 = r5.a     // Catch:{ all -> 0x0061 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0061 }
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x01a7
            boolean r5 = r11.b     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0155
            kxa r5 = defpackage.kxa.a     // Catch:{ all -> 0x0061 }
            kxa r5 = defpackage.kxa.a     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r5.f(r9)     // Catch:{ all -> 0x0061 }
            goto L_0x0156
        L_0x0155:
            r10 = 0
        L_0x0156:
            r0.c = r9     // Catch:{ all -> 0x0061 }
            java.util.logging.Logger r5 = defpackage.tw9.a     // Catch:{ all -> 0x0061 }
            ml6 r5 = new ml6     // Catch:{ all -> 0x0061 }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x0061 }
            zw r6 = new zw     // Catch:{ all -> 0x0061 }
            java.io.InputStream r8 = r9.getInputStream()     // Catch:{ all -> 0x0061 }
            r6.<init>(r8, r3, r5)     // Catch:{ all -> 0x0061 }
            zw r8 = new zw     // Catch:{ all -> 0x0061 }
            r8.<init>(r5, r4, r6)     // Catch:{ all -> 0x0061 }
            v0c r5 = new v0c     // Catch:{ all -> 0x0061 }
            r5.<init>(r8)     // Catch:{ all -> 0x0061 }
            r0.g = r5     // Catch:{ all -> 0x0061 }
            ml6 r5 = new ml6     // Catch:{ all -> 0x0061 }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x0061 }
            yw r2 = new yw     // Catch:{ all -> 0x0061 }
            java.io.OutputStream r6 = r9.getOutputStream()     // Catch:{ all -> 0x0061 }
            r2.<init>(r6, r3, r5)     // Catch:{ all -> 0x0061 }
            yw r3 = new yw     // Catch:{ all -> 0x0061 }
            r3.<init>(r5, r4, r2)     // Catch:{ all -> 0x0061 }
            u0c r2 = new u0c     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
            r0.h = r2     // Catch:{ all -> 0x0061 }
            if (r10 == 0) goto L_0x0194
            vhb r7 = swb.t(r10)     // Catch:{ all -> 0x0061 }
        L_0x0194:
            r0.e = r7     // Catch:{ all -> 0x0061 }
            kxa r2 = defpackage.kxa.a
            kxa r2 = defpackage.kxa.a
            r2.a(r9)
            vhb r2 = r0.e
            vhb r3 = defpackage.vhb.HTTP_2
            if (r2 != r3) goto L_0x01a6
            r0.l(r1)
        L_0x01a6:
            return
        L_0x01a7:
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0061 }
            defpackage.hr1.r(r0)     // Catch:{ all -> 0x0061 }
            r1 = 0
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x01b0:
            r0 = move-exception
            r1 = 0
        L_0x01b2:
            r10 = r1
            goto L_0x01bf
        L_0x01b4:
            r1 = 0
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01bd }
            java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r0.<init>(r2)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            goto L_0x01b2
        L_0x01bf:
            if (r10 == 0) goto L_0x01c8
            kxa r1 = defpackage.kxa.a
            kxa r1 = defpackage.kxa.a
            r1.a(r10)
        L_0x01c8:
            if (r10 == 0) goto L_0x01cd
            defpackage.nze.d(r10)
        L_0x01cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1c.g(qd3, int, j06):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (defpackage.ow9.c(r0, (java.security.cert.X509Certificate) r10) != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.ca r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            byte[] r0 = defpackage.nze.a
            java.util.ArrayList r0 = r8.o
            int r0 = r0.size()
            int r1 = r8.n
            r2 = 0
            if (r0 >= r1) goto L_0x00d2
            boolean r0 = r8.i
            if (r0 == 0) goto L_0x0013
            goto L_0x00d2
        L_0x0013:
            qgc r0 = r8.q
            ca r1 = r0.a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            sm6 r1 = r9.a
            java.lang.String r3 = r1.e
            ca r4 = r0.a
            sm6 r5 = r4.a
            java.lang.String r5 = r5.e
            boolean r3 = defpackage.hhd.f(r3, r5)
            r5 = 1
            if (r3 == 0) goto L_0x0030
            return r5
        L_0x0030:
            gl6 r3 = r8.f
            if (r3 != 0) goto L_0x0035
            return r2
        L_0x0035:
            if (r10 == 0) goto L_0x00d2
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x003f
            goto L_0x00d2
        L_0x003f:
            java.util.Iterator r10 = r10.iterator()
        L_0x0043:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00d2
            java.lang.Object r3 = r10.next()
            qgc r3 = (defpackage.qgc) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L_0x0043
            java.net.Proxy r6 = r0.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L_0x0043
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r6 = r0.c
            boolean r3 = defpackage.hhd.f(r6, r3)
            if (r3 == 0) goto L_0x0043
            ow9 r10 = defpackage.ow9.a
            javax.net.ssl.HostnameVerifier r0 = r9.g
            if (r0 == r10) goto L_0x0072
            return r2
        L_0x0072:
            byte[] r10 = defpackage.nze.a
            sm6 r10 = r4.a
            int r0 = r10.f
            int r3 = r1.f
            if (r3 == r0) goto L_0x007d
            goto L_0x00d2
        L_0x007d:
            java.lang.String r0 = r1.e
            java.lang.String r10 = r10.e
            boolean r10 = defpackage.hhd.f(r0, r10)
            if (r10 == 0) goto L_0x0088
            goto L_0x00a9
        L_0x0088:
            boolean r10 = r8.j
            if (r10 != 0) goto L_0x00d2
            be6 r10 = r8.d
            if (r10 == 0) goto L_0x00d2
            java.util.List r10 = r10.a()
            boolean r1 = r10.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r10 = r10.get(r2)
            if (r10 == 0) goto L_0x00ca
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = defpackage.ow9.c(r0, r10)
            if (r10 == 0) goto L_0x00d2
        L_0x00a9:
            iy1 r9 = r9.h     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            be6 r8 = r8.d     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            r8.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            r9.getClass()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            java.util.Set r8 = r9.a     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            boolean r9 = r8.hasNext()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            if (r9 != 0) goto L_0x00c0
            return r5
        L_0x00c0:
            java.lang.Object r8 = r8.next()     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            defpackage.hr1.r(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
            r8 = 0
            throw r8     // Catch:{ SSLPeerUnverifiedException -> 0x00c9 }
        L_0x00c9:
            return r2
        L_0x00ca:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        L_0x00d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1c.h(ca, java.util.ArrayList):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = defpackage.nze.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.b
            java.net.Socket r3 = r9.c
            v0c r4 = r9.g
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x0026
            goto L_0x0075
        L_0x0026:
            gl6 r2 = r9.f
            r6 = 1
            if (r2 == 0) goto L_0x0049
            monitor-enter(r2)
            boolean r9 = r2.Z     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x0032
            monitor-exit(r2)
            goto L_0x0046
        L_0x0032:
            long r9 = r2.E0     // Catch:{ all -> 0x0042 }
            long r3 = r2.D0     // Catch:{ all -> 0x0042 }
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0044
            long r9 = r2.F0     // Catch:{ all -> 0x0042 }
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            monitor-exit(r2)
            goto L_0x0046
        L_0x0042:
            r9 = move-exception
            goto L_0x0047
        L_0x0044:
            monitor-exit(r2)
            r5 = r6
        L_0x0046:
            return r5
        L_0x0047:
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            throw r9
        L_0x0049:
            monitor-enter(r9)
            long r7 = r9.p     // Catch:{ all -> 0x0072 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0071
            if (r10 == 0) goto L_0x0071
            int r9 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x006a }
            boolean r10 = r4.B()     // Catch:{ all -> 0x006a }
            r10 = r10 ^ r6
            r3.setSoTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            r5 = r10
            goto L_0x0070
        L_0x006a:
            r10 = move-exception
            r3.setSoTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            throw r10     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
        L_0x006f:
            r5 = r6
        L_0x0070:
            return r5
        L_0x0071:
            return r6
        L_0x0072:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1c.i(boolean):boolean");
    }

    public final m15 j(qw9 qw9, e1c e1c) {
        Socket socket = this.c;
        v0c v0c = this.g;
        u0c u0c = this.h;
        gl6 gl6 = this.f;
        if (gl6 != null) {
            return new hl6(qw9, this, e1c, gl6);
        }
        int i2 = e1c.d;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v0c.c.p().g((long) i2, timeUnit);
        u0c.c.p().g((long) e1c.e, timeUnit);
        return new b9(qw9, this, v0c, u0c);
    }

    public final synchronized void k() {
        this.i = true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ga0, java.lang.Object] */
    public final void l(int i2) {
        Socket socket = this.c;
        v0c v0c = this.g;
        u0c u0c = this.h;
        socket.setSoTimeout(0);
        kee kee = kee.h;
        ? obj = new Object();
        obj.g = kee;
        obj.f = yk6.a;
        String str = this.q.a.a.e;
        obj.c = socket;
        obj.a = nze.g + ' ' + str;
        obj.d = v0c;
        obj.e = u0c;
        obj.f = this;
        obj.b = i2;
        gl6 gl6 = new gl6(obj);
        this.f = gl6;
        y5d y5d = gl6.Q0;
        this.n = (y5d.a & 16) != 0 ? y5d.b[4] : Integer.MAX_VALUE;
        ol6 ol6 = gl6.N0;
        synchronized (ol6) {
            try {
                if (ol6.c) {
                    throw new IOException("closed");
                } else if (ol6.Y) {
                    Logger logger = ol6.Z;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(nze.h(">> CONNECTION " + vk6.a.d(), new Object[0]));
                    }
                    ol6.X.M(vk6.a);
                    ol6.X.flush();
                }
            } finally {
            }
        }
        ol6 ol62 = gl6.N0;
        y5d y5d2 = gl6.G0;
        synchronized (ol62) {
            try {
                if (!ol62.c) {
                    ol62.g(0, Integer.bitCount(y5d2.a) * 6, 4, 0);
                    int i3 = 0;
                    while (i3 < 10) {
                        boolean z = true;
                        if (((1 << i3) & y5d2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            ol62.X.y(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                            ol62.X.A(y5d2.b[i3]);
                        }
                        i3++;
                    }
                    ol62.X.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        int a = gl6.G0.a();
        if (a != 65535) {
            gl6.N0.S(0, (long) (a - 65535));
        }
        kee.f().c(new el6(gl6.O0, gl6.o, 2), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        qgc qgc = this.q;
        sb.append(qgc.a.a.e);
        sb.append(':');
        sb.append(qgc.a.a.f);
        sb.append(", proxy=");
        sb.append(qgc.b);
        sb.append(" hostAddress=");
        sb.append(qgc.c);
        sb.append(" cipherSuite=");
        be6 be6 = this.d;
        if (be6 == null || (obj = be6.c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
