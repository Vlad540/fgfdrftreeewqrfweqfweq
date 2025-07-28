package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.c0;

public final class b0 extends c0 {
    final c0.a a;
    final boolean b;

    public b0(c0.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010a A[Catch:{ all -> 0x00ec, all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0115 A[SYNTHETIC, Splitter:B:63:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.c0.b a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "HttpPostRequest error: error while sending data"
            java.lang.String r1 = "HttpPostRequest error: response code "
            java.lang.String r2 = "HttpPostRequest: send request to "
            com.my.tracker.obfuscated.c0$b r3 = com.my.tracker.obfuscated.c0.b.c()
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r6.<init>(r2)     // Catch:{ all -> 0x0119 }
            r6.append(r10)     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0119 }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r2)     // Catch:{ all -> 0x0119 }
            r2 = 27498374(0x1a39786, float:6.009417E-38)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ all -> 0x0119 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0119 }
            r2.<init>(r10)     // Catch:{ all -> 0x0119 }
            java.net.URLConnection r10 = r2.openConnection()     // Catch:{ all -> 0x0119 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ all -> 0x0119 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r2)     // Catch:{ all -> 0x00be }
            r10.setReadTimeout(r2)     // Catch:{ all -> 0x00be }
            r2 = 1
            r10.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r6 = "POST"
            r10.setRequestMethod(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r6 = "Connection"
            java.lang.String r7 = "close"
            r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x00be }
            java.lang.String r6 = "Content-Type"
            com.my.tracker.obfuscated.c0$a r7 = r9.a     // Catch:{ all -> 0x00be }
            java.lang.String r7 = r7.a()     // Catch:{ all -> 0x00be }
            r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x00be }
            r10.setUseCaches(r4)     // Catch:{ all -> 0x00be }
            r10.setDoOutput(r2)     // Catch:{ all -> 0x00be }
            boolean r6 = r9.b     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x007a
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x0077 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0077 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0077 }
            java.io.OutputStream r8 = r10.getOutputStream()     // Catch:{ all -> 0x0077 }
            r7.<init>(r8)     // Catch:{ all -> 0x0077 }
            r6.<init>(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "HttpPostRequest: populating post request body using gzip"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r7)     // Catch:{ all -> 0x0074 }
            goto L_0x0088
        L_0x0074:
            r9 = move-exception
            goto L_0x0113
        L_0x0077:
            r9 = move-exception
            goto L_0x0112
        L_0x007a:
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0077 }
            java.io.OutputStream r7 = r10.getOutputStream()     // Catch:{ all -> 0x0077 }
            r6.<init>(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "HttpPostRequest: populating post request body without using gzip"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r7)     // Catch:{ all -> 0x0074 }
        L_0x0088:
            com.my.tracker.obfuscated.c0$a r7 = r9.a     // Catch:{ all -> 0x0098 }
            r7.a(r6)     // Catch:{ all -> 0x0098 }
            boolean r9 = r9.b     // Catch:{ all -> 0x0098 }
            if (r9 == 0) goto L_0x009c
            r9 = r6
            java.util.zip.GZIPOutputStream r9 = (java.util.zip.GZIPOutputStream) r9     // Catch:{ all -> 0x0098 }
            r9.finish()     // Catch:{ all -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r9 = move-exception
            r5 = r6
            goto L_0x0112
        L_0x009c:
            r6.close()     // Catch:{ all -> 0x00be }
            int r9 = r10.getResponseCode()     // Catch:{ all -> 0x00be }
            r6 = 200(0xc8, float:2.8E-43)
            if (r9 == r6) goto L_0x00c1
            r7 = 204(0xcc, float:2.86E-43)
            if (r9 != r7) goto L_0x00ac
            goto L_0x00c1
        L_0x00ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r2.<init>(r1)     // Catch:{ all -> 0x00be }
            r2.append(r9)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00be }
            com.my.tracker.obfuscated.y0.a((java.lang.String) r1)     // Catch:{ all -> 0x00be }
            r3.a = r4     // Catch:{ all -> 0x00be }
            goto L_0x00c8
        L_0x00be:
            r9 = move-exception
            r5 = r10
            goto L_0x011a
        L_0x00c1:
            java.lang.String r1 = "HttpPostRequest: response successfully received"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r1)     // Catch:{ all -> 0x00be }
            r3.a = r2     // Catch:{ all -> 0x00be }
        L_0x00c8:
            if (r9 != r6) goto L_0x010e
            java.lang.String r9 = "HttpPostRequest: processing server response"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r9)     // Catch:{ all -> 0x0106 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0106 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0106 }
            java.io.InputStream r2 = r10.getInputStream()     // Catch:{ all -> 0x0106 }
            r1.<init>(r2)     // Catch:{ all -> 0x0106 }
            r9.<init>(r1)     // Catch:{ all -> 0x0106 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r1.<init>()     // Catch:{ all -> 0x00ec }
        L_0x00e2:
            java.lang.String r2 = r9.readLine()     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00ee
            r1.append(r2)     // Catch:{ all -> 0x00ec }
            goto L_0x00e2
        L_0x00ec:
            r1 = move-exception
            goto L_0x0104
        L_0x00ee:
            int r2 = r1.length()     // Catch:{ all -> 0x00ec }
            if (r2 <= 0) goto L_0x00fb
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ec }
            r3.b = r1     // Catch:{ all -> 0x00ec }
            goto L_0x0100
        L_0x00fb:
            java.lang.String r1 = "HttpPostRequest: response data is empty"
            com.my.tracker.obfuscated.y0.a((java.lang.String) r1)     // Catch:{ all -> 0x00ec }
        L_0x0100:
            r9.close()     // Catch:{ all -> 0x00be }
            goto L_0x010e
        L_0x0104:
            r5 = r9
            goto L_0x0108
        L_0x0106:
            r9 = move-exception
            r1 = r9
        L_0x0108:
            if (r5 == 0) goto L_0x010d
            r5.close()     // Catch:{ all -> 0x00be }
        L_0x010d:
            throw r1     // Catch:{ all -> 0x00be }
        L_0x010e:
            r10.disconnect()
            return r3
        L_0x0112:
            r6 = r5
        L_0x0113:
            if (r6 == 0) goto L_0x0118
            r6.close()     // Catch:{ all -> 0x00be }
        L_0x0118:
            throw r9     // Catch:{ all -> 0x00be }
        L_0x0119:
            r9 = move-exception
        L_0x011a:
            com.my.tracker.obfuscated.y0.a(r0, r9)     // Catch:{ all -> 0x0127 }
            r3.a = r4     // Catch:{ all -> 0x0127 }
            r3.c = r0     // Catch:{ all -> 0x0127 }
            if (r5 == 0) goto L_0x0126
            r5.disconnect()
        L_0x0126:
            return r3
        L_0x0127:
            r9 = move-exception
            if (r5 == 0) goto L_0x012d
            r5.disconnect()
        L_0x012d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.b0.a(java.lang.String):com.my.tracker.obfuscated.c0$b");
    }
}
