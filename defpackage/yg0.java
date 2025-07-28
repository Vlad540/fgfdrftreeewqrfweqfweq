package defpackage;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import one.me.net.client.impl.internal.SocketFactoryCreateException;
import one.me.net.ssl.api.InvalidSslSessionException;

/* renamed from: yg0  reason: default package */
public abstract class yg0 implements zz2 {
    public static final Pattern i = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public final it4 a;
    public final yd3 b;
    public final und c;
    public Socket d;
    public nhd e;
    public final cd3 f;
    public rc3 g = new rc3(false);
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public yg0(it4 it4, cd3 cd3, und und, yd3 yd3) {
        this.a = it4;
        this.b = yd3;
        this.c = und;
        this.f = cd3;
    }

    public static Socket n(SocketFactory socketFactory) {
        udd.q("yg0", "createSocket");
        try {
            Socket createSocket = socketFactory.createSocket();
            if (createSocket != null) {
                TrafficStats.tagSocket(createSocket);
            }
            createSocket.setKeepAlive(false);
            createSocket.setTcpNoDelay(true);
            return createSocket;
        } catch (IOException e2) {
            q((Socket) null);
            throw e2;
        } catch (Throwable th) {
            q((Socket) null);
            throw new IOException("Failed to create socket", th);
        }
    }

    public static long p(int i2, boolean z) {
        if (i2 > 6) {
            i2 = 6;
        }
        double pow = (double) ((long) (Math.pow(2.0d, (double) i2) * 1000.0d));
        long random = (long) (((pow / 2.0d) * Math.random()) + pow);
        if (z && random > 15000) {
            random = 15000;
        }
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "yg0", "getConnectionTimeout: errorsCount: " + i2 + " timeout: " + random, (Throwable) null);
        }
        return random;
    }

    public static void q(Socket socket) {
        if (socket != null) {
            udd.q("yg0", "releaseSocketSafely");
            try {
                socket.close();
            } catch (Throwable th) {
                udd.S("yg0", "failed to close socket", th);
            }
        }
    }

    public final yd3 a() {
        return this.b;
    }

    public final void b() {
        this.h.clear();
    }

    public final void c(Socket socket) {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    public Socket connect() {
        String str;
        int i2;
        long j;
        udd.q("yg0", "connect ->");
        this.g = new rc3(true);
        TrafficStats.setThreadStatsTag((i() + d()).hashCode());
        String i3 = i();
        int d2 = d();
        try {
            SocketFactory socketFactory = (SocketFactory) this.h.computeIfAbsent(i3, new di(20, this));
            rc3 rc3 = this.g;
            rc3.g = i3;
            rc3.h = d2;
            Socket m = m(socketFactory, i3, d2);
            this.d = m;
            if (!(m instanceof SSLSocket)) {
                rc3 rc32 = this.g;
                rc32.getClass();
                rc32.b = System.currentTimeMillis();
                return this.d;
            }
            und und = this.c;
            SSLSocket sSLSocket = (SSLSocket) m;
            String str2 = i.matcher(i3).matches() ? this.f.a : i3;
            vnd vnd = (vnd) und;
            String str3 = vnd.a;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str3, wn6.i("verifySocket, host=", str2, " ->"), (Throwable) null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            wnd wnd = (wnd) vnd.d.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i4 = d2;
            try {
                SSLSession session = sSLSocket.getSession();
                if (!session.isValid()) {
                    throw new InvalidSslSessionException("session is not valid " + session, 2);
                } else if (!"SSL_NULL_WITH_NULL_NULL".equalsIgnoreCase(session.getCipherSuite())) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 >= 0) {
                        wnd.g = elapsedRealtime2;
                        wnd.h += elapsedRealtime2;
                        wnd.i++;
                    } else {
                        wnd.getClass();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    long currentTimeMillis3 = System.currentTimeMillis();
                    wnd wnd2 = (wnd) vnd.d.b;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    try {
                        if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSocket.getSession())) {
                            wnd2.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                            String str4 = vnd.a;
                            fn6 fn62 = udd.e;
                            if (fn62 != null && fn62.c()) {
                                fn62.d(tn7.X, str4, us8.j(currentTimeMillis2 + currentTimeMillis4, "<- verifySocket, took=", "ms"), (Throwable) null);
                            }
                            rc3 rc33 = this.g;
                            rc33.getClass();
                            rc33.b = System.currentTimeMillis();
                            udd.q("yg0", "ssl session is ok");
                            ihd ihd = this.e;
                            if (ihd == null || !ihd.h()) {
                                int i5 = i4;
                                wnd wnd3 = ((vnd) this.c).c;
                                long j2 = wnd3.a;
                                int i6 = wnd3.c;
                                long j3 = wnd3.b;
                                if (i6 > 1) {
                                    j3 /= (long) wnd3.c;
                                }
                                long j4 = j3;
                                int i7 = wnd3.c;
                                long j5 = wnd3.d;
                                long j6 = wnd3.f > 1 ? wnd3.e / ((long) wnd3.f) : wnd3.e;
                                int i8 = wnd3.f;
                                long j7 = wnd3.g;
                                String str5 = "yg0";
                                if (wnd3.i > 1) {
                                    str = i3;
                                    i2 = i5;
                                    j = wnd3.h / ((long) wnd3.i);
                                } else {
                                    str = i3;
                                    i2 = i5;
                                    j = wnd3.h;
                                }
                                xnd xnd = new xnd(j2, j4, i7, j5, j6, i8, j7, j, wnd3.i);
                                rc3 rc34 = this.g;
                                long j8 = xnd.l;
                                rc34.getClass();
                                rc34.f = Math.max(j8, 0);
                                udd.p(str5, "<- connect, socket connected to %s:%d, ssl_metrics=%s", new Object[]{str, Integer.valueOf(i2), xnd.toString()});
                                return this.d;
                            }
                            String str6 = "emitter was disposed " + i3 + ":" + i4;
                            udd.q("yg0", str6);
                            throw new IOException(str6);
                        }
                        throw new SSLPeerUnverifiedException("Failed to verify host=".concat(str2));
                    } catch (SSLPeerUnverifiedException e2) {
                        wnd2.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                        udd.s(vnd.a, ete.v(sSLSocket, str2), (Throwable) null);
                        throw e2;
                    } catch (Throwable th) {
                        wnd2.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                        udd.s(vnd.a, ete.v(sSLSocket, str2), (Throwable) null);
                        SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException("Failed to verify host=".concat(str2));
                        sSLPeerUnverifiedException.initCause(th);
                        throw sSLPeerUnverifiedException;
                    }
                } else {
                    throw new InvalidSslSessionException("Illegal session cipher suite", 2);
                }
            } catch (InvalidSslSessionException e3) {
                throw e3;
            } catch (Throwable th2) {
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime4 >= 0) {
                    wnd.g = elapsedRealtime4;
                    wnd.h += elapsedRealtime4;
                    wnd.i++;
                } else {
                    wnd.getClass();
                }
                throw th2;
            }
        } catch (SocketFactoryCreateException e4) {
            throw e4.a;
        }
    }

    public final boolean e() {
        return true;
    }

    public final void f() {
        yd3 yd3 = this.b;
        ((AtomicInteger) yd3.c).incrementAndGet();
        String name = yd3.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, wn6.h(((AtomicInteger) yd3.c).get(), "tryNextRequestTimeout "), (Throwable) null);
        }
    }

    public final long h(int i2) {
        return p(i2, ((rf4) this.a.a).d());
    }

    public final rc3 k() {
        return this.g;
    }

    public final void l(Socket socket, String str, int i2, int i3) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "yg0", String.format(Locale.ROOT, "connectSocket, socket=%s, host=%s:%d, timeout=%dms", new Object[]{socket, str, Integer.valueOf(i2), Integer.valueOf(i3)}), (Throwable) null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i2);
        if (inetSocketAddress.getAddress() != null) {
            rc3 rc3 = this.g;
            rc3.getClass();
            rc3.d = Math.max(System.currentTimeMillis() - currentTimeMillis, 0);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        udd.q("Socket", "socket connect");
        socket.connect(inetSocketAddress, i3);
        udd.q("Socket", "socket connected");
        rc3 rc32 = this.g;
        rc32.getClass();
        rc32.e = Math.max(System.currentTimeMillis() - currentTimeMillis2, 0);
    }

    public Socket m(SocketFactory socketFactory, String str, int i2) {
        udd.q("yg0", "createConnection");
        Socket n = n(socketFactory);
        try {
            l(n, str, i2, j());
            return n;
        } catch (IOException e2) {
            q(n);
            throw e2;
        } catch (Throwable th) {
            q(n);
            throw new IOException("Failed to create connection", th);
        }
    }

    public final kld o(String str) {
        ((rf4) this.a.a).e();
        vnd vnd = (vnd) this.c;
        String str2 = vnd.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str2, wn6.i("createSocketFactory, host=", str, " ->"), (Throwable) null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            kld kld = new kld(vnd.b, str);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            wnd wnd = vnd.c;
            if (currentTimeMillis2 >= 0) {
                wnd.a = currentTimeMillis2;
                wnd.b += currentTimeMillis2;
                wnd.c++;
            } else {
                wnd.getClass();
            }
            String str3 = vnd.a;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, str3, us8.j(currentTimeMillis2, "<- createSocketFactory, took=", "ms"), (Throwable) null);
            }
            return kld;
        } catch (SSLException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new SSLException("Failed to create socket factory", th);
        }
    }
}
