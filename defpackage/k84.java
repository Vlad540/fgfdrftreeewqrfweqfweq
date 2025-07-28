package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: k84  reason: default package */
public final class k84 extends eh0 implements ul6 {
    public final u1b A0;
    public xz3 B0;
    public HttpURLConnection C0;
    public InputStream D0;
    public boolean E0;
    public int F0;
    public long G0;
    public long H0;
    public final boolean X = false;
    public final int Y;
    public final int Z;
    public final String w0;
    public final afc x0;
    public final afc y0;
    public final boolean z0;

    public k84(String str, int i, int i2, afc afc) {
        super(true);
        this.w0 = str;
        this.Y = i;
        this.Z = i2;
        this.x0 = afc;
        this.A0 = null;
        this.y0 = new afc(20);
        this.z0 = false;
    }

    public static void l(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = mze.a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", (Class[]) null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, (Object[]) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N(defpackage.xz3 r20) {
        /*
            r19 = this;
            r1 = r19
            r6 = r20
            r1.B0 = r6
            r2 = 0
            r1.H0 = r2
            r1.G0 = r2
            r19.d()
            java.net.HttpURLConnection r0 = r19.j(r20)     // Catch:{ IOException -> 0x01c5 }
            r1.C0 = r0     // Catch:{ IOException -> 0x01c5 }
            int r5 = r0.getResponseCode()     // Catch:{ IOException -> 0x01c5 }
            r1.F0 = r5     // Catch:{ IOException -> 0x01c5 }
            java.lang.String r5 = r0.getResponseMessage()     // Catch:{ IOException -> 0x01c5 }
            int r7 = r1.F0
            java.lang.String r8 = "Content-Range"
            r9 = 200(0xc8, float:2.8E-43)
            r10 = -1
            long r12 = r6.f
            long r14 = r6.g
            if (r7 < r9) goto L_0x013b
            r4 = 299(0x12b, float:4.19E-43)
            if (r7 <= r4) goto L_0x0033
            goto L_0x013b
        L_0x0033:
            java.lang.String r4 = r0.getContentType()
            u1b r5 = r1.A0
            if (r5 == 0) goto L_0x004b
            boolean r5 = r5.apply(r4)
            if (r5 == 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            r19.f()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r4, r6)
            throw r0
        L_0x004b:
            int r4 = r1.F0
            if (r4 != r9) goto L_0x0054
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r12 = r2
        L_0x0055:
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r0.getHeaderField(r4)
            java.lang.String r5 = "gzip"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x00f9
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x006b
            r1.G0 = r14
            goto L_0x00fb
        L_0x006b:
            java.lang.String r5 = "Content-Length"
            java.lang.String r5 = r0.getHeaderField(r5)
            java.lang.String r7 = r0.getHeaderField(r8)
            java.util.regex.Pattern r8 = defpackage.xm6.a
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x008d
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x008e
        L_0x0082:
            r8 = 28
            int r8 = me4.e(r8, r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
        L_0x008d:
            r8 = r10
        L_0x008e:
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            if (r14 != 0) goto L_0x00f0
            java.util.regex.Pattern r14 = defpackage.xm6.a
            java.util.regex.Matcher r14 = r14.matcher(r7)
            boolean r15 = r14.matches()
            if (r15 == 0) goto L_0x00f0
            r15 = 2
            java.lang.String r15 = r14.group(r15)     // Catch:{ NumberFormatException -> 0x00e5 }
            r15.getClass()     // Catch:{ NumberFormatException -> 0x00e5 }
            long r17 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00e5 }
            r15 = 1
            java.lang.String r14 = r14.group(r15)     // Catch:{ NumberFormatException -> 0x00e5 }
            r14.getClass()     // Catch:{ NumberFormatException -> 0x00e5 }
            long r14 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x00e5 }
            long r17 = r17 - r14
            r14 = 1
            long r14 = r17 + r14
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c4
            r8 = r14
            goto L_0x00f0
        L_0x00c4:
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x00f0
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ NumberFormatException -> 0x00e5 }
            int r2 = r2.length()     // Catch:{ NumberFormatException -> 0x00e5 }
            int r2 = r2 + 26
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00e5 }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x00e5 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00e5 }
            r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x00e5 }
            long r8 = java.lang.Math.max(r8, r14)     // Catch:{ NumberFormatException -> 0x00e5 }
            goto L_0x00f0
        L_0x00e5:
            r2 = 27
            int r2 = me4.e(r2, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L_0x00f0:
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00f6
            long r10 = r8 - r12
        L_0x00f6:
            r1.G0 = r10
            goto L_0x00fb
        L_0x00f9:
            r1.G0 = r14
        L_0x00fb:
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0110 }
            r1.D0 = r0     // Catch:{ IOException -> 0x0110 }
            if (r4 == 0) goto L_0x010e
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0110 }
            java.io.InputStream r3 = r1.D0     // Catch:{ IOException -> 0x0110 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            r1.D0 = r0     // Catch:{ IOException -> 0x0110 }
        L_0x010e:
            r3 = 1
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            r4 = 1
            goto L_0x0132
        L_0x0113:
            r1.E0 = r3
            r19.e(r20)
            r1.n(r12, r6)     // Catch:{ IOException -> 0x011e }
            long r0 = r1.G0
            return r0
        L_0x011e:
            r0 = move-exception
            r3 = r0
            r19.f()
            boolean r0 = r3 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            if (r0 == 0) goto L_0x012b
            r0 = r3
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = (com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException) r0
            throw r0
        L_0x012b:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r4 = 1
            r0.<init>((java.io.IOException) r3, (defpackage.xz3) r6, (int) r2, (int) r4)
            throw r0
        L_0x0132:
            r19.f()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r1.<init>((java.io.IOException) r0, (defpackage.xz3) r6, (int) r2, (int) r4)
            throw r1
        L_0x013b:
            java.util.Map r7 = r0.getHeaderFields()
            int r4 = r1.F0
            r9 = 416(0x1a0, float:5.83E-43)
            if (r4 != r9) goto L_0x0180
            java.lang.String r4 = r0.getHeaderField(r8)
            java.util.regex.Pattern r8 = defpackage.xm6.a
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x0155
            r16 = r10
            r8 = 1
            goto L_0x0171
        L_0x0155:
            java.util.regex.Pattern r8 = defpackage.xm6.b
            java.util.regex.Matcher r4 = r8.matcher(r4)
            boolean r8 = r4.matches()
            if (r8 == 0) goto L_0x016e
            r8 = 1
            java.lang.String r4 = r4.group(r8)
            r4.getClass()
            long r16 = java.lang.Long.parseLong(r4)
            goto L_0x0171
        L_0x016e:
            r8 = 1
            r16 = r10
        L_0x0171:
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0180
            r1.E0 = r8
            r19.e(r20)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x017f
            r2 = r14
        L_0x017f:
            return r2
        L_0x0180:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x01a1
            int r2 = defpackage.mze.a     // Catch:{ IOException -> 0x01a4 }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x01a4 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01a4 }
            r3.<init>()     // Catch:{ IOException -> 0x01a4 }
        L_0x0191:
            int r4 = r0.read(r2)     // Catch:{ IOException -> 0x01a4 }
            r8 = -1
            if (r4 == r8) goto L_0x019d
            r8 = 0
            r3.write(r2, r8, r4)     // Catch:{ IOException -> 0x01a4 }
            goto L_0x0191
        L_0x019d:
            r3.toByteArray()     // Catch:{ IOException -> 0x01a4 }
            goto L_0x01a6
        L_0x01a1:
            int r0 = defpackage.mze.a     // Catch:{ IOException -> 0x01a4 }
            goto L_0x01a6
        L_0x01a4:
            int r0 = defpackage.mze.a
        L_0x01a6:
            r19.f()
            int r0 = r1.F0
            if (r0 != r9) goto L_0x01b6
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)
        L_0x01b4:
            r4 = r0
            goto L_0x01b8
        L_0x01b6:
            r0 = 0
            goto L_0x01b4
        L_0x01b8:
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            int r2 = r1.F0
            r1 = r0
            r3 = r5
            r5 = r7
            r6 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            throw r0
        L_0x01c5:
            r0 = move-exception
            r19.f()
            r1 = 1
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException.b(r0, r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k84.N(xz3):long");
    }

    public final Map a() {
        HttpURLConnection httpURLConnection = this.C0;
        return httpURLConnection == null ? j8c.w0 : new j84(0, httpURLConnection.getHeaderFields());
    }

    public final void close() {
        try {
            InputStream inputStream = this.D0;
            if (inputStream != null) {
                long j = this.G0;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.H0;
                }
                l(this.C0, j2);
                inputStream.close();
            }
            this.D0 = null;
            f();
            if (this.E0) {
                this.E0 = false;
                c();
            }
        } catch (IOException e) {
            xz3 xz3 = this.B0;
            int i = mze.a;
            throw new HttpDataSource$HttpDataSourceException(e, xz3, 2000, 3);
        } catch (Throwable th) {
            this.D0 = null;
            f();
            if (this.E0) {
                this.E0 = false;
                c();
            }
            throw th;
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.C0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                oyb.b("Unexpected error while disconnecting", e);
            }
            this.C0 = null;
        }
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.C0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final URL h(URL url, String str, xz3 xz3) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new HttpDataSource$HttpDataSourceException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), xz3, 2001);
                } else if (this.X || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(protocol.length() + me4.e(41, protocol2));
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new HttpDataSource$HttpDataSourceException(sb.toString(), xz3, 2001);
                }
            } catch (MalformedURLException e) {
                throw new HttpDataSource$HttpDataSourceException((IOException) e, xz3, 2001, 1);
            }
        } else {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", xz3, 2001);
        }
    }

    public final HttpURLConnection j(xz3 xz3) {
        HttpURLConnection k;
        k84 k84;
        URL url;
        xz3 xz32 = xz3;
        URL url2 = new URL(xz32.a.toString());
        int i = 0;
        boolean z = (xz32.i & 1) == 1;
        boolean z2 = this.X;
        boolean z3 = this.z0;
        int i2 = xz32.c;
        byte[] bArr = xz32.d;
        long j = xz32.f;
        long j2 = xz32.g;
        if (!z2 && !z3) {
            return k(url2, i2, bArr, j, j2, z, true, xz32.e);
        }
        URL url3 = url2;
        byte[] bArr2 = bArr;
        int i3 = i2;
        while (true) {
            int i4 = i + 1;
            if (i <= 20) {
                int i5 = i3;
                int i6 = i4;
                long j3 = j2;
                URL url4 = url3;
                long j4 = j;
                k = k(url3, i3, bArr2, j, j2, z, false, xz32.e);
                int responseCode = k.getResponseCode();
                String headerField = k.getHeaderField("Location");
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    k84 = this;
                    i3 = i5;
                    URL url5 = url4;
                    k.disconnect();
                    url = k84.h(url5, headerField, xz32);
                } else if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return k;
                } else {
                    k.disconnect();
                    if (!z3 || responseCode != 302) {
                        bArr2 = null;
                        k84 = this;
                        i3 = 1;
                    } else {
                        k84 = this;
                        i3 = i5;
                    }
                    url = k84.h(url4, headerField, xz32);
                }
                url3 = url;
                k84 k842 = k84;
                i = i6;
                j2 = j3;
                j = j4;
            } else {
                throw new HttpDataSource$HttpDataSourceException((IOException) new NoRouteToHostException(m4b.h(31, i4, "Too many redirects: ")), xz32, 2001, 1);
            }
        }
        return k;
    }

    public final HttpURLConnection k(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String str;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.Y);
        httpURLConnection.setReadTimeout(this.Z);
        HashMap hashMap = new HashMap();
        afc afc = this.x0;
        if (afc != null) {
            hashMap.putAll(afc.y());
        }
        hashMap.putAll(this.y0.y());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = xm6.a;
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder k = hr1.k(j, "bytes=", "-");
            if (j2 != -1) {
                k.append((j + j2) - 1);
            }
            str = k.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str3 = this.w0;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = xz3.k;
        if (i == 1) {
            str2 = "GET";
        } else if (i == 2) {
            str2 = "POST";
        } else if (i == 3) {
            str2 = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void n(long j, xz3 xz3) {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                InputStream inputStream = this.D0;
                int i = mze.a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new HttpDataSource$HttpDataSourceException((IOException) new InterruptedIOException(), xz3, 2000, 1);
                } else if (read != -1) {
                    j -= (long) read;
                    b(read);
                } else {
                    throw new DataSourceException(2008);
                }
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.G0;
            if (j != -1) {
                long j2 = j - this.H0;
                if (j2 != 0) {
                    i2 = (int) Math.min((long) i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.D0;
            int i3 = mze.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.H0 += (long) read;
            b(read);
            return read;
        } catch (IOException e) {
            xz3 xz3 = this.B0;
            int i4 = mze.a;
            throw HttpDataSource$HttpDataSourceException.b(e, xz3, 2);
        }
    }
}
