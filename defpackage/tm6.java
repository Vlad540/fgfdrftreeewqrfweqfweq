package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;

/* renamed from: tm6  reason: default package */
public final class tm6 {
    public final Context a;
    public final String b;
    public final int c;
    public final int d = 0;
    public final int e = 0;

    public tm6(int i, Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = i;
    }

    public static void a(HttpURLConnection httpURLConnection, int i, int i2, int i3) {
        int i4;
        if (i != -1) {
            i4 = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i);
        } else {
            i4 = -1;
        }
        if (i2 > 0) {
            try {
                httpURLConnection.setConnectTimeout(i2);
            } catch (SecurityException e2) {
                Throwable cause = e2.getCause();
                if (cause != null) {
                    String name = cause.getClass().getName();
                    if (name.equals("libcore.io.GaiException") || name.equals("android.system.GaiException")) {
                        throw new UnknownHostException();
                    }
                    throw e2;
                }
                throw e2;
            } catch (IllegalArgumentException e3) {
                throw e3;
            } catch (NullPointerException e4) {
                throw e4;
            } catch (Throwable th) {
                if (i4 != -1) {
                    TrafficStats.setThreadStatsTag(i4);
                }
                throw th;
            }
        }
        if (i3 > 0) {
            httpURLConnection.setReadTimeout(i3);
        }
        httpURLConnection.connect();
        if (i4 != -1) {
            TrafficStats.setThreadStatsTag(i4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a6, code lost:
        urd.l(r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        urd.l(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        urd.l(r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0159, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018f, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        urd.l(r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0193, code lost:
        throw r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.om6 b(defpackage.jg8 r13) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r13.b
            java.lang.String r2 = (java.lang.String) r2
            java.net.URL r3 = new java.net.URL
            java.lang.Object r4 = r13.c
            java.lang.String r4 = (java.lang.String) r4
            r3.<init>(r4)
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            boolean r4 = r3 instanceof javax.net.ssl.HttpsURLConnection
            r5 = 0
            if (r4 == 0) goto L_0x00b0
            r4 = r3
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            java.lang.String r6 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r6 = javax.net.ssl.TrustManagerFactory.getInstance(r6)
            r6.init(r5)
            javax.net.ssl.TrustManager[] r6 = r6.getTrustManagers()
            int r7 = r6.length
            java.lang.String r8 = "Array is empty."
            if (r7 == 0) goto L_0x00aa
            r6 = r6[r1]
            javax.net.ssl.X509TrustManager r6 = (javax.net.ssl.X509TrustManager) r6
            int r7 = defpackage.usb.rootca_ssl_rsa2022
            android.content.Context r9 = r12.a
            android.content.Context r9 = r9.getApplicationContext()
            android.content.res.Resources r9 = r9.getResources()
            java.io.InputStream r10 = r9.openRawResource(r7)
            java.lang.String r11 = "X509"
            java.security.cert.CertificateFactory r11 = java.security.cert.CertificateFactory.getInstance(r11)     // Catch:{ all -> 0x00a3 }
            java.security.cert.Certificate r11 = r11.generateCertificate(r10)     // Catch:{ all -> 0x00a3 }
            urd.l(r10, r5)
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            java.lang.String r7 = r9.getResourceEntryName(r7)
            java.lang.String r9 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r9 = java.security.KeyStore.getInstance(r9)
            r9.load(r5, r5)
            r9.setCertificateEntry(r7, r11)
            java.lang.String r7 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r7 = javax.net.ssl.TrustManagerFactory.getInstance(r7)
            r7.init(r9)
            javax.net.ssl.TrustManager[] r7 = r7.getTrustManagers()
            int r9 = r7.length
            if (r9 == 0) goto L_0x009d
            r7 = r7[r1]
            javax.net.ssl.X509TrustManager r7 = (javax.net.ssl.X509TrustManager) r7
            r8 = 2
            javax.net.ssl.X509TrustManager[] r8 = new javax.net.ssl.X509TrustManager[r8]
            r8[r1] = r6
            r8[r0] = r7
            b93 r6 = new b93
            r6.<init>(r8)
            java.lang.String r7 = "SSL"
            javax.net.ssl.SSLContext r7 = javax.net.ssl.SSLContext.getInstance(r7)
            javax.net.ssl.TrustManager[] r8 = new javax.net.ssl.TrustManager[r0]
            r8[r1] = r6
            r7.init(r5, r8, r5)
            javax.net.ssl.SSLSocketFactory r6 = r7.getSocketFactory()
            r4.setSSLSocketFactory(r6)
            goto L_0x00b0
        L_0x009d:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            r12.<init>(r8)
            throw r12
        L_0x00a3:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r13 = move-exception
            urd.l(r10, r12)
            throw r13
        L_0x00aa:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            r12.<init>(r8)
            throw r12
        L_0x00b0:
            r3.setRequestMethod(r2)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r2 = r12.b     // Catch:{ IOException -> 0x00bd }
            if (r2 == 0) goto L_0x00c0
            java.lang.String r4 = "User-Agent"
            r3.setRequestProperty(r4, r2)     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c0
        L_0x00bd:
            r12 = move-exception
            goto L_0x01b1
        L_0x00c0:
            java.lang.String r2 = "Content-Type"
            java.lang.Object r13 = r13.o
            nm6 r13 = (defpackage.nm6) r13
            if (r13 == 0) goto L_0x00e9
            java.lang.String r4 = r13.getContentType()     // Catch:{ IOException -> 0x00bd }
            r3.setRequestProperty(r2, r4)     // Catch:{ IOException -> 0x00bd }
            r3.setDoOutput(r0)     // Catch:{ IOException -> 0x00bd }
            long r6 = r13.getContentLength()     // Catch:{ IOException -> 0x00bd }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00e4
            long r6 = r13.getContentLength()     // Catch:{ IOException -> 0x00bd }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00bd }
            goto L_0x00e9
        L_0x00e4:
            r4 = 4096(0x1000, float:5.74E-42)
            r3.setChunkedStreamingMode(r4)     // Catch:{ IOException -> 0x00bd }
        L_0x00e9:
            int r4 = r12.c     // Catch:{ IOException -> 0x00bd }
            int r6 = r12.d     // Catch:{ IOException -> 0x00bd }
            int r12 = r12.e     // Catch:{ IOException -> 0x00bd }
            a(r3, r4, r6, r12)     // Catch:{ IOException -> 0x00bd }
            if (r13 == 0) goto L_0x0106
            java.io.OutputStream r12 = r3.getOutputStream()     // Catch:{ IOException -> 0x00bd }
            r13.writeTo(r12)     // Catch:{ all -> 0x00ff }
            urd.l(r12, r5)     // Catch:{ IOException -> 0x00bd }
            goto L_0x0106
        L_0x00ff:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r0 = move-exception
            urd.l(r12, r13)     // Catch:{ IOException -> 0x00bd }
            throw r0     // Catch:{ IOException -> 0x00bd }
        L_0x0106:
            int r12 = r3.getResponseCode()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01aa, NullPointerException -> 0x0194 }
            java.lang.String r13 = r3.getResponseMessage()     // Catch:{ IOException -> 0x00bd }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00bd }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ IOException -> 0x00bd }
            java.util.List r2 = (java.util.List) r2     // Catch:{ IOException -> 0x00bd }
            if (r2 == 0) goto L_0x0122
            java.lang.Object r2 = o23.X(r2)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00bd }
            if (r2 != 0) goto L_0x0124
        L_0x0122:
            java.lang.String r2 = "application/octet-stream"
        L_0x0124:
            r4 = 400(0x190, float:5.6E-43)
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r12 >= r4) goto L_0x015a
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ IOException -> 0x00bd }
            boolean r7 = r4 instanceof java.io.BufferedInputStream     // Catch:{ IOException -> 0x00bd }
            if (r7 == 0) goto L_0x0135
            java.io.BufferedInputStream r4 = (java.io.BufferedInputStream) r4     // Catch:{ IOException -> 0x00bd }
            goto L_0x013b
        L_0x0135:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00bd }
            r7.<init>(r4, r6)     // Catch:{ IOException -> 0x00bd }
            r4 = r7
        L_0x013b:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0153 }
            int r8 = r4.available()     // Catch:{ all -> 0x0153 }
            int r6 = java.lang.Math.max(r6, r8)     // Catch:{ all -> 0x0153 }
            r7.<init>(r6)     // Catch:{ all -> 0x0153 }
            oyb.q(r4, r7)     // Catch:{ all -> 0x0153 }
            byte[] r6 = r7.toByteArray()     // Catch:{ all -> 0x0153 }
            urd.l(r4, r5)     // Catch:{ IOException -> 0x00bd }
            goto L_0x0182
        L_0x0153:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r13 = move-exception
            urd.l(r4, r12)     // Catch:{ IOException -> 0x00bd }
            throw r13     // Catch:{ IOException -> 0x00bd }
        L_0x015a:
            java.io.InputStream r4 = r3.getErrorStream()     // Catch:{ IOException -> 0x00bd }
            boolean r7 = r4 instanceof java.io.BufferedInputStream     // Catch:{ IOException -> 0x00bd }
            if (r7 == 0) goto L_0x0165
            java.io.BufferedInputStream r4 = (java.io.BufferedInputStream) r4     // Catch:{ IOException -> 0x00bd }
            goto L_0x016b
        L_0x0165:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00bd }
            r7.<init>(r4, r6)     // Catch:{ IOException -> 0x00bd }
            r4 = r7
        L_0x016b:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x018d }
            int r8 = r4.available()     // Catch:{ all -> 0x018d }
            int r6 = java.lang.Math.max(r6, r8)     // Catch:{ all -> 0x018d }
            r7.<init>(r6)     // Catch:{ all -> 0x018d }
            oyb.q(r4, r7)     // Catch:{ all -> 0x018d }
            byte[] r6 = r7.toByteArray()     // Catch:{ all -> 0x018d }
            urd.l(r4, r5)     // Catch:{ IOException -> 0x00bd }
        L_0x0182:
            om6 r4 = new om6     // Catch:{ IOException -> 0x00bd }
            be5 r5 = new be5     // Catch:{ IOException -> 0x00bd }
            r5.<init>(r2, r0, r6)     // Catch:{ IOException -> 0x00bd }
            r4.<init>(r12, r13, r5, r1)     // Catch:{ IOException -> 0x00bd }
            return r4
        L_0x018d:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x018f }
        L_0x018f:
            r13 = move-exception
            urd.l(r4, r12)     // Catch:{ IOException -> 0x00bd }
            throw r13     // Catch:{ IOException -> 0x00bd }
        L_0x0194:
            r12 = move-exception
            java.lang.String r13 = r12.getMessage()     // Catch:{ IOException -> 0x00bd }
            if (r13 == 0) goto L_0x01a9
            java.lang.String r0 = "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'"
            boolean r13 = p0e.Q(r13, r0, r1)     // Catch:{ IOException -> 0x00bd }
            if (r13 == 0) goto L_0x01a9
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x00bd }
            r13.<init>(r12)     // Catch:{ IOException -> 0x00bd }
            throw r13     // Catch:{ IOException -> 0x00bd }
        L_0x01a9:
            throw r12     // Catch:{ IOException -> 0x00bd }
        L_0x01aa:
            r12 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x00bd }
            r13.<init>(r12)     // Catch:{ IOException -> 0x00bd }
            throw r13     // Catch:{ IOException -> 0x00bd }
        L_0x01b1:
            r3.disconnect()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm6.b(jg8):om6");
    }
}
